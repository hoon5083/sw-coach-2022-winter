package com.swcoaching.example1.friendship.jpa;

import com.swcoaching.example1.user.jpa.UserEntity;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Table(name = "friendship")
@Entity
public class FriendshipEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(nullable = false)
    private UserEntity sender;

    @ManyToOne
    @JoinColumn(nullable = false)
    private UserEntity receiver;

    @Column(columnDefinition = "boolean", nullable = false)
    private boolean isApproved;
}
