package com.punnfect.workouttimer.repository;

import com.punnfect.workouttimer.entities.WorkoutTimer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutTimerRepo extends JpaRepository<WorkoutTimer, Long> {


}
