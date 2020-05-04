package atomp;

import atomp.spares.Engine;

import java.util.Map.Entry;

public class Application {
  public static void main(String[] args) {
    Car car = new Car("Hello", Engine.generateRandomEngine());
    car.testMethod(new Child());
  }
}
