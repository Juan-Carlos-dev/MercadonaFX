package servicios.impl;

import dao.DaoClientes;
import dao.impl.DaoClientesImpl;
import domain.modelo.Cliente;
import jakarta.inject.Inject;
import servicios.ServiciosClientes;

import java.util.List;

public class ServiciosClientesImpl implements ServiciosClientes {

    private DaoClientes dao;

    @Inject
    public ServiciosClientesImpl(DaoClientes dao) {
        this.dao = dao;
    }

    @Override
    public boolean addCliente(Cliente c)
    {
        return dao.addCliente(c);
    }


    @Override
    public boolean updateCliente(Cliente c)
    {
        return dao.addCliente(c);
    }


    @Override
    public List<Cliente> getClientes() {
        return dao.getClientes();
    }
}
