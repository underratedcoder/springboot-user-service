package com.akash.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @Column(name = "courseId")
    private long courseId;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;

    public Course() {
        super();
    }

    public Course(long courseId, String title, String description) {
        super();
        this.courseId = courseId;
        this.title = title;
        this.description = description;
    }

    public long getCourseId() {
        return courseId;
    }
    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course [courseId=" + courseId + ", title=" + title + ", description=" + description + "]";
    }
}
