import javax.swing.*;
import java.io.File;

import static java.lang.System.lineSeparator;

public class ej2 {
    public static void main(String[] args) {
        JFileChooser jf = new JFileChooser("l:\\");
        jf.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        jf.showOpenDialog(null);
        File directorio = jf.getSelectedFile();
        File[] archivos = directorio.listFiles();
        long total = 0;
        StringBuilder sb = new StringBuilder();
        for (File archivo : archivos){
            sb.append("Nome: ").append(archivo.getName()).append(lineSeparator());
            sb.append("Tamaño: ").append(tamaño(archivo)).append(lineSeparator());
            sb.append(archivo.isDirectory()? "Directorio" : "Archivo").append(lineSeparator()).append(lineSeparator());

            total += archivo.length();

        }
        sb.append("Tamaño total: ").append(total).append(" bytes");

        JOptionPane.showMessageDialog(null, sb);
    }

    public static long tamaño(File directorio){
       long tDirectorio = 0;

       File[] lista = directorio.listFiles();
       for (File sl : lista){
           if(sl.isFile()) tDirectorio += sl.length();

           else tamaño(sl);
       }

       return tDirectorio;
    }
}
