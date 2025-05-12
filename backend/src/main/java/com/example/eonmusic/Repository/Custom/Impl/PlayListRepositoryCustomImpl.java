package com.example.eonmusic.Repository.Custom.Impl;

import com.example.eonmusic.Entity.QPlayList;
import com.example.eonmusic.Repository.Custom.PlayListRepositoryCustom;
import com.querydsl.jpa.impl.JPAQueryFactory;

public class PlayListRepositoryCustomImpl implements PlayListRepositoryCustom {

    private JPAQueryFactory jpaQueryFactory;

    QPlayList qPlayList = QPlayList.playList;
}
