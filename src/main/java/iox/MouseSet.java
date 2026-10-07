/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package iox;

import java.awt.event.InputEvent;
import java.util.EnumMap;

/**
 *
 * @author rash4
 */
public class MouseSet {
    private EnumMap<MouseTypeEvent, Action> actions = new EnumMap<>(MouseTypeEvent.class);
    public MouseSet(){}
    public MouseSet setAction(MouseTypeEvent eventType, Action acts){
        this.actions.put(eventType, acts);
        return this;
    }
    public Action get(MouseTypeEvent eventType){
        return this.actions.get(eventType);
    }
    public void execute(MouseTypeEvent eventType, InputEvent e){
        final var evt = this.actions.get(eventType);
        if(evt != null)evt.execute(e);
    }
}
