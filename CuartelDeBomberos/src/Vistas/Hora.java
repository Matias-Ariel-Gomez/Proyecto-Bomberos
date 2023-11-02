package Vistas;




import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;


public class Hora extends Thread {
    
    private final JLabel jl;
    
    public Hora(JLabel jl){
     
        this.jl=jl;
    
    }

    @Override
    public void run() {
        Calendar calendario=GregorianCalendar.getInstance();
        String AmPm=calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
        while(true){
            
            Date hoy= new Date();
            SimpleDateFormat df= new SimpleDateFormat("hh:mm:ss");
            jl.setText(df.format(hoy) + " " + AmPm);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Logger.getLogger(Hora.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
    
    
    
}
