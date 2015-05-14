package task5;

import task5.task52.Remover2;

import java.util.Hashtable;

/**
 * Created by Zornitsa Petkova on 5/12/15.
 */
public class TimeHashTable {
  Hashtable<String, Value> table = new Hashtable<String, Value>();
  private int countTime;



  public TimeHashTable(int countTime) {
    this.countTime = countTime;
  }

  public void put(String key, Object value) {
    Thread thread = new Thread(new Remover2(this, key, countTime ));
    table.put(key, new Value(value, thread));
    thread.start();
  }

  public Object get(String key) {
    if (table.containsKey(key)) {
      put(key, table.get(key).value);
      return table.get(key).value;
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
    for (Value t : table.values())
      t.thread.interrupt();
  }

  public void print() {
    for (String key : table.keySet()) {
      System.out.print(key + " ");
    }
  }
}
