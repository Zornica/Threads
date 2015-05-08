package task4;

import java.util.concurrent.BlockingQueue;

/**
 * Created by Zornitsa Petkova on 5/8/15.
 */
public class ThreadRemove extends Thread {
  protected BlockingQueue queue = null;
  int index = 0;
  private final Object lock;

  public ThreadRemove(BlockingQueue queue, Object lock) {
    this.queue = queue;
    this.lock = lock;
  }

  public void remove() throws InterruptedException {

    synchronized (lock) {
      if (queue.isEmpty()) {
        lock.wait();
      } else {
        queue.take();
        index--;
        lock.notify();
      }
    }
  }
}
