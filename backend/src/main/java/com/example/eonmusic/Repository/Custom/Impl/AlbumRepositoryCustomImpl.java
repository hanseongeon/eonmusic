package com.example.eonmusic.Repository.Custom.Impl;

import com.example.eonmusic.Entity.QAlbum;
import com.example.eonmusic.Repository.Custom.AlbumRepositoryCustom;
import com.querydsl.jpa.impl.JPAQueryFactory;

public class AlbumRepositoryCustomImpl implements AlbumRepositoryCustom {
    private JPAQueryFactory jpaQueryFactory;

    QAlbum qAlbum = QAlbum.album;
}
