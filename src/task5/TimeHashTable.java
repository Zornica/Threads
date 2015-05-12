package task5;

import java.util.Hashtable;

/**
 * Created by Zornitsa Petkova on 5/12/15.
 */
public class TimeHashTable {
  Hashtable<String, Object> table = new Hashtable<String, Object>();
  private int countTime;
  public TimeHashTable(Hashtable<String,Object> table,int countTime) {
    this.table = table;
    this.countTime = countTime;
  }

  public void put(String key, Object value) {
    table.put(key, value);
  }

  public Object get(String key) {
      countTime=0;
      if (table.containsKey(key)) {
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

}
