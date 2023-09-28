package Methods;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class EscalaCinza {


    public void histogramaCinza(BufferedImage imagem) throws IOException {

        int[] histograma = new int[256];
        int largura = imagem.getWidth();
        int altura = imagem.getHeight();

        for (int linha = 0; linha < largura; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {
                int intensidade = imagem.getRGB(linha, coluna) & 0xFF;
                histograma[intensidade]++;
            }
        }

        for (int i = 0; i < 256; i++) {
            System.out.println("Intensidade " + i + ": " + histograma[i] + " de vezes");
        }
    }
}