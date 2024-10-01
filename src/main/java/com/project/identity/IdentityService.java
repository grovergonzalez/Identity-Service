package com.project.identity;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IdentityService {
    private List<String> identityList = new ArrayList<>();

    public void addCI(String ci) {
        identityList.add(ci);
    }

    public boolean verifyCI(IdentityDto identityDto) {
        return identityList.contains(identityDto.getCi()); // Verifica si el CI está en la lista
    }
}
