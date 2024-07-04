package com.poker.game.auth.biz.service.impl;

import com.poker.game.auth.biz.exception.AuthErrorDefine;
import com.poker.game.auth.biz.model.bo.UserBo;
import com.poker.game.auth.biz.model.mapper.UserMapper;
import com.poker.game.auth.biz.repository.UserRepository;
import com.poker.game.auth.biz.service.IUserService;
import com.poker.game.common.exception.BizException;

import com.poker.game.common.util.security.SecurityHelper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {
    private static final int INIT_POINTS = 100;

    private final UserRepository userRepository;

    @Override
    @Transactional
    public UserBo signUp(UserBo userBo) {
        if (isPhoneNumberBeingUsed(userBo.getPhoneNumber())) {
            throw new BizException(AuthErrorDefine.PHONE_NUMBER_HAS_ALREADY_BEEN_USED);
        }
        initUserPoints(userBo);
        encryptPassword(userBo);
        return UserMapper.INSTANCE.getBo(userRepository.save(UserMapper.INSTANCE.getEntity(userBo)));
    }

    @Override
    public boolean isPhoneNumberBeingUsed(String phoneNumber) {
        // todo 数据库查询
        return false;
    }

    private void initUserPoints(UserBo userBo) {
        userBo.setPoints(INIT_POINTS);
    }

    private void encryptPassword(UserBo userBo) {
        userBo.setPassword(SecurityHelper.bcrypt(userBo.getPassword()));
    }
}
