package com.company;

import java.time.LocalDate;

public class Issue extends BoardItem{
    private String title;
    private String description;
    private LocalDate duedate;

    public Issue(String title, String description, LocalDate dueDate) {
        super(title, dueDate, Status.OPEN);
        validadeDescription(description);
        setDescription(description);
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description){
        this.description=description;
    }
    /*private void setDescription(String description){
        if(description.isEmpty()){
            throw new IllegalArgumentException("No description");
        } else {
            this.description=description;
        }
    }*/
    private void validadeDescription(String description){
        if(description.isEmpty()){
            throw new IllegalArgumentException("No description");
        }
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

    @Override
    protected void logEvent(String event) {
        super.logEvent(event);
    }


}
