package org.baost.juntisimo.domain.relation;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
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
import org.baost.juntisimo.domain.common.location.Location;
import org.baost.juntisimo.domain.user.User;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "user_location_relation",
        uniqueConstraints = {
            @UniqueConstraint(name = "UniqueUserAndLocation",
                    columnNames = {"user_id", "location_id"})})
public class UserLocationRelation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", updatable = false)
    @NotNull
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id", updatable = false)
    @NotNull
    private Location location;

    @Enumerated
    @Column(name = "location_category")
    @NotNull
    private LocationCategory locationCategory;
}
