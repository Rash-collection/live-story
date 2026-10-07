/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package iox;

import java.awt.event.KeyEvent;
import java.util.HashMap;

/**
 *
 * @author rash4
 */
public class KeySet {
    private HashMap<Integer, Action> keys;
    public KeySet(){}
    public boolean bind(int keyCode, Action action){
        if(action == null || this.keys.containsKey(keyCode))return false;
        this.keys.putIfAbsent(keyCode, action);
        return true;
    }
    public Action unbind(int keyCode){
        return this.keys.remove(keyCode);
    }
    public Action replace(int keyCode, Action neoAction){
        if(neoAction == null) return null;
        final var old = this.unbind(keyCode);
        // redundancy for future functionality hahaha @@!
        if(old != null && this.bind(keyCode, neoAction));
        return old;
    }
    public Action get(int keyCode){
        return this.keys.get(keyCode);
    }
}
