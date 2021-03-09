package rectangleArea;

import static org.junit.Assert.*;


public class Test {

	@org.junit.Test
	public void test() {
		AreaOfRec area=new AreaOfRec();
		assertEquals(10,area.areaOfRectangle(2,5));
		assertEquals(12,area.areaOfRectangle(2,6));

		

	}

}
