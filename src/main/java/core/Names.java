/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package core;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author rash4
 */
public class Names implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private int mark = -1;
    private final ArrayList<String> NAMES = new ArrayList<>();
    
    public Names(String name){
        if(this.NAMES.add(name))this.mark = 0; // for fun
    }
    
    public boolean setCurrent(int i){
        if(i >= 0 && i < this.NAMES.size()){
            this.mark = i;
            return true;
        }else return false;
    }
    public int addName(String alias){
        final int s = this.NAMES.size();
        if(alias == null && alias.isBlank()) return s;
        if(this.NAMES.add(alias))this.mark = s;
        return s;
    }
    
    public int getCurrent(){return this.mark;}
    public String getCurrentName(){return this.NAMES.get(this.mark);}
    public String getName(int index){return this.NAMES.get(index);}
    public String[] getNames(){return this.NAMES.toArray(String[]::new);}
    
    @Override public String toString(){
        final var bul = new StringBuilder();
        for(String al: this.NAMES)
            bul.append("> ").append(al).append("\n");
        return bul.toString();
    }
    public String toString(String priefLevel){
        final var bul = new StringBuilder();
        for(String al: this.NAMES)
            bul.append(priefLevel).append(al).append("\n");
        return bul.toString();
    }
}
