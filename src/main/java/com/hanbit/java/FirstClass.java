package com.hanbit.java;

public class FirstClass {
	
	int number; // 멤버변수
	int sum;
	
	FirstClass(int number) {
		this.number = number;
	}

	int getNumber(){
		
		return number;
	}
	
	int addNumber(int add){
		number+=add;
		
		int sum = number; // 지역변수는 멤버변수와 같은 이름 사용 가능, 지역변수가 우선순위가 높음
		this.sum = sum;
		
		return number;
	}

}
