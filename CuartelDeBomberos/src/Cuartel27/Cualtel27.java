package Cuartel27;
import Entidades.*;
import ClasesData.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;


public class Cualtel27 {

    public static void main(String[] args) {
      
        CentralData conexion=new CentralData();
        conexion.conectarBD();  
        
    //Cuartel dos = new Cuartel( 7,"CuartelDos", 1.2, "000-333333", "cuarteldos@cuartel27.com");
    CuartelData cd=new CuartelData();
    //cd.guardarCuartel(dos);
    //cd.modificarCuartel(dos);
     Brigada alfa=new Brigada( 1," Brigada Beta", "Rescate en altura",null, true );
     // BrigadaData brd=new BrigadaData();
      // brd.listarBrigada();
       
       
       //brd.modificarBrigada(alfa);
      // brd.guardarBrigada(brigada);
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
                
      // Bombero lista=bd.buscarBombero(2);
       //bd.listarBombero();
       //cd.buscarCuartel(7);
      //  cd.listarCuartel();
       LocalTime ld = LocalTime.now();
      double dr = 9.3; 
      LocalDate Is = LocalDate.of(2009,01,07);
      LocalDate Fs = LocalDate.of(2009,01,06);
      
      Siniestro s = new Siniestro(dr ,Is,ld,"Deceso","Deceso en vias de tren", Fs, 8,alfa,true);
      SiniestroData sd = new SiniestroData();
      
      //sd.guardarSiniestro(s);
      //sd.modificarSiniestro(s);
      //sd.eliminarSiniestro(2);
      //sd.buscarSiniestro(3);
      sd.listarSiniestro();
    }
        
    }
