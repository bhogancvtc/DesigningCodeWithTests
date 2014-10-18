
public class CircularRoom implements Room {

	private double radiusOfRoom;

	public CircularRoom(double radius) {
		radiusOfRoom = radius;
	}

	public double getArea() {
		return (radiusOfRoom * radiusOfRoom * 3.14159);
	}
	
	
	
}
