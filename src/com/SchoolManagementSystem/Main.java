package com.SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      Teacher lizzy = new Teacher(1, "Lizzy", 500);
      Teacher melissa = new Teacher(2,"Melissa", 700);
      Teacher vanderhorn = new Teacher(3, "Vanderhorn", 600);


        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(vanderhorn);

      Students tamasha = new Students(1, "Tamasha", 4);
      Students rakshith = new Students (2, "Rakshith Vasude",12);
      Students rabbi = new Students(3, "Rabbi", 5);
      List<Students> studentsList = new ArrayList<>();

      studentsList.add(tamasha);
      studentsList.add(rabbi);
      studentsList.add(rakshith);

      School ghs = new School(teacherList, studentsList);
      Teacher megan = new Teacher(6, "megan",900);
      ghs.addTeacher(megan);

        tamasha.payFees(5000);
        rakshith.payFees(6000);
        System.out.println("Ghs has earned $" + ghs.getTotalMoneyEarned() );
        System.out.println("-------MAKING SCHOOL PAY SALARY-----");

        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to " + vanderhorn.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());

        System.out.println(rakshith);
        melissa.receiveSalary(melissa.getSalary());
        System.out.println(melissa);


    }

}
