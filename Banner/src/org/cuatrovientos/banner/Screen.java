/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cuatrovientos.banner;

/**
 * Screen
 * The class where we paint the Letters
 * @author Pello Xabier
 * note: from now on I'll not forget the private constructor, I swear ;)
 */
public class Screen {
    private final static int WIDTH = 80;
    private final static int HEIGHT = 24;
    private final static String WHITESPACE = " ";
    private final static char NEWLINE = '\n';
    private String[][] canvas = new String[HEIGHT][WIDTH];
    private static Screen theScreen = null;

    // private constructor
    private Screen () { clear(); }

    /**
     * clears the screen
     */
    private void clear () {
        for (int h = 0;h< HEIGHT; h++) 
            for (int w=0;w<WIDTH; w++)
                canvas[h][w] = WHITESPACE;
    }

    /**
     * getScreen
     * @return the one and only screen instance
     */
    public static Screen getScreen() {
        if (theScreen == null) {
            theScreen = new Screen();
        }

        return theScreen;
    }

    /**
     * fill
     * fills  the screen with a matrix at given coords
     * @param what
     * @param x
     * @param y
     */
    public void fill (String[][] what, int x, int y) {

        if (boundsOk(x,y)) {
            int i = 0, j = 0;
            //go on and fill the canvas
            for (int h = y;h< y+what.length; h++) {
                for (int w=x;w<x+what[0].length; w++)
                    canvas[h][w] = what[i][j++];
                i++;j=0;
            }//for

        }//if
    }

    /**
     * draw
     * paints contents on console
     */
    public void draw () {
        for (int h = 0;h< HEIGHT; h++) {
            for (int w=0;w<WIDTH; w++)
                System.out.print(canvas[h][w]);
            System.out.print(NEWLINE);
        }
    }

    /**
     * boundsOk
     * tell us if given coords are inside Screen margins
     * @param x
     * @param y
     * @return true if coords are ok.
     */
    public boolean boundsOk (int x, int y) {
        return (y >= 0 && y < HEIGHT && x >= 0 && x < WIDTH);
    }
}
