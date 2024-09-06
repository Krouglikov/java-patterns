package ask.urfu.examples.patterns.creation.builder;

/**
 * Builder pattern
 */
public class BeaverBuilder {

  private int age;
  private double movementSpeed;
  private double buildingSpeed;
  private double weightCapacity;

  /**
   * Constructor is non-public to encourage static method use
   */
  BeaverBuilder() {
  }

  /**
   * Set age
   */
  public BeaverBuilder age(int age) {
    this.age = age;
    return this;
  }

  /**
   * Set movement speed
   */
  public BeaverBuilder movementSpeed(double movementSpeed) {
    this.movementSpeed = movementSpeed;
    return this;
  }

  /**
   * Set building speed
   */
  public BeaverBuilder buildingSpeed(double buildingSpeed) {
    this.buildingSpeed = buildingSpeed;
    return this;
  }

  /**
   * Ser weight capacity
   */
  public BeaverBuilder weightCapacity(double weightCapacity) {
    this.weightCapacity = weightCapacity;
    return this;
  }

  /**
   * Create a beaver
   */
  public Beaver build() {
    return new Beaver(age, movementSpeed, buildingSpeed, weightCapacity);
  }

}
