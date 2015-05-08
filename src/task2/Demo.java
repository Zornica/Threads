package task2;

/**
 * Created by Zornitsa Petkova on 5/7/15.
 */
public class Demo {
  public static void main(String[] args) {
    Counter thr1 = new Counter("ThreadCounter1", 1, 10);
    Counter thr2 = new Counter("ThreadCounter2", 1, 5);
    thr1.start();
    thr2.start();
    while (true) {
      if (!thr1.isAlive()) {
        thr2.interrupt();
        break;
      }
      if (!thr2.isAlive()) {
        thr1.interrupt();
        break;
      }
    }
  }
}
