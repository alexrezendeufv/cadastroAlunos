package classes;

public class Acumulador {

    private String acumulador="";
    private int numb = 0;

    public String getAcumulador(){
        return acumulador;
    }

    public void getDis(Aluno aluno){
        for (Disciplina var: aluno.getDisciplinas() ) {
            acumulador += numb +"-" + var.getNome() + "\n";
            numb++;
        }
    }

    public void resetAcumulador(){
        this.acumulador="";
        this.numb=0;
    }


}
