package db;

public class Connection {
    private static Connection thisConnection;
    private Connection(){

    }
    public static Connection getThisConnection(){
        if (thisConnection != null){
            thisConnection = new Connection();
        }
        return thisConnection;
    }
}
