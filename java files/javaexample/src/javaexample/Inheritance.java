package javaexample;

class a{
	int salary = 40000;
}

class b extends a{
	int bonus = 10000;
}

class c extends b{
	int incentive = 12345;
}

public class Inheritance {
	public static void main(String[] args){
		c program = new c();
		System.out.println("salary :" +program.salary);
		System.out.println("bonus :" +program.bonus);
		System.out.println("incentive :" +program.incentive);
		
	}
	
	
}
