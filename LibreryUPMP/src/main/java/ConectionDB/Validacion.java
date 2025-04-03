package ConectionDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Validacion {
    public boolean validarUsuario(JTextField usuario, JPasswordField pwd){
        boolean retorno = false;
        try{
            ResultSet rs = null;
            PreparedStatement ps = null;
            
            String query = "select * from usuario where usuario.Usuario = (?) and usuario.password = (?) ";
            Conectar c = new Conectar();
            ps = c.conectarToDB().prepareStatement(query);
            
            ps.setString(1, usuario.getText());
            ps.setString(2, String.valueOf(pwd.getPassword()));
            rs = ps.executeQuery();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Ingreso Exitoso a la BD");
                retorno = true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Acceso denegado");
                retorno = false;
            }
        }
        catch(Exception e){
            
        }
        
        return retorno;
        
    }
    
    
}
