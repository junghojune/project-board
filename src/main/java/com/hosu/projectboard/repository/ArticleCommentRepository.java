package com.hosu.projectboard.repository;

import com.hosu.projectboard.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {

}