/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Joey
 */


public class BasicFile {
    
    public BasicFile() {
        
        final JFileChooser fc = new JFileChooser();
        int returnValue = fc.showOpenDialog(null);
        
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            String name = file.getName();
            String path = file.getAbsolutePath();
            
            try {
                FileReader fr = new FileReader(path);
                BufferedReader br = new BufferedReader(fr);
                new ReadFile(name, br).setVisible(true);
                br.close();
            } catch(IOException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
}
