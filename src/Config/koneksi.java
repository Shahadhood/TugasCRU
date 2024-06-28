package Config;
import java.sql.*;
import java .util.logging.Level;
import java.util.logging.Logger;
public class koneksi {
    private static Connection conn;
    public static  Connection getConnection(){
        if (conn==null){
            try{
                Class.forName("com.mysql.jdbc.Driver");

                String unl ="jbdc:mysql://localhost:3306//db_kampus2";
                String user= "root";
                String pass="";  
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                conn =(Connection)DriverManager.getConnection(unl, user, pass);
            }catch (Exception e){
                Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return conn;
    } 
}
