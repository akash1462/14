package javaexample;

public class car {
	int modelyear;
	String modelname;
	
	public car(int year,String name){
		modelyear = year;
		modelname = name;
	}
	
	public static void main(String[] args) {	
		car mycar = new car(1969, "Mustang");
		System.out.println(mycar.modelyear+ " " + mycar.modelname);
	}

}
