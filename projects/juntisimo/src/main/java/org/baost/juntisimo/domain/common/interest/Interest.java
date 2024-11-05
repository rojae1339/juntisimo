package org.baost.juntisimo.domain.common.interest;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Immutable
@Getter
public class Interest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated
    @NotNull
    private SubInterest subInterest;
    @Enumerated
    @NotNull
    private SurInterest surInterest;
}
