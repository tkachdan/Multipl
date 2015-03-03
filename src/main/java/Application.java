/**
 * Created by dan on 3.3.15.
 */
public class Application implements Chain {
    private Chain nextChain;
    @Override
    public void setNextChain(Chain chain) {
        this.nextChain = chain;
    }

    @Override
    public void printMessage(Message message) {
        if(nextChain != null){
            System.out.println("Message:"+ message.getMessage());
            nextChain.printMessage(message);
        }
    }
}
