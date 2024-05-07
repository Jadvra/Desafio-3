
package entities;

public class Aluno {
    private String nome;
    private int idade;
    private String matricula;
    private String id; 

    public Aluno(String nome, int idade, String matricula, String id) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getId() {
        return id;
    }

    public void atualizarInformacoes(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }
}
