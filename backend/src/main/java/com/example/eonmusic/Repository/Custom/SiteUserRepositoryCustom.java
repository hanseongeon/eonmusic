package com.example.eonmusic.Repository.Custom;

import com.example.eonmusic.Entity.SiteUser;

public interface SiteUserRepositoryCustom {

     SiteUser findByUserName(String username);
}
