import classes.Acumulador;
import classes.Aluno;
import classes.Disciplina;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<Aluno>();

        String numDeAlunos = JOptionPane.showInputDialog("Quantos alunos deseja cadastrar");

        //Cadastro de varios alunos
        for (int i=0; i<Integer.valueOf(numDeAlunos).intValue();i++){

            //Setando dados do aluno
            Aluno aluno = new Aluno(); //Chamando e setando o aluno
            String nome = JOptionPane.showInputDialog("Nome do aluno " + i);
            String idade = JOptionPane.showInputDialog("Idade do aluno " + i);
            String cpf = JOptionPane.showInputDialog("Cpf do aluno (000.000.000-00)" + i);

            aluno.setNome(nome);
            aluno.setIdade(Integer.valueOf(idade).intValue());
            aluno.setNumeroCpf(cpf);

            //cadastrar disciplinas e armazenar no list presente em alunos

            for(int ii=0;ii<2;ii++){
                Disciplina disciplina = new Disciplina();

                String nomeDaDisciplina = JOptionPane.showInputDialog("Cadastre o nome da disciplina");
                String nota = JOptionPane.showInputDialog("Cadastre a nota final da disciplina");

                disciplina.setNome(nomeDaDisciplina);
                disciplina.setNota(Integer.valueOf(nota).intValue());

                //Armazenar a nota no list em alunos
                aluno.getDisciplinas().add(disciplina);

            }

            /*String acumulador="";
            int numb = 0;
            for (Disciplina var: aluno.getDisciplinas()) {
                acumulador += numb +"-" + var.getNome() + "\n";
                numb++;
            }*/

            Acumulador acum = new Acumulador();
            acum.getDis(aluno);

            int remover = JOptionPane.showConfirmDialog(null,"Deseja alguma das disciplinas cadastradas? " +
                    "lista de displinas\n" + acum.getAcumulador());

            if (remover == 0) {
                int continuarRemover = 0;
                while (continuarRemover == 0) {
                    String rem = JOptionPane.showInputDialog("Qual disciplina deseja remover\n" + acum.getAcumulador());
                    aluno.getDisciplinas().remove(Integer.valueOf(rem).intValue());
                    acum.resetAcumulador();
                    acum.getDis(aluno);
                    continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");

                }
            }

            alunos.add(aluno);

        }

        for(Aluno var: alunos){
            System.out.println(var.getNome());
            System.out.println("A media do Aluno "+ var.getNome()+" "+ var.getMedia());
            var.aprovacao();
        }


    }
}

/*String acumulador="";
            for (Aluno var2: alunos) {
                for (Disciplina var3: aluno.getDisciplinas()) {
                    acumulador += var3.getNome() + "\n";
                }
            }*/