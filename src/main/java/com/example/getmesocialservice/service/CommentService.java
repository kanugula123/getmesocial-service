package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.Comment;
import com.example.getmesocialservice.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepository;

    public Optional<Comment> getCommentById(String photoId) {
        return commentRepository.findById(photoId);
    }

    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public Comment updateComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public void deletePhoto(String photoId) {
        commentRepository.deleteById(photoId);
    }
}
