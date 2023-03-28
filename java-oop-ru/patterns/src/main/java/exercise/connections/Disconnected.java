package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Disconnected implements Connection {

    private TcpConnection tcpConnection;

    public Disconnected(TcpConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public String getCurrentState() {
        return "disconnected";
    }

    @Override
    public void connect() {
        System.out.println("No connections available");
        this.tcpConnection.state = new Connected(this.tcpConnection);
    }

    @Override
    public void write(String toWrite) {
        System.out.println("Error. No connections available");
    }

    @Override
    public void disconnect() {
        System.out.println("Error. Connection has already been terminated");
    }
}
// END
