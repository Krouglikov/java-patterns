package ask.urfu.examples.patterns.structure.bridge;

import ask.urfu.examples.patterns.structure.bridge.util.KeyPressImitator;

/**
 * Implementation subclass
 */
public class KeyboardInterfaceImplementation implements GameInterfaceImplementation {

  private final KeyPressImitator keyboard;

  public KeyboardInterfaceImplementation(KeyPressImitator keyboard) {
    this.keyboard = keyboard;
    new Thread(keyboard).start();
  }

  @Override
  public boolean forwardCommand() {
    return keyboard.lastKeyPressed().equals("W");
  }

  @Override
  public boolean backCommand() {
    return keyboard.lastKeyPressed().equals("S");
  }

  @Override
  public boolean fireCommand() {
    return keyboard.lastKeyPressed().equals("Space");
  }

  @Override
  public boolean specialCommand() {
    return keyboard.lastKeyPressed().equals("Ctrl");
  }

  @Override
  public boolean quitCommand() {
    return keyboard.lastKeyPressed().equals("Esc");
  }

}
