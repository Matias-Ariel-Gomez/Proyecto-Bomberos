package ClasesData;

import Entidades.Bombero;
import Entidades.Brigada;
import Entidades.Cuartel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CuartelData {
    
    private Connection conex;

    public CuartelData() {
        
        conex=CentralData.conectarBD();
    }
    
    public void guardarCuartel(Cuartel c) {
        String sql = ("INSERT INTO cuartel (nombreCuartel, calleC, alturaC, telefono, mail) "
                + "VALUES (?,?,?,?,?)");

        try {
            PreparedStatement ps = conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, c.getNombreCuartel());
            ps.setInt(2, c.getCalleC());
            ps.setInt(3, c.getAlturaC());
            ps.setString(4, c.getTelefono());
            ps.setString(5, c.getMail());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                c.setCodCuartel(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cuartel guardado.");
            }

            ps.close();
            rs.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Error en sentencia SQL. ");
        }

    }
    
    public Cuartel buscarCuartel(int id) {
         
         Cuartel c =null;
         
         String sql = "SELECT * FROM cuartel WHERE codCuartel=? " ;
         
         try{
             PreparedStatement ps=conex.prepareStatement(sql);
             
             ps.setInt(1, id);
             
             ResultSet rs=ps.executeQuery();
             
             if(rs.next()){
             
                 c = new Cuartel();
                 c.setCodCuartel(id);
                 c.setNombreCuartel(rs.getString("nombreCuartel"));
                 c.setCalleC(rs.getInt("calleC"));
                 c.setAlturaC(rs.getInt("alturaC"));
                 c.setTelefono(rs.getString("telefono"));
                 c.setMail(rs.getString("mail"));
                }
             
             ps.close();
             rs.close();
             
         }catch (SQLException e){
             
             JOptionPane.showMessageDialog(null, "Error en sentencia SQL. ");
         }
        
        return c;
     
     } 

    public ArrayList<Cuartel> listarCuartel(){
        
        Cuartel c =null;       
        
        ArrayList<Cuartel> lista = new ArrayList<>();
        
        try {
            String sql = "SELECT codCuartel, nombreCuartel, calleC, alturaC, telefono, mail  FROM cuartel" ;
            
            PreparedStatement ps = conex.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                 c = new Cuartel();
                 c.setCodCuartel(rs.getInt("codCuartel"));
                 c.setNombreCuartel(rs.getString("nombreCuartel"));
                 c.setCalleC(rs.getInt("calleC"));
                 c.setAlturaC(rs.getInt("alturaC"));
                 c.setTelefono(rs.getString("telefono"));
                 c.setMail(rs.getString("mail"));
                                 
                 lista.add(c);  
                 
            }              
                       
//            for (Cuartel x:lista){
//                     
//                System.out.println(x);
//               
//            }               
            
            ps.close();
            rs.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error sentencia SQL. " );
        }
        return lista;
    }  
}    
