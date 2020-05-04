package atomp;

import java.util.Optional;

public class Human implements Runnable<Long> {

  @Override
  public Long run() {
    return 200L;
  }
}
