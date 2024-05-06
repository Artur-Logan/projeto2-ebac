package test;

import dao.ClienteDAOMock;
import dao.IClienteDAO;
import domains.Cliente;
import exceptions.TipoChaveNaoEncontradaException;
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
    public void init() throws TipoChaveNaoEncontradaException {
        cliente = new Cliente();
        cliente.setCpf(12345678900l);
        cliente.setNome("Artur Logan");
        cliente.setEstado("Mg");
        cliente.setEnd("endereço end");
        cliente.setCidade("Cidade 0");
        cliente.setNumero(000);
        cliente.setTel(1234567899l);

        clienteDAO.cadastrar(cliente);
    }

    @Test
    public void pesquisarCliente(){
        Cliente clienteConsultado = clienteDAO.consultar(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteDAO.cadastrar(cliente);

        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente(){
        clienteDAO.excluir(cliente.getCpf());
    }

    @Test
    public void alterar() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Alterar");
        clienteDAO.alterar(cliente);

        Assert.assertEquals("Alterar", cliente.getNome());
    }

}
