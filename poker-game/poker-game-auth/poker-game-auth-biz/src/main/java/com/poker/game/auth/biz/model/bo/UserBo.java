package com.poker.game.auth.biz.model.bo;

import com.poker.game.auth.api.enumeration.GenderEnum;
import com.poker.game.common.entity.BaseBo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class UserBo extends BaseBo {
    private String nikeName;

    private String phoneNumber;

    private GenderEnum gender;

    private String password;

    private Integer age;

    private Integer points;
}
