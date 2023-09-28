package Methods;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class EscalaColorida {

    public void histogramaColorido(BufferedImage imagem) throws IOException {

        int[] histogramaVm = new int[256];
        int[] histogramaVd = new int[256];
        int[] histogramaAz = new int[256];

        int largura = imagem.getWidth();
        int altura = imagem.getHeight();

        for (int linha = 0; linha < altura; linha++) {
            for (int coluna = 0; coluna < largura; coluna++) {
                int pixel = imagem.getRGB(coluna, linha);

                int vermelho = (pixel >> 16) & 0xFF;
                int verde = (pixel >> 8) & 0xFF;
                int azul = pixel & 0xFF;

                histogramaVm[vermelho]++;
                histogramaVd[verde]++;
                histogramaAz[azul]++;
            }
        }

        for (int i = 0; i < 256; i++) {
            System.out.println("Intensidade Vermelha: " + i + ": " + histogramaVm[i] + " de vezes");
            System.out.println("Intensidade Verde: " + i + ": " + histogramaVd[i] + " de vezes");
            System.out.println("Intensidade Azul: " + i + ": " + histogramaAz[i] + " de vezes");
        }
    }

}
