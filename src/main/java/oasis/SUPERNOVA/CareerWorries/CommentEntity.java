package oasis.SUPERNOVA.CareerWorries;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class CommentEntity {
    private String content;

    public CommentEntity() {
    }

    public CommentEntity(String content) {
        this.content = content;
    }
}
