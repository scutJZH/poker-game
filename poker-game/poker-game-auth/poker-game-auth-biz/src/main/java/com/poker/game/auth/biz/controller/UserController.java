package com.poker.game.auth.biz.controller;

import com.poker.game.auth.api.UserApi;
import com.poker.game.auth.api.constant.ValidationGroups;
import com.poker.game.auth.api.dto.UserDto;
import com.poker.game.auth.api.vo.UserVo;
import com.poker.game.auth.biz.model.mapper.UserMapper;
import com.poker.game.auth.biz.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController implements UserApi {
    private final IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @Override
    @PostMapping("/poker-game-auth/users")
    public UserVo signUp(@RequestBody @Validated(value = ValidationGroups.UserCreateGroup.class) UserDto userDto) {
        return UserMapper.INSTANCE.getVo(userService.signUp(UserMapper.INSTANCE.getBo(userDto)));
    }

    @Override
    public void update(Long id, UserDto userDto) {

    }

    @Override
    public boolean isPhoneNumberBeingUsed(String phoneNumber) {
        return userService.isPhoneNumberBeingUsed(phoneNumber);
    }

    @Override
    public void signIn(UserDto userDto) {

    }

    @Override
    public UserVo getUserInfo(Long id) {
        return null;
    }
}
