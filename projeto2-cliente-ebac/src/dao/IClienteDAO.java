package dao;

import domains.Cliente;

public interface IClienteDAO {
    void salvar(Cliente cliente);

    Cliente buscarPorCPF(Long cpf);
}
