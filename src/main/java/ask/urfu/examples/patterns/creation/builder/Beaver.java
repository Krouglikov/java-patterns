package ask.urfu.examples.patterns.creation.builder;

public class Beaver {

  private int age;
  private double movementSpeed;
  private double buildingSpeed;
  private double weightCapacity;

  /**
   * Constructor is non-public to encourage builder use
   */
  Beaver(int age, double movementSpeed, double buildingSpeed, double weightCapacity) {
    this.age = age;
    this.movementSpeed = movementSpeed;
    this.buildingSpeed = buildingSpeed;
    this.weightCapacity = weightCapacity;
    //insert invariants checks here
  }

  /**
   * Acquire instance builder
   */
  public static BeaverBuilder builder() {
    return new BeaverBuilder();
  }

  /**
   * Functionality
   */
  public void buildHut() {
    //insert code here
  }

}
