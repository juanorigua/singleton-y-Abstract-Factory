/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.personajes;

import logica.armaduras.Armadura;
import logica.armas.Arma;

public class Personaje {
    protected String tipo;
    protected String img;
    private Arma arma;
    private Armadura armadura;
    
    public void setTipo(){
        
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setImgDir(){
        
    }
    
    public String getImgDir(){
        return this.img;
    }
    
    public void setArma(Arma a){
        this.arma = a;
    }
    
    public String getArma(){
        return this.arma.getArma();
    }
    
    public void setArmadura(Armadura ar){
        this.armadura = ar;
    }
    
    public String getArmadura(){
        return this.armadura.getArmadura();
    }
    
    public Personaje(){
        this.arma = new Arma();
        this.armadura = new Armadura();
    }
}

