
package net2;

import java.io.*;
import java.net.*;


public class Net2 {

    
    public static void main(String[] args) {
        
        try {
         URL song = new URL("file:/C:/Documents%20and%20Settings/ahmed%20samir/Desktop/Amr.Diab.Ahla.W.Ahla.2016.ArabSeed.CoM/02%20-%20Waadtak.mp3");
         // domain+ port+ somekind of service with one paticaler file
         // ftp is akind of servicse
         // http is kind
         
//         URLConnection con = song.openConnection();
//          OutputStream out = con.getOutputStream();
        java.util.Date date = new java.util.Date();
        System.out.println(date);
         
         File in = new File ("D:/JAVA/jenkov.com/index.html");
         System.out.println(in.toURI());
         
         
         
         
         
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
      
    }
    
}
