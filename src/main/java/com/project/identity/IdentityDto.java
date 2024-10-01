package com.project.identity;

public class IdentityDto {
    private String ci; // Campo para el CI

    public IdentityDto() {}

    public IdentityDto(String ci) {
        this.ci = ci;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }
}
