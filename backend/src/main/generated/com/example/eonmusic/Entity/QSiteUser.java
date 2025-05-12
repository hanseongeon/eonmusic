package com.example.eonmusic.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSiteUser is a Querydsl query type for SiteUser
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSiteUser extends EntityPathBase<SiteUser> {

    private static final long serialVersionUID = 834571233L;

    public static final QSiteUser siteUser = new QSiteUser("siteUser");

    public final ListPath<Album, SimplePath<Album>> albumList = this.<Album, SimplePath<Album>>createList("albumList", Album.class, SimplePath.class, PathInits.DIRECT2);

    public final DateTimePath<java.time.LocalDateTime> createDate = createDateTime("createDate", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> modifyDate = createDateTime("modifyDate", java.time.LocalDateTime.class);

    public final ListPath<PlayList, QPlayList> myPlayList = this.<PlayList, QPlayList>createList("myPlayList", PlayList.class, QPlayList.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final StringPath nickName = createString("nickName");

    public final StringPath password = createString("password");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final StringPath userName = createString("userName");

    public final EnumPath<com.example.eonmusic.Enum.UserRole> userRole = createEnum("userRole", com.example.eonmusic.Enum.UserRole.class);

    public QSiteUser(String variable) {
        super(SiteUser.class, forVariable(variable));
    }

    public QSiteUser(Path<? extends SiteUser> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSiteUser(PathMetadata metadata) {
        super(SiteUser.class, metadata);
    }

}

