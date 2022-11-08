import java.util.ArrayList;
import java.util.Scanner;

public class CadastroAluno {
Scanner l=new Scanner(System.in);


    public Scanner getL() {
        return l;
    }

    public void setL(Scanner l) {
        this.l = l;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    Aluno aluno;


public Aluno cadastroAluno(){

    System.out.println("Qual o nome do aluno ?");
    String nomeA=l.next();
    System.out.println("Qual o cpf ?");
    String cpfA=l.next();
    System.out.println("Qual o rg ?");
    String rgA=l.next();
    System.out.println("Qual o rgm ?");
    String rgmA=l.next();
    System.out.println("Qual foi a nota dos exercicios ?");
    Double   exerciciosA=l.nextDouble();
    System.out.println("Qual foi a nota da avaliação Parcial ?");
    Double  avaliacaoParcialA=l.nextDouble();
    System.out.println("Qual foi a nota da avaliação Regimental ?");
    Double  avaliacaoRegimentalA=l.nextDouble();


   return new Aluno(nomeA,cpfA,rgA,rgmA,exerciciosA,avaliacaoParcialA,avaliacaoRegimentalA);
}

    public void listaAlunos(ArrayList<Aluno>listAlunos){

        System.out.println("====================Sistema de Avaliação de Alunos=====================");
        for(int i = 0; i < listAlunos.size(); i++){
            String status = null;
            Double st=null;
            st=(listAlunos.get(i).getExercicios()+listAlunos.get(i).getAvaliacaoParcial()
                    +listAlunos.get(i).getAvaliacaoRegimental())/3;

            if(st >= 6 ){
                 status="Aprovado";
            }else if(st>=2 && st<6){
                status="Avaliação Final";
            }else if(st<2){
                status=" Reprovado";
            }


            System.out.print("Nome: " + listAlunos.get(i).getNome()+"|");
            System.out.print("Cpf: " + listAlunos.get(i).getCpf()+"|");
            System.out.print("Rg: " + listAlunos.get(i).getRg()+"|");
            System.out.print("Rgm: " + listAlunos.get(i).getRgm()+"|");
            System.out.print("Exs: " + listAlunos.get(i).getExercicios()+"|");
            System.out.print("Ap: " + listAlunos.get(i).getAvaliacaoParcial()+"|");
            System.out.print("Ar: " + listAlunos.get(i).getAvaliacaoRegimental()+"|");
            System.out.print("Status: " + status +"|\n");
        }

        System.out.println("====================Sistema de Avaliação de Alunos=====================");
    }


    public void removerAluno(ArrayList<Aluno>listAlunos,String aln){
        System.out.println("---------------------------");
        for (int i = 0; i<listAlunos.size(); i++){
            if (aln.equals(listAlunos.get(i).getNome())){
                listAlunos.remove(i);
                System.out.println("O Aluno: " + aln +" Foi removido!");
            }

        }
        System.out.println("---------------------------");

    }

    }








