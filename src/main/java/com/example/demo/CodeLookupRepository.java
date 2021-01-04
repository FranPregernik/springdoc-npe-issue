package com.example.demo;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

@NoRepositoryBean
public interface CodeLookupRepository<EntityT, KeyT> {
    EntityT findOneByCode(@Param("code") KeyT code);

    Long countByCode(KeyT code);
}

