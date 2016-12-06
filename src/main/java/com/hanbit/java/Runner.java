package com.hanbit.java;

import com.hanbit.animal.Dog;

public class Runner {
	
	public static void main(String[] args){
		
		/*FirstClass선언 firstClass객체= new FirstClass(6);
		FirstClass secondClass = new FirstClass(7);
		
		System.out.println(firstClass.getNumber());
		System.out.println(firstClass.addNumber(5));
		System.out.println(firstClass.addNumber(5));
		
		System.out.println(secondClass.getNumber());
		System.out.println(secondClass.addNumber(5));*/
		
		Dog dog = new Dog("이슬", "미니슈나우져", "짙은회색");
		Dog dog2 = new Dog("달래", "슈나우져", "옅은 검정");
		Dog dog3 = new Dog("별이", "슈나우져", "갈색");
		
		System.out.println(dog);
		System.out.println(dog2);
		System.out.println(dog3);
	}
}
