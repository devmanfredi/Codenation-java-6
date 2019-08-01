package challenge;

import java.util.Iterator;

public class CriptografiaCesariana implements Criptografia {
    String normalString = new String("a ligeira raposa marrom saltou sobre o cachorro cansado");

    String cifrado = criptografar(normalString);
    String decifrado = descriptografar(cifrado);

    @Override
    public String criptografar(String texto) {
        int i, n = texto.length();
        int chave = 3;
        String saux = "";

        for (i = 0; i < n; i++) {
            saux = saux + (char) (texto.charAt(i) + chave);
        }
        return saux.toLowerCase();
        //throw new UnsupportedOperationException("esse method nao esta implementado aainda");
    }

    @Override
    public String descriptografar(String texto) {
        char[] cifradoT = texto.toCharArray();
        String decifrado = null;
        int count = 3;

        for (int i = 0; i < cifradoT.length; i++) {
            Character character = cifradoT[i];
            if (character != ' ' && character != ',' && character != '.') {
                cifradoT[i] = (char) ((cifradoT[i] - 'a' + 26 - count) % 26 + 'a');
                decifrado = new String(cifradoT);
            }
        }
        return decifrado.toLowerCase();
        //throw new UnsupportedOperationException("esse method nao esta implementado aainda");
    }
}
