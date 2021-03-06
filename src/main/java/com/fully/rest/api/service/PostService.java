package com.fully.rest.api.service;

import com.fully.rest.api.domain.entity.Post;
import java.util.List;
import org.springframework.http.ResponseEntity;

public interface PostService {

  Post findById(Long socialId, Long id);

  List<Post> findBySocialId(Long socialId);

  Post save(Post post, Long socialId);

  Post update(Post post, Long socialId, Long id);

  void delete(Long socialId, Long id);
}
