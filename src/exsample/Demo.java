package exsample;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by Zornitsa Petkova on 5/8/15.
 */
public class Demo {
  public static void main(String[] args) throws Exception{
    BlockingQueue queue = new ArrayBlockingQueue(1024);
    Producer producer = new Producer(queue);
    Consumer consumer = new Consumer(queue);

    new Thread(producer).start();
    new Thread(consumer).start();
    Thread.sleep(4000);

  }
}
