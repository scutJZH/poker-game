package com.poker.game.common.entity;

import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;

@MapperConfig
public interface BaseMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createTime", ignore = true)
    @Mapping(target = "lastUpdateTime", ignore = true)
    @Mapping(target = "createdBy", ignore = true)
    @Mapping(target = "lastModifiedBy", ignore = true)
    BaseBo getBo(BaseDto baseDto);

    /**
     * entity 转 bo
     *
     * @param entity entity
     * @return bo
     */
    BaseBo getBo(BaseEntity entity);

    /**
     * bo 转 entity
     *
     * @param bo bo
     * @return entity
     */
    BaseEntity getEntity(BaseBo bo);
}
