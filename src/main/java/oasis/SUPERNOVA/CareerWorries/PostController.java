package oasis.SUPERNOVA.CareerWorries;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import oasis.SUPERNOVA.CheckSuccess;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/careerWorries")
public class PostController {

    private final CareerPostMapper careerPostMapper;

    //POST /api/careerWorries/createPost - 게시물 등록
    @PostMapping("/createPost")
    public ResponseEntity<CheckSuccess> insertPost(@RequestBody PostEntity postEntity) {

        PostEntity insertPostEntity = new PostEntity(postEntity.getPost_title(), postEntity.getPost_content());
        log.info("postEntity.getPostTitle(): {}", postEntity.getPost_title());
        log.info("postEntity.getPostContent(): {}", postEntity.getPost_content());

        careerPostMapper.insertPost(insertPostEntity);

        CheckSuccess response = new CheckSuccess(true);
        return ResponseEntity.ok(response);
    }

    //POST /api/careerWorries/updatePost - 게시물 수정
    @PostMapping("/{post_id}/updatePost")
    public ResponseEntity<CheckSuccess> updatePost(@PathVariable(name = "post_id") int post_id, @RequestBody PostEntity postEntity) {
        PostEntity updatePostEntity = new PostEntity(post_id, postEntity.getPost_title(), postEntity.getPost_content());
        careerPostMapper.updatePost(updatePostEntity);

        CheckSuccess response = new CheckSuccess(true);
        return ResponseEntity.ok(response);
    }

    //GET /api/careerWorries/deletePost/{post_id} - 게시물 삭제
    @GetMapping("/deletePost/{post_id}")
    public ResponseEntity<CheckSuccess> deletePost(@PathVariable(name = "post_id") int post_id) {

        careerPostMapper.deletePost(post_id);
        CheckSuccess response = new CheckSuccess(true);
        return ResponseEntity.ok(response);
    }

    //GET /api/careerWorries/showPostList - 게시물 리스트 조회
    @GetMapping("/showPostList")
    public ArrayList<PostEntity> showPostList() {

        return careerPostMapper.selectAll();
    }

    //GET /api/careerWorries/{post_id}` - 게시물 조회
    @GetMapping("/{post_id}")
    public PostEntity showPost(@PathVariable(name = "post_id") int post_id){

        return careerPostMapper.selectPostOne(post_id);
    }

    //GET /api/careerWorries/{post_id}/showCommentsList` - 댓글 리스트 조회
    @GetMapping("/{post_id}/showCommentsList")
    public ArrayList<PostCommentEntity> showCommentsList(@PathVariable(name = "post_id") int post_id) {

        return careerPostMapper.selectCommentAll(post_id);
    }

    //POST /api/careerWorries/{post_id}/createComments`- 댓글 작성
    @PostMapping("/{post_id}/createComments")
    public ResponseEntity<CheckSuccess> insertComment(@PathVariable(name = "post_id") int post_id,
                                                      @RequestBody CommentEntity comment) {

        log.info(comment.getContent());

        PostCommentEntity insertCommentEntity =
                new PostCommentEntity(post_id, comment.getContent());

        careerPostMapper.insertComment(insertCommentEntity);

        CheckSuccess response = new CheckSuccess(true);
        return ResponseEntity.ok(response);
    }

    //POST /api/careerWorries/{post_id}/pushLikes` - 공감 작성
    @GetMapping("/{post_id}/pushLikes")
    public ResponseEntity<CheckSuccess> pushLikes(@PathVariable(name = "post_id") int post_id) {

        careerPostMapper.updatePostLike(post_id);
        CheckSuccess response = new CheckSuccess(true);
        return ResponseEntity.ok(response);
    }



}
