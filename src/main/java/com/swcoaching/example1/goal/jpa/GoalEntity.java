package com.swcoaching.example1.goal.jpa;

import com.swcoaching.example1.user.jpa.UserEntity;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Table(name = "goal")
@Entity
public class GoalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100,nullable = false)
    private String title;

    @Column(length = 20,nullable = false)
    private String category;

    @ManyToOne
    @JoinColumn(nullable = false)
    private UserEntity user;
}
