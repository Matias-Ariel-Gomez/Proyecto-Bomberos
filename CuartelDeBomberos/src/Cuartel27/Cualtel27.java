package Cuartel27;
import Entidades.*;
import ClasesData.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;


public class Cualtel27 {

    public static void main(String[] args) {
      
        CentralData conexion=new CentralData();
        conexion.conectarBD();  
        
    //Cuartel uno = new Cuartel( "CuartelUno", 5.1, "000-222222", "cuarteluno@cuartel27.com");
       //CuartelData cd=new CuartelData();
      // cd.guardarCuartel(uno);
        
      // Brigada alfa=new Brigada( 1," Brigada Beta", "Rescate en altura",null, true );
       BrigadaData brd=new BrigadaData();
       brd.listarBrigada();
       
       
       //brd.modificarBrigada(alfa);
       // brd.guardarBrigada(alfa);
      // brd.eliminarBrigada(1);
        //Bombero a=new Bombero(2 ,"01020304", "Rodriguez, Rodrigo", "AB (+)", LocalDate.of(2000, Month.JANUARY, 31), "000-1111", null ,true);
       //BomberoData bd=new BomberoData(); 
      //  bd.guardarBombero(a);        
      //  bd.modificarBombero(a);
      // bd.eliminarBombero(2);
      
      // for(Bombero a:bd.listarBombero()){
      // bd.listarBombero();
       //for (Iterator<Bombero> it = lista.iterator(); it.hasNext();) {
                   // System.out.println(listarBombero().);
                }
      // Bombero lista=bd.buscarBombero(2);
        
      //bd.listarBombero();
        
    }
