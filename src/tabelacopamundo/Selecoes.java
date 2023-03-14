package tabelacopamundo;
public class Selecoes {
    //Atributo
    private String nome;
    private int pontos;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int golsjogo1;
    private int golsjogo2;
    private int golsjogo3;
    //Metodos especiais
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    
    public int getPontos(){
        return this.pontos;
    }
    
    public void setPontos(){
        this.pontos = (this.getVitorias()*3)+(this.getEmpates());
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getGolsjogo1() {
        return golsjogo1;
    }

    public void setGolsjogo1(int golsjogo1) {
        this.golsjogo1 = golsjogo1;
    }

    public int getGolsjogo2() {
        return golsjogo2;
    }

    public void setGolsjogo2(int golsjogo2) {
        this.golsjogo2 = golsjogo2;
    }

    public int getGolsjogo3() {
        return golsjogo3;
    }

    public void setGolsjogo3(int golsjogo3) {
        this.golsjogo3 = golsjogo3;
    }
    
    //Construtor
    public Selecoes(String nome) {
        this.nome = nome;
        this.pontos = 0;
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
        this.golsjogo1 = 0;
        this.golsjogo2 = 0;
        this.golsjogo3 = 0;
    }
    //Metodos personalizados
    public void empatar(){
        this.empates=this.getEmpates()+1;
    }
    public void ganhar(){
        this.vitorias=this.getVitorias()+1;
    }
    public void perder(){
        this.derrotas=this.getDerrotas()+1;
    }
    public void resetar(){
        this.derrotas = 0;
        this.empates = 0;
        this.pontos = 0;
        this.vitorias = 0;
    }
    
}
