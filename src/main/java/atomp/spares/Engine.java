package atomp.spares;

import java.util.Random;
import java.util.function.Function;

public class Engine {
  protected String stuff;
  protected Integer power;
  protected Fuel fuel;

  public Engine(String stuff, Integer power, Fuel fuel) {
    this.stuff = stuff;
    this.power = power;
    this.fuel = fuel;
  }

  public String getStuff() {
    return stuff;
  }

  public void setStuff(String stuff) {
    this.stuff = stuff;
  }

  public Integer getPower() {
    return power;
  }

  public void setPower(Integer power) {
    this.power = power;
  }

  public Fuel getFuel() {
    return fuel;
  }

  public void setFuel(Fuel fuel) {
    this.fuel = fuel;
  }

  private static Fuel[] fuelTypes = {Fuel.DIESEL, Fuel.GAS, Fuel.PETROL};
  private static String[] staffTypes = {"steel", "cast iron", "copper"};

  public static final String dateTimeFormat = "YYYY_DD_MM";

  public static Engine generateRandomEngine() {
    Random random = new Random();
    String staff = Engine.staffTypes[random.nextInt(2)];
    Integer power = random.nextInt(1000);
    Fuel fuel = Engine.fuelTypes[random.nextInt(2)];
    return new Engine(staff, power, fuel);
  }

}

enum Fuel {
  GAS,
  PETROL,
  DIESEL
}


