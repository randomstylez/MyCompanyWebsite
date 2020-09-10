/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author Joey
 */

public class MyGraphics extends JFrame {
    
    public MyGraphics() {
        super("Smile white board");
        setSize(300, 300);
        setVisible(true);
    }
    
    /**
     *
     * @param graphics
     */
    
    @Override
    public void paint(Graphics graphics) {
        
        super.paint(graphics); 
        int xPnts[] = {42, 52, 72, 52, 60, 40, 15, 28, 9, 32, 42}; 
        int yPnts[] = {38, 62, 68, 80, 105, 85, 102, 75, 58, 60, 38}; 
        graphics.drawPolygon(xPnts, yPnts, xPnts.length);
        
        graphics.setColor(Color.magenta);
        graphics.fillRect(230, 80, 150, 100);
    }
}
