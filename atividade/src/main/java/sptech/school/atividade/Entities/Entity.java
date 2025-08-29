package sptech.school.atividade.Entities;

public class Entity {

    private Integer id;
    private String nome;
    private String email;
    private String telefone;
    private Integer idade;

    public Entity(Integer id, String nome, String email, String telefone, Integer idade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

        public void validarCampos() {
            validarNome();
            validarEmail();
            validarTelefone();
            validarIdade();
        }

        private void validarNome() {
            if (nome == null || nome.length() < 3) {
                System.out.println("O nome deve ter pelo menos 3 caracteres.");
            }
        }

        private void validarEmail() {
            if (email == null || !email.contains("@")) {
                System.out.println("O email deve ser válido e conter '@'.");
            }
        }

        private void validarTelefone() {
            if (telefone == null || telefone.length() < 10) {
                System.out.println("O telefone deve ter pelo menos 10 dígitos.");
            }
        }

        private void validarIdade() {
            if (idade == null || idade < 18) {
                System.out.println("A idade deve ser maior ou igual a 18 anos.");
            }
        }
    }