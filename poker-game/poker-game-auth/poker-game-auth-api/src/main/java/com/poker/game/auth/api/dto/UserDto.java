package com.poker.game.auth.api.dto;

import com.poker.game.auth.api.constant.ValidationConstants;
import com.poker.game.auth.api.constant.ValidationGroups;
import com.poker.game.auth.api.enumeration.GenderEnum;
import com.poker.game.common.entity.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class UserDto extends BaseDto {
    @Size(groups = {ValidationGroups.UserCreateGroup.class, ValidationGroups.UserUpdateGroup.class},
            min = ValidationConstants.USER_NICKNAME_MIN_SIZE, max = ValidationConstants.USER_NICKNAME_MAX_SIZE)
    @NotBlank
    private String nikeName;

    @Pattern(groups = {ValidationGroups.UserCreateGroup.class}, regexp = ValidationConstants.USER_PHONE_NUMBER_REGEXP)
    @NotBlank
    private String phoneNumber;

    @NotNull(groups = {ValidationGroups.UserCreateGroup.class, ValidationGroups.UserUpdateGroup.class})
    private GenderEnum gender;

    @Size(groups = {ValidationGroups.UserCreateGroup.class},
            min=ValidationConstants.USER_PASSWORD_MIN_SIZE, max = ValidationConstants.USER_PASSWORD_MAX_SIZE)
    private String password;

    @Min(value = ValidationConstants.MIN_USER_AGE)
    @Max(value = ValidationConstants.MAX_USER_AGE)
    @NotNull
    private Integer age;
}
