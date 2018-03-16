
package pagamentobanco;


public class ContaBanco {
   //Atributos
    private String dono;
    protected String tipo;
    private double saldo;
    public  int numConta;
    private boolean status;
    //metodos
    public void abrirConta(String t){
        this.status = true;
        this.setTipo(t);
        if (t=="cc") {
          this.setSaldo(50);
        }else if (t=="cp") {
          this.setSaldo(150);
        }
    }
    
    public void fecharConta(double saldo){
        this.status = false;
        if(this.saldo>0){
            System.out.println("nao tem como fechar a conta existe saldo nela");
        }else if(saldo<0){
            System.out.println("nao tem como fechar conta o saldo esta negativo");
        }else{
            System.out.println("Conta fechada com sucesso");
        }
    }
    public void  depositar(double saldo){
        if(this.status==true){
            int v = 0;
             saldo = saldo+v;
        }else if(this.status==false){
            System.out.println("vc nao pode depositar!!");
        }
        
    }
    public void sacar(double saldo){
        int v = 0;
        if(this.getSaldo()<=v){
           saldo=saldo-v; 
        }else{
            System.out.println("vc nao pode sacar");
        }
    }
    public void pagarMensal(){
        
}
//metodos especiais 
    public String getTipo() {
       
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

   
    

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    
    
    
}
