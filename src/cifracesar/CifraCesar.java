/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifracesar;

import java.util.concurrent.RecursiveTask;



public class CifraCesar extends RecursiveTask<String>{
    public String retorno="";
    String metade;
    
  
    
    public CifraCesar(String metade){
        this.metade= metade;
    }


    @Override
    protected String compute() {
        
            retorno = criptografia(metade, 3);
 
        return retorno;
    }

    private String criptografia(String texto, int chave) {
        int i, n = texto.length();
          String aux = "";
 
          for (i=0; i<n; i++) {
            aux = aux + (char)(texto.charAt(i) + chave);
          }
    
          return(aux);
    }
    


    
}
