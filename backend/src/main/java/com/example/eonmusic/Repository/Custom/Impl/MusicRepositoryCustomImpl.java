package com.example.eonmusic.Repository.Custom.Impl;

import com.example.eonmusic.Entity.QMusic;
import com.example.eonmusic.Repository.Custom.MusicRepositoryCustom;
import com.querydsl.jpa.impl.JPAQueryFactory;

public class MusicRepositoryCustomImpl implements MusicRepositoryCustom {
    public JPAQueryFactory jpaQueryFactory;

    QMusic qMusic = QMusic.music1;
}
