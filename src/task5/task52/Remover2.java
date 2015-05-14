package task5.task52;

import task5.TimeHashTable;

/**
 * Created by Zornitsa Petkova on 5/14/15.
 */
public class Remover2 extends Thread {
  private int countTo;
  private int count;
  private String key;


  private TimeHashTable table;

  public Remover2(TimeHashTable table, String key, int countTo) {
    this.table = table;
    this.key = key;
    this.countTo = countTo;
  }

  public void run() {
    for (count = 0; count < countTo; count++) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        return;
      }
    }
    table.remove(key);
    System.out.println("Mahame " + key);
  }

  {
  }
}
