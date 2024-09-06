package ask.urfu.examples.patterns.behavior.templatemethod;

/**
 * How to use Template method pattern
 */
public class Usage {

  public static void main(String[] args) {
    Message message = new Message();
    MessageSender sender = new FormatAMessageSender();
//    MessageSender sender = new FormatBMessageSender();
    sender.sendMessage(message);
  }

}
