package Main;

import Methods.EscalaCinza;
import Methods.EscalaColorida;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public Main() throws IOException {
    }

    public static void main(String[] args) throws IOException {

        BufferedImage bandas = ImageIO.read(
                new File("C:\\Users\\Administrator\\IdeaProjects\\PDIHistograma\\src\\Imagens\\grey_scale.jpg")
        );
        EscalaCinza escalaCinza = new EscalaCinza();
        escalaCinza.histogramaCinza(bandas);

        BufferedImage bandas2 = ImageIO.read(
                new File("C:\\Users\\Administrator\\IdeaProjects\\PDIHistograma\\src\\Imagens\\sombrinhas.jpg")
        );

        EscalaColorida escalaColorida = new EscalaColorida();
        escalaColorida.histogramaColorido(bandas2);
    }
}
