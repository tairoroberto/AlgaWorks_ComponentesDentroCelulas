package br.com.tairoroberto.componentesdentrocelulas;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ConsultaClienteBean {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	public void consultar() {
		this.getClientes().add(new Cliente(1, "Tairo", "Gurupi"));
		this.getClientes().add(new Cliente(2, "Luceli", "São Paulo"));
		this.getClientes().add(new Cliente(4, "Tarliane", "Gurupi"));
		this.getClientes().add(new Cliente(6, "Sérgio", "Rio Maria"));
		this.getClientes().add(new Cliente(7, "Neusa", "Gurupi"));
		this.getClientes().add(new Cliente(10, "Roberto", "Gurupi"));
	}
	
	public void salvar() {
		for (Cliente cliente : this.getClientes()) {
			System.out.println(cliente.getCodigo() + " - " + cliente.getNome());
		}
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}
	
}
