package challenge;

import java.util.Iterator;

public class CriptografiaCesariana implements Criptografia {
    @Override
    public String criptografar(String texto) {
        if (texto.length() == 0){
            IllegalArgumentException error = new IllegalArgumentException();
            throw error;
        }
        String cifrado = "";
        char cifra = 3;
        for (char i : texto.toCharArray()){
            if (Character.isLetter(i)){
                char j = (char) (i + cifra);
                cifrado = cifrado + (j);
            }else {
                cifrado = cifrado + i;
            }
        }
        return cifrado.toLowerCase();
    }

    @Override
    public String descriptografar(String texto) {
        if (texto.length() == 0){
            IllegalArgumentException error = new IllegalArgumentException();
            throw error;
        }
        String decifrado = "";
        char cifra = 3;
        for (char i : texto.toCharArray()){
            if (Character.isLetter(i)){
                char j = (char) (i - cifra);
                decifrado = decifrado + (j);
            }else {
                decifrado = decifrado + i;
            }
        }
        return decifrado.toLowerCase();
    }
}
