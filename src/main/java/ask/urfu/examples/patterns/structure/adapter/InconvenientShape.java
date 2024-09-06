package ask.urfu.examples.patterns.structure.adapter;

/**
 * Adaptee.
 * <p>
 * Usually, adaptee is not our code, but a library class. For this reason we can't just rewrite it
 * as suits us.
 */
public final class InconvenientShape {

  private final double[][] points;

  public InconvenientShape(double[][] points) {
    this.points = points;
  }

  public double[][] getPoints() {
    return points;
  }

}
