import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class GiaiPTBacITest {
	GiaiPTBacI pt = new GiaiPTBacI();
	@Test
	public void testTrue() {
		assertEquals(-1.00, pt.TimNghiem(1.00, 1.00),0.000001);
	}
	
	  @Rule
	  public ExpectedException exception = ExpectedException.none();
	
	  @Test
	  public void TimNghiemThrowsArthmeticException() {
	
	    exception.expect(ArithmeticException.class);
	    pt.TimNghiem(9, 1);
	  }
}

