package com.SchoolManagementSystem;

import java.util.List;

/**
 * Many teachers, students
 * Implement teachers and student
 * using an Arraylist
 * created by Duke on 4/20/19
 */
public class School {

    private List<Teacher> teachers;
    private List<Students> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created
     *
     * @param teachers list of teachers in the school.
     * @param students list of students in the school.
     */
    public School(List<Teacher> teachers, List<Students> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * @return the list of teachers in the school
     */

    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * add teacher to the school
     * @param teacher the teacher to be added
     */
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;

    }

    /**
     *
     * @return the list of students in school
     */
    public List<Students> getStudents() {
        return students;
    }

    /**
     * Add a student to the school
     * @param student the sudent to be added
     */
    public void addStudent(Students student){
        students.add(student);

    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }

    /**
     *
     * @return total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     *
     * @param MoneyEarned money that is supposed to be added
     */

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money spent by the school
     * is the salary given by the school to its teacher
     * @param MoneySpent the money by school
     */
    public static void updateTotalMoneySpent(int MoneySpent) {
       totalMoneySpent-= MoneySpent;

    }
}


