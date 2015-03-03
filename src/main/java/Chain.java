/**
 * Created by dan on 3.3.15.
 */
public interface Chain {
    public void setNextChain(Chain chain);

    public void printMessage(Message message);
}
