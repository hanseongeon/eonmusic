package com.example.eonmusic.Repository.Custom.Impl;

import com.example.eonmusic.Entity.QSiteUser;
import com.example.eonmusic.Entity.SiteUser;
import com.example.eonmusic.Repository.Custom.SiteUserRepositoryCustom;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SiteUserRepositoryCustomImpl implements SiteUserRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;

    QSiteUser qSiteUser = QSiteUser.siteUser;

    public SiteUser findByUserName(String username) {

        return jpaQueryFactory.selectFrom(qSiteUser).where(qSiteUser.userName.eq(username)).fetchOne();
    }
}
