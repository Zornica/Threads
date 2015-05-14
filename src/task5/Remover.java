package task5;

import task5.task52.TimeOutHashTable;

/**
 * Created by Zornitsa Petkova on 5/12/15.
 */
public class Remover extends Thread {
  private int countTo;
  private int count ;
  private String key;


  private TimeOutHashTable table;

  public Remover(TimeOutHashTable table, String key, int countTo ) {
    this.table = table;
    this.key = key;
    this.countTo = countTo;
    }

  public void run() {
    for ( count = 0; count < countTo; count++) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        return;
      }
    }
    table.remove(key);
    System.out.println("Mahame " + key);
  }

public void reset (){
  count=0;
}
}
