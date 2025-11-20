package org.yourcompany.yourproject;

public class Venta {
    private Cliente cliente;
    private Producto producto;
    private int cantidad;

    public Venta(Cliente cliente, Producto producto, int cantidad) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double total() {
        return producto.getPrecio() * cantidad;
    }
}