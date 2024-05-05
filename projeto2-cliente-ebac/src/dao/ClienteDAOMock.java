package dao;

import domains.Cliente;
import service.ClienteDAO;

public class ClienteDAOMock implements IClienteDAO {
    @Override
    public void salvar(Cliente cliente) {

    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }
}
