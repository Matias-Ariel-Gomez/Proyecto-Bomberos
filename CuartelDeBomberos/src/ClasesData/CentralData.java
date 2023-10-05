package ClasesData;
import Entidades.Bombero;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class CentralData {        
   
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "Cuartel27";
    private static final String USUARIO = "root";
    private static final String PASSWORD= "";
    private static Connection conex;

    public CentralData() {
    }
    
    public static Connection conectarBD(){
       if  (conex == null){
           try{
               Class.forName("org.mariadb.jdbc.Driver");

               conex= DriverManager.getConnection("jdbc:mariadb://localhost/cuartel27","root","");
               
               JOptionPane.showMessageDialog(null,"Conectado");

           } catch ( SQLException    e  ){
               JOptionPane.showMessageDialog( null , " Error al conectarse con la base de datos");
               
           } catch (ClassNotFoundException e) {
               JOptionPane.showMessageDialog(null, " Error al cargar los drivers");
           }
        
       }     
        return conex;
        
   }

 
    

    
}
