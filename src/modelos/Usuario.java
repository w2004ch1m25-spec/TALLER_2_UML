package modelos;

public abstract class Usuario {

    protected String usuario;
    protected String contrasena;
    protected String nombre;
    protected String apellido;

    public boolean login() {
        return usuario != null && contrasena != null;
    }

    public boolean logOut() {
        return true;
    }
}
