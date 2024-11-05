package org.baost.juntisimo.dto.club;

public record ClubUpdateRequest(String title,
                                String info,
                                String mainPic,
                                int maxMemberCount
                                ) {
}
