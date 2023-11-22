package com.employee;

import java.util.Comparator;

class Sortbyname implements Comparator<Object>
{
    public int compare(Object str1, Object str2)
    {
        String i1=str1.toString();
        String i2= str2.toString();
        return i2.compareTo(i1);
    }
}