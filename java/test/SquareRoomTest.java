import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

public class SquareRoomTest {

	@Test
	public void testArea() {
		assertThat(new SquareRoom(10,10).getArea(), is(100.0));
	}

}
