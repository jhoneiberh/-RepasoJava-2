package repasojava.pkg2.polimorfismo;

public class Postgres extends BDatos implements Operaciones
{

    @Override
    public void conectar() {
        System.out.println("Conectado a postgres");
    }

    @Override
    public void consultar() {
        System.out.println("Consultar registro en postgres");
    }

    @Override
    public void insertar() {
        System.out.println("Insertar registro en postgres");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar registro de postgres");
    }

    @Override
    public void imprimir(int numer) {
        System.out.println("Imprimiendo los " +numer+" datos de Posrgres");
    }
    
}
