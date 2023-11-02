package ClasesData;

import Entidades.Brigada;
import Entidades.Cuartel;
import Entidades.Siniestro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class SiniestroData {
    
     private Connection conex;

     public SiniestroData() {
        
        conex= CentralData.conectarBD();
    }
         
    public void guardarSiniestro(Siniestro s) {
        
        String sql = "INSERT INTO siniestro (calleS, alturaS, ,fechaSiniestro,hora,tipo,detalle,fechaResolucion,puntuacion,codBrigada,estadoSiniestro) VALUES (?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1,s.getCalleS());
            ps.setInt(2, s.getAlturaS());
            ps.setDate(3,Date.valueOf(s.getFechaSiniestro()));
            ps.setTime(4,Time.valueOf(s.getHora()));
            ps.setString(5, s.getTipo());
            ps.setString(6, s.getDetalle());
            ps.setDate(7,Date.valueOf(s.getFechaResolucion()));
            ps.setInt(8, s.getPuntuacion());
            ps.setInt(9,s.getBrigada().getCodBrigada());
            ps.setBoolean(10, s.isEstadoSiniestro());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                s.setCodSiniestro(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Siniestro guardado");
            }

            ps.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Error en sentencia SQL. ");
        }
            System.out.println(s);
    }
    
     
    public void modificarSiniestro(Siniestro s){
    
       String sql= "UPDATE siniestro SET  calleS=?, alturaS=?, fechaSiniestro=?, hora=?, tipo=?, detalle=?,fechaResolucion =?, puntuacion= ?, codBrigada=?,  estadoSiniestro=? "
                   +"  WHERE codSiniestro=? " ;
        try {
            PreparedStatement ps = conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1,s.getCalleS());
            ps.setInt(2, s.getAlturaS());
            ps.setDate(3,Date.valueOf(s.getFechaSiniestro()));
            ps.setTime(4,Time.valueOf(s.getHora()));
            ps.setString(5, s.getTipo());
            ps.setString(6, s.getDetalle());
            ps.setDate(7,Date.valueOf(s.getFechaResolucion()));
            ps.setInt(8, s.getPuntuacion());
            ps.setInt(9,s.getBrigada().getCodBrigada());
            ps.setBoolean(10, s.isEstadoSiniestro());

            int modificacion= ps.executeUpdate(); 
            
            if (modificacion>=1) {
                JOptionPane.showMessageDialog(null, " Modificacion efectuada.");
                
            }
            
             ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error en sentencia SQL.");
        }
    }
     
    public void eliminarSiniestro(int id){
        String sql = "UPDATE siniestro SET estadoSiniestro=0 WHERE codSiniestro=?";

        try {
            PreparedStatement ps = conex.prepareStatement(sql);

            ps.setInt(1, id);

            int filaEliminada = ps.executeUpdate();

            if (filaEliminada == 1) {
                JOptionPane.showMessageDialog(null, " Eliminacion efectuada.");
            }

            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error en sentencia SQL. ");
        }   
        
     }
    
    
    public Siniestro buscarSiniestro(int id) {
         
        Siniestro s = null;
         
        String sql= "SELECT * FROM siniestro WHERE codSiniestro = ?" ;
         
         try{
             PreparedStatement ps = conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             
             ps.setInt(1, id);
             
             ResultSet rs = ps.executeQuery();
             
             if(rs.next()){
             
                 s = new Siniestro();
                 s.setCodSiniestro(id);
                 s.setCalleS(rs.getInt("calleS"));
                 s.setAlturaS(rs.getInt("alturaS"));
                 s.setFechaSiniestro(rs.getDate("fechaSiniestro").toLocalDate());
                 s.setHora(rs.getTime("hora").toLocalTime());
                 s.setTipo(rs.getString("tipo"));
                 s.setDetalle(rs.getString("detalle"));
                 s.setFechaResolucion(rs.getDate("fechaResolucion").toLocalDate());
                 s.setPuntuacion(rs.getInt("puntuacion"));
                 
                 Brigada br = new Brigada();
                 br.setCodBrigada(rs.getInt("codBrigada"));             
                 s.setBrigada(br);
                 s.setEstadoSiniestro(rs.getBoolean("estadoSiniestro"));
                 
             }
             
             ps.close();
             rs.close();
             
         }catch (SQLException e){
             
             JOptionPane.showMessageDialog(null, "Error en sentencia SQL. ");
         }
         
        return s;     
     }
    
    
     public ArrayList<Siniestro> listarUltimosSiniestros(){
     
        Siniestro s=null;
        
        ArrayList<Siniestro> lista = new ArrayList<>();
        
        try {
            
            LocalDate hoy = LocalDate.now();
            LocalDate ayer = hoy.minusDays(1);
   
            String sql = "SELECT codSiniestro, calleS, alturaS, fechaSiniestro, tipo, fechaResolucion, puntuacion, codBrigada  FROM siniestro";
            
            PreparedStatement ps = conex.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                s = new Siniestro();
                 s.setCodSiniestro(rs.getInt("codSiniestro"));
                 s.setCalleS(rs.getInt("calleS"));
                 s.setAlturaS(rs.getInt("alturaS"));
                 s.setFechaSiniestro(rs.getDate("fechaSiniestro").toLocalDate());
//                 s.setHora(rs.getTime("hora").toLocalTime());
                 s.setTipo(rs.getString("tipo"));
//                 s.setDetalle(rs.getString("detalle"));
                 s.setFechaResolucion(rs.getDate("fechaResolucion").toLocalDate());
                 s.setPuntuacion(rs.getInt("puntuacion"));
                 
                 Brigada br = new Brigada();
                 br.setCodBrigada(rs.getInt("codBrigada"));                
                 s.setBrigada(br);
                 
                 s.isEstadoSiniestro();
                 
                 lista.add(s);
                
            }    
               
                for (Siniestro x: lista){
                    
                    if(x.getFechaSiniestro().isEqual(hoy)){
//                        System.out.println(x.toString());
                    }else if(x.getFechaSiniestro().isEqual(ayer)){
//                        System.out.println(x.toString());                                                            
                    }
                }       
              
            ps.close();
            rs.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error en sentencia SQL. " );
        }
        return lista;
        
    } 
     
     
    public ArrayList<Siniestro> listarSiniestrosActivos(){
        
        Siniestro s=null;
       
        ArrayList<Siniestro> lista = new ArrayList<>();
        
        try {
            String sql = "SELECT codSiniestro, calleS, alturaS, fechaSiniestro,tipo, codBrigada FROM siniestro WHERE estadoSiniestro =? ";
            
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setBoolean(1, true);
           
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                 s = new Siniestro();
                 s.setCodSiniestro(rs.getInt("codSiniestro"));
                 s.setCalleS(rs.getInt("calleS"));
                 s.setAlturaS(rs.getInt("alturaS"));
                 s.setFechaSiniestro(rs.getDate("fechaSiniestro").toLocalDate());
//                 s.setHora(rs.getTime("hora").toLocalTime());
                 s.setTipo(rs.getString("tipo"));
//                 s.setDetalle(rs.getString("detalle"));
//                 s.setFechaResolucion(rs.getDate("fechaResolucion").toLocalDate());
//                 s.setPuntuacion(rs.getInt("puntuacion"));
                 
                 Brigada br = new Brigada();
                 br.setCodBrigada(rs.getInt("codBrigada"));                     
                 s.setBrigada(br);
                 
                 s.isEstadoSiniestro();
                 
                 lista.add(s);    
                 
            }    
            
            for (Siniestro x:lista){
                     
                System.out.println(x.toString());                
            }               
            
            ps.close();
            rs.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error en sentencia SQL. " );
        }
        return lista;
    }   
    
     public ArrayList<Siniestro> listarSiniestrosResueltos(){
        
        Siniestro s=null;
       
        ArrayList<Siniestro> lista = new ArrayList<>();
        
        try {
            String sql = "SELECT codSiniestro, calleS, alturaS, fechaSiniestro, tipo, fechaResolucion, puntuacion, codBrigada FROM siniestro WHERE estadoSiniestro =? ";
            
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setBoolean(1, false);
           
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                 s = new Siniestro();
                 s.setCodSiniestro(rs.getInt("codSiniestro"));
                 s.setCalleS(rs.getInt("calleS"));
                 s.setAlturaS(rs.getInt("alturaS"));
                 s.setFechaSiniestro(rs.getDate("fechaSiniestro").toLocalDate());
//                 s.setHora(rs.getTime("hora").toLocalTime());
                 s.setTipo(rs.getString("tipo"));
//                 s.setDetalle(rs.getString("detalle"));
                 s.setFechaResolucion(rs.getDate("fechaResolucion").toLocalDate());
                 s.setPuntuacion(rs.getInt("puntuacion"));
                 
                 Brigada br = new Brigada();
                 br.setCodBrigada(rs.getInt("codBrigada"));                     
                 s.setBrigada(br);
                 
//                 s.setEstadoSiniestro(rs.getBoolean("estadoSiniestro"));
                 s.isEstadoSiniestro();
                 lista.add(s);    
                 
            }    
            
            for (Siniestro x:lista){
                     
                System.out.println(x.toString());                
            }               
            
            ps.close();
            rs.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error en sentencia SQL. " );
        }
        return lista;
    }  
         
    
    public double calcularDistancia() {
        Siniestro s = null;
        Cuartel c = null;

        PreparedStatement ps;
        PreparedStatement ps1;
        ResultSet rs;
        ResultSet rs1;

        int calleS = 0;
        int alturaS = 0;
        int calleC = 0;
        int alturaC = 0;
        double distancia = 0;
        double aux=0;
        
        String sql = "SELECT  calleS,  alturaS FROM siniestro";
        String sql1 = "SELECT codCuartel, nombreCuartel, calleC, alturaC FROM cuartel";

        try {
            ps = conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            rs = ps.executeQuery();

            while(rs.next()) {
                s = new Siniestro();
                s.setCalleS(rs.getInt("calleS"));
                s.setAlturaS(rs.getInt("alturaS"));                
                calleS = s.getCalleS();
                alturaS = s.getAlturaS();
                System.out.println("Datos del Siniestro: " + s.getCalleS() + "-" +  s.getAlturaS());
                
            }
            ps.close();
            rs.close();

            ps1 = conex.prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS);
            rs1 = ps1.executeQuery();

            while (rs1.next()) {
                c = new Cuartel();
                c.setCodCuartel(rs1.getInt("codCuartel"));
                c.setNombreCuartel(rs1.getString("nombreCuartel"));
                c.setCalleC(rs1.getInt("calleC"));
                c.setAlturaC(rs1.getInt("alturaC"));
                calleC = c.getCalleC();
                alturaC = c.getAlturaC();
                
                System.out.println("Cuartel: " + c.getCalleC() + "-" + c.getAlturaC());      
                
                ArrayList<Cuartel> cu = new ArrayList<>();
                cu.add(c);


                for (Cuartel x : cu) {
                  
                    if (x.getCalleC() > calleS && x.getAlturaC() > alturaS) {

                        int calleX = x.getCalleC() - calleS;
                        int alturaY = x.getAlturaC() - alturaS;
                        distancia = Math.sqrt(Math.pow(calleX, 2) + Math.pow(alturaY, 2));

                        if (distancia > aux) {
                            aux = distancia;
                            System.out.println("Distancia: " + (aux *100) + " mts" );
                            System.out.println(x.toString());
                        } else {
                          
                            System.out.println("Distancia: " + (aux*100) + " mts");
                            System.out.println(x.toString());
                        }

                    } else if (x.getCalleC() > calleS && x.getAlturaC() < alturaS) {

                        int calleX = x.getCalleC() - calleS;
                        int alturaY = alturaS - x.getAlturaC();
                        distancia = Math.sqrt(Math.pow(calleX, 2) + Math.pow(alturaY, 2));

                        if (distancia < aux) {
                            aux = distancia;
                            System.out.println("Distancia: " + (aux *100) + " mts" );
                            System.out.println(x.toString());
                        } else {
                           
                            System.out.println("Distancia: " + (distancia*100) + " mts" );
                            System.out.println(x.toString());
                        }

                    } else if (x.getCalleC() < calleS && x.getAlturaC()> alturaS) {

                        int calleX = calleS - x.getCalleC();
                        int alturaY =x.getAlturaC()- alturaS;
                        distancia = Math.sqrt(Math.pow(calleX, 2) + Math.pow(alturaY, 2));

                        if (distancia < aux) {
                            aux = distancia;
                            System.out.println("Distancia: " + (aux *100) + " mts"  );
                            System.out.println(x.toString());
                        } else {
                            distancia = distancia;
                           System.out.println("Distancia: " + (distancia*100) + " mts" );
                           System.out.println(x.toString());
                        }

                    } else if (x.getCalleC() < calleS && x.getAlturaC() < alturaS) {

                        int calleX = calleS - x.getCalleC();
                        int alturaY = alturaS - x.getAlturaC();
                        distancia = Math.sqrt(Math.pow(calleX, 2) + Math.pow(alturaY, 2));

                        if (distancia < aux) {
                            aux = distancia;
                            System.out.println("Distancia: " + (aux *100) + " mts"  );
                            System.out.println(x.toString());
                        } else {
                            distancia = distancia;
                            System.out.println("Distancia: " + (distancia*100) + " mts" );
                            System.out.println(x.toString());
                        }

                    } else if( x.getCalleC() > calleS && x.getAlturaC() == alturaS) {

                        int calleX = x.getCalleC() - calleS;
                        int alturaY =x.getAlturaC();
                        distancia = Math.sqrt(Math.pow(calleX, 2) + Math.pow(alturaY, 2));

                        if (distancia < aux) {
                            aux = distancia;
                            System.out.println("Distancia: " + (aux *100) + " mts"  );
                            System.out.println(x.toString());
                        } else {
                            distancia = distancia;
                            System.out.println("Distancia: " + (distancia*100) + " mts" );
                            System.out.println(x.toString());
                        }

                    } else if (x.getCalleC() < calleS && x.getAlturaC() == alturaS) {

                        int calleX = calleS - x.getCalleC();
                        int alturaY = alturaS;
                        distancia = Math.sqrt(Math.pow(calleX, 2) + Math.pow(alturaY, 2));

                        if (distancia < aux) {
                            aux = distancia;
                            System.out.println("Distancia: " + (aux *100) + " mts" );
                            System.out.println(x.toString());
                        } else {
                            distancia = distancia;
                            System.out.println("Distancia: " + (distancia*100) + " mts" );
                            System.out.println(x.toString());
                        }

                    } else if (x.getCalleC() == calleS && alturaS > x.getAlturaC()) {

                        distancia = alturaS - x.getAlturaC();

                        if (distancia < aux) {
                            aux = distancia;
                            System.out.println("Distancia: " + (aux *100) + " mts" );
                            System.out.println(x.toString());
                        } else {
                            distancia = distancia;
                            System.out.println("Distancia: " + (distancia*100) + " mts" );
                            System.out.println(x.toString());
                        }

                    } else if (x.getCalleC() == calleS && alturaS < x.getAlturaC()) {

                        distancia = x.getAlturaC() - alturaS;

                        if (distancia < aux) {
                            aux = distancia;
                            System.out.println("Distancia: " + (aux *100) + " mts" );
                            System.out.println(x.toString());
                        } else {
                            distancia = distancia;
                            System.out.println("Distancia: " + (distancia*100) + " mts");
                            System.out.println(x.toString());
                        }

                    } else {
                        System.out.println("Confirme la dirección del Siniestro.");
                    }
                }
            }
        } catch (SQLException ex2) {
            JOptionPane.showMessageDialog(null, "Error en sentencia SQL.");
        }
         return distancia ;
        
    }
    
    
    public void modificarResolucionSiniestrofs(Siniestro s){
    
       String sql= "UPDATE siniestro SET   fechaResolucion =?, puntuacion= ? "
                   +"  WHERE codSiniestro=? " ;
        try {
            PreparedStatement ps = conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
          
            ps.setDate(1,Date.valueOf(s.getFechaResolucion()));
            ps.setInt(2, s.getPuntuacion());
            ps.setInt(3,s.getCodSiniestro());

            int modif = ps.executeUpdate(); 
            
            if (modif==1) {
                
            } else {
                JOptionPane.showMessageDialog(null, " Modificacion efectuada.");
                
            }
            
             ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error de sentencia sql");
        }
    }
    
     
    public void cierreSiniestro(int id,LocalDate fechaRes,int puntua){
    
       String sql= "UPDATE siniestro SET  fechaResolucion =?, puntuacion= ?"
                   +"  WHERE codSiniestro=? " ;
      
        try {
            PreparedStatement ps = conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setDate(1,Date.valueOf(fechaRes));
            ps.setInt(2,puntua);
            ps.setInt(3, id);
            
            int modificacion= ps.executeUpdate(); 
            
            if (modificacion>=1) {
                JOptionPane.showMessageDialog(null, " Modificacion efectuada.");
             }
            
             ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error en sentencia SQL");
        }
    }
    
 
}