package com.project.identity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class IdentityServiceTest {

    @Autowired
    private IdentityService identityService;

    IdentityDto identityDto = new IdentityDto("12345678");

    @Test
    public void addCI() {
        assertThat(identityService.verifyCI(identityDto)).isFalse();

        identityService.addCI(identityDto.getCi());

        assertThat(identityService.verifyCI(identityDto)).isTrue();
    }

    @Test
    void verifyCI() {
        IdentityDto anotherIdentityDto = new IdentityDto("87654321");

        // Act: Agrega el CI
        identityService.addCI(anotherIdentityDto.getCi());

        assertThat(identityService.verifyCI(anotherIdentityDto)).isTrue();

        IdentityDto nonExistentCI = new IdentityDto("11111111");
        assertThat(identityService.verifyCI(nonExistentCI)).isFalse();
    }
}