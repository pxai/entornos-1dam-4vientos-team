/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cuatrovientos.banner;

import java.util.Hashtable;

/**
 * Letters
 * singleton hashtable that holds all letters
 * @author Pello Xabier
 * note: from now on I'll not forget the private constructor, I swear ;)
 */
public class Letters extends Hashtable<String, String[][]>{

    private static Letters letters = null;
    private static final int LETTER_WIDTH = 4;
    private static final int LETTER_HEIGHT = 5;
    
    /**
     * private constructor
     */
    private Letters () {
        initialize();
    }

    /**
     * getLetters
     * @return
     */
    public static Letters getLetters () {
        if (letters == null) {
            letters = new Letters();
        }

        return letters;
    }

    /**
     * initialize
     * puts letters into the hashtable
     * Note: I'll NOT put all letters, It's too late for this,
     * and I know that this font is horrid, but gimme a break.
     */
    private void initialize () {
        this.put("A",new String[][]{{"A","A","A","A"},
                                    {"A"," "," ","A"},
                                    {"A","A","A","A"},
                                    {"A"," "," ","A"},
                                    {"A"," "," ","A"}});
        this.put("B",new String[][]{{"B","B","B","B"},
                                    {"B"," "," ","B"},
                                    {"B","B","B"," "},
                                    {"B"," "," ","B"},
                                    {"B","B","B","B"}});
        this.put("C",new String[][]{{"C","C","C","C"},
                                    {"C"," "," "," "},
                                    {"C"," "," "," "},
                                    {"C"," "," "," "},
                                    {"C","C","C","C"}});
        this.put("D",new String[][]{{"D","D","D"," "},
                                    {"D"," "," ","D"},
                                    {"D"," "," ","D"},
                                    {"D"," "," ","D"},
                                    {"D","D","D"," "}});
        this.put("E",new String[][]{{"E","E","E","E"},
                                    {"E"," "," "," "},
                                    {"E","E","E"," "},
                                    {"E"," "," "," "},
                                    {"E","E","E","E"}});
    }


    /**
     * getHeight
     * @return hegith of letters
     */
    public int getHeight () {
        return LETTER_HEIGHT;
    }

    /**
     *  getWidth
     * @return width of letters
     */
    public int getWidth () {
        return LETTER_WIDTH;
    }

}
