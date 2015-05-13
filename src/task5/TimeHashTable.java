package task5;

import java.util.Hashtable;

/**
 * Created by Zornitsa Petkova on 5/12/15.
 */
public class TimeHashTable {
  Hashtable<String, Thread> table = new Hashtable<String, Thread>();
  private int countTime;
  public TimeHashTable(int countTime) {
    this.countTime = countTime;
  }

  public void put(String key) {
    if (table.containsKey(key)) {
      table.get(key).interrupt();
    }
    Thread thread = new Thread(new Remover(this,key,countTime));
    table.put(key,thread);
    thread.start();
  }

  public Object get(String key) {
    if (table.containsKey(key)) {
      put(key);
      return table.get(key);
    }
    return null;
  }

  public Object remove(String key) {
    if (table.containsKey(key)) {
      return table.remove(key);
    }
    return null;
  }

  public void close(){
    for(Thread t : table.values())
      t.interrupt();
  }

  public void print(){
    for(String key : table.keySet() ){
      System.out.print(key+" ");
    }
}
}
