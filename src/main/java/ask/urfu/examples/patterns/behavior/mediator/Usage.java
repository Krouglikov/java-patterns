package ask.urfu.examples.patterns.behavior.mediator;

import java.time.LocalDate;

/**
 * How to use Mediator pattern
 */
public class Usage {

  // convenience fields
  private static Input<Long> intInput;
  private static Input<LocalDate> dateInput;
  private static ValidatorOutput validatorOutput;

  // see Mediator class for rules of interaction
  public static void main(String[] args) {
    // create all beans (mediator and colleagues)
    Mediator mediator = new Mediator();

    // convenience to imitate user input and output
    intInput = mediator.getIntInput();
    dateInput = mediator.getDateInput();
    validatorOutput = mediator.getValidatorOutput();

    // imitate user work
    showState();
    imitateUserIntInput(-1);
    showState();
    imitateUserIntInput(0);
    showState();
    imitateUserIntInput(10);
    showState();
    imitateUserDateInput(LocalDate.now().minusDays(1)); // yesterday
    showState();
    imitateUserDateInput(LocalDate.now()); // today
    showState();
    imitateUserDateInput(LocalDate.now().plusDays(1)); //tomorrow
    showState();
  }

  private static void showState() {
    System.out.println("Int field value: " + intInput.getValue());
    System.out.println("Date field value: " + dateInput.getValue());
    System.out.println("Validation field text: " + validatorOutput.getText());
    System.out.println("_______________________");
  }

  private static void imitateUserIntInput(long value) {
    System.out.println("\n>>> User input into INT field: " + value);
    intInput.setValue(value);
  }

  private static void imitateUserDateInput(LocalDate value) {
    System.out.println("\n>>> User input into DATE field: " + value);
    dateInput.setValue(value);
  }

}
