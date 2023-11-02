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
        String sql= ("INSERT INTO brigada (nombreClave, especialidad, codCuartel, estadoBrigada)"
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
             
             JOptionPane.showMessageDialog(null, " Error SQL. ");
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
            JOptionPane.showMessageDialog(null, " Error SQL.");
        }   
        
     }
  
    public void modificarBrigada(Brigada br){
    
       String sql= "UPDATE brigada SET  nombreClave=?, especialidad=?, codCuartel=?, estadoBrigada=?"
                   +"  WHERE codBrigada=? " ;
         
        try {
            PreparedStatement ps = conex.prepareStatement(sql); 
            
            ps.setString(1,br.getNombreClave());
            ps.setString(2, br.getEspecialidad());
            ps.setInt(3, br.getCuartel().getCodCuartel());
            ps.setBoolean(4, true);
            ps.setInt(5, br.getCodBrigada());
            
            
            int modificacion= ps.executeUpdate(); 
            
            if (modificacion==1) {
                JOptionPane.showMessageDialog(null, " Modificacion efectuada.");
            }
            
             ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error SQL.");
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
                 
                 Cuartel c = new Cuartel();
                 c.setCodCuartel(rs.getInt("codCuartel"));
                 
                 br.setCuartel(c);
                 br.isEstadoBrigada();
                 
               
             }
             
             ps.close();
             rs.close();
             
         }catch (SQLException e){
             
             JOptionPane.showMessageDialog(null, "Error al realizar búsqueda");
         }
         
        return br;
     
     }   
   
    public ArrayList<Brigada> listarBrigadas() {
        Brigada br = null;

        ArrayList<Brigada> lista = new ArrayList<>();

        try {
            String sql = "SELECT  codBrigada, nombreClave, especialidad, codCuartel, estadoBrigada FROM brigada;";

            try (PreparedStatement ps = conex.prepareStatement(sql)) {
                 ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    br = new Brigada();
                    br.setCodBrigada(rs.getInt("codBrigada"));
                    br.setNombreClave(rs.getString("nombreClave"));
                    br.setEspecialidad(rs.getString("especialidad"));
                    Cuartel c = new Cuartel();
                    c.setCodCuartel(rs.getInt("codCuartel"));
                 
                     br.setCuartel(c);
                    br.isEstadoBrigada();
                    
                    lista.add(br);

                }
                               
                rs.close();
            } catch (NullPointerException n) {

                JOptionPane.showMessageDialog(null, " Valor no admitido. ");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error SQL ");
        }
        return lista;
    } 
    
    public ArrayList<Brigada> listarBrigadasDisponibles() {
        Brigada br = null;

        ArrayList<Brigada> lista = new ArrayList<>();

        try {
            String sql = "SELECT  codBrigada, nombreClave, especialidad FROM brigada WHERE estadoBrigada =?;";

            try (PreparedStatement ps = conex.prepareStatement(sql)) {
                ps.setBoolean(1, true);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    br = new Brigada();
                    br.setCodBrigada(rs.getInt("codBrigada"));
                    br.setNombreClave(rs.getString("nombreClave"));
                    br.setEspecialidad(rs.getString("especialidad"));
                    br.isEstadoBrigada();

                    lista.add(br);
                }
                
                for (Brigada x : lista) {
                    System.out.println(x.toString());                    
                }

                rs.close();
            } catch (NullPointerException n) {

                JOptionPane.showMessageDialog(null, " Valor no admitido. ");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error SQL. ");
        }
        return lista;
    }   
    
    public ArrayList<Brigada> listarBrigadasNoDisponibles() {
        Brigada br = null;

        ArrayList<Brigada> lista = new ArrayList<>();

        try {
            String sql = "SELECT  codBrigada, nombreClave, especialidad FROM brigada WHERE estadoBrigada =?;";

            try (PreparedStatement ps = conex.prepareStatement(sql)) {
                ps.setBoolean(1, false);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    br = new Brigada();
                    br.setCodBrigada(rs.getInt("codBrigada"));
                    br.setNombreClave(rs.getString("nombreClave"));
                    br.setEspecialidad(rs.getString("especialidad"));
                    br.isEstadoBrigada();

                    lista.add(br);

                }
               
                for (Brigada x : lista) {

                    System.out.println(x.toString());
                    
                }

                rs.close();
            } catch (NullPointerException n) {

                JOptionPane.showMessageDialog(null, " Valor no admitido. ");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error SQL ");
        }
        return lista;
    }     
   
    public ArrayList<Brigada> listarBrigadasPorCuartel(Cuartel c, boolean bl) {
        Brigada br = null;

        ArrayList<Brigada> lista = new ArrayList<>();

        try {
            String sql = " SELECT * FROM brigada WHERE codCuartel=?  AND estadoBrigada=?";

            try (PreparedStatement ps = conex.prepareStatement(sql)) {
                ps.setInt(1, c.getCodCuartel());
                ps.setBoolean(2, bl);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    br = new Brigada();
                    br.setCodBrigada(rs.getInt("codBrigada"));
                    br.setNombreClave(rs.getString("nombreClave"));
                    br.setEspecialidad(rs.getString("especialidad"));
                    c.setCodCuartel(rs.getInt("codCuartel"));
                    br.isEstadoBrigada();

                    lista.add(br);
                }
                
                for (Brigada x : lista) {
                    System.out.println(x.toString());                    
                }

                rs.close();
            } catch (NullPointerException n) {

                JOptionPane.showMessageDialog(null, " Valor no admitido. ");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error SQL. ");
        }
        return lista;
    }
       
}     
