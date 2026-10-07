/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package iox;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author rash4
 */
public class Keyz implements KeyListener{
    private KeySet typed, pressed, released;
    public Keyz(){
        this.typed    = new KeySet();
        this.pressed  = new KeySet();
        this.released = new KeySet();
    }
    @Override public void keyTyped(KeyEvent e) {
        this.typed.execute(e);
    }
    @Override public void keyPressed(KeyEvent e) {
        this.pressed.execute(e);
    }
    @Override public void keyReleased(KeyEvent e) {
        this.released.execute(e);
    }
    public KeySet getKeyTyped(){return this.typed;}
    public KeySet getKeyPressed(){return this.pressed;}
    public KeySet getKeyReleased(){return this.released;}
}
