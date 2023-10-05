package Cuartel27;
import Entidades.*;
import ClasesData.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;


public class Cualtel27 {

    public static void main(String[] args) {
      
        CentralData conexion=new CentralData();
        conexion.conectarBD();  
        
//        Cuartel uno = new Cuartel( "CuartelUno", 5.1, "000-222222", "cuarteluno@cuartel27.com");
//        CuartelData cd=new CuartelData();
//        cd.guardarCuartel(uno);
//        
//        Brigada alfa=new Brigada("Brigada Alfa", "Rescate en altura",null, true );
//        BrigadaData brd=new BrigadaData();
//        brd.guardarBrigada(alfa);
//               
//        Bombero a=new Bombero(2 ,"01020304", "Rodriguez, Rodrigo", "AB (+)", LocalDate.of(2000, Month.JANUARY, 31), "000-1111", null ,true);
//        BomberoData bd=new BomberoData(); 
//        bd.guardarBombero(a);        
//        bd.modificarBombero(a);
//        bd.eliminarBombero(2);
//
//        Bombero lista=bd.buscarBombero(2);
//        
//        bd.listarBombero();
    
    }
}