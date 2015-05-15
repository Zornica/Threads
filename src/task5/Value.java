package task5;

/**
 * Created by Zornitsa Petkova on 5/13/15.
 */
public class Value {
  public final Object value;
  public final Remover thread;

  public Value(Object value, Remover thread) {
    this.value = value;
    this.thread = thread;
  }
}
