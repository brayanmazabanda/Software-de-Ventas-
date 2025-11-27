package factura;

public class ProductoSinDescuento extends ProductoBase {

    public ProductoSinDescuento(int cantidad, double precioUnitario) {
        super(cantidad, precioUnitario);
    }

    @Override
    public double calcularImporte() {
        return cantidad * precioUnitario; // precio normal
    }
}
