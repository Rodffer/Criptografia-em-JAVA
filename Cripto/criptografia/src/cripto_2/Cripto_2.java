
package cripto_2;

import org.jasypt.util.text.BasicTextEncryptor;


public class Cripto_2 {
   
    public static void main(String[] args){
        
        String seuTexto = "Teste de criptografia";
            
        System.out.println("Texto sem criptografia: " + seuTexto);
        
        //instanciamos a classe BasicText Encryptor
        BasicTextEncryptor bte = new BasicTextEncryptor();
        
        //inserir uma senha qualquer
        bte.setPassword("A1B2");
        
        //criar string que recebe senha criptografada
        String seuTextoCriptografado = bte.encrypt(seuTexto);
        System.out.println("Seu texto criptografado = " + seuTextoCriptografado);
        
        //criar uma String que recebe a senha descriptografada
        String seuTextoNovamenteDescriptografado = bte.decrypt(seuTexto);
        System.out.println("Texto descriptografado = " + seuTextoNovamenteDescriptografado);
    }
 
}
