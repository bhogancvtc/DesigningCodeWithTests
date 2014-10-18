import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

public class CircularRoomTest {

	@Test
	public void testArea() {
		assertThat(new CircularRoom(10.0).getArea(), is(314.159));
	}

}
