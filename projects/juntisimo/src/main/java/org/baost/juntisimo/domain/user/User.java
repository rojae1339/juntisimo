package org.baost.juntisimo.domain.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String password;

    @NotNull
    private String information;

    @NotNull
    private LocalDate birthDate;

    @Column(name = "profile_picture")
    @NotNull
    private String profilePicture;

    @Column(name = "manner_score")
    @NotNull
    private int mannerScore;

    @Column(name = "reported_score")
    @NotNull
    private int reportedScore;

    @Column(name = "is_activated")
    @NotNull
    private boolean isActivated;

    @Column(name = "created_at")
    @NotNull
    private LocalDate createdAt;

    @Enumerated
    @Column(name = "account_role")
    @NotNull
    private UserRole role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "occupation_id")
    private Occupation occupation;
}
