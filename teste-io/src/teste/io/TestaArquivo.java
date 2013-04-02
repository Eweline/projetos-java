
package teste.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestaArquivo {
    
     public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("texto.txt");
        InputStreamReader isr = new InputStreamReader(is);
        try (BufferedReader br = new BufferedReader(isr)) {
            String linha = br.readLine(); // primeira linha

            while (linha != null) {
            System.out.println(linha);
           linha = br.readLine();

           }
        }
    }
    
}
