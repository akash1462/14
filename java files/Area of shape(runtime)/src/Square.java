
public class Square extends Shape{

		private int side;
		public int getSide() {
			return side;
		}

		public void setSide(int side) {
			this.side = side;
		}

		public Square(int side){
			super("Square");
			this.side = side;
		}
		
		double calculateArea(){
			double area = 0.00;
			area = side * side;
			return (area);
		}
		
		
		
		
}
