 import java.io.BufferedWriter;
 import java.io.FileWriter;
 import java.io.IOException;
 import java.util.Scanner;


 public class FileWritingExercise {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);


         // Solicita o nome do arquivo
         System.out.print("Digite o nome do arquivo (com extensão .txt): ");
         try {
            String fileName = scanner.nextLine();
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            String line = "";
            while(true) {
                line = scanner.nextLine();
                if("sair".equals(line)) {
                    writer.close();
		    break;
                } else {
                    writer.write(line);
                    writer.newLine();
                }
                
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }        
     }
 }
