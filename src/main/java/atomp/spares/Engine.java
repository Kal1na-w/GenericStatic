package atomp.spares;

import java.util.Random;
import java.util.function.Function;

public class Engine implements Comparable<Engine> {
  protected String stuff;
  protected Integer power;
  protected Fuel fuel;

  public Engine(String stuff, Integer power, Fuel fuel) {
    this.stuff = stuff;
    this.power = power;
    this.fuel = fuel;
  }

  @Override
  public int compareTo(Engine o) {
    if (this.power.equals(o.power)) {
      return 0;
    } else if (this.power > o.power) {
      return 1;
    }
    return -1;
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

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;

    Engine engine = (Engine) o;

    if (!stuff.equals(engine.stuff))
      return false;
    if (!power.equals(engine.power))
      return false;
    return fuel == engine.fuel;
  }

  @Override
  public int hashCode() {
    int result = stuff.hashCode();
    result = 31 * result + power.hashCode();
    result = 31 * result + fuel.hashCode();
    return result;
  }
}


