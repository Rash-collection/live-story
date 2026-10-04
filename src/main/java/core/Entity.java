/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package core;

import java.io.Serializable;
import java.util.UUID;
import java.time.Instant;

/**
 *
 * @author rash4
 */
public class Entity implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private final UUID GID = UUID.randomUUID();
    private final Instant SINCE = Instant.now();
    private final Names NAMES;
    
    public Entity(String name){
        this.NAMES = new Names(name);
    }
    
    public final UUID getGID(){return this.GID;}
    public final Names getNames(){return this.NAMES;}
    public final Instant getSince(){return this.SINCE;}
    
    @Override public String toString(){
        return this.getGID().toString() + "\n -- " 
                + this.SINCE.toString() + "\n"
                + this.NAMES.toString(" > ") + "\n";
    }
}
