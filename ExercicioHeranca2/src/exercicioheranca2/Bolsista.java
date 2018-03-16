
package exercicioheranca2;


public class Bolsista extends Aluno {
    //Atributos
    private float bolsa;
    //Metodos
    public void renovarBolsa(){
        System.out.println("renovando bolsa " +this.getNome());
    }
    public void pagarMensalidade(){
        System.out.println(this.getNome()+ " é um bolsista, pagamento facilitado");
        
    }
    //Metodos especiais

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
