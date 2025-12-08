package com.codingshuttle.youtube.hospitalManagement.controller;


import com.codingshuttle.youtube.hospitalManagement.dto.LoginRequestDto;
import com.codingshuttle.youtube.hospitalManagement.dto.LoginResponseDto;
import com.codingshuttle.youtube.hospitalManagement.dto.signupRequestDto;
import com.codingshuttle.youtube.hospitalManagement.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/auth")
@RestController
@RequiredArgsConstructor
public class Auth {

    private final AuthService authService;


    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> login(@RequestBody LoginRequestDto loginRequestDto) {

        LoginResponseDto login= authService.login(loginRequestDto);
        return ResponseEntity.ok(login);

    }

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody signupRequestDto signupRequest) {
        authService.signupService(signupRequest);
        return ResponseEntity.ok("Signup Successful");
    }
}
