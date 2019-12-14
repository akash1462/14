
public class Student {
	private long employeeId;
	private String name;
	private static final String COHORT_CODE = "CHNAJ19004"; 

	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void display(){
		System.out.print(getEmployeeId()+ " ");
		System.out.print(getName()+ " ");
		System.out.print(COHORT_CODE+ "");
		System.out.println();
	}

}
