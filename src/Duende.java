public class Duende extends Persona implements villano {
    private String atributo;

    public Duende(String nombre, long descripcion, int poder, int vida, String field) {
        super(nombre, descripcion, poder, vida);
        this.atributo = field;
    }
    @Override
    public void Desplazarse() {
    }
    @Override
    public void atacar() {
    }
    @Override
    public void destruir() {
    }
}
