package service;

import dao.IClienteDAO;
import domains.Cliente;

public class ClienteDAO implements IClienteDAO {
    @Override
    public Boolean salvar(Cliente cliente) {
        return true;
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return null;
    }

    @Override
    public void excluir(Long cpf) {

    }
}
