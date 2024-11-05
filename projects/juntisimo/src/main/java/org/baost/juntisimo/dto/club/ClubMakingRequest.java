package org.baost.juntisimo.dto.club;

public record ClubMakingRequest(String title,
                                String info,
                                String mainPic,
                                int maxMemberCount) {
}
