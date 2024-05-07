
package entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Disciplina {
    private String nome;
    private String codigo;
    private String id;
    private Map<Aluno, Double> notas;
    private List<Aluno> alunosMatriculados;

    public Disciplina(String nome, String codigo, String id) {
        this.nome = nome;
        this.codigo = codigo;
        this.id = id;
        this.notas = new HashMap<>();
        this.alunosMatriculados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getId() {
        return id;
    }

    public void adicionarAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);
        System.out.println("Aluno adicionado à disciplina: " + aluno.getNome());
        System.out.println("Total de alunos matriculados na disciplina: " + alunosMatriculados.size());
    }
    

    public void adicionarNota(Aluno aluno, double nota) {
        notas.put(aluno, nota);
    }

    public void lancarNota(Aluno aluno, double nota) {
        if (notas.containsKey(aluno)) {
            notas.put(aluno, nota);
        } else {
            System.out.println("Aluno não está matriculado nesta disciplina.");
        }
    }

    public void removerAluno(Aluno aluno) {
        alunosMatriculados.remove(aluno);
        notas.remove(aluno);
    }
    
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setCodigo(String novoCodigo) {
        this.codigo = novoCodigo;
    }
    public boolean verificarMatricula(Aluno aluno) {
        return alunosMatriculados.contains(aluno);
    }
    
}
