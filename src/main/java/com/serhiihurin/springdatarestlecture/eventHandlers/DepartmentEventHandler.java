package com.serhiihurin.springdatarestlecture.eventHandlers;

import com.serhiihurin.springdatarestlecture.entities.Department;
import com.serhiihurin.springdatarestlecture.entities.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.rest.core.annotation.HandleAfterLinkSave;
import org.springframework.data.rest.core.annotation.HandleBeforeLinkSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

@RepositoryEventHandler
@Slf4j
@RequiredArgsConstructor
@Component
public class DepartmentEventHandler {

    @HandleBeforeLinkSave
    public void handleBeforeLinkSave(Department department, User user) {
        log.info("Some amogus wants to join " + department.getName());
    }

    @HandleAfterLinkSave
    public void handleAfterLinkSave(Department department, User user) {
        log.info("Amogus " + user.getFirstName() + " has joined " + department.getName());
    }
}
