package com.swcoaching.example1.succeed.jpa;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Getter
@Table(name = "succeed")
@Entity
public class SucceedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedDate
    @Column(updatable = false, nullable = false)
    private LocalDateTime createdAt;

//    @ManyToOne
//    @JoinColumn(name = "goal")
//    private GoalEntity goal;
}
