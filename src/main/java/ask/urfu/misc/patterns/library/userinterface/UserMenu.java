package ask.urfu.misc.patterns.library.userinterface;

import ask.urfu.misc.patterns.library.game.UserDecision;
import java.util.Collection;
import java.util.function.Predicate;

public class UserMenu extends UserInterface {

  private final Predicate<UserDecision> optionIsValid;

  public UserMenu(
      UserInterfaceImplementation implementation,
      Collection<? extends UserDecision> validOptions
  ) {
    super(implementation);
    this.optionIsValid = d -> validOptions.stream().anyMatch(x -> x.equals(d));
  }

  public UserMenu(
      UserInterfaceImplementation implementation,
      Predicate<UserDecision> optionIsValid
  ) {
    super(implementation);
    this.optionIsValid = optionIsValid;
  }

  @Override
  public UserDecision awaitNextDecision() throws InterruptedException {
    UserDecision userDecision = super.awaitNextDecision();
    if (optionIsValid.test(userDecision)) {
      return userDecision;
    } else {
      return awaitNextDecision();
    }
  }

}
