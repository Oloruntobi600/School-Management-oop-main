package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Course {
    public static final int MATHEMATICS_CODE = 100;
    public static final int ENGLISH_CODE = 101;
    public static final int ECONOMICS_CODE = 102;
    public static final List<Integer> SUBJECT_CODES = List.of(MATHEMATICS_CODE, ENGLISH_CODE, ECONOMICS_CODE);;

    private int courseId;
    public String courseTittle;
    private int courseCode;
    private int teacherId;

    public Course(int courseId, String courseTittle, int courseCode, int teacherId) {
        this.courseId = courseId;
        this.courseTittle = courseTittle;
        this.courseCode = courseCode;
        this.teacherId = teacherId;
    }
    public void showCourseDetails(Course course) {
        System.out.println(course.getCourseId());
        System.out.println(course.getCourseCode());
        System.out.println(course.getCourseTittle());
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseTittle() {
        return courseTittle;
    }

    public void setCourseTittle(String courseTittle) {
        this.courseTittle = courseTittle;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseTittle='" + courseTittle + '\'' +
                ", courseCode=" + courseCode +
                ", teacherId=" + teacherId +
                '}';
    }
}
