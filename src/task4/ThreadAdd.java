package task4;

import java.util.concurrent.BlockingQueue;

/**
 * Created by Zornitsa Petkova on 5/8/15.
 */
public class ThreadAdd extends Thread {
  protected BlockingQueue queue = null;
  int index = 0;
  private final Object lock;

  public ThreadAdd(BlockingQueue queue, Object lock) {
    this.queue = queue;
    this.lock = lock;
  }

  public void run() {
    synchronized (lock) {
      try {
        if (index < queue.size()) {
          queue.put("1");
          queue.put("2");
          index++;
          lock.notifyAll();
        } else {
          lock.wait();
        }
      } catch (InterruptedException e) {
        e.getStackTrace();
      }
    }
  }
}
