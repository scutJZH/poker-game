package com.poker.game.auth.biz.service;

import com.poker.game.auth.api.vo.UserVo;
import com.poker.game.auth.biz.model.bo.UserBo;

public interface IUserService {
    /**
     * 注册
     *
     * @param userBo userBo
     * @return UserVo
     */
    UserBo signUp(UserBo userBo);

    /**
     * 电话号码是否注册
     *
     * @param phoneNumber phoneNumber
     * @return 注册ture/未注册false
     */
    boolean isPhoneNumberBeingUsed(String phoneNumber);
}
