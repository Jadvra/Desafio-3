
package control;

import entities.Aluno;
import entities.Disciplina;
import entities.Professor;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Disciplina> disciplinas;

    public Escola() {
        alunos = new ArrayList<>();
        professores = new ArrayList<>();
        disciplinas = new ArrayList<>();
    }
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public Aluno buscarAluno(String id) {
        for (Aluno aluno : alunos) {
            if (aluno.getId().equals(id)) {
                return aluno;
            }
        }
        return null;
    }

    public void atualizarAluno(String id, Aluno novoAluno) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getId().equals(id)) {
                alunos.set(i, novoAluno);
                break;
            }
        }
    }

    public void removerAluno(String id) {
        alunos.removeIf(aluno -> aluno.getId().equals(id));
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public Professor buscarProfessor(String id) {
        for (Professor professor : professores) {
            if (professor.getId().equals(id)) {
                return professor;
            }
        }
        return null;
    }

    public void atualizarProfessor(String id, Professor novoProfessor) {
        for (int i = 0; i < professores.size(); i++) {
            if (professores.get(i).getId().equals(id)) {
                professores.set(i, novoProfessor);
                break;
            }
        }
    }

    public void removerProfessor(String id) {
        professores.removeIf(professor -> professor.getId().equals(id));
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public Disciplina buscarDisciplina(String id) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getId().equals(id)) {
                return disciplina;
            }
        }
        return null;
    }

    public void atualizarDisciplina(String id, Disciplina novaDisciplina) {
        for (int i = 0; i < disciplinas.size(); i++) {
            if (disciplinas.get(i).getId().equals(id)) {
                disciplinas.set(i, novaDisciplina);
                break;
            }
        }
    }

    public void removerDisciplina(String id) {
        disciplinas.removeIf(disciplina -> disciplina.getId().equals(id));
    }

    public void matricularAlunoDisciplina(Aluno aluno, Disciplina disciplina) {
        disciplina.adicionarAluno(aluno);
    }

    public void lancarNota(Aluno aluno, double nota) {
        System.out.println("Verificando matrícula do aluno.");
        Disciplina disciplinaDoAluno = encontrarDisciplinaDoAluno(aluno);
        if (disciplinaDoAluno != null) {
            if (disciplinaDoAluno.verificarMatricula(aluno)) {
                System.out.println("Aluno matriculado na disciplina. Lançando nota.");
                disciplinaDoAluno.adicionarNota(aluno, nota);
                System.out.println("Nota lançada com sucesso.");
            } else {
                System.out.println("Aluno não está matriculado nesta disciplina.");
            }
        } else {
            System.out.println("Disciplina do aluno não encontrada.");
        }
    }
    
    
    private Disciplina encontrarDisciplinaDoAluno(Aluno aluno) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.verificarMatricula(aluno)) {
                return disciplina;
            }
        }
        return null;
    }
    
    
}
