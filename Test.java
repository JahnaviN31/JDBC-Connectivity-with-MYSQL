// It is recommended to run this code in command prompt.

import java.sql.Connection;
import java.sql.DriverManager;

class Test {
    public static void main(String args[]) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledatabase", "root", "password");
            System.out.println("Connection Success");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
