package dao.impl;

import dao.DaoClientes;
import domain.modelo.Cliente;
import jakarta.inject.Inject;

import java.util.ArrayList;
import java.util.List;


public class DaoClientesImpl implements DaoClientes {


    private DataBase db;


    @Inject
    public DaoClientesImpl(DataBase db) {
        this.db = db;
    }
//
//    public DaoClientes() {
//        this.db = new DataBase();
//    }

    @Override
    public boolean updateCliente(Cliente c) {
        boolean ok = false;

        List<Cliente> clientes = db.loadClientes();

        if (clientes != null) {
            ok = clientes.remove(c);
            if (ok) {
                clientes.add(c);
                ok = db.saveClientes(clientes);
            }
        }

        return ok;
    }


    @Override
    public boolean addCliente(Cliente c) {
        boolean ok = false;
        List<Cliente> clientes = db.loadClientes();
        if (clientes == null) {
            clientes = new ArrayList<>();
        }

        clientes.add(c);
        ok = db.saveClientes(clientes);

        return ok;
    }


    @Override
    public List<Cliente> getClientes() {
        return db.loadClientes();
    }

}
