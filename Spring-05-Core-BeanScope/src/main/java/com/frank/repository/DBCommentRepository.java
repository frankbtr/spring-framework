package com.frank.repository;

import com.frank.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository{
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
