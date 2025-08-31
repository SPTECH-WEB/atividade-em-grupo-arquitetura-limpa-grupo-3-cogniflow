package sptech.school.atividade.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.school.atividade.Controllers.dto.ClienteRequestdto;
import sptech.school.atividade.Entities.Cliente;
import sptech.school.atividade.Entities.RendaMensal;
import sptech.school.atividade.UseCases.ClienteService;

@RestController
@RequestMapping("/clientes")
public class Controller {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Cliente> cadastrarCliente(@RequestBody ClienteRequestdto request) {
        try {
            Cliente cliente = request.getCliente();
            RendaMensal renda = request.getRendaMensal();

            clienteService.calcularRisco(cliente, renda);
            Cliente clienteSalvo = clienteService.postCliente(cliente);

            return ResponseEntity.ok(clienteSalvo);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> listarDados(@PathVariable Integer id) {
        try {
            Cliente cliente = clienteService.getCliente(id);
            return ResponseEntity.ok(cliente);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }

}
