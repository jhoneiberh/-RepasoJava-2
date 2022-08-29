package repasojava.pkg2.polimorfismo;

public class Main 
{
    public static void main(String[] args) 
    {        
        BDatos oracle = new Oracle();
        BDatos postgres = new Postgres();
        BDatos mariadb = new MariaDB();
        
        
        
        oracle.imprimir(10);
        postgres.imprimir(5);
        mariadb.imprimir(20);
    
       
    }
    
}
