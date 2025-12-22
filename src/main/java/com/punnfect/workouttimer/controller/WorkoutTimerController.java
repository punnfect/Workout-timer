package com.punnfect.workouttimer.controller;


import com.punnfect.workouttimer.entities.WorkoutTimer;
import com.punnfect.workouttimer.service.WorkoutTimerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Controller for handling all the Rest API data coming in and out, base endpoint is /api/timers
@RestController
@RequestMapping("/api/timers")
public class WorkoutTimerController {

    private final WorkoutTimerService workoutTimerService;

    //constructor for spring boot to inject a bean for workoutTimerService at startup
    public WorkoutTimerController(WorkoutTimerService workoutTimerService) {

        this.workoutTimerService = workoutTimerService;

    }

    //Handles Get requests for what to return to default page of /api/timers returns all timers
    @GetMapping
    public List<WorkoutTimer> getAllTimers() {
        return workoutTimerService.getAllTimers();
    }

    //Handles Post request for when we are going to create a timer, currently on /api/timers
    @PostMapping
    public WorkoutTimer createTimer(@RequestBody WorkoutTimer timer) {
        return workoutTimerService.createTimer(timer);
    }


}
