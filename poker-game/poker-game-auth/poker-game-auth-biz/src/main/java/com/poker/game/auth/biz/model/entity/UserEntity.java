package com.poker.game.auth.biz.model.entity;


import com.poker.game.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user", indexes = {@Index(name = "idx_phone_number_nick_name", columnList = "nick_name, phone_number")})
public class UserEntity extends BaseEntity {
    @Column(name = "nick_name", length = 64, nullable = false)
    private String nickName;

    @Column(name = "phone_number", length = 32, unique = true, nullable = false)
    private String phoneNumber;

    @Column(name = "gender", length = 32, nullable = false)
    private String gender;

    @Column(name = "password", length = 64, nullable = false)
    private String password;

    @Column(name = "age", columnDefinition = "int(4) default 0", nullable = false)
    private Integer age;

    @Column(name = "points", columnDefinition = "int(4) default 0", nullable = false)
    private Integer points;
}
