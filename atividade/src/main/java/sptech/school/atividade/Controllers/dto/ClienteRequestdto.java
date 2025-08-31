package sptech.school.atividade.Controllers.dto;

import sptech.school.atividade.Entities.Cliente;
import sptech.school.atividade.Entities.RendaMensal;

public class ClienteRequestdto {

    private Cliente cliente;
    private RendaMensal rendaMensal;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public RendaMensal getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(RendaMensal rendaMensal) {
        this.rendaMensal = rendaMensal;
    }
}
