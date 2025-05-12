package com.example.eonmusic.Repository;

import com.example.eonmusic.Entity.Music;
import com.example.eonmusic.Repository.Custom.MusicRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepository extends JpaRepository<Music,Long>, MusicRepositoryCustom {
}
