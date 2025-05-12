package com.example.eonmusic.Repository;

import com.example.eonmusic.Entity.Album;
import com.example.eonmusic.Repository.Custom.AlbumRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album,Long>, AlbumRepositoryCustom {
}
