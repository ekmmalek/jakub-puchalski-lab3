package com.example.filecollector.controller;

import com.example.filecollector.dto.UserDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final PasswordEncoder passwordEncoder;

    @PostMapping("/create")
    public ResponseEntity<Void> createUser(@RequestBody @Valid UserDTO userDTO) {
        String hashPassword = passwordEncoder.encode(userDTO.getPassword());
        log.info("New Passwd: {}", hashPassword);
        log.info("Trying to create user");
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

}
