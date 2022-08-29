package repasojava.pkg2.polimorfismo;

public class MariaDB extends BDatos implements Operaciones
{

    @Override
    public void imprimir(int numer) {
        System.out.println("Imprimiendo los " +numer+" datos de Mariadb");
    }

    @Override
    public void conectar() {
        System.out.println("Conectado a MariaDB");
    }

    @Override
    public void consultar() {
        System.out.println("Consultar registro en MariaDB");
    }

    @Override
    public void insertar() {
        System.out.println("Insertar registro en MariDB");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar registro de MariDB");
    }
    
}
