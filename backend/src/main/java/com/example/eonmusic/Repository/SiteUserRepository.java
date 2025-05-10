package com.example.eonmusic.Repository;

import com.example.eonmusic.Entity.SiteUser;
import com.example.eonmusic.Repository.Custom.SiteUserRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiteUserRepository extends JpaRepository<SiteUser,String>, SiteUserRepositoryCustom {
}
