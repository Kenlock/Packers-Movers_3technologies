/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author dell
 */
public class javaconnect {
    Connection conn;
    public static Connection connectDb(){        
        Connection con=null;
        try{
           Class.forName("oracle.jdbc.OracleDriver");
           con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","devi");
           return con;
        }catch(Exception e){
           System.err.println(e);
        }
        return con;
}

}
