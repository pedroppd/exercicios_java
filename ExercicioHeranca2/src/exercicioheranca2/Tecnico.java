
package exercicioheranca2;


public class Tecnico extends Aluno {
    //Atributos
    private String registro;
    //metodos
    public void praticar(){
        System.out.println("Praticando ");
    }
    //Metodos especiais

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
    
    
}
