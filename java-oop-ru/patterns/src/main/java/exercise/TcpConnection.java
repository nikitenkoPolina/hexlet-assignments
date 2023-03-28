package exercise;

import exercise.connections.Connected;
import exercise.connections.Connection;

// BEGIN
public class TcpConnection implements Connection {
    public Connection state;
    public String toWrite;
    private final String ip;
    private final int port;

    public TcpConnection(String ip, int port) {
        this.ip = ip;
        this.port = port;
        this.state = new Connected(this);
    }


    @Override
    public String getCurrentState() {
        return this.state.getCurrentState();
    }

    @Override
    public void connect() {
        this.state.connect();
    }

    @Override
    public void write(String toWrite) {
        this.state.write(toWrite);
    }

    @Override
    public void disconnect() {
        this.state.disconnect();
    }
}
// END
