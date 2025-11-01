package com.example;

import java.awt.*;

public class HelloWorld {
    public static void main(String[] args) {
        Frame frame = new Frame("Hello AWT");
        Button button = new Button("Click Me");
        frame.add(button);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}