package com.muchosamuchos.relaciones.utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Component;
 
@Component
public class ImageUtils {
    
    public String saveImageBase64(String dir, String imageB64) {
        String[] parts = imageB64.split(","); //como java después de la coma manda la imagen en base 64
        String base64 = parts.length > 1 ? parts[1] : parts[0]; //me quedo con la parte después de la coma, de ahí el [1], de lo contrario me quedo con la primera parte [0]
        String fileName = System.currentTimeMillis() + ".png";//genera nombre de imagen con fecha actual en milisegundos
        BufferedImage image; //guardar la imagen como archivo
        byte[] imageByte = Base64.getDecoder().decode(base64);//paso la imagen a binario
        try {
            Path pathDir = Paths.get("public", "images", dir);//creo en public la carpeta images
            if (!Files.exists(pathDir)) {//sí no existe le directorio lo creo
                Files.createDirectory(pathDir);
            }//paso el arrayde bytes a un objeto de tipo imágen
            image = ImageIO.read(new ByteArrayInputStream(imageByte));//obtengo la ruta donde voy a guardar la imágen
            Path path = Paths.get("public", "images", dir, fileName);
            ImageIO.write(image, "png", path.toFile());//escribo la imágen y lo guardo en un archivo en formato png indicandole donde la guarda
            return "images" + "/" + dir + "/" + fileName; //devuelve la ruta d ela imágen y la guarda en la BD
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return "";
        }
    }
}
