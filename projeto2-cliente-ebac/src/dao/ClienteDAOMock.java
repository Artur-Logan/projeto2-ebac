package dao;

import domains.Cliente;

import java.util.Collection;
import java.util.List;

public class ClienteDAOMock implements IClienteDAO {
    @Override
    public Boolean cadastrar(Cliente cliente) {
        return true;
    }

    @Override
    public Cliente consultar(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return List.of();
    }

    @Override
    public void excluir(Long cpf) {

    }

    @Override
    public void alterar(Cliente cliente) {

    }
}
