public class MySQLRepository implements UserRepository{
    private DataBase database;
    public void insertUserInDatabase(User user){
        database.insert("sql");
     }
}
// Se crea interfaz UserRepository que cumple el SRD para la generalización de ingreso de usuarios a la base de datos
// así mismo la clase MySQLRepository que implementa la interfaz y así insertar al usuario