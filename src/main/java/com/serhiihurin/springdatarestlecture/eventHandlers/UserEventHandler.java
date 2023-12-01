package com.serhiihurin.springdatarestlecture.eventHandlers;

import com.serhiihurin.springdatarestlecture.entities.Department;
import com.serhiihurin.springdatarestlecture.entities.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.rest.core.annotation.*;
import org.springframework.stereotype.Component;

@RepositoryEventHandler
@Slf4j
@RequiredArgsConstructor
@Component
public class UserEventHandler {
    @HandleBeforeCreate
    public void handleBeforeCreate(User user) {
        log.info("Creating new amogus - " + user.getFirstName());
    }

    @HandleAfterCreate
    public void handleAfterCreate(User user) {
        log.info("Created new amogus - " + user.getFirstName());
    }
}
