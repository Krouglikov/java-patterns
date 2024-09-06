package ask.urfu.examples.patterns.behavior.templatemethod;

public class FormatAMessageSender extends MessageSender {

  @Override
  protected void preprocessMessage(Message message) {
    //implement
    System.out.println("Preprocess Format A message");
  }

  @Override
  protected Envelope makeEnvelope(Message message) {
    //implement
    System.out.println("Make Format A envelope");
    return null;
  }

  @Override
  protected Quittance sendEnvelope(Envelope envelope) {
    //implement
    System.out.println("Send Format A envelope");
    return null;
  }

  @Override
  protected void processQuittance(Quittance quittance) {
    //implement
    System.out.println("Process Format A quittance");
  }
}
