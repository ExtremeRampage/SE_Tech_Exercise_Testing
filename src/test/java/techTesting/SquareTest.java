package techTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest 
{
	Square sq = new Square(4);
	
	@Test
	public void test() 
	{
		assertEquals(16, sq.Area()); 
	}

}
