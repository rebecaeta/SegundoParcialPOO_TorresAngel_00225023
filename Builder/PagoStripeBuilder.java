package Builder;

import Builder.PagoBuilder;

public class PagoStripeBuilder implements PagoBuilder {

    @Override
    public Pago realizarPago(Pago pagoStripe) {
        return pagoStripe;
    }
}
