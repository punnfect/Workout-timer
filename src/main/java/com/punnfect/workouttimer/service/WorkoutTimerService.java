package com.punnfect.workouttimer.service;


import com.punnfect.workouttimer.entities.WorkoutTimer;
import com.punnfect.workouttimer.repository.WorkoutTimerRepo;
import org.springframework.stereotype.Service;

import java.util.List;

//service bean for business layer logic
@Service
public class WorkoutTimerService {

    //creates variable for connection to the needed repo
    private final WorkoutTimerRepo workoutTimerRepo;

    //constructor, spring boot will give requested beans here
    public WorkoutTimerService(WorkoutTimerRepo workoutTimerRepo) {
        this.workoutTimerRepo = workoutTimerRepo;

    }

    //returns all timers in a List<WorkoutTimer> uses CRUD operations from extending JPArepo in workoutTimerRepo
    public List<WorkoutTimer> getAllTimers() {
        return workoutTimerRepo.findAll();

    }

    //Saves and returns a WorkoutTimer. Uses CRUD from JPA Repo in workouTimerRepo
    public WorkoutTimer createTimer(WorkoutTimer timer) {
        return workoutTimerRepo.save(timer);
    }

}
