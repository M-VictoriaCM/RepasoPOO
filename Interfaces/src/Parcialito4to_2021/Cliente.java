package Parcialito4to_2021;

public class Cliente {
    private String nombre;
    private String apellido;
    private Preferencia preferencias;

    public Cliente(String nombre, String apellido, Preferencia preferencias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.preferencias = preferencias;
    }

    public boolean puedeAsistir(Comercio comercio) {
        return preferencias.cumple(comercio);
    }
}
