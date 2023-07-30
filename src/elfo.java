public class elfo extends Persona implements heroe {
    private String atributo;

    public elfo(String nombre, long descripcion, int poder, int vida, String atributo) {
        super(nombre, descripcion, poder, vida);
        this.atributo= atributo;
    }
    @Override
    public void Desplazarse() {
    }
    @Override
    public void atacar() {
    }
    @Override
    public void defender() {
    }
    @Override
    public void recibirAtaque() {
    }
}
