package Tema8.Pilotos;

import java.sql.*;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Scanner;

public class PilotosCRUD {
    public static void menu(){
        System.out.println("1. Crear Piloto");
        System.out.println("2. Leer Piloto");
        System.out.println("3. Leer Pilotos");
        System.out.println("4. Actualizar Piloto");
        System.out.println("5. Eliminar Piloto");
        System.out.println("6. Mostrar Clasificacion Pilotos");
        System.out.println("7. Mostrar Clasificacion Equipos");
        System.out.println("0. Salir");
    }
    public static int CrearPiloto(String url, String username, String password,String codigo ,String nombre, String apellidos, String fechaNacimiento, String nacionalidad,int constructorid, String enlace){
        int resultado;
        String sentenciaSQL="INSERT INTO drivers (code, forename, surname, dob, nationality,constructorid, url) VALUES (?,?,?,?,?,?,?)";
        try (Connection con = DriverManager.getConnection(url,username,password); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){
            sentencia.setString(1, codigo);
            sentencia.setString(2, nombre);
            sentencia.setString(3, apellidos);
            sentencia.setDate(4, Date.valueOf(fechaNacimiento));
            sentencia.setString(5, nacionalidad);
            sentencia.setInt(6, constructorid);
            sentencia.setString(7, enlace);

            resultado = sentencia.executeUpdate();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return resultado;
    }

    public static String LeerPiloto(String url, String username, String password, int codigo){
        String resultado = "";
        String sentenciaSQL="SELECT * FROM drivers WHERE driverid = ?";
        try(Connection con = DriverManager.getConnection(url,username,password); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){
            sentencia.setInt(1, codigo);
            ResultSet rs = sentencia.executeQuery();

            if(rs.next()){
                String identificador = rs.getString("code");
                String nombre = rs.getString("forename");
                String apellidos = rs.getString("surname");
                String fechaNacimiento = rs.getString("dob");
                String nacionalidad = rs.getString("nationality");
                int constructorid = rs.getInt("constructorid");
                String enlace = rs.getString("url");

                resultado = "Piloto{" +
                        "codigo='" + identificador + '\'' +
                        ", nombre='" + nombre + '\'' +
                        ", apellido='" + apellidos + '\'' +
                        ", fechaNacimiento='" + fechaNacimiento + '\'' +
                        ", nacionalidad='" + nacionalidad + '\'' +
                        ", constructorid=" + constructorid +
                        ", enlace='" + enlace + '\'' +
                        '}';
            }
            
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
            return resultado;
    }

    public static ArrayList<Piloto> LeerPilotos(String url, String username, String password){
        int contador = 0;
        ArrayList<Piloto> resultado = new ArrayList<>();
        String sentenciaSQL="SELECT * FROM drivers";
        try(Connection con = DriverManager.getConnection(url,username,password); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){
            ResultSet rs = sentencia.executeQuery();

            while(rs.next()){
                String identificador = rs.getString("code");
                String nombre = rs.getString("forename");
                String apellidos = rs.getString("surname");
                String fechaNacimiento = rs.getString("dob");
                String nacionalidad = rs.getString("nationality");
                int constructorid = rs.getInt("constructorid");
                String enlace = rs.getString("url");

                Piloto p = new Piloto(identificador, nombre, apellidos, fechaNacimiento, nacionalidad, constructorid, enlace);
                resultado.add(p);

            }

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return resultado;
    }

    public static int ActualizarPiloto(String url, String username, String password,String codigo ,String nombre, String apellidos, String fechaNacimiento, String nacionalidad,int constructorid, String enlace, int id){
        int resultado;
        String sentenciaSQL="UPDATE drivers SET code = ?, forename = ?, surname =?, dob=?, nationality=?,constructorid=?, url=? WHERE driverid = ?";
        try (Connection con = DriverManager.getConnection(url,username,password); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){
            sentencia.setString(1, codigo);
            sentencia.setString(2, nombre);
            sentencia.setString(3, apellidos);
            sentencia.setDate(4, Date.valueOf(fechaNacimiento));
            sentencia.setString(5, nacionalidad);
            sentencia.setInt(6, constructorid);
            sentencia.setString(7, enlace);
            sentencia.setInt(8, id);

            resultado = sentencia.executeUpdate();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return resultado;
    }
    public static int EliminarPiloto(String url, String username, String password,int id){
        int resultado;
        String sentenciaSQL="DELETE FROM drivers WHERE driverid = ?";
        try (Connection con = DriverManager.getConnection(url,username,password); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){
            sentencia.setInt(1, id);
            resultado = sentencia.executeUpdate();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return resultado;
    }
    public static ArrayList<Piloto> MostrarPilotos(String url, String username, String password){
        ArrayList<Piloto> resultado = new ArrayList<>();
        String sentenciaSQL="SELECT drivers.*, SUM(results.points) AS totalPoints FROM drivers JOIN results ON results.driverid = drivers.driverid GROUP BY drivers.driverid ORDER BY totalPoints DESC";
        try (Connection con = DriverManager.getConnection(url,username,password); PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){
            ResultSet rs = sentencia.executeQuery();
            while(rs.next()){
                String identificador = rs.getString("code");
                String nombre = rs.getString("forename");
                String apellidos = rs.getString("surname");
                String fechaNacimiento = rs.getString("dob");
                String nacionalidad = rs.getString("nationality");
                int constructorid = rs.getInt("constructorid");
                String enlace = rs.getString("url");
                int totalPoints = rs.getInt("totalPoints");
                Piloto p = new Piloto(identificador,nombre,apellidos,fechaNacimiento,nacionalidad,constructorid,enlace);
                resultado.add(p);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return resultado;
    }
    public static ArrayList<String> MostrarEquipos(String url, String username, String password){
        ArrayList<String> resultado = new ArrayList<>();
        String sentenciaSQL = "SELECT constructors.name AS nombre, SUM(results.points) AS total_points FROM drivers JOIN results ON drivers.driverid = results.driverid JOIN constructors ON drivers.constructorid = constructors.constructorid GROUP BY constructors.constructorid, constructors.name ORDER BY total_points DESC";
        try(Connection con = DriverManager.getConnection(url, username, password);PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){
            ResultSet rs = sentencia.executeQuery();
            while(rs.next()){
                String nombre = rs.getString("nombre");
                int puntos = rs.getInt("total_points");
                resultado.add(nombre+" "+puntos);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return resultado;
    }


    public static void main(String[] args) {
        String host = "programacion.c7yc084oohyl.us-east-1.rds.amazonaws.com";
        String port = "5432";
        String database = "f12006";
        String username = "carlos";
        String password = "240726240726";

        String codigoPiloto;
        String nombrePiloto;
        String apellidoPiloto;
        String fechaNacimiento;
        String nacionalidad;
        int codigoConsructor;
        String enlace;

        ArrayList<Piloto> pilotos;
        ArrayList<String> equipos;

        String url =  "jdbc:postgresql://" + host + ":" + port + "/" + database;

        Scanner in =  new Scanner(System.in);

        int opcion;
        int valor;
        int id;

        String respuesta;

        menu();
        System.out.println("Que quieres hacer?");
        opcion = in.nextInt();

        switch (opcion){
            case 1:
                in.nextLine();
                System.out.println("Introduce el codigo del Piloto");
                codigoPiloto = in.nextLine();
                System.out.println("Introduce el nombre del Piloto");
                nombrePiloto = in.nextLine();
                System.out.println("Introduce el apellido del Piloto");
                apellidoPiloto = in.nextLine();
                System.out.println("Introduce la fecha de nacimiento del Piloto (Formato YYYY-MM-DD)");
                fechaNacimiento = in.nextLine();
                System.out.println("Introduce la nacionalidad del Piloto");
                nacionalidad = in.nextLine();
                System.out.println("Introduce el id del equipo del Piloto");
                codigoConsructor = in.nextInt();
                in.nextLine();
                System.out.println("Introduce el enlace del Piloto");
                enlace = in.nextLine();
                valor = CrearPiloto(url,username,password,codigoPiloto,nombrePiloto,apellidoPiloto,fechaNacimiento,nacionalidad,codigoConsructor,enlace);

                if(valor>0){
                    System.out.println("Piloto creado con exito");
                }else {
                    System.out.println("Error al intentar crear la piloto");
                }
                break;
            case 2:
                System.out.println("Introduce el identificador numerico del Piloto");
                id = in.nextInt();
                respuesta = LeerPiloto(url,username,password,id);
                System.out.println(respuesta);
                break;
            case 3:
                pilotos=LeerPilotos(url,username,password);
                for(Piloto p:pilotos){
                    System.out.println(p);
                }
                break;
            case 4:
                in.nextLine();
                System.out.println("Introduce el codigo del Piloto");
                codigoPiloto = in.nextLine();
                System.out.println("Introduce el nombre del Piloto");
                nombrePiloto = in.nextLine();
                System.out.println("Introduce el apellido del Piloto");
                apellidoPiloto = in.nextLine();
                System.out.println("Introduce la fecha de nacimiento del Piloto (Formato YYYY-MM-DD)");
                fechaNacimiento = in.nextLine();
                System.out.println("Introduce la nacionalidad del Piloto");
                nacionalidad = in.nextLine();
                System.out.println("Introduce el id del equipo del Piloto");
                codigoConsructor = in.nextInt();
                in.nextLine();
                System.out.println("Introduce el enlace del Piloto");
                enlace = in.nextLine();
                System.out.println("Introduce el id del Piloto");
                id=in.nextInt();

                valor=ActualizarPiloto(url,username,password,codigoPiloto,nombrePiloto,apellidoPiloto,fechaNacimiento,nacionalidad,codigoConsructor,enlace,id);
                if(valor>0){
                    System.out.println("Piloto actualizado con exito");
                }else {
                    System.out.println("Error al actualizar al piloto");
                }
                break;
            case 5:
                System.out.println("Introduce el id del Piloto");
                id=in.nextInt();
                valor=EliminarPiloto(url,username,password,id);
                if(valor>0){
                    System.out.println("Piloto eliminado con exito");
                }else {
                    System.out.println("Error al eliminar al piloto");
                }
                break;
            case 6:
                pilotos=MostrarPilotos(url,username,password);
                valor=1;
                for(Piloto p:pilotos){
                    System.out.println(valor + " " + p);
                    valor++;
                }
                break;
            case 7:
                equipos=MostrarEquipos(url,username,password);
                valor=1;
                for (int i = 0; i<equipos.size();i++){
                    System.out.println(valor + " " + equipos.get(i));
                    valor++;
                }
                break;
            case 0:
                break;
        }
    }
}
