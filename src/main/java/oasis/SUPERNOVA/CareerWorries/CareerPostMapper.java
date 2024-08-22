package oasis.SUPERNOVA.CareerWorries;

import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface CareerPostMapper {

    @Insert("INSERT INTO CareerWorriedPost (post_title, post_content)VALUES (#{post_title}, #{post_content})")
    void insertPost(PostEntity postEntity);

    @Update("UPDATE CareerWorriedPost SET post_title = #{post_title}, post_content = #{post_content} WHERE post_id = #{post_id}")
    void updatePost(PostEntity postEntity);

    @Delete("DELETE FROM CareerWorriedPost WHERE post_id = #{post_id}")
    void deletePost(int post_id);

    @Select("SELECT post_id, post_title, post_content, post_like FROM CareerWorriedPost")
    ArrayList<PostEntity> selectAll();

    @Select("SELECT post_id, post_title, post_content, post_like FROM CareerWorriedPost where post_id = #{id}")
    PostEntity selectPostOne(int id);

    @Select("SELECT comment_id, post_id, comment_content FROM CareerWorriedComment where post_id = #{post_id}")
    ArrayList<PostCommentEntity> selectCommentAll(int post_id);

    @Insert("INSERT INTO CareerWorriedComment (post_id, comment_content)VALUES (#{post_id}, #{comment_content})")
    void insertComment(PostCommentEntity postCommentEntity);

    @Update("UPDATE CareerWorriedPost SET post_like = post_like + 1 WHERE post_id = #{post_id}")
    void updatePostLike(int post_id);
}
