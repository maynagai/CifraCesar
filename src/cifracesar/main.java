
package cifracesar;

/**
 *
 * @author cc47579086875
 */
public class main {
    public static void main(String[] args) {
        
        String palavra = "mayla"; 
        int metade = palavra.length() / 2; 
        String metade1 = palavra.substring(0, metade);
        String metade2 = palavra.substring(metade);
       
        CifraCesar c1 = new CifraCesar(metade1);
        c1.fork();
        CifraCesar c2 = new CifraCesar(metade2);
        c2.fork();
        palavra =c1.join() + c2.join();
        
        
        System.out.println(palavra);
    }
}
