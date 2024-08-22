package oasis.SUPERNOVA.CareerWorries;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class PostEntity {

    private int post_id;
    private String post_title;
    private String post_content;
    private int post_like;

    public PostEntity() {
    }

    public PostEntity(String post_title, String post_content) {
        this.post_title = post_title;
        this.post_content = post_content;
    }

    public PostEntity(int post_id, String post_title, String post_content) {
        this.post_id = post_id;
        this.post_title = post_title;
        this.post_content = post_content;
    }

    public PostEntity(int post_id, String post_title, String post_content, int post_like) {
        this.post_id = post_id;
        this.post_title = post_title;
        this.post_content = post_content;
        this.post_like = post_like;
    }
}
