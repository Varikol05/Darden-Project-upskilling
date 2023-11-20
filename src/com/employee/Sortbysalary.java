package com.employee;

import java.util.Comparator;

class Sortbysalary implements Comparator<Employee>



{
    public int compare(Employee a, Employee b)



{
     return a.salary - b.salary;
}}
