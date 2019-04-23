package com.SchoolManagementSystem;

/*
*create by Duke on 4/20/2019
* This class is responsible for keeping
* track of students fees, name, grade and fee
* paid
*
 */
public class Students {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new students by initializing
     * Fees for every is $30,000
     * Fees paid initially is 0
     *
     * @param id    id for the student: unique
     * @param name  name of the student.
     * @param grade grade of the student
     */
    public Students(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }
    //Not going to alter student's name, id.

    /**
     * used to update student's grade.
     *
     * @param grade new grade of student.
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Keep adding the fees to feesPaid field.
     * Add the fees to the fees paid.
     * The school is going to receive the fund
     *
     * @param fees the fee that student pays
     */
    public void payFees(int fees) {
        feesPaid += fees;
     School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     * @return name of student
     */

    public String getName() {
        return name;

    }

    /**
     * @return the grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @return fees paid by the student
     */
    public int getFeesPaid() {
        return getFeesPaid();
    }

    /**
     * @return the toal fees of the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees
     */
    public int getRemainingFeee(){
        return feesTotal = feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name :" + name + "Total Fees Paid so far";
    }
}

