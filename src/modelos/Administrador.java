package modelos;

public class Administrador extends Usuario {

    public void crearUsuarioConRol(String usuario, String contrasena) {
        System.out.println("Usuario creado: " + usuario);
    }

    public void asignarPermiso(String usuario) {
        System.out.println("Permiso asignado a: " + usuario);
    }

    public void actualizarSoftware() {
        System.out.println("Software actualizado");
    }

    public void asignarResponsable(Curso curso, Profesor responsable) {
        curso.setResponsable(responsable);
    }
}
