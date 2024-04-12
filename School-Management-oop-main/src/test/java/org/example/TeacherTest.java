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
            assertEquals(courseCodeToAdd, teacherList.get(0).getCourseCode());// the .get(0) means to.......
        // retrieve the course code of the teacher at index 0 in the teacherList list.
//            Teacher.addTeacherToCourse(teacherIdToAdd, courseCodeToAdd, teacherList);// the .get(0) means to.......
//        // retrieve the teachers id of the teacher at index 0 in the teacherList list.
//            assertEquals(teacherIdToAdd, teacherList.get(0).getId());
       }
    @Test
    void wantToRemoveCourseForATeacher() {
        int teacherIdToRemove = 2;
        int courseCodeToRemove = 101 & 102;
        Teacher.removeTeacherFromCourse(teacherIdToRemove, courseCodeToRemove, teacherList);
        assertEquals(courseCodeToRemove, teacherList.get(0).getCourseCode());// the .get(0) means to.......
        // retrieve the course code of the teacher at index 0 in the teacherList list.
//            Teacher.addTeacherToCourse(teacherIdToAdd, courseCodeToAdd, teacherList);// the .get(0) means to.......
//        // retrieve the teachers id of the teacher at index 0 in the teacherList list.
//            assertEquals(teacherIdToAdd, teacherList.get(0).getId());
    }

//

}