package ask.urfu.examples.patterns.behavior.templatemethod;

public class FormatBMessageSender extends MessageSender {

  @Override
  protected void preprocessMessage(Message message) {
    //implement
    System.out.println("Preprocess Format B message");
  }

  @Override
  protected Envelope makeEnvelope(Message message) {
    //implement
    System.out.println("Make Format B envelope");
    return null;
  }

  @Override
  protected Quittance sendEnvelope(Envelope envelope) {
    //implement
    System.out.println("Send Format B envelope");
    return null;
  }

  @Override
  protected void processQuittance(Quittance quittance) {
    //implement
    System.out.println("Process Format B quittance");
  }
}
