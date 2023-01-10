package com.hosu.projectboard.config;

import com.hosu.projectboard.domain.UserAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class DataRestConfig {

    @Bean
    public RepositoryRestConfigurer repositoryRestConfigurer(){
        return RepositoryRestConfigurer.withConfig((config, cors) ->
                config.exposeIdsFor(UserAccount.class)
        );
    }
}
