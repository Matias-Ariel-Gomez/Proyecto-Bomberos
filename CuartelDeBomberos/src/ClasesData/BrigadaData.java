package ClasesData;

import Entidades.Bombero;
import Entidades.Cuartel;
import Entidades.Brigada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
     public void eliminarBrigada(int br) {
        String sql = "UPDATE brigada SET estadoBrigada=0 WHERE codBrigada=?";

        try {
            PreparedStatement ps = conex.prepareStatement(sql);

            ps.setInt(1, br);

            int filaEliminada = ps.executeUpdate();

            if (filaEliminada == 1) {
                JOptionPane.showMessageDialog(null, " Eliminacion efectuada.");
            }

            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error en la eliminacón en la Base de Datos.");
        }   
        
     } 
      public void modificarBrigada(Brigada br){
    
       String sql= "UPDATE brigada SET  nombreClave=?, especialidad=?,  estadoBrigada=? "
                   +"  WHERE codBrigada=? " ;
         
        try {
            PreparedStatement ps = conex.prepareStatement(sql); 
            
            ps.setString(1,br.getNombreClave());
            ps.setString(2, br.getEspecialidad());
            ps.setBoolean(3, true);
            ps.setInt(4, br.getCodBrigada());
            
            
            int modificacion= ps.executeUpdate(); 
            
            if (modificacion>=1) {
                JOptionPane.showMessageDialog(null, " Modificacion efectuada.");
            }
            
             ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error en la modificación en la Base de Datos.");
        }
    }
      
      public Brigada buscarBrigada(int id) {
         
         Brigada br=null;
         
         String sql="SELECT  * FROM brigada WHERE  codBrigada=? " ;
         
         try{
             PreparedStatement ps=conex.prepareStatement(sql);
             ps.setInt(1, id);
             
             ResultSet rs=ps.executeQuery();
             
             if(rs.next()){
             
                 br = new Brigada();
                 br.setCodBrigada(id);
                 br.setNombreClave(rs.getString("nombreClave"));
                 br.setEspecialidad(rs.getString("especialidad"));
                 //br.setCuartel(rs.getObject( Cuartel ));
                 br.setEstadoBrigada(rs.getBoolean("estadoBrigada"));
                 br.setCuartel((Cuartel) rs.getObject("cuartel"));
             }
             
             ps.close();
             rs.close();
             
         }catch (SQLException e){
             
             JOptionPane.showMessageDialog(null, "Error al realizar búsqueda.");
         }
         
        return br;
     
     }
    
public ArrayList<Brigada> listarBrigada(){
        Brigada br=null;
       
        
        ArrayList<Brigada> lista = new ArrayList<>();
        
        try {
            String sql = "SELECT  nombreClave,especialidad FROM brigada WHERE estadoBrigada =?;";
            
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setBoolean(1, true);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                 br = new Brigada();
                 br.setNombreClave(rs.getString("nombreClave"));
                 br.setEspecialidad(rs.getString("especialidad"));
                 br.isEstadoBrigada();
                 
                 
                
                 lista.add(br);    
                 
            }    
            
            System.out.println("LISTADO DE BRIGADAS ACTIVAS");
            for (Brigada x:lista){
                     
                System.out.println(x.getNombreClave()+  "  "  + x.getEspecialidad());
                System.out.println("");
            }
            System.out.println("");                
            
            
            
            ps.close();
            rs.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla brigada " );
        }
        return lista;
    }
       
}    
