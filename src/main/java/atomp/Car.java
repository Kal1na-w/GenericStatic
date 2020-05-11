package atomp;

import atomp.spares.Engine;

public class Car implements Comparable<Car> {
  private String name;
  private Engine engine;

  public Car(String name, Engine engine) {
    this.name = name;
    this.engine = engine;
  }

  public Engine getEngine() {
    return engine;
  }

  @Override
  public int compareTo(Car o) {
    return this.name.compareTo(o.getName());
  }

  public void test() {
    System.out.println();
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public <H extends Runnable<Long>> void testMethod(H generic) {
    System.out.println(generic.run());
  }
}
