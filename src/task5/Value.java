package task5;

/**
 * Created by Zornitsa Petkova on 5/13/15.
 */
public class Value {
  public final Object value;
  public final Thread thread;
  public Value(Object value,Thread thread){
    this.value = value;
    this.thread = thread;
  }
}
