package unidero.loo.escola.dominio;


public abstract class BaseVeiculo {

    protected int codigo;
    protected int anoFabricado;
    protected int eixos;
    protected int assentos;
    protected int rodas;
    protected int qntdMotores;
    protected int qntdOcupantes;
    protected String nome;
    protected String anoModelo; 
    protected String cor; 
    protected String fabricante;
    protected String tipoCombustivel;
    protected String nomeProprietario;
    protected String estadoUF;
    protected String cidadeUF;
    protected String chassi;
    protected String placa;
    protected String tipoVeiculo;
    protected double pesoLiquido; 
    protected double pesoTotal;
    protected double potencia;
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getAnoFabricado() {
        return anoFabricado;
    }
    public void setAnoFabricado(int anoFabricado) {
        this.anoFabricado = anoFabricado;
    }
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public int getQntdMotores() {
        return qntdMotores;
    }
    public void setQntdMotores(int qntdMotores) {
        this.qntdMotores = qntdMotores;
    }
    public int getQntdOcupantes() {
        return qntdOcupantes;
    }
    public void setQntdOcupantes(int qntdOcupantes) {
        this.qntdOcupantes = qntdOcupantes;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAnoModelo() {
        return anoModelo;
    }
    public void setAnoModelo(String anoModelo) {
        this.anoModelo = anoModelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public String getNomeProprietario() {
        return nomeProprietario;
    }
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }
    public String getEstadoUF() {
        return estadoUF;
    }
    public void setEstadoUF(String estadoUF) {
        this.estadoUF = estadoUF;
    }
    public String getCidadeUF() {
        return cidadeUF;
    }
    public void setCidadeUF(String cidadeUF) {
        this.cidadeUF = cidadeUF;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    public double getPesoLiquido() {
        return pesoLiquido;
    }
    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }
    public double getPesoTotal() {
        return pesoTotal;
    }
    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public BaseVeiculo(int codigo, int anoFabricado, int eixos, int assentos, int rodas, int qntdMotores,
            int qntdOcupantes, String nome, String anoModelo, String cor, String fabricante, String tipoCombustivel,
            String nomeProprietario, String estadoUF, String cidadeUF, String chassi, String placa, String tipoVeiculo,
            double pesoLiquido, double pesoTotal, double potencia) {
        this.codigo = codigo;
        this.anoFabricado = anoFabricado;
        this.eixos = eixos;
        this.assentos = assentos;
        this.rodas = rodas;
        this.qntdMotores = qntdMotores;
        this.qntdOcupantes = qntdOcupantes;
        this.nome = nome;
        this.anoModelo = anoModelo;
        this.cor = cor;
        this.fabricante = fabricante;
        this.tipoCombustivel = tipoCombustivel;
        this.nomeProprietario = nomeProprietario;
        this.estadoUF = estadoUF;
        this.cidadeUF = cidadeUF;
        this.chassi = chassi;
        this.placa = placa;
        this.tipoVeiculo = tipoVeiculo;
        this.pesoLiquido = pesoLiquido;
        this.pesoTotal = pesoTotal;
        this.potencia = potencia;
    }
    
    
    
    
}