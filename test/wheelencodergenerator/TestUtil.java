/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package wheelencodergenerator;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;

/**
 *
 * @author Michael Shimniok
 */
public class TestUtil {

    public static void delay() {
        delay(5000);
    }
    
    public static void delay(int d) {
        try {
            Thread.sleep(d);
        } catch (InterruptedException ex) {
            Logger.getLogger(ImageExportChooserTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void createFile(File f) {
        if (f != null && !f.exists()) {
            System.out.println("createFile() creating "+f.getName());
            try {
                Assert.assertTrue(f.createNewFile());
            } catch (IOException ex) {
                Assert.fail();
            }
        }
    }

    public static void deleteFile(File f) {
        if (f != null && f.exists()) {
            System.out.print("deleteFile() Deleting "+f.getName());
            System.out.println(" "+Boolean.toString(f.delete()));
        }
    }

}
