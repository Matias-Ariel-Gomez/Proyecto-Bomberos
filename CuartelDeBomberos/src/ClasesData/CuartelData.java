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
        String sql = ("INSERT INTO cuartel(nombreCuartel,direccion,telefono,mail)"
                + "VALUES (?,?,?,?)");

        try {
            PreparedStatement ps = conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, c.getNombreCuartel());
            ps.setDouble(2, c.getDireccion());
            ps.setString(3, c.getTelefono());
            ps.setString(4, c.getMail());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                c.setCodCuartel(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cuartel guardado.");
            }

            ps.close();
            rs.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Error en la inserción en la Base de Datos. ");
        }

    }

     public void modificarCuartel(Cuartel Cu){
    
       String sql= "UPDATE cuartel SET  nombreCuartel =?,direccion=?,telefono=?,mail=?  WHERE codCuartel=?;" ;
         
        try {
            PreparedStatement ps = conex.prepareStatement(sql); 
            
            ps.setString(1,Cu.getNombreCuartel());
            ps.setDouble(2,Cu.getDireccion());
            ps.setString(3, Cu.getTelefono());
            ps.setString(4,Cu.getMail());
            ps.setInt(5,Cu.getCodCuartel());
           
            
            
            int modificacion= ps.executeUpdate(); 
            
            if (modificacion>=1) {
                JOptionPane.showMessageDialog(null, " Modificacion efectuada.");
            }
            
             ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error de sentencia sql");
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
                 c.setDireccion(rs.getDouble("direccion"));
                 c.setTelefono(rs.getString("telefono"));
                 c.setMail(rs.getString("mail"));
                }
             
             ps.close();
             rs.close();
             
         }catch (SQLException e){
             
             JOptionPane.showMessageDialog(null, "Error en la búsqueda(SQL Excepcion)");
         }
         System.out.println(c.toString()); 
        return c;
     
     } 

     public ArrayList<Cuartel> listarCuartel(){
        
         Cuartel c =null;
       
        
        ArrayList<Cuartel> listaCuartel = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM cuartel" ;
            
            PreparedStatement ps = conex.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                 c = new Cuartel();
                 c.setCodCuartel(rs.getInt("codCuartel"));
                 c.setNombreCuartel(rs.getString("nombreCuartel"));
                 c.setDireccion(rs.getDouble("direccion"));
                 c.setTelefono(rs.getString("telefono"));
                 c.setMail(rs.getString("mail"));
                
                 listaCuartel.add(c);    
                 
            }    
            
            System.out.println("LISTADO DE CUARTELES CERCANOS");
            
            for (Cuartel x:listaCuartel){
                     
                System.out.println(x.toString());
                System.out.println("");
            }
            System.out.println("");                
            
            
            
            ps.close();
            rs.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla cuartel " );
        }
        return listaCuartel;
    }
}
