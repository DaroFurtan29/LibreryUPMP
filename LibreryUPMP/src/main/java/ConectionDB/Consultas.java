
package ConectionDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/* @author Admin */

public class Consultas {
    
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
                    JOptionPane.showInternalMessageDialog(INSERTAR_MATRICULA, "Matricula no encontrada, Favor de registrarse ");
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
