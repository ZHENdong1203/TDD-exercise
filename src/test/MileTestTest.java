package test;

import main.Length;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;


public class MileTestTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 


@Test
public void testTest() throws Exception {
    assertEquals(Length.feet(3),Length.feet(3));
    assertEquals(Length.inch(3),Length.inch(3));
    assertEquals(Length.mile(3),Length.mile(3));
    assertEquals(Length.yard(3),Length.yard(3));
    assertNotEquals(Length.mile(3),Length.mile(2));
}
@Test
public void testTest1() throws Exception{
    assertEquals(Length.feet(1),Length.inch(12));
    assertEquals(Length.yard(1),Length.feet(4));
    assertEquals(Length.mile(1),Length.yard(1760));
}

@Test
public void testTest2() throws Exception{
    assertEquals(Length.inch(5),Length.inch(1).add(Length.inch(4)));
    assertEquals(Length.feet(5),Length.feet(1).add(Length.feet(4)));
    assertEquals(Length.yard(5),Length.yard(1).add(Length.yard(4)));
    assertEquals(Length.mile(5),Length.mile(1).add(Length.mile(4)));

}

@Test
public void testTestt3() throws Exception{
    assertEquals(Length.feet(5),Length.feet(1).add(Length.yard(1)));
    assertEquals(Length.yard(1762),Length.mile(1).add(Length.yard(2)));

}

} 
