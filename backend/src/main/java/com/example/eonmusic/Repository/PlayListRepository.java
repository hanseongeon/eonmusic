package com.example.eonmusic.Repository;

import com.example.eonmusic.Entity.PlayList;
import com.example.eonmusic.Repository.Custom.PlayListRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayListRepository extends JpaRepository<PlayList,Long>, PlayListRepositoryCustom {
}
