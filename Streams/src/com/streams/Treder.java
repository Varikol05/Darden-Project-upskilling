package com.streams;

import java.util.ArrayList;
import java.util.Comparator;

public class Treder {

	public static void main(String[] args) {
		 ArrayList <Fruits> fruitList = new ArrayList <Fruits>();
		 fruitList.add(new Fruits(100,"apple",40,"red"));
		 fruitList.add(new Fruits(100,"orange",20,"orange"));
		 fruitList.add(new Fruits(50,"Grapes",30,"Green"));
		 fruitList.add(new Fruits(90,"Mango",50,"yellow"));
		 System.out.println("List of fruits sorted by calories");
		 fruitList.stream().filter(f->f.calories<100).forEach(f->System.out.println(f.calories));
		 System.out.println("color wise fruit names");
		 fruitList.stream().sorted(new Comparator<Fruits>()
		 {
			 @Override 
			 public int compare(Fruits o1, Fruits o2)
			 {
				 return o1.getColor().compareTo(o2.getColor()); 
			}
			})
		 .forEach(f->System.out.println(f.getName()));
		 System.out.println("List of fruits which are red sorted by price:");
		 fruitList.stream().filter(f->f.getColor().equalsIgnoreCase("red")).sorted((Fruits o1,Fruits o2)->(int)o1.getPrice()-o2.getPrice()).forEach(f->System.out.println(f.getName())); 
		

	}

}
