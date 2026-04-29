package Tema8.Hogwarts.EntidadConsulta;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Phaser;

public class Operaciones {

    public static ArrayList<Asignatura> getAsignaturas (String url, String username, String password) {
        ArrayList<Asignatura> lista = new ArrayList<>();

        String sentenciaSQL = "SELECT * FROM Asignatura";
        try(Connection con = DriverManager.getConnection(url,username,password); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)) {
            ResultSet resultado = sentencia.executeQuery();

            while(resultado.next()){
                Asignatura asignatura = new Asignatura();
                asignatura.setId_asignatura(resultado.getInt("id_asignatura"));
                asignatura.setNombre(resultado.getString("nombre"));
                asignatura.setAula(resultado.getString("aula"));
                asignatura.setObligatoria(resultado.getBoolean("obligatoria"));

                lista.add(asignatura);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Lista de Asignaturas:");

        return lista;
    }

    public static String[] estudiantes (String url, String username, String password, String casa) {

        String nombres[] = new String[50];
        int contador = 0;
        String sentenciaSQL = "SELECT Estudiante.nombre AS estudiante,apellido FROM Estudiante INNER JOIN Casa ON Casa.id_casa = Estudiante.id_casa WHERE Casa.nombre = ?";
        try(Connection con = DriverManager.getConnection(url,username,password); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)) {
            sentencia.setString(1, casa);
            ResultSet resultado = sentencia.executeQuery();

            while(resultado.next()){
                String nombre =  resultado.getString("estudiante");
                String apellido =   resultado.getString("apellido");
                String completo = nombre + " " + apellido;
                nombres[contador] = completo;
                contador++;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return nombres;
    }

    public static String mascota (String url, String username, String password, String nombre, String apellido) {
        String nombremascota="";
        String sentenciaSQL = "SELECT Mascota.nombre AS mascota FROM Mascota INNER JOIN Estudiante ON Mascota.id_estudiante = Estudiante.id_estudiante WHERE Estudiante.nombre = ? AND Estudiante.apellido = ?";
        try(Connection con = DriverManager.getConnection(url,username,password); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)) {
            sentencia.setString(1, nombre);
            sentencia.setString(2, apellido);
            ResultSet resultado = sentencia.executeQuery();

            while(resultado.next()){
                nombremascota =  resultado.getString("mascota");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return nombremascota;
    }
    public static String[] alumnos (String url, String username, String password) {
        String[] casaAlumnos = new String[4];
        String sentenciaSQL = "SELECT Casa.nombre AS casa, COUNT(Estudiante.id_casa) AS estudiantes FROM Casa INNER JOIN Estudiante ON Estudiante.id_casa = Casa.id_casa GROUP BY Casa.id_casa";
        int contador = 0;
        try(Connection con = DriverManager.getConnection(url,username,password); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){
            ResultSet resultado = sentencia.executeQuery();

            while(resultado.next()){
                String casa = resultado.getString("casa");
                int alumnos = resultado.getInt("estudiantes");
                String alumno = String.valueOf(alumnos);
                casaAlumnos[contador] = casa + ": " + alumno;
                contador++;
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return casaAlumnos;
    }
    public static int asignatura (String url, String username, String password, String nombre, String aula, boolean obligatoria) {
        int resultado;
        String sentenciaSQL= "INSERT INTO Asignatura (nombre, aula, obligatoria) VALUES (?, ?, ?)";
        try (Connection con = DriverManager.getConnection(url,username,password); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){
            sentencia.setString(1, nombre);
            sentencia.setString(2, aula);
            sentencia.setBoolean(3, obligatoria);
            resultado = sentencia.executeUpdate();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return resultado;
    }
    public static int modificar(String url, String username, String password, String nombre, String aula) {
        int resultado;
        String sentenciaSQL = "UPDATE Asignatura SET aula = ? WHERE nombre = ?";
        try (Connection con = DriverManager.getConnection(url,username,password); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){
            sentencia.setString(1,aula);
            sentencia.setString(2,nombre);
            resultado = sentencia.executeUpdate();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return resultado;
    }
    public static int eliminar(String url, String username, String password, String asignatura) {
        int resultado;
        String sentenciaSQL = "DELETE FROM Asignatura WHERE nombre = ?";
        try (Connection con = DriverManager.getConnection(url,username,password); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){
            sentencia.setString(1, asignatura);
            resultado = sentencia.executeUpdate();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return resultado;
    }

    public static void main (String args[]){
        String host = "programacion.c7yc084oohyl.us-east-1.rds.amazonaws.com";
        String port = "5432";
        String database = "hogwarts";
        String username = "carlos";
        String password = "240726240726";

        ArrayList<Asignatura> lista = new ArrayList<>();

        String casa;
        String nombre;
        String apellido;

        String URL =  "jdbc:postgresql://" + host + ":" + port + "/" + database;

        lista = getAsignaturas(URL, username, password);
        System.out.println("Lista de Asignaturas:");
        for (Asignatura asignatura : lista) {
            System.out.println(asignatura.toString());
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Dime una casa");
        casa = in.nextLine();
        System.out.println("Lista de estudiantes:");

        String[] estudiante = estudiantes(URL, username, password, casa);
        for (int i = 0; i<estudiante.length; i++){
            System.out.println(estudiante[i]);
        }

        System.out.println("Dime un nombre");
        nombre = in.nextLine();
        System.out.println("Dime un apellido");
        apellido = in.nextLine();
        String nombreMascota = mascota(URL,username,password,nombre,apellido);
        System.out.println("Mascota:");
        System.out.println(nombreMascota);

        String[] alumnos = alumnos(URL,username,password);
        for (int i = 0; i<alumnos.length; i++){
            System.out.println(alumnos[i]);
        }

        System.out.println("Dime una asignatura");
        String asignatura = in.nextLine();
        System.out.println("Dime una aula");
        String aula = in.nextLine();
        System.out.println("Es obligatoria?");
        boolean obligatoria = in.nextBoolean();
        int resultado = asignatura(URL,username,password,asignatura,aula,obligatoria);
        System.out.println(resultado);
        in.nextLine();

        System.out.println("Dime una aula");
        aula = in.nextLine();
        System.out.println("Dime el nombre de la asignatura a modificar");
        nombre = in.nextLine();
        resultado = modificar(URL,username,password,nombre,aula);
        System.out.println(resultado);
        in.nextLine();

        System.out.println("Dime una asignatura");
        asignatura = in.nextLine();
        resultado = eliminar(URL,username,password,asignatura);
        System.out.println(resultado);
    }
}
