package Tema8.Hogwarts;

import java.sql.*;

public class EjerciciosSQL {
    public static void main(String[] args) {

        String HOST = "programacion.c7yc084oohyl.us-east-1.rds.amazonaws.com";
        String PORT = "5432";
        String DATABASE = "hogwarts";
        String USER = "carlos";
        String PASSWORD = "240726240726";

        String URL = "jdbc:postgresql://" + HOST + ":" + PORT + "/" + DATABASE;

        String sentenciaSQL = "SELECT nombre, apellido FROM Profesor";

        try (Connection con = DriverManager.getConnection(URL,USER,PASSWORD); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)) {
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                System.out.println("Profesor : " + nombre + " " + apellido);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        sentenciaSQL = "SELECT nombre, apellido FROM Estudiante WHERE fecha_nacimiento>'1980-01-01'";
        try (Connection con = DriverManager.getConnection(URL,USER,PASSWORD); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)) {
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                System.out.println("Estudiante : " + nombre + " " + apellido + " nacido despues del 01-01-1980");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        sentenciaSQL = "SELECT nombre, apellido FROM Estudiante ORDER BY fecha_nacimiento ASC";
        try (Connection con = DriverManager.getConnection(URL,USER,PASSWORD); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)) {
            ResultSet resultado = sentencia.executeQuery();

            int contador = 1;
            while (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                System.out.println(contador + ": " + nombre + " " + apellido);
                contador++;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        sentenciaSQL = "SELECT Casa.nombre, COUNT(*) AS cantidad FROM Casa INNER JOIN Estudiante ON Estudiante.id_casa = Casa.id_casa GROUP BY Casa.nombre";
        try (Connection con = DriverManager.getConnection(URL,USER,PASSWORD); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)) {
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()) {
                String casa = resultado.getString("nombre");
                int cantidad = resultado.getInt("cantidad");
                System.out.println(casa + ": " + cantidad);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        sentenciaSQL = "SELECT MAX(calificacion) AS maxima, AVG(calificacion) AS promedio FROM Estudiante_Asignatura INNER JOIN Asignatura ON Asignatura.id_asignatura = Estudiante_Asignatura.id_asignatura WHERE Asignatura.nombre = 'Pociones'";
        try (Connection con = DriverManager.getConnection(URL,USER,PASSWORD); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)) {
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                double maxima = resultado.getDouble("maxima");
                double promedio = resultado.getDouble("promedio");
                System.out.println("Maxima : " + maxima + " Promedio : " + promedio);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        sentenciaSQL = "SELECT DISTINCT anyo_curso FROM Estudiante";
        try (Connection con = DriverManager.getConnection(URL,USER,PASSWORD); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)) {
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                int curso = resultado.getInt("anyo_curso");
                System.out.println(curso);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        sentenciaSQL = "SELECT nombre FROM Estudiante WHERE apellido LIKE 'P%'";
        try (Connection con = DriverManager.getConnection(URL,USER,PASSWORD); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)) {
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                String nombre = resultado.getString("nombre");
                System.out.println(nombre + " su apellido empieza por P");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        sentenciaSQL = "SELECT nombre, apellido FROM Estudiante WHERE anyo_curso IN (4,5)";
        try (Connection con = DriverManager.getConnection(URL,USER,PASSWORD); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)) {
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");

                System.out.println(nombre + " " + apellido + " esta haciendo el 4 o 5 curso");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        sentenciaSQL = "SELECT Estudiante.nombre AS estudiante, apellido FROM Estudiante INNER JOIN Casa ON Casa.id_casa = Estudiante.id_casa WHERE Estudiante.anyo_curso=5 AND (Casa.nombre = 'Gryffindor' OR Casa.nombre = 'Slytherin')";
        try (Connection con = DriverManager.getConnection(URL,USER,PASSWORD); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)) {
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                String nombre = resultado.getString("estudiante");
                String apellido = resultado.getString("apellido");
                System.out.println(nombre + " " + apellido + " pertenece a  Gryffindor o Slytherin y esta en el 5to curso");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        sentenciaSQL = "SELECT nombre, apellido FROM Estudiante ORDER BY fecha_nacimiento DESC LIMIT 5";
        try (Connection con = DriverManager.getConnection(URL,USER,PASSWORD); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)) {
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                System.out.println(nombre + " " + apellido + " es uno de los 5 estudiantes mas jovenes");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        sentenciaSQL = "SELECT Estudiante.nombre AS estudiante, apellido FROM Estudiante INNER JOIN Estudiante_Asignatura ON Estudiante_Asignatura.id_estudiante = Estudiante.id_estudiante INNER JOIN Asignatura ON Asignatura.id_asignatura = Estudiante_Asignatura.id_asignatura WHERE Asignatura.nombre = 'Vuelo' AND Estudiante_Asignatura.calificacion>=8";
        try (Connection con = DriverManager.getConnection(URL,USER,PASSWORD); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)) {
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                String nombre = resultado.getString("estudiante");
                String apellido = resultado.getString("apellido");
                System.out.println("El alumno " + nombre + " " + apellido + " tiene una nota igual o superior a 8 en vuelo");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
/*No contar*/
        sentenciaSQL = "DELETE FROM Estudiante WHERE nombre = 'Nymphadora' AND apellido = 'Tonks'";
        try (Connection con = DriverManager.getConnection(URL,USER,PASSWORD); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)) {
            int resultado = sentencia.executeUpdate();

            System.out.println(resultado);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        sentenciaSQL = "INSERT INTO Estudiante (nombre, apellido, id_casa, anyo_curso, fecha_nacimiento) VALUES ('Nymphadora', 'Tonks', 4, 7, '1973-11-25')";
        try (Connection con = DriverManager.getConnection(URL,USER,PASSWORD); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)) {
            int resultado = sentencia.executeUpdate();

            System.out.println(resultado);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        sentenciaSQL = "UPDATE CASA SET id_jefe = Profesor.id_profesor FROM Profesor WHERE Casa.nombre = 'Hufflepuff' AND Profesor.nombre = 'Pomona' AND Profesor.apellido = 'Sprout'";
        try (Connection con = DriverManager.getConnection(URL,USER,PASSWORD); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)) {
            int resultado = sentencia.executeUpdate();

            System.out.println(resultado);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        sentenciaSQL = "DELETE FROM Estudiante WHERE Estudiante.nombre = 'Tom' AND Estudiante.apellido = 'Riddle'";
        try (Connection con = DriverManager.getConnection(URL,USER,PASSWORD); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){
            int resultado = sentencia.executeUpdate();

            System.out.println(resultado);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

        sentenciaSQL = "SELECT Estudiante.nombre AS estudiante, apellido, Casa.nombre AS casa From Estudiante INNER JOIN Casa ON Casa.id_casa = Estudiante.id_casa";
        try (Connection con = DriverManager.getConnection(URL,USER,PASSWORD); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                String nombre = resultado.getString("estudiante");
                String apellido = resultado.getString("apellido");
                String casa = resultado.getString("casa");

                System.out.println(nombre + " " + apellido + " " + casa);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

        sentenciaSQL = "SELECT Estudiante.nombre AS estudiante, Estudiante.apellido AS apellido, Mascota.nombre AS mascota, Asignatura.nombre AS asignatura FROM Estudiante LEFT JOIN Mascota ON Estudiante.id_estudiante = Mascota.id_estudiante INNER JOIN Estudiante_Asignatura ON Estudiante_Asignatura.id_estudiante = Estudiante.id_estudiante INNER JOIN Asignatura ON Asignatura.id_asignatura = Estudiante_Asignatura.id_asignatura";
        try(Connection con = DriverManager.getConnection(URL,USER,PASSWORD); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                String nombre = resultado.getString("estudiante");
                String apellido = resultado.getString("apellido");
                String mascota = resultado.getString("mascota");
                String asignatura = resultado.getString("asignatura");
                System.out.println(nombre + " " + apellido + " " + mascota + " " + asignatura);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

        sentenciaSQL="SELECT Estudiante.nombre AS estudiante, Estudiante.apellido AS apellido FROM Estudiante WHERE  Estudiante.id_estudiante IN (SELECT Estudiante.id_estudiante FROM Estudiante INNER JOIN Estudiante_Asignatura ON Estudiante.id_estudiante = Estudiante_Asignatura.id_estudiante INNER JOIN Asignatura ON Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura WHERE Asignatura.nombre = 'Encantamientos' AND Estudiante_Asignatura.calificacion>(SELECT AVG(Estudiante_Asignatura.calificacion) FROM Estudiante_Asignatura INNER JOIN Asignatura ON Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura WHERE  Asignatura.nombre = 'Encantamientos'))";
        try (Connection con = DriverManager.getConnection(URL,USER,PASSWORD); PreparedStatement sentencia= con.prepareStatement(sentenciaSQL)){
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                String nombre = resultado.getString("estudiante");
                String apellido = resultado.getString("apellido");
                System.out.println(nombre + " " + apellido + " tiene una nota superior al promedio en encantamientos");
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

        sentenciaSQL="SELECT Casa.nombre AS casa FROM Casa WHERE Casa.id_casa IN (SELECT Casa.id_casa FROM Casa INNER JOIN Estudiante ON Casa.id_casa = Estudiante.id_casa INNER JOIN Estudiante_Asignatura ON Estudiante.id_estudiante = Estudiante_Asignatura.id_estudiante GROUP BY Casa.id_casa HAVING AVG(Estudiante_Asignatura.calificacion)>7)";
        try (Connection con = DriverManager.getConnection(URL,USER,PASSWORD); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                String nombre = resultado.getString("casa");
                System.out.println(nombre + " Es una de las casas cuya calificacion media es mayor a 7");
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
