package com.symon.portal.application.services;

import com.symon.portal.application.dto.UserDto;
import com.symon.portal.application.mapper.UserMapper;
import com.symon.portal.domain.model.User;
import com.symon.portal.infrastructure.entity.UserEntity;
import com.symon.portal.infrastructure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity addUser(UserDto userDto) {
        User user = UserMapper.toUser(userDto);
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new RuntimeException("User Already Exists");
        }
        UserEntity entity = UserMapper.toUserEntity(user);
        userRepository.save(entity);
        return entity;
    }
}
