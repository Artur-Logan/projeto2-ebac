package test;

import dao.ClienteDAOMock;
import dao.IClienteDAO;
import domains.Cliente;
import exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.ClienteService;
import service.IClienteService;

public class ClienteServiceTest {

    private Cliente cliente;

    private IClienteService clienteService;

    public ClienteServiceTest(){
        IClienteDAO dao = new ClienteDAOMock();
        clienteService = new ClienteService(dao);
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

        clienteService.salvar(cliente);
    }

    @Test
    public void pesquisarCliente(){
        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteService.salvar(cliente);

        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente(){
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterar() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Alterar");
        clienteService.alterarCliente(cliente);

        Assert.assertEquals("Alterar", cliente.getNome());
    }

    @Test
    public void consultarCliente(){

        Cliente clienteConsultado = clienteService.buscarPorCPF(Long.valueOf(cliente.getCpf()));
        Assert.assertNotNull(clienteConsultado);
    }
}
