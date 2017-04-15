/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.io.BufferedOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Administrador
 */
public class Main {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos sd=new Metodos();
        System.out.println("Entra la palabra en binario:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try {
            String es = br.readLine();
            char []arr=sd.CodificarConJ(es);
            String df=sd.Calcular(arr);


          System.out.println("Palabra Codificada:"+df);

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }








    }

    
}
