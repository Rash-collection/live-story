/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package iox;

import java.awt.event.InputEvent;

/**
 *
 * @author rash4
 */
@FunctionalInterface public interface Action {
    void execute(InputEvent ie);
}
