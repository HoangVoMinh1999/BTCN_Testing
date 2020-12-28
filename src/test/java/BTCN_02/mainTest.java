package BTCN_02;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class mainTest {

	@Test
    public void test01() {
        String rs = mainClass.checkTriangle(0, 0, 0);
        String expected = "Không phải tam giác";
        assertEquals(rs, expected);
	}
	@Test
    public void test02() {
        String rs = mainClass.checkTriangle(2, 3, 4);
        String expected = "Tam giác nhọn";
        assertEquals(rs, expected);
	}	@Test
    public void test03() {
        String rs = mainClass.checkTriangle(3, 4, 5);
        String expected = "Tam giác vuông";
        assertEquals(rs, expected);
	}	@Test
    public void test04() {
        String rs = mainClass.checkTriangle(5, 5, 5);
        String expected = "Tam giác đều";
        assertEquals(rs, expected);
	}

}
