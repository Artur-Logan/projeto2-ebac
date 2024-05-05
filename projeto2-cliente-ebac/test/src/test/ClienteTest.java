package test;

import dao.ClienteDAOMock;
import dao.IClienteDAO;
import domains.Cliente;
import org.junit.Assert;
import org.junit.Test;
import service.ClienteService;
import service.IClienteService;

public class ClienteTest {

    private IClienteService clienteService;

    public ClienteTest(){
        IClienteDAO dao = new ClienteDAOMock();
        clienteService = new ClienteService(dao);
    }

    @Test
    public void pesquisarCliente(){
        Cliente cliente = new Cliente();
        cliente.setCpf(12345678900l);
        cliente.setNome("Artur Logan");
        cliente.setEstado("Mg");
        cliente.setEnd("endereço end");
        cliente.setCidade("Cidade 0");
        cliente.setNumero(000);
        cliente.setTel(1234567899l);

        clienteService.salvar(cliente);

        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }
}
