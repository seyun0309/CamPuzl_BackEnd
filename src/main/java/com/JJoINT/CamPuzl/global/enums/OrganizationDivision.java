package com.JJoINT.CamPuzl.global.enums;

import lombok.Getter;

@Getter
public enum OrganizationDivision {
    UNDERGRADUATE_STUDENT_COUNCIL("O001","학부 학생회"),
    COLLEGE_STUDENT_COUNCIL("O002","단과대학 학생회"),
    GENERAL_STUDENT_COUNCIL("O003","총학생회"),
    CENTRAL_CLUB("O004","중앙동아리"),
    UNDERGRADUATE_CLUB("O005","학부동아리");

    private final String code ;
    private final String description;

    OrganizationDivision(String code, String description) {
        this.code = code;
        this.description = description;
    }
}
