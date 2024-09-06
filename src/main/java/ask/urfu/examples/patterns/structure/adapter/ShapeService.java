package ask.urfu.examples.patterns.structure.adapter;

import ask.urfu.examples.patterns.structure.adapter.Shape.Point;
import java.util.List;

/**
 * Client.
 * <p>
 * Can't use adaptee class directly for some reasons.
 */
public class ShapeService {

  public void doSomething(Shape t) {
    List<Point> referencePoints = t.getReferencePoints();
    // some code here
  }

}
