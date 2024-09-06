package ask.urfu.examples.patterns.behavior.mediator;

import java.time.Duration;
import java.time.LocalDate;

/**
 * Essence of Mediator pattern.
 * <p>
 * Rules of behavior:
 * <ul>
 * <li>Date field MUST be set, otherwise validator must show error message;</li>
 * <li>Int field can be empty if Date field is not set or is in future;</li>
 * <li>Int field cannot be set to negative value, if anything, it's reset to 0;</li>
 * <li>When Int field is set, Date field updates to (today - Int field);</li>
 * <li>When Date field is set, Int field is updated to (Date field - today) in days;</li>
 * </ul>
 */
public class Mediator {

  //region Colleagues

  Input<Long> intInput;
  Input<LocalDate> dateInput;
  ValidatorOutput validatorOutput;

  //endregion

  public Mediator() {
    intInput = new Input<>(this);
    dateInput = new Input<>(this);
    validatorOutput = new ValidatorOutput(this);
    validate();
  }

  public Input<Long> getIntInput() {
    return intInput;
  }

  public Input<LocalDate> getDateInput() {
    return dateInput;
  }

  public ValidatorOutput getValidatorOutput() {
    return validatorOutput;
  }

  /**
   * Rules of behavior:
   * <ul>
   * <li>Int field can be empty if Date field is not set or is in future;</li>
   * <li>Int field cannot be set to negative value, if anything, it's reset to 0;</li>
   * <li>When Int field is set, Date field updates to (today - Int field);</li>
   * <li>When Date field is set, Int field is updated to (Date field - today) in days;</li>
   * </ul>
   */
  public void wasChanged(Colleague colleague) {
    // When Date field is set, Int field is updated to (Date field - today) in days
    if (colleague == dateInput) {
      LocalDate newDate = dateInput.getValue();
      if (newDate != null) {
        // technical hint: between() fails on LocalDate type
        long days =
            Duration.between(newDate.atStartOfDay(), LocalDate.now().atStartOfDay()).toDays();
        if (intInput.getValue() != days) {
          intInput.setValue(days);
        }
      }
    }
    // Int field cannot be set to negative value, if anything, it's reset to 0.
    // When Int field is set, Date field updates to (today - Int field)
    else if (colleague == intInput) {
      long value = intInput.getValue();
      if (value < 0) {
        intInput.setValue(0L);
      } else {
        LocalDate date = LocalDate.now().minusDays(value);
        LocalDate dateInputValue = dateInput.getValue();
        if (dateInputValue == null || !dateInputValue.equals(date)) {
          dateInput.setValue(date);
        }
      }
    }
    validate();
  }


  private void validate() {
    StringBuilder stringBuilder = new StringBuilder();

    // Date field MUST be set
    if (dateInput.getValue() == null) {
      stringBuilder.append("Date field must be set. ");
    }
    // Int field can be empty if Date field is not set or is in future
    if (intInput == null
        && dateInput != null
        && !dateInput.getValue().isAfter(LocalDate.now())) {
      stringBuilder.append("Int field must be set. ");
    }
    // update validator output
    String validatorText = stringBuilder.toString();
    if (validatorText.isEmpty()) {
      validatorOutput.setText("OK");
    } else {
      validatorOutput.setText(validatorText);
    }
  }

}
