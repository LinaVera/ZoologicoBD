package zoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class conexionBD {

    Connection conx = null;
    
    //conectar
    public Connection conexionBD() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            conx = DriverManager.getConnection("jdbc:mysql://localhost/bdzoo", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
        return conx;

    }

    //crear
    public void crearTablaAnimal() {
        String sql = "CREATE TABLE IF NOT EXISTS animal(\n"
                + "codigo varchar(20) PRIMARY KEY,\n"
                + "nombre_ci varchar(50),\n"
                + "nombre_co varchar(50)"
                + ");";
        try (Connection conexion2 = this.conexionBD();
                Statement st = conexion2.createStatement()) {
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "Tabla Animal, ha sido creado con exito");

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    //guardar- insertar
    public void insertar(String codigo, String nombre_ci, String nombre_co) {
        String sql = "INSERT INTO animal(codigo,nombre_ci,nombre_co) VALUES(?,?,?)";
        try (Connection conexion2 = this.conexionBD();
                PreparedStatement pst = conexion2.prepareStatement(sql)) {
            pst.setString(1, codigo);
            pst.setString(2, nombre_ci);
            pst.setString(3, nombre_co);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Se inserto Animal: " + nombre_ci + " con código: " + codigo + " nombre en común: " + nombre_co);

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    //buscar para actualizar
    public void llamar(String codigo, JTextField m1, JTextField m2, JTextField m3) {
        String sql = "SELECT codigo, nombre_ci, nombre_co FROM animal WHERE codigo = '" + codigo + "'";
        try (Connection conexion3 = this.conexionBD();
                Statement declaracion = conexion3.createStatement();
                ResultSet rs = declaracion.executeQuery(sql)) {
            while (rs.next()) {
                m1.setText(rs.getString("codigo"));
                m2.setText(rs.getString("nombre_ci"));
                m3.setText(rs.getString("nombre_co"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void actualizar(String codigo, JTextField m1, JTextField m2, JTextField m3, String noci, String noco) {

        String sql = "UPDATE animal SET nombre_ci = '" + noci + "', nombre_co = '" + noco + "' WHERE codigo = '" + codigo + "'";

        try (Connection conexion2 = this.conexionBD();
                PreparedStatement pst = conexion2.prepareStatement(sql)) {
            JOptionPane.showMessageDialog(null, "Se actulizarón los datos");
            pst.execute();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    //eliminar
    public void eliminar(String codigo) {

        try (Connection conexion3 = this.conexionBD();
                Statement declaracion = conexion3.createStatement()) {
            String sql = "DELETE FROM animal WHERE codigo = '" + codigo + "'";
            declaracion.execute(sql);
            JOptionPane.showMessageDialog(null, "Animal borrado");

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

}
