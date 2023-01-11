package com.hosu.projectboard.controller;

import com.hosu.projectboard.domain.QUserAccount;
import com.hosu.projectboard.dto.UserAccountDto;
import com.hosu.projectboard.dto.request.ArticleCommentRequest;
import com.hosu.projectboard.service.ArticleCommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@RequestMapping("/comments")
@Controller
public class ArticleCommentController {

    private final ArticleCommentService articleCommentService;

    @PostMapping("/new")
    public String postNewArticleComment(ArticleCommentRequest articleCommentRequest){

        articleCommentService.saveArticleComment(articleCommentRequest.toDto(
                UserAccountDto.of(
                        "hosu", "pw", "hosu@maili.com", null, null
                )
        ));

        return "redirect:/articles/" + articleCommentRequest.articleId();
    }


    @PostMapping ("/{commentId}/delete")
    public String deleteArticleComment(@PathVariable Long commentId, Long articleId) {
        articleCommentService.deleteArticleComment(commentId);

        return "redirect:/articles/" + articleId;
    }
}
