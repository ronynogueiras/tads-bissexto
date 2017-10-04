package tadsBissexto;

import static org.junit.Assert.*;

import org.junit.Test;

public class BissextoTest {

	@Test
	public void test() {
		Bissexto ano = new Bissexto();
		
		assertEquals(true, ano.anoBissexto(2000));
		assertEquals(true, ano.anoBissexto(380));
		assertEquals(true, ano.anoBissexto(28));
		assertEquals(false, ano.anoBissexto(2017));
	}

}
