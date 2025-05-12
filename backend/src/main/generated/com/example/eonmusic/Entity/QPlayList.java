package com.example.eonmusic.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPlayList is a Querydsl query type for PlayList
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPlayList extends EntityPathBase<PlayList> {

    private static final long serialVersionUID = 2037857825L;

    public static final QPlayList playList = new QPlayList("playList");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<Integer, NumberPath<Integer>> musicId = this.<Integer, NumberPath<Integer>>createList("musicId", Integer.class, NumberPath.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public QPlayList(String variable) {
        super(PlayList.class, forVariable(variable));
    }

    public QPlayList(Path<? extends PlayList> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPlayList(PathMetadata metadata) {
        super(PlayList.class, metadata);
    }

}

