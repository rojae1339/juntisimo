package org.baost.juntisimo.dto.account;

import java.time.LocalDate;

public record UserSigninRequest(String username,
                                String email,
                                String password,
                                String info,
                                LocalDate birthDate,
                                String profilePic) {
}
