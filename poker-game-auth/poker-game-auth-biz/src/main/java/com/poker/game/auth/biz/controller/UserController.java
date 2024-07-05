package com.poker.game.auth.biz.controller;

import com.poker.game.auth.api.UserApi;
import com.poker.game.auth.api.dto.UserDto;
import com.poker.game.auth.api.vo.UserVo;
import com.poker.game.auth.biz.model.mapper.UserMapper;
import com.poker.game.auth.biz.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController implements UserApi {
    private final IUserService userService;

    @Override
    public UserVo signUp(UserDto userDto) {
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
