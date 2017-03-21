package ru.stqa.pdt39.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Borealis on 22.03.2017.
 */
public class SquareTests {

  @Test
  public void testArea() {
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 25.0);
  }
}
