package ConectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conectar {
    String ip = "localhost";
    String usuario = "root";
    String pwd = "UPMP";
    String puerto = "3306";
    String db = "upmp";
    
    String query = "jdbc:mysql://" + ip + ":" + puerto + "/" + db;

    public Connection conectarToDB(){
        Connection conectar = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(query,usuario,pwd);
            JOptionPane.showMessageDialog(null,"Conectado");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Fallo la Conexion");
        }
        return conectar;
    }
}
