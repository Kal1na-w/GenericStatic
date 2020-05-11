package atomp;

import atomp.comparator.EngineNameComparator;
import atomp.spares.Engine;
import atomp.spares.Fuel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ApplicationTest {

  @Test
  public void compareTest() {
    Engine engine1 = new Engine("steel", 500, Fuel.DIESEL);
    Engine engine2 = new Engine("steel", 500, Fuel.DIESEL);
    assertEquals(engine1.compareTo(engine2), 0);
  }

  @Test
  public void testCompareFirstBeFirstTest() {
    Engine engine1 = new Engine("steel", 600, Fuel.DIESEL);
    Engine engine2 = new Engine("steel", 500, Fuel.DIESEL);
    assertEquals(engine1.compareTo(engine2), 1);
  }


  @Test
  public void testCompareSecondBeFirstTest() {
    Engine engine1 = new Engine("steel", 400, Fuel.DIESEL);
    Engine engine2 = new Engine("steel", 500, Fuel.DIESEL);
    assertEquals(engine1.compareTo(engine2), -1);
  }

  @Test
  public void nameComparatorTest() {
    Engine engine1 = new Engine("ABCc", 400, Fuel.DIESEL);
    Engine engine2 = new Engine("abc", 500, Fuel.DIESEL);
    Engine engine3 = new Engine("abc", 500, Fuel.DIESEL);
    EngineNameComparator engineNameComparator = new EngineNameComparator();
    assertEquals(1, engineNameComparator.compare(engine1, engine2));
    assertEquals(0, engineNameComparator.compare(engine3, engine2));
    assertEquals(-1, engineNameComparator.compare(engine3, engine1));
  }

  @Test
  public void equalsTest() {
    Engine engine2 = new Engine("abc", 500, Fuel.DIESEL);
    Engine engine3 = new Engine("abc", 500, Fuel.DIESEL);
    Engine engine4 = new Engine("abc", 500, Fuel.DIESEL);
    //Рефлексивность
    //для любого заданного значения x, выражение x.equals(x) должно возвращать true.
    //Заданного — имеется в виду такого, что x != null
    assertTrue(engine2.equals(engine2));

    //Симметричность
    //для любых заданных значений x и y, x.equals(y)
    //должно возвращать true только в том случае, когда y.equals(x) возвращает true.
    assertEquals(engine3.equals(engine2), engine2.equals(engine3));

    //Транзитивность
    //для любых заданных значений x, y и z, если x.equals(y)
    // возвращает true и y.equals(z) возвращает true, x.equals(z) должно вернуть значение true.
    assertTrue(engine2.equals(engine3));
    assertTrue(engine3.equals(engine4));
    assertTrue(engine2.equals(engine4));

    //Согласованность
    //для любых заданных значений x и y повторный вызов x.equals(y)
    // будет возвращать значение предыдущего вызова этого метода при условии,
    // что поля, используемые для сравнения этих двух объектов, не изменялись между вызовами.
    assertTrue(engine2.equals(engine3));
    assertTrue(engine2.equals(engine3));
    //Сравнение null
    //для любого заданного значения x вызов x.equals(null) должен возвращать false.
    engine3 = null;
    assertFalse(engine2.equals(engine3));

    if (engine2.equals(engine4)) {
      assertTrue(engine2.hashCode() == engine4.hashCode());
    }
  }
}
