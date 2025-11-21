import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvFileReader {
    public static void main(String[] args) {
        String fileName = "funcionarios.csv";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] array = line.split(",");
                System.out.println("Funcionário: " + array[0]);
                System.out.println("Idade: " + array[1]);
                System.out.println("Departamento: " + array[2]);
                System.out.println("Salarial: " + array[3]);
                System.out.println("------------------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Leitura do arquivo concluída.");
    }
}
