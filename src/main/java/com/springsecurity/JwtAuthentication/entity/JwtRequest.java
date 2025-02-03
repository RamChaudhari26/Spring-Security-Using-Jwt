package com.springsecurity.JwtAuthentication.entity;

import lombok.*;

@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class JwtRequest {

    private String email;

    private String password;
}
