package pergamo.springpadroesprojetos.service;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pergamo.springpadroesprojetos.model.Cliente;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}