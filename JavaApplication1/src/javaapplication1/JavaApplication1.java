/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;


/**
 *
 * @author Kris
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
  Timer timer;
    
    public static void main(String[] args) {
        // TODO code application logic here
        //
        //constructor to display the frame
        //
        NewJFrame frame = new NewJFrame();
        frame.setVisible(true);
        frame.setLocation(200,200);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
               
        // code for custom exit stuff
        WindowListener exitListener = new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showOptionDialog(null, "Are You Sure to Close Application?", "Exit Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (confirm == 0) {
                   System.exit(0);
                }
            }
        };
        frame.addWindowListener(exitListener);  
        
    }
}
