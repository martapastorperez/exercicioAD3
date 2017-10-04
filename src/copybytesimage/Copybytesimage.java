
package copybytesimage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Copybytesimage {

  
    public static void main(String[] args) throws IOException {
         try(FileInputStream fis=new FileInputStream("/home/local/DANIELCASTELAO/mpastorperez/Escritorio/AD/foto1.jpg")){
             BufferedInputStream bis=new BufferedInputStream(fis);
            FileOutputStream fos = new FileOutputStream("/home/local/DANIELCASTELAO/mpastorperez/Escritorio/AD/foto2.jpg",true);
            BufferedOutputStream bos=new BufferedOutputStream(fos);
            int valor=0;
            while((valor=bis.read())!=-1){
                 bos.write(valor);
            }
            bis.close();
            bos.close();
         } catch (FileNotFoundException ex) {
            Logger.getLogger(Copybytesimage.class.getName()).log(Level.SEVERE, null, ex);
        

            
                }
         
         }
  
    
    
}
