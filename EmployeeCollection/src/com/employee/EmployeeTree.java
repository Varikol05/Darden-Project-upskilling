package com.employee;

import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeTree {
	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        Employee t1 = new Employee(1, "a", "B", 10000);
        Employee t2 = new Employee(2, "b", "c", 20000);
        Employee t3 = new Employee(3, "c", "a", 30000);
        Employee t4 = new Employee(4, "d", "j", 40000);
        Employee t5 = new Employee(11, "e", "k", 50000);
        Employee t6 = new Employee(6, "f", "l", 60000);
        Employee t7 = new Employee(7, "g", "m", 70000);
        Employee t8 = new Employee(8, "h", "n", 80000);
        Employee t9 = new Employee(9, "i", "o", 1000);
        Employee t10 = new Employee(10, "j", "p", 100000);
        System.out.println("choose 1 for name choose 2 for department choose 3 for salary choose 4 for id");
        int choose = s.nextInt();
        switch (choose) {
            case 1:
                TreeSet<Employee> s1 = new TreeSet<>(new Sortbyid());
                s1.add(t1);
                s1.add(t2);
                s1.add(t3);
                s1.add(t4);
                s1.add(t5);
                s1.add(t6);
                s1.add(t7);
                s1.add(t8);
                s1.add(t9);
                s1.add(t10);
                System.out.println(s1);
                break;
            case 2:
                TreeSet<Employee> s2 = new TreeSet<>(new Sortbysalary());
                s2.add(t1);
                s2.add(t2);
                s2.add(t3);
                s2.add(t4);
                s2.add(t5);
                s2.add(t6);
                s2.add(t7);
                s2.add(t8);
                s2.add(t9);
                s2.add(t10);
                System.out.println(s2);
                break;
            case 3:
                TreeSet<Employee> s3 = new TreeSet<Employee>(new Sortbyname());
                s3.add(t1);
                s3.add(t2);
                s3.add(t3);
                s3.add(t4);
                s3.add(t5);
                s3.add(t6);
                s3.add(t7);
                s3.add(t8);
                s3.add(t9);
                s3.add(t10);
                System.out.println(s3);
                break;
            case 4:
                TreeSet<Employee> s4 = new TreeSet<Employee>(new Sortbydepartment());
                s4.add(t1);
                s4.add(t2);
                s4.add(t3);
                s4.add(t4);
                s4.add(t5);
                s4.add(t6);
                s4.add(t7);
                s4.add(t8);
                s4.add(t9);
                s4.add(t10);
                System.out.println(s4);
                break;
        }
    }}


