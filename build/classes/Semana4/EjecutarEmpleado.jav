/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana4;

/**
 *
 * @author User
 */
public class EjecutarEmpleado {
    public static void main(String[] args) {
        Empleado []emp = new Empleado[3];
        emp[0] = new EmpleadoTiempoCompleto("Ana", 12000);
        emp[1] = new EmpleadoPorHoras(40, 100, "Luis");
        emp[2] = new EmpleadoPorComision(50000, 0.10, "Carlos");
        
        for (Empleado e : emp){
            e.mostrarInfo();
            System.out.println("Pago: "+e.CalcularPago());
            System.out.println("----------");
            
        }
    }
    
}
