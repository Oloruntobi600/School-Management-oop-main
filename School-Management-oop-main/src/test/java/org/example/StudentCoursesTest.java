package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentCoursesTest {
    private List<StudentCourses> studentCoursesList;

    @BeforeEach
    public void setUp() {
        studentCoursesList = new ArrayList<>();
        studentCoursesList.add(new StudentCourses( 1, 100, 0, 'F')); // Example data
        studentCoursesList.add(new StudentCourses( 2, 101, 0, 'F')); // Example data
        studentCoursesList.add(new StudentCourses( 3, 102, 0, 'F')); // Example data
    }
    @Test
    void wantToEnrollAStudentToACourse() {

        StudentCourses studentCourses = new StudentCourses();
        studentCourses.enrollCourse(studentCoursesList);
        assertEquals(3, studentCoursesList.size());
    }
    @Test
    void wantToRemoveCoursesForAStudent() {
        int studentIdToRemove = 1;
        int courseCodeToRemove = 100;
        StudentCourses studentCourses = new StudentCourses();
        studentCourses.removeCourse(studentIdToRemove, courseCodeToRemove, studentCoursesList);
        assertEquals(2, studentCoursesList.size());
    }
    @Test
    void wantToRemoveCoursesForAnotherStudent() {
        int studentIdToRemove = 2;
        int courseIdToRemove = 101;
        StudentCourses studentCourses = new StudentCourses();
        studentCourses.removeCourse(studentIdToRemove, courseIdToRemove, studentCoursesList);
        assertNotEquals(1, studentCoursesList.size());
    }
}