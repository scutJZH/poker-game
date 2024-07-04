package com.poker.game.auth.api.constant;

import javax.validation.groups.Default;

public interface ValidationGroups {
    /**
     * 用户创建校验分组
     */
    interface UserCreateGroup extends Default {
    }

    /**
     * 用户更新校验分组
     */
    interface UserUpdateGroup extends Default {
    }

    /**
     * 登录分组
     */
    interface SignInGroup extends Default {
    }

    ;
}
