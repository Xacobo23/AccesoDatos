import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import static java.lang.System.lineSeparator;
import static java.lang.System.out;

public class Ej1 {
    public static void main(String[] args) {

        JFileChooser fc = new JFileChooser("l:\\");
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int botonPulsado = fc.showOpenDialog(null);
        if (botonPulsado == JFileChooser.APPROVE_OPTION){
            File arquivo = fc.getSelectedFile();
            StringBuilder sb = new StringBuilder();
            sb.append("Ruta absoluta: ")
                .append(arquivo.getAbsolutePath()).append(lineSeparator());
            sb.append("Ruta absoluta: ")
                .append(arquivo.getAbsolutePath()).append(lineSeparator());
            sb.append("Nome arquivo: ")
                .append(arquivo.getName()).append(lineSeparator());
            sb.append("Tamaño: ")
                .append(arquivo.length())
                .append(" bytes").append(lineSeparator());
            sb.append("Data modificación: ")
                .append(new Date(arquivo.lastModified())).append(lineSeparator());
            sb.append(arquivo.isFile() ? "Es un archivo" : "Es un directorio").append(lineSeparator());

            JOptionPane.showMessageDialog(null, sb);
        }

//        File arquivo = new File("prueba.txt");
//        if(arquivo.exists()){
//            out.println("Existe");
//            out.println("Ruta absoluta: "+arquivo.getAbsolutePath());
//            out.println("Nome arquivo: "+arquivo.getName());
//            out.print("Tamaño: "+arquivo.length() + " bytes");
//            out.println("Data modificación: "+ new Date(arquivo.lastModified()));
//            out.println(arquivo.isFile() ? "Es un archivo" : "Es un directorio");
//
//        }
//        else{
//            out.println("No existe");
//            try {
//                if (arquivo.createNewFile())
//                    out.println("archivo creado");
//                else
//                    out.println("Error al crear el archivo");
//
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
        //out.println(arquivo.exists()? "Existe" : "Non existe");
    }
}