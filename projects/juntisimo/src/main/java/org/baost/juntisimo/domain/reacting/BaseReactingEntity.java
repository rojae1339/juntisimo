package org.baost.juntisimo.domain.reacting;

import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import org.baost.juntisimo.domain.user.User;

import java.time.LocalDate;

@MappedSuperclass
public abstract class BaseReactingEntity {
    @Enumerated
    private ReactionType reactionType;
    private LocalDate reactedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
