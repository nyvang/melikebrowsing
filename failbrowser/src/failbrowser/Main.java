/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package failbrowser;

import javax.swing.JFrame;

/**
 *
 * @author Nyvang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Browser app = new Browser();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }

}
