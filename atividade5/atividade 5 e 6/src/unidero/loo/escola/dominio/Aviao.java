package unidero.loo.escola.dominio;

public class Aviao extends BaseVeiculo{

    private int portas;
    private int atdeOcupantes;
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public int getAtdeOcupantes() {
        return atdeOcupantes;
    }
    public void setAtdeOcupantes(int atdeOcupantes) {
        this.atdeOcupantes = atdeOcupantes;
    }
    public Aviao(int codigo, int anoFabricado, int eixos, int assentos, int rodas, int qntdMotores, int qntdOcupantes,
            String nome, String anoModelo, String cor, String fabricante, String tipoCombustivel,
            String nomeProprietario, String estadoUF, String cidadeUF, String chassi, String placa, String tipoVeiculo,
            double pesoLiquido, double pesoTotal, double potencia, int portas, int atdeOcupantes) {
        super(codigo, anoFabricado, eixos, assentos, rodas, qntdMotores, qntdOcupantes, nome, anoModelo, cor,
                fabricante, tipoCombustivel, nomeProprietario, estadoUF, cidadeUF, chassi, placa, tipoVeiculo,
                pesoLiquido, pesoTotal, potencia);
        this.portas = portas;
        this.atdeOcupantes = atdeOcupantes;
    }
    public void Imprimir(){
        System.out.println("Informações Avião");
        System.out.println("Tipo do Veiculo: "+ this.tipoVeiculo);
        System.out.println("Ano de fabricção: "+ this.anoFabricado);
        System.out.println("Ano modelo: "+ this.anoModelo);
        System.out.println("Chassi: "+ this.chassi);
        System.out.println("Cidade UF: "+ this.cidadeUF);
        System.out.println("Estado UF: "+ this.estadoUF);
        System.out.println("Codigo: "+ this.codigo);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Fabricante: "+ this.fabricante);
        System.out.println("Modelo: "+ this.anoModelo);
        System.out.println("Nome: "+ this.nome);
        System.out.println("Nome Propietário: "+ this.nomeProprietario);
        System.out.println("Peso Liquido: "+ this.pesoLiquido);
        System.out.println("Peso Total: "+ this.pesoTotal);
        System.out.println("Placa: "+ this.placa);
        System.out.println("Quantidade de portas: "+ this.portas);
        System.out.println("Potência"+ this.potencia);
        System.out.println("Quantidade de motores: "+ this.qntdMotores);
        System.out.println("Quantidade de ocupantes: "+ this.qntdOcupantes);
        System.out.println("Quantidade de assentos: "+ this.assentos);
        System.out.println("Quantidade de rodas: "+ this.rodas);
        System.out.println("Tipo do combustível: "+ this.tipoCombustivel);
        
        
    }
        
}