package db;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionTest {

    @Test
    void getThisConnection() {
        Connection connection = Connection.getThisConnection();
        Connection connection1 = Connection.getThisConnection();
        assertEquals(connection, connection1);
    }
}