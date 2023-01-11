package com.hosu.projectboard.dto.request;

import com.hosu.projectboard.dto.ArticleCommentDto;
import com.hosu.projectboard.dto.UserAccountDto;

/**
 * A DTO for the {@link com.hosu.projectboard.domain.ArticleComment} entity
 */
public record ArticleCommentRequest(Long articleId, String content) {


    public static ArticleCommentRequest of(Long articleId, String content) {
        return new ArticleCommentRequest(articleId, content);
    }

    public ArticleCommentDto toDto(UserAccountDto userAccountDto) {
        return ArticleCommentDto.of(
                articleId,
                userAccountDto,
                content
        );

    }

}