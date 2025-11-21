 import java.io.BufferedWriter;
 import java.io.FileWriter;
 import java.io.IOException;
 import java.util.Scanner;


 public class FileWritingExercise {
     public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);


         // Solicita o nome do arquivo
         System.out.print("Digite o nome do arquivo (com extensão .txt): ");
         String fileName = scanner.nextLine();


     // implemente o codigo aqui
    try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            
            String line = "";
            while(!"sair".equals(line)) {
                line = scanner.nextLine();
                if("sair".equals(line)) {
                    break;
                    
                } else {
                    writer.write(line);
                    writer.newLine();
                }
                
            }
            writer.close();
            System.out.println("O arquivo foi criado e seu conteúdo foi salvo com sucesso");
        } catch (IOException e) {
            e.printStackTrace();
        }

         scanner.close();
     }
 }
