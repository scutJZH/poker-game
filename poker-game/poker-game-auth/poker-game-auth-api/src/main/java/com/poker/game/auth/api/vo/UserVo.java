package com.poker.game.auth.api.vo;

import com.poker.game.auth.api.enumeration.GenderEnum;
import com.poker.game.common.entity.BaseVo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class UserVo extends BaseVo {
    private String nikeName;

    private String phoneNumber;

    private GenderEnum gender;

    private int age;
}
