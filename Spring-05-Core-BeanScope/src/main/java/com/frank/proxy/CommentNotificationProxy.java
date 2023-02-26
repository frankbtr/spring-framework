package com.frank.proxy;

import com.frank.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
