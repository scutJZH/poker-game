package com.poker.game.auth.api;

import com.poker.game.auth.api.constant.ValidationGroups;
import com.poker.game.auth.api.dto.UserDto;
import com.poker.game.auth.api.vo.UserVo;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

public interface UserApi {
    /**
     * 注册
     *
     * @param userDto userDto
     */
    @PostMapping("/poker-game-auth/users")
    UserVo signUp(@RequestBody @Validated(value = ValidationGroups.UserCreateGroup.class) UserDto userDto);

    /**
     * 登录
     *
     * @param userDto userDto
     */
    @PostMapping("/poker-game-auth/users/sign-in")
    void signIn(@RequestBody @Validated(ValidationGroups.SignInGroup.class) UserDto userDto);

    /**
     * 获取用户信息
     *
     * @param id id
     * @return UserVo
     */
    @GetMapping("/poker-game-auth/users/{id}")
    UserVo getUserInfo(@PathVariable("id") Long id);

    /**
     * 更新用户信息
     *
     * @param id 用户id
     * @param userDto userDto
     */
    @PutMapping("/poker-game-auth/users/{id}")
    void update(@PathVariable("id") @NotNull Long id,
                @RequestBody @Validated(ValidationGroups.UserUpdateGroup.class) UserDto userDto);

    /**
     * 检查账户是否存在
     *
     * @return true存在/false不存在
     */
    @PostMapping("/poker-game-auth/users/{phone_number}/is-used")
    boolean isPhoneNumberBeingUsed(@PathVariable("phone_number") String phoneNumber);
}
