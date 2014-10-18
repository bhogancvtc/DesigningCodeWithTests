import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;


public class PaintCalculatorTest {

	@Test
	public void testCalculateCeilingOfSquareRoom(){
		PaintCalculator pc = new PaintCalculator(new SquareRoom(10,10));
		assertThat(pc.getGallonsOfPaintForCeiling(), is(1));
	}

	@Test
	public void testCalculateCeilingOfLargeSquareRoom(){
		PaintCalculator pc = new PaintCalculator(new SquareRoom(50,50));
		assertThat(pc.getGallonsOfPaintForCeiling(), is(8));
	}
	@Test
	public void testCalculateCeilingOfCircularRoom(){
		PaintCalculator pc = new PaintCalculator(new CircularRoom(10.0));
		assertThat(pc.getGallonsOfPaintForCeiling(), is(1));

		
	}
}
