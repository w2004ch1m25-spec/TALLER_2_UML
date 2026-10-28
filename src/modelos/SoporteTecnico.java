package modelos;

public class SoporteTecnico extends Usuario {

    public void brindarAsistencia(Usuario usuario) {
        System.out.println("Brindando asistencia a " + usuario.nombre);
    }

    public void resolverProblemaTecnico(Usuario usuario) {
        System.out.println("Resolviendo problema técnico");
    }

    public void derivarProblemaGestion(Administrador administrador) {
        System.out.println("Problema derivado al administrador");
    }
}
