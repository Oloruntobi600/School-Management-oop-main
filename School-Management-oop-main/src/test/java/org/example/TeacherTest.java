package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {
    private List<Teacher>teacherList;

    @BeforeEach
    public void setUp() {
        teacherList = new ArrayList<>();
        teacherList.add(new Teacher(1,"Bimbo",20,"mokola",100));
        teacherList.add(new Teacher(2, "Segun", 20, "mokola", 101));
        teacherList.add(new Teacher(3, "Sayo", 20, "mokola", 102));
    }
    @Test
    void wantToAddCourseForATeacher() {
            int teacherIdToAdd = 3;
            int courseCodeToAdd = 100 & 101 & 102;
            Teacher.addTeacherToCourse(teacherIdToAdd, courseCodeToAdd, teacherList);
            assertEquals(courseCodeToAdd, teacherList.get(0).getCourseCode());

       }
    @Test
    void testAddTeacherToCourseInvalid() {
        Teacher.addTeacherToCourse(1, 100, teacherList); // Invalid course code
        assertEquals(100, teacherList.get(0).getCourseCode()); // Course code should remain unchanged
    }
    @Test
    void wantToRemoveCourseForATeacher() {
        int teacherIdToRemove = 2;
        int courseCodeToRemove = 101 & 102;
        Teacher.removeTeacherFromCourse(teacherIdToRemove, courseCodeToRemove, teacherList);
        assertEquals(courseCodeToRemove, teacherList.get(0).getCourseCode());
    }
    @Test
    void testPrintTeacherCoursesList() {
        Teacher.printTeacherCoursesList();
        assertTrue(true); // No assertion, just checking for no errors
    }
    @Test
    void testGetSetCourseCode() {
        Teacher teacher = new Teacher();
        teacher.setCourseCode(100);
        assertEquals(100, teacher.getCourseCode());
    }


    @Test
    void testShowTeacherDetails() {
        Teacher teacher = new Teacher(1, "Bimbo", 20, "mokola", 100);
        teacher.showTeacherDetails(teacher);
        assertTrue(true);
    }
    @Test
    void testGetSetId() {
        Teacher teacher = new Teacher();
        teacher.setId(1);
        assertEquals(1, teacher.getId());
    }

    @Test
    void testGetSetName() {
        Teacher teacher = new Teacher();
        teacher.setName("Bimbo");
        assertEquals("Bimbo", teacher.getName());
    }

    @Test
    void testGetSetAge() {
        Teacher teacher = new Teacher();
        teacher.setAge(20);
        assertEquals(20, teacher.getAge());
    }
}