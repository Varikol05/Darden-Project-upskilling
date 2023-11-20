package com.employee;

import java.util.Comparator;

class Sortbyid implements Comparator<Employee>
{
    public int compare(Employee a, Employee b)



{
     return a.id - b.id;
}

}