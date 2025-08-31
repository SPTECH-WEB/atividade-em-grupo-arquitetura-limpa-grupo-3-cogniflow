
package sptech.school.atividade.Interfaces;

import sptech.school.atividade.Entities.Entity;
import java.util.Optional;

public interface EntityRepositoryPort {
    // Altere para retornar a entidade salva
    Entity save(Entity cliente);
    Optional<Entity> findById(Integer id);
}