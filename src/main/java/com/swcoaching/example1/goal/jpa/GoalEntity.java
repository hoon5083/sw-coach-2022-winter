package com.swcoaching.example1.goal.jpa;

import jakarta.persistence.*;

public class GoalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String title;

    @Column(length = 20)
    private String category;

//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private UserEntity user;
}
