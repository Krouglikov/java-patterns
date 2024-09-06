package ask.urfu.examples.patterns.creation.staticfactorymethod;

/**
 * How to use Static factory method pattern
 */
public class Usage {

  public static void main(String[] args) {
    FactoryGirl factoryGirl = FactoryGirl.withJobExperience(5);
    factoryGirl.doWork();
  }

}
