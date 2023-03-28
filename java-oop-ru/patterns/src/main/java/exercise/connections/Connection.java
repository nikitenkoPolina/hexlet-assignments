package exercise.connections;

public interface Connection {
    // BEGIN
    String getCurrentState();

    void connect();

    void write(String toWrite);

    void disconnect();
    // END
}
