package ask.urfu.examples.patterns.structure.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Adapter. Implements target interface, contains adaptee instance.
 */
public class InconvenientShapeAdapter implements Shape {

  /**
   * Adaptee instance
   */
  private final InconvenientShape inconvenientShape;

  public InconvenientShapeAdapter(InconvenientShape inconvenientShape) {
    this.inconvenientShape = inconvenientShape;
  }

  @Override
  public List<Point> getReferencePoints() {
    double[][] inconvenientPoints = inconvenientShape.getPoints();
    // adapt result
    List<Point> points = new ArrayList<>(inconvenientPoints.length);
    for (double[] p : inconvenientPoints) {
      points.add(new Point(p[0], p[1]));
    }
    return points;
  }

}
