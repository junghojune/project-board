package com.hosu.projectboard.repository;

import com.hosu.projectboard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
