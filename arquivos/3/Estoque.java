import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Estoque {
    private String fileName;
    int index = 0;

    public Estoque(String fileName) {
        this.fileName = fileName;
        List<Produto> lista = readFile();
        int temp = 0;
        for(Produto produto: lista) {
            if(temp < produto.getId()) {
                temp = produto.getId();
            }
        }
        this.index = temp + 1;
    }

    public void adicionarProduto(String nome,int quantidade, double preco) {
        Produto produto = new Produto(this.index, nome, quantidade, preco);
        breakLine();
        addLine(produto.toCsv());
        this.index++;
    }

    public void excluirProduto(int idExcluir) {
        List<Produto> lista = readFile();
        int position = -1;
        for(int i = 0; i < lista.size(); i++) {
            Produto produto = lista.get(i);
            if(produto.getId() == idExcluir) {
                position = i;
                break;
            }
        }
        if(position >= 0) {
            lista.remove(position);
            addAllLines(lista);
        }
    }

    public void exibirEstoque() {
        List<Produto> lista = readFile();
        for(Produto produto: lista) {
            System.out.println(produto.toString());
        }
    }

    public void atualizarQuantidade(int idAtualizar, int novaQuantidade) {
        List<Produto> lista = readFile();
        for(Produto produto: lista) {
            if(produto.getId() == idAtualizar) {
                produto.setQuantidade(novaQuantidade);
            }
        }
        addAllLines(lista);
    }

    private void addAllLines(List<Produto> lista) {
        cleanFile();
        for(int i = 0; i < lista.size(); i++) {
            Produto produto = lista.get(i);
            addLine(produto.toCsv());
            if(i < (lista.size() - 1)) {
                breakLine();
            }
        }
    }

    private List<Produto> readFile() {
        List<Produto> lista = new ArrayList<>();
         try {
            BufferedReader reader = new BufferedReader(new FileReader(this.fileName));
            String line;
 	    while ((line = reader.readLine()) != null) {
                String[] array = line.split(",");
                if(array.length == 4) {
                    int codProduto = Integer.parseInt(array[0]);
                    String nomeProduto = array[1];
                    int quantidade = Integer.parseInt(array[2]);
                    double preco = Double.parseDouble(array[3]);
                    Produto produto = new Produto(codProduto, nomeProduto, quantidade, preco);
                    lista.add(produto);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }

    private void addLine(String line) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(this.fileName, true));
            writer.write(line);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void breakLine() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(this.fileName, true));
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void cleanFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(this.fileName));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
