package ConectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
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
                JOptionPane.showMessageDialog(null, "Ingreso Exitoso al Administrador");
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
    
    public class RegistroVisitas {
        public boolean BuscarMatricula (JTextField INSERTAR_MATRICULA){
            boolean retorno = false;
            try{
                ResultSet rs = null;
                PreparedStatement ps = null;
            
                String query = "select Matricula from alumno where alumno.Matricula = (?)";
                Conectar c = new Conectar();
                ps = c.conectarToDB().prepareStatement(query);
                
                ps.setString(1, INSERTAR_MATRICULA.getText());
                rs = ps.executeQuery();
                
                if(rs.next()){
                    JOptionPane.showInternalMessageDialog(INSERTAR_MATRICULA, "Registrada su Vista");
                    retorno = true;
                }
                else{
                    JOptionPane.showInternalMessageDialog(INSERTAR_MATRICULA, "Matricula no encontrada, Registrese ");
                    retorno = false;
                }
            }
            catch(Exception e){
            }
            return retorno;   
        }
    }
    
    public class RegistroPrestamos{}
    
    public class RegistroAlumnos{}
    
}
