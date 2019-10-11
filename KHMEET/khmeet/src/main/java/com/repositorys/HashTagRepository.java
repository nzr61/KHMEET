package com.repositorys;

import com.models.Hashtag.HashTag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface HashTagRepository extends CrudRepository<HashTag,Long> {
}
