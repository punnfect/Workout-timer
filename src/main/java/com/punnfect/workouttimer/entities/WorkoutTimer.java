package com.punnfect.workouttimer.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "workout_timers")
public class WorkoutTimer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "timer_id")
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "workSeconds")
    Integer workSeconds;

    @Column(name = "restSeconds")
    Integer restSeconds;

    @Column(name = "rounds")
    Integer rounds;

}
