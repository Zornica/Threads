package task3;

/**
 * Created by Zornitsa Petkova on 5/7/15.
 */
public class Counter extends Thread {

  private final Object lock;
  private String threadName;
  private int firstNumber;
  private int lastNumber;

  public Counter(String name, int firstNumber, int lastNumber, Object lock) {
    threadName = name;
    this.firstNumber = firstNumber;
    this.lastNumber = lastNumber;
    this.lock = lock;
  }

  public void run() {
    synchronized (lock) {
      for (int i = firstNumber; i <= lastNumber; i++) {
        System.out.println(threadName + " -> " + i);
        lock.notify();
        if (i==lastNumber)
        {
          break;
        }
        try {
          lock.wait();
        } catch (InterruptedException e) {
          System.out.println("Threads " + threadName + " interrupted.");
          break;
        }
      }
    }
  }
}


