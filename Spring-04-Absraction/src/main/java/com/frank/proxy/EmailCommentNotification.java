package com.frank.proxy;

import com.frank.model.Comment;

public class EmailCommentNotification implements CommentNotificationProxy{
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}
