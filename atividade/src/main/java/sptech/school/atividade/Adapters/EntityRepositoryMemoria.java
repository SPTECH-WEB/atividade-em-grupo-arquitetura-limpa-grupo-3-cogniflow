// Arquivo: EntityRepositoryMemoria.java
package sptech.school.atividade.Adapters;

import sptech.school.atividade.Entities.Cliente;
import sptech.school.atividade.Interfaces.EntityRepositoryPort;
import java.util.*;

public class EntityRepositoryMemoria implements EntityRepositoryPort {
    private final Map<Integer, Cliente> armazenamento = new HashMap<>();
    private Integer contadorId = 0;


    @Override
    public Cliente save(Cliente cliente) {
        if (cliente.getId() == null) {
            cliente.setId(++contadorId);
        }
        armazenamento.put(cliente.getId(), cliente);
        return cliente;
    }
    @Override
    public Optional<Cliente> findById(Integer id) {
        return Optional.ofNullable(armazenamento.get(id));
    }
}