package com.example.eonmusic.Security;

import com.example.eonmusic.Entity.SiteUser;
import com.example.eonmusic.Repository.SiteUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomUserDetailService  implements UserDetailsService {

    private final SiteUserRepository siteUserRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<SiteUser> _siteUser = Optional.ofNullable(this.siteUserRepository.findByUserName(username));
        if(_siteUser.isEmpty())
            throw new UsernameNotFoundException("사용자를 찾을수 없습니다.");
        return null;
    }
}
