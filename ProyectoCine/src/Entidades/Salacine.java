package Entidades;
// Generated 03/04/2018 16:15:58 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Salacine generated by hbm2java
 */
public class Salacine  implements java.io.Serializable {


     private Integer idSalaCine;
     private Cine cine;
     private int salaCantButacas;
     private int salaIdButaca;
     private Butaca butaca;
     private Set funcions = new HashSet(0);

    public Salacine() {
    }

	
    public Salacine(Cine cine, int salaCantButacas, int salaIdButaca) {
        this.cine = cine;
        this.salaCantButacas = salaCantButacas;
        this.salaIdButaca = salaIdButaca;
    }
    public Salacine(Cine cine, int salaCantButacas, int salaIdButaca, Butaca butaca, Set funcions) {
       this.cine = cine;
       this.salaCantButacas = salaCantButacas;
       this.salaIdButaca = salaIdButaca;
       this.butaca = butaca;
       this.funcions = funcions;
    }
   
    public Integer getIdSalaCine() {
        return this.idSalaCine;
    }
    
    public void setIdSalaCine(Integer idSalaCine) {
        this.idSalaCine = idSalaCine;
    }
    public Cine getCine() {
        return this.cine;
    }
    
    public void setCine(Cine cine) {
        this.cine = cine;
    }
    public int getSalaCantButacas() {
        return this.salaCantButacas;
    }
    
    public void setSalaCantButacas(int salaCantButacas) {
        this.salaCantButacas = salaCantButacas;
    }
    public int getSalaIdButaca() {
        return this.salaIdButaca;
    }
    
    public void setSalaIdButaca(int salaIdButaca) {
        this.salaIdButaca = salaIdButaca;
    }
    public Butaca getButaca() {
        return this.butaca;
    }
    
    public void setButaca(Butaca butaca) {
        this.butaca = butaca;
    }
    public Set getFuncions() {
        return this.funcions;
    }
    
    public void setFuncions(Set funcions) {
        this.funcions = funcions;
    }




}


