package task5;

import java.util.Hashtable;

/**
 * Created by Zornitsa Petkova on 5/12/15.
 */
public class Remover extends Thread {
  private int countTime;
 private String key;
  Hashtable<String, Object> hasTable = new Hashtable<String, Object>();
  TimeHashTable table = new TimeHashTable(hasTable,countTime);

  public Remover(TimeHashTable table, String key) {
    this.table = table;
    this.key = key;

  }

  public void run(){
    while(countTime != 3){
      try {
        Thread.sleep(1000);
        countTime ++;
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
   table.remove(key);
  }
}
