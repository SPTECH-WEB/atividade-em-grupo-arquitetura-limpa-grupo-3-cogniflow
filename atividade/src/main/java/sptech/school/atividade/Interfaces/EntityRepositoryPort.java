
package sptech.school.atividade.Interfaces;

import sptech.school.atividade.Entities.Cliente;
import java.util.Optional;

public interface EntityRepositoryPort {
    // Altere para retornar a entidade salva
    Cliente save(Cliente cliente);
    Optional<Cliente> findById(Integer id);
}