package classes;

import java.util.Objects;

public class Disciplina {

    private String nome;
    private double nota;

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNota(int nota){
        this.nota=nota;
    }

    public double getNota(){
        return this.nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disciplina that)) return false;
        return Double.compare(that.getNota(), getNota()) == 0 && Objects.equals(getNome(), that.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getNota());
    }
}
