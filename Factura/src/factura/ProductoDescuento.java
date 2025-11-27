package factura;

public class ProductoDescuento extends ProductoBase {

    public ProductoDescuento(int cantidad, double precioUnitario) {
        super(cantidad, precioUnitario);
    }

    @Override
    public double calcularImporte() {
        double total = cantidad * precioUnitario;
        return total * 0.90; // 10% DESCUENTO
    }
}
