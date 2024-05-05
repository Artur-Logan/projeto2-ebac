package service;

import domains.Cliente;

public interface IClienteService {
    void salvar(Cliente cliente);

    Cliente buscarPorCPF(Long cpf);
}
