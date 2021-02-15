package com.pantz;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, AWTException {
	// write your code here

       // File file = new File ("C:\\Users\\anast\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\System Tools\\Run.lnk");
      //  Desktop desktop = Desktop.getDesktop();
       //discord
        // desktop.open(file);
        Robot r = new Robot();
        r.keyRelease(KeyEvent.VK_DELETE);
        r.keyRelease(KeyEvent.VK_DELETE);

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
            r.keyRelease(KeyEvent.VK_DELETE);
            r.keyPress(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_V);
            r.keyRelease(KeyEvent.VK_CONTROL);
            r.keyRelease(KeyEvent.VK_V);
            r.keyRelease(KeyEvent.VK_ENTER);
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyPress(KeyEvent.VK_INSERT);


        }
        catch(Exception e)
        {
            e.printStackTrace();

        }
    }
}
