package com.om.officemanagement.member.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Date;

/**
 * packageName    : com.om.officemanagement.member.entity
 * fileName       : MemberEntity
 * author         : juhyub
 * date           : 2023/07/05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/07/05        juhyub       최초 생성
 */

@SuperBuilder
@NoArgsConstructor(force = true)
@Setter
@Getter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})  //-- JPA에서 lazy관련 에러 날 경우 사용
@Entity  //-- 객체와 테이블 매핑
@Table(name = "MEMBER")  //-- 테이블 지정
public class MemberEntity {

    @Id  //-- Primary Key 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //-- AUTO_INCREMENT 설정 (id값이 null일 경우 자동 생성)
    @Column(name = "ID")  //-- 컬럼 지정
    private Long id;

    @NotNull
    @Column(name = "NAME")
    private String name;

    @NotNull
    @Column(name = "email")
    private String email;

    @Column(name = "NICKNAME")
    private String nickname;

    @Column(name = "AGE")
    private Integer age;

    @Column(name = "BIRTHDAY")
    private Date birthday;
}
