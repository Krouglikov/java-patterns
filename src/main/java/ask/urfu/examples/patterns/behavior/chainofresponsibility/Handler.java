package ask.urfu.examples.patterns.behavior.chainofresponsibility;

import java.util.LinkedList;
import java.util.List;

/**
 * Handler in chain
 */
public interface Handler<C> {

  void handle(C context);

  Handler<C> nextHandler();

  /**
   * Utility class -- handlers chain
   */
  class Chain<C> {

    List<Handler<C>> handlers = new LinkedList<>();

    public Handler<C> getNext(Handler<C> current) {
      int i = handlers.indexOf(current);
      if (i == -1 || (i + 1) >= handlers.size()) {
        return null;
      } else {
        return handlers.get(i + 1);
      }
    }

    /**
     * Utility -- add handler
     */
    public <T extends HandlerBase<C>> void link(T handler) {
      handlers.add(handler);
      handler.setChain(this);
    }

    /**
     * Utility -- execute chain of handlers
     */
    public void run(C context) {
      Handler<C> first = handlers.get(0);
      if (first != null) {
        first.handle(context);
      }
    }
  }

}
