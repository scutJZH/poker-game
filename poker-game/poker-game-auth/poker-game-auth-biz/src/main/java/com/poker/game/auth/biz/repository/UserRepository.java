package com.poker.game.auth.biz.repository;

import com.poker.game.auth.biz.model.entity.UserEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface UserRepository extends ListCrudRepository<UserEntity, Long> {
}
