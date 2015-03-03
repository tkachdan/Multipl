/**
 * Created by dan on 3.3.15.
 */
public class Example {

    public static void main(String[] args) {
        Message message = new Message("Hey Joel what’s up?");

        Chain application = new Application();
        Chain transport = new Transport();
        Chain internet = new Internet();
        Chain link = new Link();

        application.setNextChain(transport);
        transport.setNextChain(internet);
        internet.setNextChain(link);

        System.out.println("Message:" + message.getMessage());
        application.printMessage(message);


        System.out.println("------------------------------");
        message = new Message("MAC2:IP2:Port2:From Joel>Not much");
        System.out.println("Recv(\"Message:" + message.getMessage()+"\")");
        link = new Link();
        internet = new Internet();
        transport = new Transport();
        application = new Application();

        link.setNextChain(internet);
        internet.setNextChain(transport);
        transport.setNextChain(application);

        link.reversePrint(message);

    }



}
