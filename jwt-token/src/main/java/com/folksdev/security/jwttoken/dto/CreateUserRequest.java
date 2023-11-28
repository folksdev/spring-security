package com.folksdev.security.jwttoken.dto;

import com.folksdev.security.jwttoken.model.Role;
import lombok.Builder;

import java.util.Set;


@Builder
public record CreateUserRequest(
        String name,
        String username,
        String password,
        Set<Role> authorities
){
}
