
package exerciciopoo09;


public class Livro implements Publicação {
   //Atributos
   private String titulo;
   private String auto;
   private int totPaginas;
   private int pagAtual;
   private boolean aberto;
   private Pessoas leitor;
   
     //Metodos
   public void detalhes(){
       System.out.println("TITULO: "+this.getTitulo());
       System.out.println(" AUTO:"+ this.getAuto());
       System.out.println("TOTAL DE PAGINAS: " +this.getTotPaginas());
       System.out.println("PAGINA ATUAL: "+this.getPagAtual());
       System.out.println("LIVRO ABERTO OU FECHADO: "+ this.getAberto());
       System.out.println("LEITOR: "+this.getLeitor());
   }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoas getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoas leitor) {
        this.leitor = leitor;
    }

    @Override
    public void Abrir() {
       this.aberto=true;
    }

    public Livro(String titulo, int totPaginas, Pessoas leitor) {
        this.titulo = titulo;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.pagAtual=0;
        this.aberto = false;
    }

    @Override
    public void Fechar() {
       this.aberto=false;
    }

    @Override
    public void Folhear(int p) {
      this.pagAtual=p;
    }

    @Override
    public void avançarpag() {
        this.pagAtual++;
    }

    @Override
    public void voltarpag() {
       this.pagAtual--;
    }
   
   }


