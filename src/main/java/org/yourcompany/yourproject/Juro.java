package org.yourcompany.yourproject;

import java.util.Scanner;

public class Juro {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese ID del cliente: ");
        String idCliente = sc.nextLine();

        System.out.print("Ingrese nombre del cliente: ");
        String nombreCliente = sc.nextLine();

        Cliente c = new Cliente(idCliente, nombreCliente);

        System.out.print("Ingrese código del producto: ");
        String codigo = sc.nextLine();

        System.out.print("Ingrese nombre del producto: ");
        String nombreProducto = sc.nextLine();

        System.out.print("Ingrese precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Ingrese cantidad: ");
        int cantidad = sc.nextInt();

        Producto p = new Producto(codigo, nombreProducto, precio);
        Venta v = new Venta(c, p, cantidad);

        System.out.println("\n--- RESUMEN DE VENTA ---");
        System.out.println("Cliente: " + c.getNombre());
        System.out.println("Producto: " + p.getNombre());
        System.out.println("Total a pagar: " + v.total());
    }
}