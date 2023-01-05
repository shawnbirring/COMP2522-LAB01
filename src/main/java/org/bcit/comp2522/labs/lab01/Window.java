package org.bcit.comp2522.labs.lab01;

import processing.core.PApplet;

/**
 * Window class contains entry point for program.
 *
 * @author Shawn Birring
 * @version 1.0
 */
public class Window extends PApplet {

  public void settings() {
    size(500, 500);
  }

  public void draw() {
    ellipse(mouseX, mouseY, 50, 50);
    rect(125, 250, 250, 300);
    triangle(125, 250, 375, 250, 250, 100);
    rect(150, 300, 100, 150);
    rect(300,400,50,100);
    circle(325, 300, 45);
  }

  public void mousePressed() {
    background(64);
  }


  /**
   * Main method runs the program.
   * Lets users draw something out.
   *
   * @param args unused.
   */
  public static void main(String[] args) {
    String[] processingArgs = {"window"};
    Window window = new Window();
    PApplet.runSketch(processingArgs, window);
  }
}