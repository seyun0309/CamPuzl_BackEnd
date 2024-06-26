package com.JJoINT.CamPuzl.domain.member.domain;

import com.JJoINT.CamPuzl.global.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "member_and_organization")
public class MemberAndOrganization extends BaseEntity {

    @JoinColumn(columnDefinition = "varchar(20)")
    @ManyToOne(fetch = FetchType.LAZY)
    private Member username;
    @JoinColumn(columnDefinition = "varchar(100)")
    @ManyToOne(fetch = FetchType.LAZY)
    private Organization organization;
}
