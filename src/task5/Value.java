package task5;

/**
 * Created by Zornitsa Petkova on 5/13/15.
 */
public class Value<K,T> {
  public final T value;
  public final Remover<K,T> thread;

  public Value(T value, Remover<K,T> thread) {
    this.value = value;
    this.thread = thread;
  }

  public T reset() {
     return (T)thread.reset();
  }
}
