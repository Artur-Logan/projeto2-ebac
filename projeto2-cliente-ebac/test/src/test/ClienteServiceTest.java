package test;

import dao.ClienteDAOMock;
import dao.IClienteDAO;
import domains.Cliente;
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
    public void init(){
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
    public void salvarCliente(){
        Boolean retorno = clienteService.salvar(cliente);

        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente(){
        clienteService.excluir(cliente.getCpf());
    }
}
