package ask.urfu.examples.patterns.creation.prototype;

public class Walle implements Robot {

  //insert fields here

  public Walle() {
  }

  private Walle(Walle prototype) {
    //clone fields here
  }

  @Override
  public Robot copy() {
    return new Walle(this);
  }

  @Override
  public String report() {
    return "I am Wall-E";
  }

}
