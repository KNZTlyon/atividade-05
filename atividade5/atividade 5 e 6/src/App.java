import unidero.loo.escola.dominio.Aviao;
import unidero.loo.escola.dominio.Caminhao;
import unidero.loo.escola.dominio.Carro;
import unidero.loo.escola.dominio.Motocicleta;
import unidero.loo.escola.dominio.Onibus;

public class App {

    public static void main(String[] args) throws Exception {
        Aviao avi = new Aviao(0, 0, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0);
        avi.Imprimir();

        Caminhao cami = new Caminhao(0, 0, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, null);
        cami.Imprimir();

        Carro car = new Carro(0, 0, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, null, 0, 0, null, 0);
        car.Imprimir();
        
        Motocicleta mot = new Motocicleta(0, 0, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null);
        mot.Imprimir();

        Onibus oni = new Onibus(0, 0, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, 0, null, 0, 0, 0);
        oni.Imprimir();
        

    }
}
