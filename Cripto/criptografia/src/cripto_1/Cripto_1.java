
package cripto_1;


import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class Cripto_1 {
    
    private static String chaveSimetrica;
    private static String mensagem;
    private static SecretKey key;
    private static byte[] mensagemEncriptada;
    private static byte[] mensagemDescriptada;
    private static final Scanner sc = new Scanner(System.in);
 
    
    
public static void main(String[] args){
    System.out.println("16 caracteres = chave com 128 bits\nInforme uma chave: ");
    chaveSimetrica = sc.nextLine();
    //key = new SecretKeySpec(chaveSimetrica.getBytes(), "AES");
    key = new SecretKeySpec(chaveSimetrica.getBytes(), "Blowfish");

try{
    //Cipher cipher = Cipher.getInstance("AES");
    Cipher cipher = Cipher.getInstance("Blowfish");    
    cipher.init(Cipher.ENCRYPT_MODE, key);
    //solicita ao usuario a mensagem que deve ser criptografada
    System.out.println("Informe sua mensagem a ser encriptada: ");
    mensagem = sc.nextLine();
    //encripta mensagem
    mensagemEncriptada = cipher.doFinal(mensagem.getBytes());
    //exibe mensagem encriptada
    System.out.println(("Mensagem Encriptada: " + new String(mensagemEncriptada)));
    // informa ao objeto a ação de desencripar
    cipher.init(Cipher.DECRYPT_MODE, key);
    //Recebe mensagem encriptada e descripta
    mensagemDescriptada = cipher.doFinal(mensagemEncriptada);
    
    // converte para a base 64 e armazena a mensagem em uma ...
    
    String mensagemOriginal = new String(mensagemDescriptada);
   
    //exibe mensagem Descriptada
    System.out.println("Mensagem Descriptada: " + mensagemOriginal);
    
    } catch(Exception e){
        e.printStackTrace();
    }
       
}
}


