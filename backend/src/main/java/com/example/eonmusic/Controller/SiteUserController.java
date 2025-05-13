package com.example.eonmusic.Controller;

import com.example.eonmusic.DTO.SiteUserRequestDto;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@NoArgsConstructor
@RequestMapping("api/user")
public class SiteUserController {

    @PostMapping
    public ResponseEntity<?> createSiteUser(@RequestBody SiteUserRequestDto siteUserRequestDto){


        return ResponseEntity.status(HttpStatus.OK).body("create");
    }
}
