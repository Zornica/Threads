package task5;



import java.util.Hashtable;

/**
 * Created by Zornitsa Petkova on 5/12/15.
 */
public class TimeHashTable<K,T> {
  Hashtable<K,Value<K,T>> table = new Hashtable<K, Value<K,T>>();
  private int countTime;


  public TimeHashTable(int countTime) {
    this.countTime = countTime;
  }

  public void put(K key, T value) {
    if (table.containsKey(key)) {
      table.get(key).reset();
      return;
    }
    Remover<K,T> thread = new Remover<K,T>(this, key, countTime);
    table.put(key, new Value<K,T>(value, thread));
    thread.start();
  }

  public T get(K key) {
    if (table.containsKey(key)) {
      put(key,(table.get(key).reset()));
      return table.get(key).value;
    }
    return null;
  }

  public Value<K,T> remove(K key) {
    if (table.containsKey(key)) {
      return table.remove(key);
    }
    return null;
  }

  public void close() {
    for (Value<K, T> t : table.values())
      t.thread.interrupt();
  }

  public void print() {
    for (K key : table.keySet()) {
      System.out.print(key + " ");
    }
  }
}
