package com.example.demo;

import java.time.LocalDate;

public class Task {

    private String description;
    private boolean done;
    private LocalDate dueDate;


    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Task(String description, boolean done, LocalDate dueDate) {
        this.description = description;
        this.done = done;
        this.dueDate = dueDate;
    }

    public Task() {
    }

}
