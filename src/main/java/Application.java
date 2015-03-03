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
        //Application: mux(“From Sarah>Hey Joel what’s up?”);

            System.out.println("Application: mux(\"From" + message.getFrom()+">"+ message.getMessage()+"\")");

        if(nextChain != null){
            nextChain.printMessage(message);
        }
    }
}
