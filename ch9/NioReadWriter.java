package gr.aueb.cf.cf9.ch9;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NioReadWriter
{
    public static void main(String[] args) {
        Path source = Path.of("C:/Users/psomp/OneDrive/Desktop/CODING FACTORY/ArtDB.drawio.png");
        Path target= Path.of("C:/Users/psomp/OneDrive/Desktop/CODING FACTORY/new_ArtDB.drawio.png");
        Path textTarger = Path.of("C:/Users/psomp/OneDrive/Desktop/CODING FACTORY/newText.txt");


        try {
            binaryReadWrite(source, target);
            textWriter(textTarger);
        } catch (IOException e) {
            System.out.println("There is sth wrong");
        }
    }

    public static  void binaryReadWrite(Path source, Path target) throws IOException{
      try{  var sourceStream = Files.newInputStream(source);
        var targetStream = Files.newOutputStream(target);
        sourceStream.transferTo(targetStream);
      }catch (IOException e) {
          e.printStackTrace();
          throw e;
      }
    }

    public static void textWriter(Path path) throws IOException {
        Files.createDirectories(path.getParent());
        Files.writeString(
                path,
                "Hello Coding",
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        );
    }
}
