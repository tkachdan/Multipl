/**
 * Created by dan on 3.3.15.
 */
public class Transport implements Chain {
    private Chain nextChain;

    @Override
    public void setNextChain(Chain chain) {
        this.nextChain = chain;
    }

    @Override
    public void printMessage(Message message) {

        System.out.println("Transport: mux(\"Port" + message.getPort() +
                ":From" + message.getFrom() + ">" + message.getMessage() + "\")");

        if (nextChain != null) {
            nextChain.printMessage(message);
        }
    }
}
