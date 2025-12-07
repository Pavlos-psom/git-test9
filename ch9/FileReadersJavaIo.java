package gr.aueb.cf.cf9.ch9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReadersJavaIo {
    public static void main(String[] args) {
        File file = new File("C:/Users/psomp/IdeaProjects/CodingFactory9/src/gr/aueb/cf/cf9/file.txt");
        try {
            bufferedReader(file);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Κάποιο λάθος συνέβη");
        }
    }

    public static void bufferedReader(File file) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))) {
            String line;
            while ((line=br.readLine())!=null) {
                System.out.println(line);
            }
        }catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void fileReader(String file) throws IOException  {
        try(FileReader fr = new FileReader(file, StandardCharsets.UTF_8)){
            int BytesRead=0;

            while ((BytesRead= fr.read())!=-1) {
                System.out.print((char) BytesRead);
            }

        }catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
