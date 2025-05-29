public interface LogIn {
    public void log(User user);
}
//Principio de Sustitución de Liskov (LSP):
// Antes, la clase AppWeb dependía directamente de LogInUser y LogInAdmin.
// Al utilizar la interfaz LogIn, AppWeb puede depender de una abstracción
// y tratar a cualquier implementación (usuario normal, administrador, etc.)
// de forma uniforme, sin romper el comportamiento esperado del sistema.
