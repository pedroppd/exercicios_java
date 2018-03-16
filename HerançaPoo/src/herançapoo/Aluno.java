
package herançapoo;


public class Aluno extends Pessoas {
    //Atributos
    private int matr;
    private String curso;
    //Metodos
   
    public void cancelarMatr(){
        System.out.println("Matricula será cancelada.");
    }
   //Metodos especiais

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNome(String joao) {
     }
    
}
