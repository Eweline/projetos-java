
package teste.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

 public class TestaEntrada {

    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine(); // primeira linha

        while (linha != null) {
        System.out.println(linha);
       linha = br.readLine();

       }
    }
}
