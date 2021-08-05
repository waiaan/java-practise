package com.example.domain;

import java.io.Serializable;

public class Job implements Serializable {
    private String id;
    private String title;
    private Long minSalary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(Long minSalary) {
        this.minSalary = minSalary;
    }

    @Override
    public String toString() {
        return "Job [id=" + id + ", minSalary=" + minSalary + ", title=" + title + "]";
    }

}
