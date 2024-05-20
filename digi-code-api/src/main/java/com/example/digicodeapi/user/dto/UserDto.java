package com.example.digicodeapi.user.dto;

import com.example.digicodeapi.user.Role;

public record UserDto(
        Long id,
        String firstName,
        String lastName,
        String email,
        Role role
) {
}
