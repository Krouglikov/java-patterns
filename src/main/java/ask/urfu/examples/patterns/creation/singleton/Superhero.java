package ask.urfu.examples.patterns.creation.singleton;

/**
 * Weird kind of singletons -- enum constants
 */
public enum Superhero {

  BATMAN {
    //insert fields here

    @Override
    public void saveTheWorld() {
      //insert code here
    }
  },

  SUPERMAN {
    //insert fields here

    @Override
    public void saveTheWorld() {
      //insert code here
    }
  };

  //insert fields and constructor here

  public abstract void saveTheWorld();

}
