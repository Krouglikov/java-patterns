package ask.urfu.examples.patterns.creation.prototype;

public class Terminator implements Robot {

  //insert fields here

  public Terminator() {
  }

  private Terminator(Terminator prototype) {
    //clone fields here
  }

  @Override
  public Robot copy() {
    return new Terminator(this);
  }

  @Override
  public String report() {
    return "Terminator reporting";
  }

}
