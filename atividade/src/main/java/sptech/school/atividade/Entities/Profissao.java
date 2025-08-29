package sptech.school.atividade.Entities;

public class Profissao {

    private String nome;

    public Profissao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String validarProfissao(String nome){

        if (nome == null){
            System.out.println("necessario ter nome");
        }

        return nome;
    }
}
