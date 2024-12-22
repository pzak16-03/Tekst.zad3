import java.io.*;

public class FileCopyWithReplacement {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";
        try (
                BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String modifiedLine = line.replace(" ", "-");
                writer.write(modifiedLine);
                writer.newLine();
            }
            System.out.println("Plik został skopiowany z zamianą spacji na myślniki.");
        } catch (IOException e) {
            System.err.println("Błąd podczas operacji na plikach: " + e.getMessage());
        }
    }
}
