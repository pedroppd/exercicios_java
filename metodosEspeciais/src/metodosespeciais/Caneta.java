
package metodosespeciais;


public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;

    
    /*public Caneta(String m, float p, boolean t){  //metodo construtor
        this.modelo=m;
        this.ponta=p;
        this.tampada=t;
        
    }*/
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String m){
        this.modelo= m;
    }
    public float getPonta(){
        return ponta;
    }
    public void setPonta(float p){
        this.ponta=p;
    }
    public boolean getTampada(){
        return tampada;
    }
    public void setTampada(boolean t){
        this.tampada =t;
    }
    public void  status(){
        System.out.println("modelo:" + this.getModelo());
        System.out.println("ponta:" + this.getPonta());
        System.out.println("Tampada"+ this.getTampada());
    }
   
    
  
    
}
