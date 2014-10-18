
public class SquareRoom implements Room{

	private double lengthOfRoom;
	private double widthOfRoom;

	public SquareRoom(double length, double width) {
		lengthOfRoom = length;
		widthOfRoom = width;
	}

	public double getArea() {
		return lengthOfRoom * widthOfRoom;
	}

}
