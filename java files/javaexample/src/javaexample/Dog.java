package javaexample;

public class Dog {

	String name;
	String breed;
	int age; 
	String color;
	
	public Dog(String name, String breed, int age, String color){
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	
	public String getname(){
		return name;
	}
	
	public String getbreed(){
		return breed;
	}
	
	public int getage(){
		return age;
	}
	
	public String getcolor(){
		return color;
	}
	
	public String a1(){
		return("his name is " +this.getname() + "breed is" +this.getbreed() + "," + this.getage() + "," + this.getcolor());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog abc = new Dog("tuffy","papillon",5,"white");
		System.out.println(abc.a1());
	}

}
