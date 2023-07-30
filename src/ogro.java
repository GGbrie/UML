public class ogro extends Persona implements villano {
    private String atributo;

    public ogro(String nombre, long descripcion, int poder, int vida, String atributo) {
        super(nombre, descripcion, poder, vida);
        this.atributo = atributo;
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
