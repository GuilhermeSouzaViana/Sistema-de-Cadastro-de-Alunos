import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner l=new Scanner(System.in);

        CadastroAluno cadastro=new CadastroAluno();



        ArrayList<Aluno>al=new ArrayList<>();
        ArrayList<CadastroAluno>cdAluno=new ArrayList<>();

        String escolha="!";
        while (!escolha.equals("X")){
        System.out.println("escolha a opção desejada \n" +
                "1-cadastrar aluno\n" +
                "2-excluir um aluno\n" +
                "E-exibir alunos\n" +
                "X-sair do sistema");
        escolha=l.next().toUpperCase();

        if(escolha.equals("1")){
           al.add(cadastro.cadastroAluno());

        }else if(escolha.equals("2")){
            String aln;
            System.out.println("Qual o nome do aluno ?");
            aln=l.next();
            cadastro.removerAluno(al,aln);

        }else if(escolha.equals("E")){
            cadastro.listaAlunos(al);
        }
        }















    }
}