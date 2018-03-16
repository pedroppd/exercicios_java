
package exercicioheranca2;


public class Aluno extends Pessoas{
    //Atributos
    private int matricula;
    private String curso;
    //Metodos
    public void pagaMensalidade(){
        System.out.println("pagando mensalidade de aluno"+this.getNome());
    }
    //Metodos especiais

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
