package com.swcoaching.example1.user.jpa;

import com.swcoaching.example1.friendship.jpa.FriendshipEntity;
import com.swcoaching.example1.goal.jpa.GoalEntity;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Table(name = "user")
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String nickname;

    @Column(length = 500)
    private String introduction;

    @Column(length = 10000)
    private String password;

    @OneToMany(mappedBy = "sender")
    public List<FriendshipEntity> sentFriendships = new ArrayList<>();

    @OneToMany(mappedBy = "receiver")
    public List<FriendshipEntity> receivedFriendships = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    public List<GoalEntity> goals = new ArrayList<>();
}
