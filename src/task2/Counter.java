package task2;

/**
 * Created by Zornitsa Petkova on 5/7/15.
 */
public class Counter extends Thread {
  private String name;
  private int firstNumber;
  private int lastNumber;
  private Counter th;


  public Counter(String name, int firstNumber, int lastNumber) {
    this.name = name;
    this.firstNumber = firstNumber;
    this.lastNumber = lastNumber;
  }

  public void set(Counter th) {
    this.th = th;
  }

  public void run() {

    for (int i = firstNumber; i <= lastNumber; i++) {
      try {
        System.out.println(name + " counts " + i);
        Thread.sleep(100);
      } catch (InterruptedException e) {
        return;
      }

    }
    th.interrupt();
  }


}
