package org.baost.juntisimo.domain.relation;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.baost.juntisimo.domain.common.interest.Interest;
import org.baost.juntisimo.domain.user.User;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "user_interest_relation",
        uniqueConstraints = {
            @UniqueConstraint(name = "UniqueUserAndInterest",
                    columnNames = {"user_id", "interest_id"})
    }
)
public class UserInterestRelation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", updatable = false)
    @NotNull
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "interest_id", updatable = false)
    @NotNull
    private Interest interest;
}
