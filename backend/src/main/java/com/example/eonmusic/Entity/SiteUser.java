package com.example.eonmusic.Entity;

import com.example.eonmusic.Enum.UserRole;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class SiteUser {
    @Id
    private String userName;

    private String password;

    private String nickName;

    private String name;

    private String phoneNumber;

    private UserRole userRole;

    @CreatedDate
    private LocalDateTime createDate;

    @LastModifiedDate
    private LocalDateTime modifyDate;

    @OneToMany(cascade = CascadeType.REMOVE)
    private List<Album> albumList = new ArrayList<>();

    @OneToMany(cascade = CascadeType.REMOVE)
    private List<PlayList> myPlayList = new ArrayList<>();
    @Builder
    public  SiteUser(String userName, String password, String nickName, String name, String phoneNumber, UserRole userRole){
        this.userName = userName;
        this.password = password;
        this.nickName = nickName;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.userRole = userRole;
    }
}
