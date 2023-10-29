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
        
        
     LocalTime ld = LocalTime.now();//Hora de inicio del siniestro, igual a la del sistema
     double direccion = 4.9;//donde 4 seria X y 9 seria Y 
     LocalDate InicioSiniestro = LocalDate.of(2023,10,25);//Fecha de inicio del siniestro
     Cuartel cuartelx = new Cuartel( 7,"CuartelDos", 1.2, "000-333333", "cuarteldos@cuartel27.com");
     CuartelData cd = new CuartelData();
     
     
    /*REQUERIMIENTOS DEL PROYECTO Y SUS RESOLUCIONES: 
        
     A continuacion se crea la clase "conexion" de nombre CentralData y se invoca el metodo "conectarBD" 
     para obtener la conexion a base de datos.*/
    
    CentralData conexion=new CentralData();
    conexion.conectarBD(); 
        
    /*            Listar las brigadas que se encuentran libres, o asignadas a un incidente o siniestro:
      
    Se crea un ArrayList en el que se listan todas las brigadas y en el que se puede determinar cual
    esta asignada a un siniestro, o no ,mediante el estado de la brigada (Ej: estadoBrigada = 1 significaria
    que ha sido asignada y en caso contrario seria un estadoBrigada = 0).
    
    1ro) Se crea una brigada con los atributos necesarios (nombreClave, especialidad,cuartel, estadoBrigada),
    existe un atributo mas que es el codigoBrigada, pero es autoincremental en base de datos,por tanto se autoasignaria.*/
    
    Brigada brigadax = new Brigada("Brigada Gamma","Inundaciones", cuartelx, true);
    
 /* 2do) Para traer las brigadas existentes en base de datos se instancia una clase "BrigadaData",la cual posee el 
    metodo "listarBrigada"
    */  
    BrigadaData brd = new BrigadaData();
  //brd.listarBrigada();
    
    /*             Mostrar todos los incidentes o siniestros que han ocurrido entre ayer y hoy:
    
    1ro) Se instancia una clase "siniestroData", la cual posee el metodo "listarUltimosSiniestros" que trae desde base
    de datos los sinistros de los ultimos 2 dias.*/
    
    SiniestroData sd = new SiniestroData();
  //sd.listarUltimosSiniestros();
    
    /*                       Se necesita consultar:
                      1)Todos los bomberos de una misma brigada
                      2)Todas las brigadas que existen en ese cuartel
    
    1)Se crea una instanciacion de clase "BomberoData" a traves de la cual podremos utilizar el metodo 
    "listarBomberosPorBrigada"*/
    BomberoData bd = new BomberoData();
  //bd.listarBomberosPorBrigada();
    
  /* 2)Teniendo ya una instanciacion de clase "BrigadaData" en la linea 36 podremos utilizar el metodo 
    "listarBrigadasPorCuartel"*/
  //brd.listarBrigadasPorCuartel();
    
    /*            Marcar un incidente como resuelto, colocando la fecha de resolución y su 
                  calificación 1 a 10, en la medida de éxito obtenido:

    1ro) Con la instanciacion de clase "SiniestroData" en la linea 53 podremos utilizar
    el metodo "cierreSiniestro", el cual permite ingresar una fecha de resolucion del mismo, ademas
    de una puntuacion.Este metodo requiere ingresar un int id por parametro el cual representara el codSiniestro 
    de algun siniestro existente en base de 
    datos, un LocalDate que sera la fecha de resolucion y un int que sera utilizado como puntuacion.
    Todo esto teniendo en cuenta que un siniestro sin solucion se encontrara cargado
    originalmente sin fecha de resolucion o puntuacion.*/
    LocalDate fechaSolucion = LocalDate.of(2023,10,30);
    //sd.cierreSiniestro(3,fechaSolucion,9);
    
    /*           Mostrar los cuarteles de bomberos cerca de un punto de siniestro o incidente:
    
    */
    
    
    
    
    
    
    
    
    /*           Medir la distancia entre dos pares de coordenadas, y devolver la cantidad de metros entre ellas
                 (usar la fórmula matemática de distancia entre dos puntos):
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /* ALGUNAS PRUEBAS REALIZADAS DURANTE EL PROYECTO:
    
    */
       
       //cd.guardarCuartel(dos);
       //cd.modificarCuartel(dos);
       //brd.guardarBrigada(brigadax);
       //brd.modificarBrigada(alfa);
       //brd.guardarBrigada(brigada);
       //brd.eliminarBrigada(1);
       Brigada brigadaPrueba = new Brigada(1,"Brigada Alfa","Rescate en altura", cuartelx, true);
       LocalDate fechaNacim = LocalDate.of(1978,12,06);
       Bombero b = new Bombero("01020871", "Fernandez,Esteban", "AB(+)", fechaNacim , "000-7777", brigadaPrueba ,true);
        
       //bd.guardarBombero(b);        
       //bd.modificarBombero(b);
       //bd.eliminarBombero(2);
      
       //for(Bombero a:bd.listarBombero()){
       //bd.listarBombero();
       //for (Iterator<Bombero> it = lista.iterator(); it.hasNext();) {
       //System.out.println(listarBombero().);
                
       //Bombero lista=bd.buscarBombero(2);
       //bd.listarBombero();
       //cd.buscarCuartel(7);
       //cd.listarCuartel();
      
       //Siniestro s = new Siniestro(direccion ,Is,ld,"ACV","ACV en via publica", Fs, 8,alfa,true);
      
      
       //sd.guardarSiniestro(s);
       //sd.modificarSiniestro(s);
       //sd.eliminarSiniestro(2);
       //sd.buscarSiniestro(3);
       //sd.listarSiniestro();
       //sd.listarUltimosSiniestros();
       
       //bd.listarBomberosPorBrigada();
    }
        
    }