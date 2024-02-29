package com.example.course_cw_2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    
    @Id
    private int courseId;

    private String courseName,instructor,preRequisites,enrolledStudents;
    private int creditHours,maxCapacity;
    public Course() {
    }
    public Course(int courseId, String courseName, String instructor, String preRequisites, String enrolledStudents,
            int creditHours, int maxCapacity) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
        this.preRequisites = preRequisites;
        this.enrolledStudents = enrolledStudents;
        this.creditHours = creditHours;
        this.maxCapacity = maxCapacity;
    }
    public int getCourseId() {
        return courseId;
    }
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getInstructor() {
        return instructor;
    }
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    public String getPreRequisites() {
        return preRequisites;
    }
    public void setPreRequisites(String preRequisites) {
        this.preRequisites = preRequisites;
    }
    public String getEnrolledStudents() {
        return enrolledStudents;
    }
    public void setEnrolledStudents(String enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
    public int getCreditHours() {
        return creditHours;
    }
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }
    public int getMaxCapacity() {
        return maxCapacity;
    }
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    
}
