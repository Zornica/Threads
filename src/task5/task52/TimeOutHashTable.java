package task5.task52;


import task5.Remover;

import java.util.Hashtable;

/**
 * Created by Zornitsa Petkova on 5/14/15.
 */
public class TimeOutHashTable {
  Hashtable<String, Remover> table = new Hashtable<String, Remover>();
  private int countTime;


  public TimeOutHashTable(int countTime) {
    this.countTime = countTime;
  }

  public void put(String key) {
    Remover thread = new Remover(this, key, countTime);
    table.put(key, thread);
    thread.start();
  }

  public Object get(String key) {
    if (table.containsKey(key)) {
      table.get(key).reset();
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

  public void close() {
    for (Remover t : table.values())
      t.interrupt();
  }

  public void print() {
    for (String key : table.keySet()) {
      System.out.print(key + " ");
    }
  }
}


