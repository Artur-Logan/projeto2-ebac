package dao;

import dao.generics.GenericDAO;
import domains.Cliente;

import java.io.Serializable;

public class ClienteDAO extends GenericDAO<Cliente> implements IClienteDAO {

    public ClienteDAO(){
        super();
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
        entityCadastrado.setCpf(entity.getCpf());
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setEnd(entity.getEnd());
        entityCadastrado.setTel(entityCadastrado.getTel());
    }

    @Override
    public void excluir(Long valor) {

    }

    @Override
    public Cliente consultar(Long valor) {
        return null;
    }
}
