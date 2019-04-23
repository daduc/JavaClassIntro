package com.SchoolManagementSystem;

public class Teacher {

    /**
     * Created by Duke 4/20/19
     * This class is responsible for keeping the track
     * of teacher's name, id, salary
     */

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Create a new Teacher object
     *
     * @param id     id for the teacher.
     * @param name   name of teacher.
     * @param salary salary of teacher.
     */

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;

    }

    /**
     *
     * @return the id.
     */

    public int getId(){
        return id;

        /**
         *
         * @return name of the Teacher
          */
    }

    /**
     *
     * @return the name of the teacher
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return the salary of the teacher.
     */

    public int getSalary() {
        return salary;
    }

    /**
     * Set the salary
     * @param salary
     */
    public void setSalry(int salary){
        this.salary = salary;

    }

    /**
     * Add to salary
     * removes from the total money earned by the school
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned+= salary;
        School.updateTotalMoneySpent(salary);

    }

    @Override
    public String toString() {
        return "Name of the Teacher: " + name
                +"otal salary earned so far $"
                +salaryEarned;
    }
}

