package ClasesData;

import Entidades.Brigada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class BrigadaData {
    
    private Connection conex;

    public BrigadaData() {
        
        conex=CentralData.conectarBD();
    }
    
        public void guardarBrigada(Brigada br){
        String sql= ("INSERT INTO brigada (nombreClave,especialidad,codCuartel,estadoBrigada)"
                     + "VALUES (?,?,?,?)");  
         
         try{  
             PreparedStatement ps = conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             
             ps.setString(1, br.getNombreClave());
             ps.setString(2, br.getEspecialidad());
             ps.setInt(3,br.getCuartel().getCodCuartel());
             ps.setBoolean(4,br.isEstadoBrigada());
             
             ps.executeUpdate();
             ResultSet rs= ps.getGeneratedKeys(); 
             
             if(rs.next()){
                 br.setCodBrigada(rs.getInt(1)); 
                 JOptionPane.showMessageDialog(null, "Brigada guardada.");
             }
            
             ps.close();
             
         }catch (SQLException e){
             
             JOptionPane.showMessageDialog(null, " Error en la inserción en la Base de Datos. ");
         }     
  
    }
}
