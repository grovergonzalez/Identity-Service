package com.project.identity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdentityController {
    @Autowired
    private IdentityService identityService;

    @PostMapping("/add")
    public String addCI(@RequestBody String ci) {
        identityService.addCI(ci);
        return "CI added: " + ci;
    }

    @PostMapping("/verify")
    public boolean verifyCI(@RequestBody IdentityDto identityDto) {
        return identityService.verifyCI(identityDto);
    }
}
