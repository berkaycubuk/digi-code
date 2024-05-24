package com.example.digicodeapi.auth;

public class AuthDTO {

    public record LoginRequest(String email, String password) {
    }

    public record Response(String message, String token) {
    }
}
