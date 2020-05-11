package atomp.comparator;

import atomp.spares.Engine;

import java.util.Comparator;

public class EngineComparator implements Comparator<Engine> {
  @Override
  public int compare(Engine o1, Engine o2) {
    if (o1.getPower().equals(o2.getPower())) {
      return 0;
    } else if (o1.getPower() > o2.getPower()) {
      return 1;
    }
    return -1;
  }
}
