package sptech.school.atividade.UseCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sptech.school.atividade.Entities.Cliente;
import sptech.school.atividade.Entities.RendaMensal;
import sptech.school.atividade.Entities.Risco;
import sptech.school.atividade.Interfaces.EntityRepositoryPort;

@Service
public class ClienteService {

    @Autowired
    private EntityRepositoryPort entityRepositoryPort;

    public Cliente postCliente(Cliente cliente){

        if(cliente == null){
            throw new IllegalArgumentException("Cliente não pode ser nulo");
        }

        cliente.validarCampos();

        return entityRepositoryPort.save(cliente);
    }

    public Cliente getCliente(Integer id){
        return entityRepositoryPort.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado"));
    }

    public Cliente calcularRisco(Cliente cliente, RendaMensal renda){

        if(cliente.getIdade() > 30 && renda.getSalario() > 6000){
            cliente.setRisco(Risco.BAIXO);
        }
        if(cliente.getIdade() < 30 && renda.getSalario() > 3000 && renda.getSalario() < 6000){
            cliente.setRisco(Risco.MEDIO);
        }
        if(renda.getSalario() < 3000){
            cliente.setRisco(Risco.ALTO);
        }

        System.out.println("Estratégia: " + cliente.getRisco().getEstrategiaContato());
        return cliente;
    }
}
