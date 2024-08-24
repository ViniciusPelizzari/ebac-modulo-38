/**
 * 
 */
package br.com.vpelizzarisilva.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.vpelizzarisilva.dao.IClienteDAO;
import br.com.vpelizzarisilva.domain.Cliente;
import br.com.vpelizzarisilva.exceptions.DAOException;
import br.com.vpelizzarisilva.exceptions.MaisDeUmRegistroException;
import br.com.vpelizzarisilva.exceptions.TableException;
import br.com.vpelizzarisilva.services.generic.GenericService;

/**
 * @author Vinícius Pelizzari
 *
 */
@Stateless
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	@Inject
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
