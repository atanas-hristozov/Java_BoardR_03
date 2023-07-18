package com.company;

import java.time.LocalDate;

public class Task extends BoardItem{
    public static final String ASSIGNEE_FIELD_SHOULD_NOT_BE_EMPTY = "Assignee field should not be empty!";
    public static final int MIN_ASSIGNEE_LENGHT = 5;
    public static final int MAX_ASSIGNEE_LENGHT = 30;
    public static final String ASSIGNEE_SHOULD_BE_BETWEEN_5_AND_30_SYMBOLS = "Assignee should be between 5 and 30 symbols";
    public String assignee;
    public Task(String title, String assignee, LocalDate dueDate) {
        super(title, dueDate, Status.TODO);
        setAssignee(assignee);
    }

    public String getAssignee() {
        return assignee;
    }



    @Override
    public Status getStatus() {
        return super.getStatus();
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public LocalDate getDueDate() {
        return super.getDueDate();
    }

    @Override
    public void setDueDate(LocalDate dueDate) {
        super.setDueDate(dueDate);
    }

    @Override
    public void revertStatus() {
        super.revertStatus();
    }

    @Override
    public void advanceStatus() {
        super.advanceStatus();
    }

    @Override
    public String viewInfo() {
        return super.viewInfo();
    }

    @Override
    public void displayHistory() {
        super.displayHistory();
    }

    public void setAssignee(String assignee) {
        if(assignee.isEmpty()){
            throw new IllegalArgumentException(ASSIGNEE_FIELD_SHOULD_NOT_BE_EMPTY);
        } else if (assignee.length()< MIN_ASSIGNEE_LENGHT || assignee.length()> MAX_ASSIGNEE_LENGHT){
            throw new IllegalArgumentException(ASSIGNEE_SHOULD_BE_BETWEEN_5_AND_30_SYMBOLS);
        } else {
            if(this.assignee!=null && this.assignee!=assignee){
                logEvent(String.format("Assignee changed from %s to %s", this.assignee, assignee));
            }
            this.assignee = assignee;
        }
    }
}
