/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cuatrovientos.banner;

/**
 * Writer
 * Gets the Screen and writes a word on It.
 * @author Pello Xabier
 */
public class Writer {

    private int initialX;
    private int initialY;

    /**
     * Writer
     * constructor
     * initializes positions at 0
     */
    public Writer () {
        initialX = 0;
        initialY = 0;
    }


    /**
     * Writer
     * constructor
     * initializes positions at x,y
     */
    public Writer (int x , int y) {
        if (Screen.getScreen().boundsOk(x, y)) {
            initialX = x;
            initialY = y;
        } else { // bajeril stylo
            initialX = initialY = 0;
        }
    }

    /**
     * writes the string
     * @param messageToWrite 
     */
    public void write (String messageToWrite) {
        int x = initialX;
        int y = initialY;

        if (messageDoesNotFitScreen(messageToWrite)) {
            System.out.println("Sorry. Message does not fit the screen");
            return;
        }

        // It's ok, we took each letter, we write on the screen and we move the cursor forward
        for (int i = 0; i< messageToWrite.length();i++) {
            // TODO next line: choose btw coolness and refactoring
            Screen.getScreen().fill(Letters.getLetters().get(messageToWrite.substring(i, i+1).toUpperCase()), x, y);
            x = x + Letters.getLetters().getWidth() + 1;
        }
        
        // Finally, we draw the screen
        Screen.getScreen().draw();
    }


    /**
     * messageDoesNotFitScreen
     * @param message
     * @return true if message is longer than screen width
     */
    private boolean messageDoesNotFitScreen (String message) {
        return (((message.length()+1) * Letters.getLetters().getWidth()) > 80);
    }
}
