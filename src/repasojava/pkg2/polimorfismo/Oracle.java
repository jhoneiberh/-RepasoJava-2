package repasojava.pkg2.polimorfismo;

public class Oracle extends BDatos implements Operaciones
{
    @Override
    public void conectar() {
        System.out.println("Conectado a oracle");
    }

    @Override
    public void consultar() {
        System.out.println("Consultar registro en oracle");
    }

    @Override
    public void insertar() {
        System.out.println("Insertar registro en oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar registro de oracle");
    }

    @Override
    public void imprimir(int numer) {
        System.out.println("Imprimiendo los " +numer+" datos de Oracle");
    }
    
}
