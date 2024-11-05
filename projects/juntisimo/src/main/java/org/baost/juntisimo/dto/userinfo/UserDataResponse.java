package org.baost.juntisimo.dto.userinfo;

import java.time.LocalDate;

public record UserDataResponse(Long userId,
                               String username,
                               String info,
                               String profilePic,
                               double mannerScore,
                               LocalDate birthdate,
                               LocalDate createdAt,
                               String occ_business,
                               String occ_job) {
}
