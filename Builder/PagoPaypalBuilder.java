package Builder;

import Builder.PagoBuilder;

public class PagoPaypalBuilder implements PagoBuilder {
    @Override
    public Pago realizarPago(Pago pagoPaypal) {
        return pagoPaypal;
    }
}
