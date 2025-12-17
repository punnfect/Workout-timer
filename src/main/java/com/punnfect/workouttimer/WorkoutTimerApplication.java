package com.punnfect.workouttimer;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.punnfect.workouttimer.repository.WorkoutTimerRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkoutTimerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkoutTimerApplication.class, args);
    }

}
