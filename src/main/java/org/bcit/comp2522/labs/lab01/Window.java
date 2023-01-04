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
  }

  public void mousePressed() {
    background(64);
  }

  /**
   * Interesting method draws some shapes.
   */
  public void interesting() {
    size(250, 250);
    line(50, 50, 100, 100);
    triangle(10, 10, 20, 20, 30, 10);
    rect(50, 100, 50, 75);
    circle(50, 50, 10);
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