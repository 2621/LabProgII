import java.io.*;
import java.util.Scanner;

public class Criptografia {
    public static void main(String[] args) throws IOException {
        BufferedReader buffReader = null;

        String strCurrentLine;
        String text = "";

        buffReader = new BufferedReader(new FileReader("original"));

        while ((strCurrentLine = buffReader.readLine()) != null){
            text = text.concat(" ");
            text = text.concat(strCurrentLine);
        }

        int n;
        Scanner input = new Scanner(System.in);
        System.out.println ("Insira o parâmetro para a Cifra de Cesar (insira um inteiro)");
        n = input.nextInt();

        CifraCesar cifra = new CifraCesar();
        text = cifra.codCesar(text,n);

        buffReader.close();

        //Cod de Huffman
        Huffman CodH = new Huffman();
        text = CodH.encode(text);

        //Escrever no arquivo o texto codificado
        BufferedWriter writer = new BufferedWriter(new FileWriter("codHuffman.txt"));
        writer.write(text);
        writer.close();


        //Decod Huffman + desfazer a Cifra de Cesar
        text = cifra.decodCesar(CodH.decode(text),n);

        //Escrever no arquivo o texto decodificado
        BufferedWriter buffwriter = new BufferedWriter(new FileWriter("decodHuffman.txt"));
        buffwriter.write(text);
        buffwriter.close();


    }
}
