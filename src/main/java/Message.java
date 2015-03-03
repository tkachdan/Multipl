/**
 * Created by dan on 3.3.15.
 */
public class Message {
    private String message;
    private String from;
    private int port;
    private int ip;
    private int frameHeader;

    public Message(String message, String from, int port, int ip, int frameHeader) {
        this.message = message;
        this.from = from;
        this.port = port;
        this.ip = ip;
        this.frameHeader = frameHeader;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
        this.ip = ip;
    }

    public int getFrameHeader() {
        return frameHeader;
    }

    public void setFrameHeader(int frameHeader) {
        this.frameHeader = frameHeader;
    }
}
