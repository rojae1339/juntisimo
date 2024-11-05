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
import org.baost.juntisimo.domain.group.ClubSchedule;
import org.baost.juntisimo.domain.user.User;

import java.time.LocalDate;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "club_schedule_user_relation",
        uniqueConstraints = {
                @UniqueConstraint(name = "UniqueClubScheduleAndUser",
                        columnNames = {"schedule_id", "user_id"})
        }
)
public class ClubScheduleUserRelation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private LocalDate userJoinedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "club_schedule_id")
    private ClubSchedule clubSchedule;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
