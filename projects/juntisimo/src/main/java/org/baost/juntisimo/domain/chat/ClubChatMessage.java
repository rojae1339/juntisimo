package org.baost.juntisimo.domain.chat;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.baost.juntisimo.domain.user.User;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ClubChatMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String content;
    private boolean isPicture;

    //sort by desc, which one should showup first is the latest sent message
    @NotNull
    private LocalDateTime sentAt;
    private int readCount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "club_chat_room_id")
    private ClubChatRoom clubChatRoom;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "send_user_id")
    private User sendUser;
}
