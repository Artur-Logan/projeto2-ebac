package service;

import dao.IClienteDAO;
import domains.Cliente;

public class ClienteDAO implements IClienteDAO {
    @Override
    public void salvar(Cliente cliente) {

    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return null;
    }
}
