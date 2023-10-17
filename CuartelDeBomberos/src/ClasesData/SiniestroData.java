package ClasesData;

import Entidades.Brigada;
import Entidades.Siniestro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SiniestroData {
    
     private Connection conex;

     public SiniestroData() {
        
        conex= CentralData.conectarBD();
    }
         
        public void guardarSiniestro(Siniestro s) {
        
        String sql = "INSERT INTO siniestro (direccionSiniestro,fechaSiniestro,hora,tipo,detalle,fechaResolucion,puntuacion,codBrigada,estadoSiniestro) VALUES (?,?,?,?,?,?,?,?,?);";

        try {
            PreparedStatement ps = conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setDouble(1, s.getDireccionSiniestro());
            ps.setDate(2,Date.valueOf(s.getFechaSiniestro()));
            ps.setTime(3,Time.valueOf(s.getHora()));
            ps.setString(4, s.getTipo());
            ps.setString(5, s.getDetalle());
            ps.setDate(6,Date.valueOf(s.getFechaResolucion()));
            ps.setInt(7, s.getPuntuacion());
            ps.setInt(8,s.getBrigada().getCodBrigada());
            ps.setBoolean(9, s.isEstadoSiniestro());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                s.setCodSiniestro(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Siniestro guardado");
            }

            ps.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Error de inserción en la Base de Datos. ");
        }
            System.out.println(s);
    }
    
     
     public void modificarSiniestro(Siniestro s){
    
       String sql= "UPDATE siniestro SET  direccionSiniestro=?, fechaSiniestro=?, hora=?, tipo=?, detalle=?,fechaResolucion =?, puntuacion= ?, codBrigada=?,  estadoSiniestro=? "
                   +"  WHERE codSiniestro=? " ;
        try {
            PreparedStatement ps = conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setDouble(1, s.getDireccionSiniestro());
            ps.setDate(2,Date.valueOf(s.getFechaSiniestro()));
            ps.setTime(3,Time.valueOf(s.getHora()));
            ps.setString(4, s.getTipo());
            ps.setString(5, s.getDetalle());
            ps.setDate(6,Date.valueOf(s.getFechaResolucion()));
            ps.setInt(7, s.getPuntuacion());
            ps.setInt(8,s.getBrigada().getCodBrigada());
            ps.setBoolean(9, s.isEstadoSiniestro());

            int modificacion= ps.executeUpdate(); 
            
            if (modificacion>=1) {
                JOptionPane.showMessageDialog(null, " Modificacion efectuada.");
                System.out.println("Modificado a:"+"\n"+s);
            }
            
             ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error de sentencia sql");
        }
    }
     
//    public void eliminarSiniestro(int id){
//        String sql = "UPDATE siniestro SET estadoSiniestro=0 WHERE codSiniestro=?";
//
//        try {
//            PreparedStatement ps = conex.prepareStatement(sql);
//
//            ps.setInt(1, id);
//
//            int filaEliminada = ps.executeUpdate();
//
//            if (filaEliminada == 1) {
//                JOptionPane.showMessageDialog(null, " Eliminacion efectuada.");
//            }
//
//            ps.close();
//
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, " Error en la eliminacón en la Base de Datos.");
//        }   
//        
//     }
//    
//    
//    public Siniestro buscarSiniestro(int id) {
//         
//        Siniestro s=null;
//         
//        String sql="SELECT  * FROM siniestro WHERE  codSiniestro=? " ;
//         
//         try{
//             PreparedStatement ps=conex.prepareStatement(sql);
//             ps.setInt(1, id);
//             
//             ResultSet rs=ps.executeQuery();
//             
//             if(rs.next()){
//             
//                 s = new Siniestro();
//                 s.setCodSiniestro(id);
//                 s.setDireccionSiniestro(rs.getDouble("direccionSiniestro"));
//                 s.setFechaSiniestro(rs.getDate("fechaSiniestro").toLocalDate());
//                 s.setHora(hr);
//                 s.setTipo(rs.getString("tipo"));
//                 s.setDetalle(rs.getString("detalle"));
//                 s.setPuntuacion(rs.getInt("puntuaciojn"));
//                 s.setBrigada((Brigada) rs.getObject("brigada"));
//                 s.setEstadoSiniestro(rs.getBoolean("estadoSiniestro"));
//             
//             }
//             
//             ps.close();
//             rs.close();
//             
//         }catch (SQLException e){
//             
//             JOptionPane.showMessageDialog(null, "Error al realizar búsqueda.");
//         }
//         
//        return s;
//     
//     }
//    
//     
//    public ArrayList<Siniestro> listarSiniestro(){
//        Siniestro s=null;
//       
//        
//        ArrayList<Siniestro> lista = new ArrayList<>();
//        
//        try {
//            String sql = "SELECT direccion, fecha, tipo,  FROM siniestro WHERE estadoSiniestro =? ";
//            
//            PreparedStatement ps = conex.prepareStatement(sql);
//            ps.setBoolean(2, true);
//           
//            ResultSet rs = ps.executeQuery();
//            
//            while (rs.next()) {
//                 s = new Siniestro();
//                 s.setDireccionSiniestro(rs.getDouble("direccionSiniestro"));       
//                 s.setFechaSiniestro(rs.getDate("fechaSiniestro").toLocalDate());
//                 s.setTipo(rs.getString("tipo"));
//                 s.isEstadoSiniestro();
//                 
//                 lista.add(s);    
//                 
//            }    
//            
//            System.out.println("LISTADO DE SINIESTROS ACTIVOS");
//            for (Siniestro x:lista){
//                     
//                System.out.println(x.getDireccionSiniestro() + " " + x.getFechaSiniestro()+ " " + x.getTipo() );
//                System.out.println("");
//            }
//            System.out.println("");                
//            
//            
//            
//            ps.close();
//            rs.close();
//            
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Siniestro de la Base de Datos." );
//        }
//        return lista;
//    }
}