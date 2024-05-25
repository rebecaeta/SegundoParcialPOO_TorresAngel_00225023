public class PagoStripe extends PagoStripeBuilder {
    private String usuario;
    private String empresa;

    public PagoStripe(String usuario, String empresa) {
        this.usuario = usuario;
        this.empresa = empresa;
    }
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
