package oasis.SUPERNOVA.CareerWorries;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostCommentEntity {

    private int comment_id;
    private int post_id;
    private String comment_content;

    public PostCommentEntity() {

    }


    public PostCommentEntity(int post_id, String comment_content) {
        this.post_id = post_id;
        this.comment_content = comment_content;
    }

    public PostCommentEntity(int comment_id, int post_id, String comment_content) {
        this.comment_id = comment_id;
        this.post_id = post_id;
        this.comment_content = comment_content;
    }
}
