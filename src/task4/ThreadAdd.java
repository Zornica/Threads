package task4;

import java.util.concurrent.BlockingQueue;

/**
 * Created by Zornitsa Petkova on 5/8/15.
 */
public class ThreadAdd extends Thread {
  protected BlockingQueue<String> queue;
  int index = 0;
  private final Object lock;


  public ThreadAdd(BlockingQueue queue, Object lock) {
    this.queue = queue;
    this.lock = lock;
  }

  public void run(){

    try {
      System.out.println("slagame 1");
      queue.put("1");
      System.out.println("slagame 2");
      queue.put("2");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
       }
}
