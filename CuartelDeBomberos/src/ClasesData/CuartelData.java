package ClasesData;

import Entidades.Bombero;
import Entidades.Cuartel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
}
