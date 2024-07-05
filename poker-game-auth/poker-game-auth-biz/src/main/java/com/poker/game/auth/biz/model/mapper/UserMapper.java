package com.poker.game.auth.biz.model.mapper;

import com.poker.game.auth.api.dto.UserDto;
import com.poker.game.auth.api.vo.UserVo;
import com.poker.game.auth.biz.constant.Constants;
import com.poker.game.auth.biz.model.bo.UserBo;
import com.poker.game.auth.biz.model.entity.UserEntity;
import com.poker.game.common.entity.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingInheritanceStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseMapper.class, mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_FROM_CONFIG,
        imports = Constants.class)
public interface UserMapper {
    /**
     * instance
     */
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    /**
     * UserDto 转 UserBo
     *
     * @param userDto userDto
     * @return UserBo
     */
    @Mapping(target = "points", ignore = true)
    UserBo getBo(UserDto userDto);

    /**
     * UserBo 转 UserEntity
     *
     * @param userBo userBo
     * @return UserEntity
     */
    @Mapping(target = "createdBy", expression = "java(Constants.SYS_ADMIN)")
    @Mapping(target = "lastModifiedBy", expression = "java(Constants.SYS_ADMIN)")
    UserEntity getEntity(UserBo userBo);

    /**
     * UserEntity 转 UserBo
     *
     * @param userEntity userEntity
     * @return UserBo
     */
    UserBo getBo(UserEntity userEntity);

    /**
     * UserBo 转 UserVo
     *
     * @param userBo userBo
     * @return UserVo
     */
    UserVo getVo(UserBo userBo);
}
