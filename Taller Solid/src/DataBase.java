public interface DataBase {
    public void insert(String statement);
    public void select(String statement);
    public void delete(String statement);
    public void update(String statement);


    //Se agrego esta interfaz para aplicar el principio de Dependency Inversion, ya que en el AppWeb
    //dependia concretamente de MySql, pero si en un futuro se desea agregar bases de datos relacionales
    //como PostgreSQL o SQL Server, no se podria ya que AppWeb depende de la clase MySQL en concreto,
    //pero ahora con esta interfaz DataBase ya se podrian crear varias clases en la cual en cada una haya
    //diferente bases de datos y en AppWeb se instanciaria la interfaz DataBase cosa que ahi ya dependeria
    //de esta y asi se deja de violar el principio de Dependecy Inversion
} 
