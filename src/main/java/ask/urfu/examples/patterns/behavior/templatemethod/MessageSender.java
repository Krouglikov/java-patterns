package ask.urfu.examples.patterns.behavior.templatemethod;

/**
 * Template method pattern.
 */
public abstract class MessageSender {

  /**
   * Template method. Should not be changed as such. Hence, final.
   */
  public final void sendMessage(Message message) {
    preprocessMessage(message);
    var envelope = makeEnvelope(message);
    var quittance = sendEnvelope(envelope);
    processQuittance(quittance);
  }

  //region Primitive methods

  protected abstract void preprocessMessage(Message message);

  protected abstract Envelope makeEnvelope(Message message);

  protected abstract Quittance sendEnvelope(Envelope envelope);

  protected abstract void processQuittance(Quittance quittance);

  //endregion

}
