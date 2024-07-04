package com.poker.game.auth.biz.model.mapper;

import com.poker.game.auth.api.dto.UserDto;
import com.poker.game.auth.api.enumeration.GenderEnum;
import com.poker.game.auth.api.vo.UserVo;
import com.poker.game.auth.biz.constant.Constants;
import com.poker.game.auth.biz.model.bo.UserBo;
import com.poker.game.auth.biz.model.entity.UserEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-05T00:24:50+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.11 (BellSoft)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserBo getBo(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        UserBo userBo = new UserBo();

        userBo.setNikeName( userDto.getNikeName() );
        userBo.setPhoneNumber( userDto.getPhoneNumber() );
        userBo.setGender( userDto.getGender() );
        userBo.setPassword( userDto.getPassword() );
        userBo.setAge( userDto.getAge() );

        return userBo;
    }

    @Override
    public UserEntity getEntity(UserBo userBo) {
        if ( userBo == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( userBo.getId() );
        userEntity.setCreateTime( userBo.getCreateTime() );
        userEntity.setLastUpdateTime( userBo.getLastUpdateTime() );
        userEntity.setPhoneNumber( userBo.getPhoneNumber() );
        if ( userBo.getGender() != null ) {
            userEntity.setGender( userBo.getGender().name() );
        }
        userEntity.setPassword( userBo.getPassword() );
        userEntity.setAge( userBo.getAge() );
        userEntity.setPoints( userBo.getPoints() );

        userEntity.setCreatedBy( Constants.SYS_ADMIN );
        userEntity.setLastModifiedBy( Constants.SYS_ADMIN );

        return userEntity;
    }

    @Override
    public UserBo getBo(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserBo userBo = new UserBo();

        userBo.setId( userEntity.getId() );
        userBo.setCreateTime( userEntity.getCreateTime() );
        userBo.setLastUpdateTime( userEntity.getLastUpdateTime() );
        userBo.setCreatedBy( userEntity.getCreatedBy() );
        userBo.setLastModifiedBy( userEntity.getLastModifiedBy() );
        userBo.setPhoneNumber( userEntity.getPhoneNumber() );
        if ( userEntity.getGender() != null ) {
            userBo.setGender( Enum.valueOf( GenderEnum.class, userEntity.getGender() ) );
        }
        userBo.setPassword( userEntity.getPassword() );
        userBo.setAge( userEntity.getAge() );
        userBo.setPoints( userEntity.getPoints() );

        return userBo;
    }

    @Override
    public UserVo getVo(UserBo userBo) {
        if ( userBo == null ) {
            return null;
        }

        UserVo userVo = new UserVo();

        userVo.setNikeName( userBo.getNikeName() );
        userVo.setPhoneNumber( userBo.getPhoneNumber() );
        userVo.setGender( userBo.getGender() );
        if ( userBo.getAge() != null ) {
            userVo.setAge( userBo.getAge() );
        }

        return userVo;
    }
}
