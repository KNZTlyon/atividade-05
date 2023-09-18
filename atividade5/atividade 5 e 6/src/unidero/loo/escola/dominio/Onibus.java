package unidero.loo.escola.dominio;

public class Onibus extends BaseVeiculo{

    private int eixos;
    private String codigoRenavem;
    private int qtdeMotores;
    private int qtdeOcupantes;
    private int portas;
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public String getCodigoRenavem() {
        return codigoRenavem;
    }
    public void setCodigoRenavem(String codigoRenavem) {
        this.codigoRenavem = codigoRenavem;
    }
    public int getQtdeMotores() {
        return qtdeMotores;
    }
    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }
    public int getQtdeOcupantes() {
        return qtdeOcupantes;
    }
    public void setQtdeOcupantes(int qtdeOcupantes) {
        this.qtdeOcupantes = qtdeOcupantes;
    }
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public Onibus(int codigo, int anoFabricado, int eixos, int assentos, int rodas, int qntdMotores, int qntdOcupantes,
            String nome, String anoModelo, String cor, String fabricante, String tipoCombustivel,
            String nomeProprietario, String estadoUF, String cidadeUF, String chassi, String placa, String tipoVeiculo,
            double pesoLiquido, double pesoTotal, double potencia, int eixos2, String codigoRenavem, int qtdeMotores,
            int qtdeOcupantes, int portas) {
        super(codigo, anoFabricado, eixos, assentos, rodas, qntdMotores, qntdOcupantes, nome, anoModelo, cor,
                fabricante, tipoCombustivel, nomeProprietario, estadoUF, cidadeUF, chassi, placa, tipoVeiculo,
                pesoLiquido, pesoTotal, potencia);
        eixos = eixos2;
        this.codigoRenavem = codigoRenavem;
        this.qtdeMotores = qtdeMotores;
        this.qtdeOcupantes = qtdeOcupantes;
        this.portas = portas;
    }
    
    public void Imprimir(){
        System.out.println("Informações Onibus");
        System.out.println("Tipo do Veiculo: "+ this.tipoVeiculo);
        System.out.println("Ano de fabricção: "+ this.anoFabricado);
        System.out.println("Codigo Renavam: "+ this.codigoRenavem);              
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
        System.out.println("Quantidade de motores: "+ this.qtdeMotores);
        System.out.println("Quantidade de ocupantes: "+ this.qtdeOcupantes);
        System.out.println("Quantidade de eixos: "+ this.eixos);
        System.out.println("Quantidade de assentos: "+ this.assentos);
        System.out.println("Quantidade de rodas: "+ this.rodas);
        System.out.println("Tipo do combustível: "+ this.tipoCombustivel);
    
    }
    
    

}