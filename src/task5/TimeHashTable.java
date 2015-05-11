package task5;

import java.util.Hashtable;

/**
 * Created by Zornitsa Petkova on 5/11/15.
 */
public class TimeHashTable {
  Hashtable<String, Object> table = new Hashtable<String, Object>();

  public TimeHashTable(Hashtable table) {
    this.table = table;
  }

  public void put(String key, Object value) {
    table.put(key, value);
  }

  public Object get(String key) {
    if (table.containsKey(key)) {
      return table.get(key);
      new Thread(key,System.currentTimeMillis());
    } else {
      return null;
    }
  }

  public void remove(String key) {
    if(table.containsKey(key)){
    table.remove(key);}
    else{
      System.out.println("There is not element with this key!");
    }
  }
}
