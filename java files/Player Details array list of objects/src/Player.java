
public class Player {
	private String name;
	private String country;
	private String skill;
	
	public Player(String name, String country, String skill){
		this.name = name;
		this.country = country;
		this.skill = skill;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public Player(){
		
	}
	
	public String toString(){
		String s =  String.format("%-15s %-15s %-15s", name, country, skill);
		//System.out.println(s);
		return s;
	}
}
