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
        String sql= ("INSERT INTO bombero (dni, nombreCompleto, grupoSanguineo, fechaNacimiento, telCelular, codBrigada, estadoBombero) VALUES (?,?,?,?,?,?,?)");  
         
         try{  
             PreparedStatement ps = conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             
             ps.setString(1, b.getDni());
             ps.setString(2, b.getNombreCompleto());
             ps.setString(3,b.getGrupoSanguineo());
             ps.setDate(4,Date.valueOf(b.getFechaNacimiento()));
             ps.setString(5, b.getTelCelular());             
             ps.setInt(6, b.getBrigada().getCodBrigada());
             ps.setBoolean(7, b.isEstadoBombero()); 
             
             ps.executeUpdate();
             ResultSet rs= ps.getGeneratedKeys(); 
             
             if(rs.next()){
                 b.setCodBombero(rs.getInt(1)); 
                 JOptionPane.showMessageDialog(null, "Bombero guardado.");
             }
            
             ps.close();
             
         }catch (SQLException e){
             
             JOptionPane.showMessageDialog(null, " Error en sentencia SQL. ");
             
         }catch (NullPointerException e)   {
             
             JOptionPane.showMessageDialog(null, " Erros en datos ingresados.");
         }
  
    }
    
    
    public void modificarBombero(Bombero b){
    
        String sql= "UPDATE bombero SET  nombreCompleto=?, grupoSanguineo=?,  telCelular=?, codBrigada=?, estadoBombero=? WHERE codBombero =?;" ;
         
        try {
            PreparedStatement ps = conex.prepareStatement(sql); 
            
            ps.setString(1, b.getNombreCompleto());
            ps.setString(2, b.getGrupoSanguineo());
            ps.setString(3, b.getTelCelular());
            ps.setInt(4, b.getBrigada().getCodBrigada());
            ps.setBoolean(5, true);
            ps.setInt(6, b.getCodBombero());         
            
            
            int modificacion= ps.executeUpdate(); 
            
            if (modificacion==1) {
                JOptionPane.showMessageDialog(null, " Modificacion efectuada.");
            }
            
             ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error de sentencia sql");
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
            JOptionPane.showMessageDialog(null, " Error en sentencia SQL.");
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
                 
                 Brigada br = new Brigada();
                 br.setCodBrigada(rs.getInt("codBrigada"));
                 b.setBrigada(br);
                 
                 b.setEstadoBombero(rs.getBoolean("estadoBombero"));
                              
             }
             
             ps.close();
             rs.close();
             
         }catch (SQLException e){
             
             JOptionPane.showMessageDialog(null, "Error en sentencia SQL.");
         }
         
        return b;
     
     }
     
    
    public ArrayList<Bombero> listarBomberosActivos(){
        Bombero b=null;       
        
        ArrayList<Bombero> lista = new ArrayList<>();
        
        try {
            String sql = "SELECT codBombero, dni, nombreCompleto, grupoSanguineo, fechaNacimiento, telCelular, codBrigada  FROM bombero WHERE estadoBombero =?";
            
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setBoolean(1, true);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
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
                 b.isEstadoBombero();
                
                 lista.add(b);                    
            }    
            
            for (Bombero x:lista){
                     
                System.out.println(x.toString());
                
            }
                   
            ps.close();
            rs.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error en sentencia SQL. " );
        }
        return lista;
    }    
   
    
    public ArrayList<Bombero> listarBomberosPasivos() {
        Bombero b = null;

        ArrayList<Bombero> lista = new ArrayList<>();

        try {
            String sql = "SELECT codBombero, dni, nombreCompleto, grupoSanguineo, fechaNacimiento, telCelular, codBrigada  FROM bombero WHERE estadoBombero =?";

            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setBoolean(1, false);
            ResultSet rs = ps.executeQuery();

             while (rs.next()) {
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
                 b.isEstadoBombero();
                
                 lista.add(b);                    
            } 

            for (Bombero x : lista) {

                System.out.println(x.toString());
                
            }
            
            ps.close();
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error en sentencia SQL. ");
        }
        return lista;

    }     

    
    public ArrayList<Bombero> listarBomberosPorBrigada(Brigada br, boolean bl) {
        Bombero b = null;

        ArrayList<Bombero> lista = new ArrayList<>();

        try {
            String sql = " SELECT * FROM bombero WHERE codBrigada=? AND estadoBombero= ?";

            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setInt(1, br.getCodBrigada());
            ps.setBoolean(2, bl);
            ResultSet rs = ps.executeQuery();

           while (rs.next()) {
                 b = new Bombero();
                 b.setCodBombero(rs.getInt("codBombero"));
                 b.setDni(rs.getString("dni"));       
                 b.setNombreCompleto(rs.getString("nombreCompleto"));
                 b.setGrupoSanguineo(rs.getString("grupoSanguineo"));
                 b.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                 b.setTelCelular(rs.getString("telCelular"));             
                 br.setCodBrigada(rs.getInt("codBrigada"));
                 b.isEstadoBombero();
                
                 lista.add(b);                    
            } 

           
            for (Bombero x : lista) {

                System.out.println(x.toString());
               
            }
            

            ps.close();
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error en sentencia SQL.");
        }
        return lista;
    }
    
}
