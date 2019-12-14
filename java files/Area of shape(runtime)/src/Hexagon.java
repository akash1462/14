
public class Hexagon extends Shape {
	private int side;
	
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public Hexagon(int side){
		super("Hexagon");
		this.side = side;
		
	}
	
	
}
