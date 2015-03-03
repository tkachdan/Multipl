/**
 * Created by dan on 3.3.15.
 */
public class Example {

    public static void main(String[] args) {
        Message message = new Message("Hey Joel what’s up? ","Sarah",1,1,1);

        Chain application = new Application();
        Chain transport = new Transport();
        Chain internet = new Internet();
        Chain link = new Link();

        application.setNextChain(transport);
        transport.setNextChain(internet);
        internet.setNextChain(link);

        application.printMessage(message);

    }



}
