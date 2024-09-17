package com.symon.portal.infrastructure.Controller;

import com.symon.portal.Utils.response.ApiResponse;
import com.symon.portal.application.dto.UserDto;
import com.symon.portal.application.services.UserService;
import com.symon.portal.infrastructure.entity.UserEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/addUser")
    public ResponseEntity<ApiResponse<UserEntity>> addUser(@RequestBody UserDto userDto) {
        try {
            UserEntity savedUser = userService.addUser(userDto);
            return ResponseEntity.ok(new ApiResponse<>(true, savedUser, "User added successfully."));
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(new ApiResponse<>(false, null, "Error while adding user."));
        }
    }
}
