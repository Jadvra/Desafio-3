
package entities;

public class Professor {
    private String nome;
    private int idade;
    private String disciplina;
    private String id; 

    public Professor(String nome, int idade, String disciplina, String id) {
        this.nome = nome;
        this.idade = idade;
        this.disciplina = disciplina;
        this.id = id;
    }

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

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getId() {
        return id;
    }

    public void atualizarInformacoes(String nome, int idade, String disciplina) {
        this.nome = nome;
        this.idade = idade;
        this.disciplina = disciplina;
    }
}
