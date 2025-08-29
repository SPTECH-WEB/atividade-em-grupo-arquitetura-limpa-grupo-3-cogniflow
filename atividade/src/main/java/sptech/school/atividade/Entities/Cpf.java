package sptech.school.atividade.Entities;

public class Cpf {

    private String CPF;

    public Cpf(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public boolean validarCpf(String cpf){

        return cpf != null && cpf.matches("\\d{11}");

    }


}
