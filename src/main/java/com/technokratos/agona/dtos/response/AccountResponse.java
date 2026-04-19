package com.technokratos.agona.dtos.response;

import com.technokratos.agona.enums.Role;

import java.util.UUID;

public class AccountResponse {
    private UUID accountId;
    private String email;
    private Role role;


    public UUID getAccountId() {
        return accountId;
    }

    public void setAccountId(UUID accountId) {
        this.accountId = accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
