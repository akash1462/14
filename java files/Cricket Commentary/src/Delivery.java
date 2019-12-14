
public class Delivery {
	private String bowler;
	private String batsman;
	
	public void displayDeliveryDetails(String bowler, String batsman){
		//print lastname of the bowler and batsman
		this.bowler = bowler;
		this.batsman = batsman;
		System.out.println("Player details of the delivery:");
		String[] arrsplit = bowler.split(" ", 2);
			System.out.println("Bowler :" +arrsplit[1]);	
		String[] arrsplit1 = batsman.split(" ", 2);
			System.out.println("Batsman :" +arrsplit[1]);
	}
	
	public void display(Long runs){
		//this.runs = runs;
		System.out.println("Number of runs scored in the delivery: " +runs );
		if(runs == 4){
			System.out.println("It is a boundary.");
		}
		if(runs == 6){
			System.out.println("It is a Sixer.");
		}
		
	}
}
