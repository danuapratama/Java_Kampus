// Fig. 11.7: LabelTest.java
// Testing LabelFrame.

import javax.swing.JFrame;

public class LabelTest {

    public static void main( String args[] ) {
        LabelFrame labelFrame = new LabelFrame(); // create LabelFrame
        labelFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        labelFrame.setSize( 100, 100 ); // set frame size
        labelFrame.setVisible( true ); // display frame
    } // end main
} // end class LabelTest

