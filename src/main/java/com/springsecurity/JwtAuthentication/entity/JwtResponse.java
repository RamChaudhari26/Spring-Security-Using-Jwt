package com.springsecurity.JwtAuthentication.entity;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class JwtResponse {

    private String jwtToken;

    private String username;
}
