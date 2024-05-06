package service;

import domains.Cliente;
import exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {
    Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);

    void alterarCliente(Cliente cliente) throws TipoChaveNaoEncontradaException;
}
