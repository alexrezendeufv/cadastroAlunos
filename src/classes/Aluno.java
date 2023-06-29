package classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    private int idade;
    private String numeroCpf;

    //Criando list para adicionar disciplinas


    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
    public void setDisciplinas(List<Disciplina> disciplinas){
        this.disciplinas =disciplinas;
    }
    public List<Disciplina> getDisciplinas(){
        return disciplinas;
    }


    //Getters and Setters atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }
    public double getMedia(){
        double media=0;
        for (Disciplina var:disciplinas) {
            media += var.getNota();
        }
        return media/disciplinas.size();
    }

    public void aprovacao(){
        if(getMedia()>60){
            System.out.println("Aluno Aprovado");
        }else if (getMedia()>=50){
            System.out.println("Aluno em recuperação");
        }else{
            System.out.println("Aluno reprovado");
        }
    }
}
