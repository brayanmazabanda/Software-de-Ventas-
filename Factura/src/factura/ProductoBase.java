package factura;

public abstract class ProductoBase {
    protected int cantidad;
    protected double precioUnitario;

    public ProductoBase(int cantidad, double precioUnitario) {
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public abstract double calcularImporte();
}
