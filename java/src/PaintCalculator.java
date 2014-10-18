
public class PaintCalculator {

	private static final int PAINT_FOR_CEILING = 350;
	Room room;

	public PaintCalculator(Room room) {
		this.room = room;
	}
	
	private double calculateArea(){
		return room.getArea();
		
	}

	public int getGallonsOfPaintForCeiling() {
      double gallonsNeeded = calculateArea() / PAINT_FOR_CEILING;
      int result = (int) Math.ceil(gallonsNeeded);
      return result;
	}

}
