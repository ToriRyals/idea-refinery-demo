package com.idearefinery.demo.Model;

import java.util.Date;

public class Task {
    private String title;
    private String description;
    private boolean completed;
    private Date createDate;
    private Date completedDate;
    private int id;

    public Task(){}

    public Task(String title, String description, boolean completed, Date createDate, Date completedDate, int id) {
        super();
        this.title = title;
        this.description = description;
        this.completed = completed;
        this.createDate = createDate;
        this.completedDate = completedDate;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(Date completedDate) {
        this.completedDate = completedDate;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
