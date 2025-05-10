package com.example.eonmusic.Enum;

import lombok.Getter;

@Getter
public enum UserRole {

    ADMIN, USER;

    public String getValue(){
        return"ROLE_"+this.name();
    }
}
