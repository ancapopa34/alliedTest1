import java.io.*;

public class Files {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("C:\\test\\a.txt");
        BufferedReader fileInput = new BufferedReader(file);
        for (int counter = 0; counter < 30; counter++) {
            System.out.println(fileInput.readLine());
        }
        fileInput.close();
    }
}
