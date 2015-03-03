/**
 * Created by dan on 3.3.15.
 */
public class Link implements Chain {
    private Chain nextChain;

    @Override
    public void setNextChain(Chain chain) {
        this.nextChain = chain;
    }

    @Override
    public void printMessage(Message message) {
        System.out.println("\"Link: send(\"MAC1:" + message.getMessage() + "\")");
        String msg = message.getMessage();
        String.join("MAC1:", msg);
        String tmp = "MAC1:";
        tmp += msg;
        message.setMessage(tmp);

        if (nextChain != null) {
            nextChain.printMessage(message);
        }
    }

    @Override
    public void reversePrint(Message message) {
        String tmp = message.getMessage();
        tmp = tmp.substring(tmp.indexOf(":") + 1);
        message.setMessage(tmp);
        System.out.println("\"Link: demux(\"" + message.getMessage() + "\")");
        if (nextChain != null) {
            nextChain.reversePrint(message);
        }
    }


}
