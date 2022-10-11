
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class PrimeTest {
	@Test
	public void checkPrimeNO() {
		Prime ob = new Prime();
		assertEquals(false,ob.PrimeNo(4));
		assertEquals(false,ob.PrimeNo(8));
		assertEquals(true,ob.PrimeNo(7));
	}

}
