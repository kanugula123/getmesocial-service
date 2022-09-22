package com.example.getmesocialservice.controller;

import com.example.getmesocialservice.model.Comment;
import com.example.getmesocialservice.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api3")
public class CommentController {

    @Autowired
    CommentService commentService;

    @GetMapping("/comment/{photoId}")
    public Optional<Comment> getComment(@PathVariable(value="photoId") String photoId) {
        return commentService.getCommentById(photoId);
    }

    @GetMapping("/comment/get-all-comments")
    public List<Comment> getAllComments() {
        return commentService.getAllComments();
    }
    @PostMapping("/comment/save-comment")
    public Comment saveComment(@RequestBody Comment comment) {
        return commentService.saveComment(comment);
    }

    @DeleteMapping("/comment/delete-comment")
    public String deleteComment(String photoId) {
        commentService.deletePhoto(photoId);
        return "Comment with " + photoId + " is deleted";
    }

    @PutMapping("/comment/update-comment")
    public Comment updateComment(@RequestBody Comment comment) {
        return commentService.updateComment(comment);
    }

}
