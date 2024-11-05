package org.baost.juntisimo.domain.group;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotNull;
import org.baost.juntisimo.domain.common.interest.Interest;
import org.baost.juntisimo.domain.common.location.Location;

import java.time.LocalDate;

@MappedSuperclass
public abstract class BaseGroupEntity {

    @NotNull
    private String title;
    @NotNull
    private String information;
    @Column(name = "main_picture")
    @NotNull
    private String mainPicture;
    @Column(name = "max_member_count")
    @NotNull
    private int maxMemberCount;
    @Column(name = "is_full")
    @NotNull
    private boolean isFull;
    @Column(name = "created_at")
    @NotNull
    private LocalDate createdAt;
    @Column(name = "is_expired")
    @NotNull
    private boolean isExpired;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "interest_id")
    private Interest interest;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id")
    private Location location;
}
