/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gui;

import javax.swing.JTextArea;

/**
 *
 * @author Joey
 */

public class DisplayText {
    
    JTextArea textArea;
    
    public DisplayText(JTextArea textArea) {
        this.textArea = textArea;
    }
    
    public DisplayText(String name, String content) {
        
    }
    
    public String selectText() {
        return textArea.getSelectedText();
    }
    
    public void insertText(String text, int position) {
        textArea.insert(text, position);
    }
}
