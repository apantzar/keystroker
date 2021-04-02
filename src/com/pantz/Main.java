package com.pantz;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;public class Main {

    public static void main(String[] args) throws IOException, AWTException {

        onPaste();
    }


    /**
     * To copy and paste commands
     * into Run's textBox
     *
     */

    private static void onPaste(){
        try
        {



            Robot r = new Robot();
            r.delay(100);
            r.keyPress(KeyEvent.VK_WINDOWS);
            r.keyPress(KeyEvent.VK_R);
            r.keyRelease(KeyEvent.VK_R);
            r.keyRelease(KeyEvent.VK_WINDOWS);
            r.keyRelease(KeyEvent.VK_DELETE);
            r.keyPress(KeyEvent.VK_DELETE);
            r.delay(50);
            r.keyPress(KeyEvent.VK_N );
            r.keyPress(KeyEvent.VK_O );
            r.keyPress(KeyEvent.VK_T );
            r.keyPress(KeyEvent.VK_E );
            r.keyPress(KeyEvent.VK_P );
            r.keyPress(KeyEvent.VK_A );
            r.keyPress(KeyEvent.VK_D );
            r.keyPress(KeyEvent.VK_PERIOD);
            r.keyPress(KeyEvent.VK_E );
            r.keyPress(KeyEvent.VK_X );
            r.keyPress(KeyEvent.VK_E );
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);
            r.delay(1000);
            r.keyPress(KeyEvent.VK_H);
            r.keyPress(KeyEvent.VK_E);
            r.keyPress(KeyEvent.VK_L);
            r.keyPress(KeyEvent.VK_L);
            r.keyPress(KeyEvent.VK_O);
            r.keyPress(KeyEvent.VK_SPACE);
            r.keyPress(KeyEvent.VK_W);
            r.keyPress(KeyEvent.VK_O);
            r.keyPress(KeyEvent.VK_R);
            r.keyPress(KeyEvent.VK_L);
            r.keyPress(KeyEvent.VK_D);
            r.keyRelease(KeyEvent.VK_SPACE);

        }
        catch(Exception e)
        {
            e.printStackTrace();

        }
    }
}
