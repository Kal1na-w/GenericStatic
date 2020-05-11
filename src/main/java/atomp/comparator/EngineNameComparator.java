package atomp.comparator;

import atomp.spares.Engine;

import java.util.Comparator;

public class EngineNameComparator implements Comparator<Engine> {
  @Override
  public int compare(Engine o1, Engine o2) {
    if (o1.getStuff().length() == o2.getStuff().length()) {
      return 0;
    }
    return o1.getStuff().length() > o2.getStuff().length() ? 1 : -1;
  }
}
