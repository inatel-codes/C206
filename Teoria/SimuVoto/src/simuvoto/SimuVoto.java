package simuvoto;

import java.util.Scanner;
import br.inatel.simuvoto.excepctions.VotoException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import javax.swing.JOptionPane;

public class SimuVoto {

    public static void main(String[] args) {
        int CPF;
        int voto;
        boolean sair = false;
        int op;
        Scanner teclado = new Scanner(System.in);

        List<String> paulinho1 = new ArrayList<>();
        List<String> rogerao1 = new ArrayList<>();
        List<String> darthVerde1 = new ArrayList<>();
        
        List<String> paulinho2 = new ArrayList<>();
        List<String> rogerao2 = new ArrayList<>();
        List<String> darthVerde2 = new ArrayList<>();

        do {
            try {
                System.out.println("Entre com seu CPF: ");
                CPF = teclado.nextInt();
                System.out.println("Entre com o número do seu candidato: ");
                voto = teclado.nextInt();

                if (voto == 77) {
                    paulinho1.add(String.valueOf(CPF));
                } else if (voto == 51) {
                    rogerao1.add(String.valueOf(CPF));
                } else if (voto == 43) {
                    darthVerde1.add(String.valueOf(CPF));
                } else {
                    throw new VotoException();
                }

            } catch (NumberFormatException e1) {
                System.out.println("O CPF não pode conter letras!");
            } catch (InputMismatchException e2) {
                System.out.println("O CPF não pode conter letras!");
            } catch (VotoException e3) {
                System.out.println("Voto inválido! ");
            } finally {
                System.out.println("Deseja continuar votando? Entre com 1 para sim e 0 para não");
                op = teclado.nextInt();
                if (op == 0) {
                    sair = true;
                }
            }

        } while (sair == false);

        try {
            OutputStream os1 = new FileOutputStream("PaulinhoAnao.txt");
            OutputStreamWriter osw1 = new OutputStreamWriter(os1);
            BufferedWriter bw1 = new BufferedWriter(osw1);
            for (String string : paulinho1) {
                bw1.write(string);
                bw1.newLine();
            }
            bw1.close();

            OutputStream os2 = new FileOutputStream("Rogerao.txt");
            OutputStreamWriter osw2 = new OutputStreamWriter(os2);
            BufferedWriter bw2 = new BufferedWriter(osw2);
            for (String string : rogerao1) {
                bw2.write(string);
                bw2.newLine();
            }
            bw2.close();

            OutputStream os3 = new FileOutputStream("DarthVerde.txt");
            OutputStreamWriter osw3 = new OutputStreamWriter(os3);
            BufferedWriter bw3 = new BufferedWriter(osw3);
            for (String string : darthVerde1) {
                bw3.write(string);
                bw3.newLine();
            }
            bw3.close();
        } catch (FileNotFoundException erro) {
            System.out.println("Erro encontrado!");
        } catch (IOException erro) {
            System.out.println("Erro encontrado!");
        }

        try {
            InputStream is1 = new FileInputStream("PaulinhoAnao.txt");
            InputStreamReader isr1 = new InputStreamReader(is1);
            BufferedReader br1 = new BufferedReader(isr1);
            String linha1 = br1.readLine();
            while (linha1 != null) {
                paulinho2.add(linha1);
                linha1 = br1.readLine();
            }

            InputStream is2 = new FileInputStream("Rogerao.txt");
            InputStreamReader isr2 = new InputStreamReader(is2);
            BufferedReader br2 = new BufferedReader(isr2);
            String linha2 = br2.readLine();
            while (linha2 != null) {
                rogerao2.add(linha2);
                linha2 = br2.readLine();
            }

            InputStream is3 = new FileInputStream("DarthVerde.txt");
            InputStreamReader isr3 = new InputStreamReader(is3);
            BufferedReader br3 = new BufferedReader(isr3);
            String linha3 = br3.readLine();
            while (linha3 != null) {
                darthVerde2.add(linha3);
                linha3 = br3.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro de leitura de arquivo!");
        } catch (IOException ex) {
            System.out.println("Erro de leitura de arquivo!");
        }
        
        System.out.println("Paulinho Anão teve " + paulinho2.size() + " voto(s)");
        System.out.println("Rogerão teve " + rogerao2.size() + " voto(s)");
        System.out.println("Darth Verde teve " + darthVerde2.size() + " voto(s)");

    }

}
