/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.petsfaces.servises;

import com.petsfaces.data_transfer_object.CommentDTO;
import com.petsfaces.Entity.Comment;
import java.security.Principal;
import java.util.List;

/**
 *
 * @author JavaDev
 */
public interface ICommentService {

    public Comment createComment(CommentDTO commentDTO,Principal principal, Long postId);

    public void deleteComment(Principal principal, Long postId);

    public List<Comment> getAllCommentsToPost(Long postId);
}
