package ask.urfu.examples.patterns.structure.adapter;

import java.util.List;

/**
 * Target
 */
public interface Shape {

  List<Point> getReferencePoints();

  final class Point {

    final double x;
    final double y;

    public Point(double x, double y) {
      this.x = x;
      this.y = y;
    }
  }

}
