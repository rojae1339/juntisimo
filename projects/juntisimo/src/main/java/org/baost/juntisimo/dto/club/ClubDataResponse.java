package org.baost.juntisimo.dto.club;

public record ClubDataResponse (Long clubId,
                                String title,
                                String info,
                                String mainPic,
                                int maxMemberCount) {
}
