package com.symon.portal.application.mapper;

import com.symon.portal.application.dto.UserDto;
import com.symon.portal.domain.factory.UserFactory;
import com.symon.portal.domain.model.User;
import com.symon.portal.infrastructure.entity.UserEntity;

public class UserMapper {
    public static User toUser(UserDto userDto) {
        return UserFactory.createUser(userDto.getUsername(), userDto.getLastName(), userDto.getAge(),
                userDto.getEmail(), userDto.getPhone(), userDto.getPassword()
        );
    }

    public static UserEntity toUserEntity(User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(user.getUsername());
        userEntity.setLastName(user.getLastName());
        userEntity.setAge(user.getAge());
        userEntity.setEmail(user.getEmail());
        userEntity.setPhone(user.getPhone());
        userEntity.setPassword(user.getPassword().toString());
        userEntity.setValidator(user.isValidator());
        userEntity.setAccountVerified(user.isAccountVerified());
        userEntity.setTwoFactorEnabled(user.isTwoFactorEnabled());
        userEntity.setCreatedAt(user.getCreatedAt());
        return userEntity;
    }
}
