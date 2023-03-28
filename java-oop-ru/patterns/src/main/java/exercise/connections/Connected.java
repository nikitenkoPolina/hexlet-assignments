package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Connected implements Connection {

    private TcpConnection tcpConnection;

    public Connected(TcpConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public String getCurrentState() {
        return "connected";
    }

    @Override
    public void connect() {
        System.out.println("Error. Connection exists");
    }

    @Override
    public void write(String toWrite) {
        this.tcpConnection.toWrite = toWrite;
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected");
        this.tcpConnection.state = new Disconnected(this.tcpConnection);
    }
}
// END
