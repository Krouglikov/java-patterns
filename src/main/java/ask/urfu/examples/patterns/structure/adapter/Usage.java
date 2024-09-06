package ask.urfu.examples.patterns.structure.adapter;

/**
 * How to use Adapter pattern
 */
public class Usage {

  public static void main(String[] args) {
    ShapeService shapeService = new ShapeService();
    InconvenientShape triangle = new InconvenientShape(new double[][]{
        {0d, 0d}, {1d, 0d}, {0d, 1d}
    });
    // won't compile, triangle is not a shape in the sense of our code
    // shapeService.doSomething(triangle);

    shapeService.doSomething(
        new InconvenientShapeAdapter(triangle)
    );
  }

}
