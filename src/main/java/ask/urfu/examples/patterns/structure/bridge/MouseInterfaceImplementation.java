package ask.urfu.examples.patterns.structure.bridge;

import ask.urfu.examples.patterns.structure.bridge.util.MouseImitator;
import ask.urfu.examples.patterns.structure.bridge.util.MouseImitator.MouseEvent;

/**
 * Implementation subclass
 */
public class MouseInterfaceImplementation implements GameInterfaceImplementation {

  private final MouseImitator mouse;

  public MouseInterfaceImplementation(MouseImitator mouse) {
    this.mouse = mouse;
    new Thread(mouse).start();
  }

  @Override
  public boolean forwardCommand() {
    return mouse.lastMouseEvent() == MouseEvent.RIGHT;
  }

  @Override
  public boolean backCommand() {
    return mouse.lastMouseEvent() == MouseEvent.LEFT;
  }

  @Override
  public boolean fireCommand() {
    return mouse.lastMouseEvent() == MouseEvent.L_CLICK;
  }

  @Override
  public boolean specialCommand() {
    return mouse.lastMouseEvent() == MouseEvent.R_CLICK;
  }

  @Override
  public boolean quitCommand() {
    return false;
  }
}
