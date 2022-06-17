/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

/**
 *
 * @author M S I
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        //1.Crear un objeto de tipo estudiante presencial;
        //
        String nombre = "Jorge";
        String apellido = "Paredes";
        String identificacion = "11022456";
        int edad = 20;

        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad);

        estPresencial.establecerNumeroCreditos(5);
        estPresencial.establecerCostoCredito(250.15);
        estPresencial.calcularMatriculaPresencial();

        System.out.println(estPresencial);
    }

}
