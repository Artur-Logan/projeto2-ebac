package test;

import dao.ClienteDAOMock;
import dao.IClienteDAO;
import domains.Cliente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {

    private Cliente cliente;

    private IClienteDAO clienteDAO;

    public ClienteDAOTest() {
        clienteDAO = new ClienteDAOMock();
    }

    @Before
    public void init(){
        cliente = new Cliente();
        cliente.setCpf(12345678900l);
        cliente.setNome("Artur Logan");
        cliente.setEstado("Mg");
        cliente.setEnd("endereço end");
        cliente.setCidade("Cidade 0");
        cliente.setNumero(000);
        cliente.setTel(1234567899l);

        clienteDAO.salvar(cliente);
    }

    @Test
    public void pesquisarCliente(){
        Cliente clienteConsultado = clienteDAO.buscarPorCPF(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente(){
        Boolean retorno = clienteDAO.salvar(cliente);

        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente(){
        clienteDAO.excluir(cliente.getCpf());
    }

}
