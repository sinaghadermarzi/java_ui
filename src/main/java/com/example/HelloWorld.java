package com.example;

import java.awt.*;

public class HelloWorld {
    public static void main(String[] args) {
        Frame frame = new Frame("Hello AWT");
        Button button = new Button("Click Me");
        
        // Use setPreferredSize instead of setSize
        button.setPreferredSize(new Dimension(100, 75));
        
        // Use FlowLayout (respects preferred sizes)
        frame.setLayout(new FlowLayout());
        
        frame.add(button);
        
        // pack() auto-sizes frame to fit components perfectly
        frame.pack();
        
        frame.setVisible(true);
    }
}