package com.frank.repository;

import com.frank.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
