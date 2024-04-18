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

    @Test
    void testGradingForAStudent(){
        StudentCourses studentCourses = new StudentCourses();
        studentCourses.gradeStudent(1,101,100,studentCoursesList);
        assertEquals('A',StudentCourses.calculatorGrade(100));
        assertEquals('B',StudentCourses.calculatorGrade(80));
        assertEquals('C',StudentCourses.calculatorGrade(70));
        assertEquals('D',StudentCourses.calculatorGrade(60));
        assertEquals('F',StudentCourses.calculatorGrade(40));
    }
    @Test
    void testPrintStudentCoursesListEmpty() {
        StudentCourses studentCourses = new StudentCourses();
        studentCourses.printStudentCoursesList(new ArrayList<>());
        assertTrue(true); // No assertion, just checking for no errors
    }

    @Test
    void testPrintStudentCoursesListNotEmpty() {
        StudentCourses studentCourses = new StudentCourses();
        studentCourses.printStudentCoursesList(studentCoursesList);
        assertTrue(true); // No assertion, just checking for no errors
    }
    @Test
    void testIsStudentCoursePresentInSchoolValid() {
        StudentCourses studentCourses = new StudentCourses();
        assertTrue(studentCourses.isStudentCoursePresentInSchool(studentCoursesList));
    }

    @Test
    void testIsStudentCoursePresentInSchoolInvalid() {
        StudentCourses studentCourses = new StudentCourses();
        studentCoursesList.get(0).setCourseCode(110); // Invalid course code
        assertFalse(studentCourses.isStudentCoursePresentInSchool(studentCoursesList));
    }
    @Test
    void testPrintStudentCoursesList() {
        StudentCourses studentCourses = new StudentCourses();
        studentCourses.printStudentCoursesList(studentCoursesList);
        assertNotNull(studentCoursesList);
    }
    @Test
    void testIsStudentCoursePresentInSchool() {
        StudentCourses studentCourses = new StudentCourses();
        assertTrue(studentCourses.isStudentCoursePresentInSchool(studentCoursesList));
    }
    @Test
    void testGetSetId() {
        StudentCourses studentCourses = new StudentCourses();
        studentCourses.setStudentId(1);
        assertEquals(1, studentCourses.getStudentId());
    }

    @Test
    void testGetSetName() {
        StudentCourses studentCourses = new StudentCourses();
        studentCourses.setCourseCode(100);
        assertEquals(100, studentCourses.getCourseCode());
    }

    @Test
    void testGetSetAge() {
        StudentCourses studentCourses = new StudentCourses();
        studentCourses.setId(1);
        assertEquals(1, studentCourses.getId());
    }


}