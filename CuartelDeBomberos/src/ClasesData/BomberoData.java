package ClasesData;

import Entidades.*;
import java.awt.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;


public class BomberoData {
    
    private Connection conex;

    public BomberoData() {
        
        conex= CentralData.conectarBD();
    }
           

    public void guardarBombero(Bombero b){
        String sql= ("INSERT INTO  bombero (dni,nombreCompleto,grupoSanguineo,fechaNacimiento,telCelular,codBrigada,estadoBombero) VALUES (?,?,?,?,?,?,?)");  
        
        
         try{  
             PreparedStatement ps = conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             
             ps.setString(1, b.getDni());
             ps.setString(2, b.getNombreCompleto());
             ps.setString(3,b.getGrupoSanguineo());
             ps.setDate(4,Date.valueOf(b.getFechaNacimiento()));
             ps.setString(5, b.getTelCelular());
             ps.setInt(6, b.getBrigada().getCodBrigada());
             ps.setBoolean(7,b.isEstadoBombero());
             
             ps.executeUpdate();
             ResultSet rs= ps.getGeneratedKeys(); 
             
             if(rs.next()){
                 b.setCodBombero(rs.getInt(1));
                 System.out.println(b.toString());
                 JOptionPane.showMessageDialog(null, "Bombero guardado.");
             }
            
             ps.close();
             
         }catch (SQLException e){
             
             JOptionPane.showMessageDialog(null, " Error en la inserción en la Base de Datos. ");
         }     
        
    }

    
     public void modificarBombero(Bombero b){
    
       String sql= "UPDATE bombero SET  dni=?, nombreCompleto=?, grupoSanguineo=?, fechaNacimiento=?, telCelular=?, estadoBombero=? "
                   +"  WHERE codBombero=? " ;
         
        try {
            PreparedStatement ps = conex.prepareStatement(sql); 
            
            ps.setString(1,b.getDni());
            ps.setString(2, b.getNombreCompleto());
            ps.setString(3, b.getGrupoSanguineo());
            ps.setDate(4, Date.valueOf(b.getFechaNacimiento()));
            ps.setString(5, b.getTelCelular());  
            ps.setBoolean(6, true);
            ps.setInt(7, b.getCodBombero());
            
            
            int modificacion= ps.executeUpdate(); 
            
            if (modificacion>=1) {
                JOptionPane.showMessageDialog(null, " Modificacion efectuada.");
            }
            
             ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error en la modificación en la Base de Datos.");
        }
    }

     
     public void eliminarBombero(int id){
        String sql = "UPDATE bombero SET estadoBombero=0 WHERE codBombero=?";

        try {
            PreparedStatement ps = conex.prepareStatement(sql);

            ps.setInt(1, id);

            int filaEliminada = ps.executeUpdate();

            if (filaEliminada == 1) {
                JOptionPane.showMessageDialog(null, " Eliminacion efectuada.");
            }

            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error en la eliminacón en la Base de Datos.");
        }   
        
     }
     
     
     
     public Bombero buscarBombero(int id) {
         
         Bombero b=null;
         
         String sql="SELECT  * FROM bombero WHERE  codBombero=? " ;
         
         try{
             PreparedStatement ps=conex.prepareStatement(sql);
             ps.setInt(1, id);
             
             ResultSet rs=ps.executeQuery();
             
             if(rs.next()){
             
                 b = new Bombero();
                 b.setCodBombero(id);
                 b.setDni(rs.getString("dni"));
                 b.setNombreCompleto(rs.getString("nombreCompleto"));
                 b.setGrupoSanguineo(rs.getString("grupoSanguineo"));
                 b.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                 b.setTelCelular(rs.getString("telCelular"));
                 b.setBrigada((Brigada) rs.getObject("brigada"));
                 b.setEstadoBombero(rs.getBoolean("estadoBombero"));
             
             }
             
             ps.close();
             rs.close();
             
         }catch (SQLException e){
             
             JOptionPane.showMessageDialog(null, "Error al realizar búsqueda.");
         }
         
        return b;
     
     }
     
    
    public ArrayList<Bombero> listarBomberosPorBrigada(){
        
        Bombero b=null;
        
        String sql = "SELECT * FROM bombero GROUP BY codBrigada ";
        ArrayList<Bombero> lista = new ArrayList<>();
        
                   
        try{  
             PreparedStatement ps = conex.prepareStatement(sql);
             ResultSet rs= ps.executeQuery();
             
             if(rs.next()){
             
             b = new Bombero();    
             b.setCodBombero(rs.getInt("codBombero")); 
             b.setDni(rs.getString("dni"));
             b.setNombreCompleto(rs.getString("nombreCompleto"));
             b.setGrupoSanguineo(rs.getString("grupoSanguineo"));
             b.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
             b.setTelCelular(rs.getString("telCelular"));
             
             Brigada br = new Brigada();
             br.setCodBrigada(rs.getInt("codBrigada"));
                 
             b.setBrigada(br);
             b.setEstadoBombero(rs.getBoolean("estadoBombero"));
             
             lista.add(b);
             System.out.println(b);
             }
             
             ps.close();
             rs.close();
         }catch (SQLException e){
             
             JOptionPane.showMessageDialog(null, " Error en de acceso a Base de Datos ");
         }
         return lista;
    }
       
      
    
}  
    
    
    


