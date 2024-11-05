package org.baost.juntisimo.dto.userinfo;

import java.time.LocalDate;

public record UserUpdateRequest(String username,
                                String password,
                                String info,
                                LocalDate birthDate,
                                String profilePic) {
}
