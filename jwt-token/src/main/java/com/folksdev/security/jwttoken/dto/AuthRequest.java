package com.folksdev.security.jwttoken.dto;

public record AuthRequest (
        String username,
        String password
){
}
