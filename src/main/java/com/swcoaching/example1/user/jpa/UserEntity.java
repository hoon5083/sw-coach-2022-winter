package com.swcoaching.example1.user.jpa;

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

//    @OneToMany(mappedBy = "friendship")
//    public List<FriendshipEntity> posts = new ArrayList<>();

//    @OneToMany(mappedBy = "Goal")
//    public List<GoalEntity> posts = new ArrayList<>();
}
