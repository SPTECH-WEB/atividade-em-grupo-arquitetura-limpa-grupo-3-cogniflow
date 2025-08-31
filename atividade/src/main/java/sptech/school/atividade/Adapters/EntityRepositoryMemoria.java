// Arquivo: EntityRepositoryMemoria.java
package sptech.school.atividade.Adapters;

import sptech.school.atividade.Entities.Entity;
import sptech.school.atividade.Interfaces.EntityRepositoryPort;
import java.util.*;

public class EntityRepositoryMemoria implements EntityRepositoryPort {
    private final Map<Integer, Entity> armazenamento = new HashMap<>();
    private Integer contadorId = 0;


    @Override
    public Entity save(Entity cliente) {
        if (cliente.getId() == null) {
            cliente.setId(++contadorId);
        }
        armazenamento.put(cliente.getId(), cliente);
        return cliente;
    }
    @Override
    public Optional<Entity> findById(Integer id) {
        return Optional.ofNullable(armazenamento.get(id));
    }
}