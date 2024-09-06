package ask.urfu.examples.patterns.behavior.chainofresponsibility;

import ask.urfu.examples.patterns.behavior.chainofresponsibility.Handler.Chain;

/**
 * How to use Chain of Responsibility pattern
 */
public class Usage {

  public static void main(String[] args) {
    Text text = new Text();
    Chain<Text> textChain = new Chain<>();
    textChain.link(new AddLineHandler("Lorem ipsum"));
    textChain.link(new AddLineHandler("dolor satem"));
    textChain.link(new ReplaceHandler("ipsum", "centum", false));
    textChain.link(new AddLineHandler("merkur vilat"));
    textChain.link(new ReplaceHandler("merkur", "mekum", true));
    textChain.link(new AddLineHandler("agricolet"));
    textChain.run(text);
    System.out.println(text);
  }

}
