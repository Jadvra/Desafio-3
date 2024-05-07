package application;

import control.Escola;
import entities.Aluno;
import entities.Disciplina;
import entities.Professor;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Escola escola = new Escola();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Buscar Aluno");
            System.out.println("3. Atualizar Aluno");
            System.out.println("4. Remover Aluno");
            System.out.println("5. Adicionar Professor");
            System.out.println("6. Buscar Professor");
            System.out.println("7. Atualizar Professor");
            System.out.println("8. Remover Professor");
            System.out.println("9. Adicionar Disciplina");
            System.out.println("10. Buscar Disciplina");
            System.out.println("11. Atualizar Disciplina");
            System.out.println("12. Remover Disciplina");
            System.out.println("13. Matricular Aluno em Disciplina");
            System.out.println("14. Lançar Notas");
            System.out.println("15. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();
            

            switch (opcao) {
                case 1:
                    System.out.println("\n=== ADICIONAR ALUNO ===");
                    System.out.print("Nome: ");
                    String nomeAluno = sc.nextLine();
                    int idadeAluno;
                    while (true) {
                        try {
                            System.out.print("Idade: ");
                            idadeAluno = Integer.parseInt(sc.nextLine());
                            if (idadeAluno <= 0) {
                                throw new IllegalArgumentException("A idade deve ser um número inteiro positivo.");
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Por favor, insira um número inteiro para a idade.");
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    System.out.print("Matrícula: ");
                    String matriculaAluno = sc.nextLine();
                    System.out.print("ID: ");
                    
                    String idAluno = sc.nextLine();
                    escola.adicionarAluno(new Aluno(nomeAluno, idadeAluno, matriculaAluno, idAluno));
                    System.out.println("Aluno adicionado com sucesso.");
                    System.out.println();
                    System.out.print("Aperte Enter para voltar ");
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("\n=== BUSCAR ALUNO ===");
                    System.out.print("ID do aluno: ");
     
                    String idBuscaAluno = sc.nextLine();
                    Aluno alunoBuscado = escola.buscarAluno(idBuscaAluno);
                    if (alunoBuscado != null) {
                        System.out.println("Aluno encontrado: " + alunoBuscado.getNome());
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    System.out.println();
                    System.out.print("Aperte Enter para voltar ");
                    sc.nextLine();
                    break;
                case 3:
                    System.out.println("\n=== ATUALIZAR ALUNO ===");
                    System.out.print("ID do aluno a ser atualizado: ");
                    String idAlunoAtualizar = sc.nextLine();
                    Aluno alunoAtualizar = escola.buscarAluno(idAlunoAtualizar);
                    if (alunoAtualizar != null) {
                        System.out.print("Novo nome: ");
                        String novoNomeAluno = sc.nextLine();
                        System.out.print("Nova idade: ");
                        int novaIdadeAluno = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nova matrícula: ");
                        String novaMatriculaAluno = sc.nextLine();
                        alunoAtualizar.setNome(novoNomeAluno);
                        alunoAtualizar.setIdade(novaIdadeAluno);
                        alunoAtualizar.setMatricula(novaMatriculaAluno);
                        System.out.println("Aluno atualizado com sucesso.");
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    System.out.println();
                    System.out.print("Aperte Enter para voltar ");
                    sc.nextLine();
                    break;
                case 4:
                    System.out.println("\n=== REMOVER ALUNO ===");
                    System.out.print("ID do aluno a ser removido: ");
                    String idAlunoRemover = sc.nextLine();
                    Aluno alunoRemover = escola.buscarAluno(idAlunoRemover);
                    if (alunoRemover != null) {
                        escola.removerAluno(idAlunoRemover);
                        System.out.println("Aluno removido com sucesso.");
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    System.out.println();
                    System.out.print("Aperte Enter para voltar ");
                    sc.nextLine();
                    break;
                case 5:
                    System.out.println("\n=== ADICIONAR PROFESSOR ===");
                    System.out.print("Nome: ");
                    String nomeProfessor = sc.nextLine();
                    System.out.print("Idade: ");
                    int idadeProfessor = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Disciplina: ");
                    String disciplinaProfessor = sc.nextLine();
                    System.out.print("ID: ");
                    String idProfessor = sc.nextLine();
                    escola.adicionarProfessor(new Professor(nomeProfessor, idadeProfessor, disciplinaProfessor, idProfessor));
                    System.out.println("Professor adicionado com sucesso.");
                    System.out.println();
                    System.out.print("Aperte Enter para voltar ");
                    sc.nextLine();
                    break;
                case 6:
                    System.out.println("\n=== BUSCAR PROFESSOR ===");
                    System.out.print("ID do professor: ");
                  
                    String idBuscaProfessor = sc.nextLine();
                    Professor professorBuscado = escola.buscarProfessor(idBuscaProfessor);
                    if (professorBuscado != null) {
                        System.out.println("Professor encontrado: " + professorBuscado.getNome());
                    } else {
                        System.out.println("Professor não encontrado.");
                    }
                    System.out.println();
                    System.out.print("Aperte Enter para voltar ");
                    sc.nextLine();
                    break;
                case 7:
                    System.out.println("\n=== ATUALIZAR PROFESSOR ===");
                    System.out.print("ID do professor a ser atualizado: ");
                  
                    String idProfessorAtualizar = sc.nextLine();
                    Professor professorAtualizar = escola.buscarProfessor(idProfessorAtualizar);
                    if (professorAtualizar != null) {
                        System.out.print("Novo nome: ");
                      
                        String novoNomeProfessor = sc.nextLine();
                        System.out.print("Nova idade: ");
                        int novaIdadeProfessor = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nova disciplina: ");
                      
                        String novaDisciplinaProfessor = sc.nextLine();
                        professorAtualizar.atualizarInformacoes(novoNomeProfessor, novaIdadeProfessor, novaDisciplinaProfessor);
                        System.out.println("Professor atualizado com sucesso.");
                    } else {
                        System.out.println("Professor não encontrado.");
                    }
                    System.out.println();
                    System.out.print("Aperte Enter para voltar ");
                    sc.nextLine();
                    break;
                case 8:
                    System.out.println("\n=== REMOVER PROFESSOR ===");
                    System.out.print("ID do professor a ser removido: ");
                  
                    String idProfessorRemover = sc.nextLine();
                    Professor professorRemover = escola.buscarProfessor(idProfessorRemover);
                    if (professorRemover != null) {
                        escola.removerProfessor(idProfessorRemover);
                        System.out.println("Professor removido com sucesso.");
                    } else {
                        System.out.println("Professor não encontrado.");
                    }
                    System.out.println();
                    System.out.print("Aperte Enter para voltar ");
                    sc.nextLine();
                    break;
                case 9:
                    System.out.println("\n=== ADICIONAR DISCIPLINA ===");
                    System.out.print("Nome: ");
                  
                    String nomeDisciplina = sc.nextLine();
                    System.out.print("Código: ");
                  
                    String codigoDisciplina = sc.nextLine();
                    System.out.print("ID: ");
                  
                    String idDisciplina = sc.nextLine();
                    escola.adicionarDisciplina(new Disciplina(nomeDisciplina, codigoDisciplina, idDisciplina));
                    System.out.println("Disciplina adicionada com sucesso.");
                    System.out.println();
                    System.out.print("Aperte Enter para voltar ");
                    sc.nextLine();
                    break;
                case 10:
                    System.out.println("\n=== BUSCAR DISCIPLINA ===");
                    System.out.print("ID da disciplina: ");
                  
                    String idBuscaDisciplina = sc.nextLine();
                    Disciplina disciplinaBuscada = escola.buscarDisciplina(idBuscaDisciplina);
                    if (disciplinaBuscada != null) {
                        System.out.println("Disciplina encontrada: " + disciplinaBuscada.getNome());
                    } else {
                        System.out.println("Disciplina não encontrada.");
                    }
                    System.out.println();
                    System.out.print("Aperte Enter para voltar ");
                    sc.nextLine();
                    break;
                case 11:
                    System.out.println("\n=== ATUALIZAR DISCIPLINA ===");
                    System.out.print("ID da disciplina a ser atualizada: ");
                  
                    String idDisciplinaAtualizar = sc.nextLine();
                    Disciplina disciplinaAtualizar = escola.buscarDisciplina(idDisciplinaAtualizar);
                    if (disciplinaAtualizar != null) {
                        System.out.print("Novo nome: ");
                      
                        String novoNomeDisciplina = sc.nextLine();
                        System.out.print("Novo código: ");
                      
                        String novoCodigoDisciplina = sc.nextLine();
                        disciplinaAtualizar.setNome(novoNomeDisciplina);
                        disciplinaAtualizar.setCodigo(novoCodigoDisciplina);
                        System.out.println("Disciplina atualizada com sucesso.");
                    } else {
                        System.out.println("Disciplina não encontrada.");
                    }
                    System.out.println();
                    System.out.print("Aperte Enter para voltar ");
                    sc.nextLine();
                    break;
                case 12:
                    System.out.println("\n=== REMOVER DISCIPLINA ===");
                    System.out.print("ID da disciplina a ser removida: ");
                  
                    String idDisciplinaRemover = sc.nextLine();
                    Disciplina disciplinaRemover = escola.buscarDisciplina(idDisciplinaRemover);
                    if (disciplinaRemover != null) {
                        escola.removerDisciplina(idDisciplinaRemover);
                        System.out.println("Disciplina removida com sucesso.");
                    } else {
                        System.out.println("Disciplina não encontrada.");
                    }
                    System.out.println();
                    System.out.print("Aperte Enter para voltar ");
                    sc.nextLine();
                    break;
                case 13:
                    System.out.println("\n=== MATRICULAR ALUNO EM DISCIPLINA ===");
                    System.out.print("ID do aluno: ");
                  
                    String idAlunoMatricular = sc.nextLine();
                    System.out.print("ID da disciplina: ");
                  
                    String idDisciplinaMatricular = sc.nextLine();
                    Aluno alunoMatricular = escola.buscarAluno(idAlunoMatricular);
                    Disciplina disciplinaMatricular = escola.buscarDisciplina(idDisciplinaMatricular);
                    if (alunoMatricular != null && disciplinaMatricular != null) {
                        disciplinaMatricular.adicionarAluno(alunoMatricular);
                        System.out.println("Aluno matriculado na disciplina com sucesso.");
                    } else {
                        System.out.println("Aluno ou disciplina não encontrado.");
                    }
                    System.out.println();
                    System.out.print("Aperte Enter para voltar ");
                    sc.nextLine();
                    break;
                case 14:
                    System.out.println("\n=== LANÇAR NOTAS ===");
                    System.out.print("ID do aluno: ");
                    String idAlunoNota = sc.nextLine();
                    System.out.print("ID da disciplina: ");
                    String idDisciplinaNota = sc.nextLine();
                    double nota;
                    while (true) {
                        try {
                            System.out.print("Nota: ");
                            nota = Double.parseDouble(sc.nextLine());
                            if (nota < 0 || nota > 10) {
                                throw new IllegalArgumentException("A nota deve estar no intervalo de 0 a 10.");
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Por favor, insira um número para a nota.");
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    Aluno alunoNota = escola.buscarAluno(idAlunoNota);
                    Disciplina disciplinaNota = escola.buscarDisciplina(idDisciplinaNota);
                    if (alunoNota != null && disciplinaNota != null) {
                        escola.lancarNota(alunoNota, nota);
                    } else {
                        System.out.println("Aluno ou disciplina não encontrado.");
                    }
                    System.out.println();
                    System.out.print("Aperte Enter para voltar ");
                    sc.nextLine();
                    break;                
                              
                case 15:
                    System.out.println("Até logo!");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    System.out.println();
                    System.out.print("Aperte Enter para voltar ");
                    sc.nextLine();
            }
        
        }
    }
}
