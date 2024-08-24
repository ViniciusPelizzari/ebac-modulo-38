/**
 * 
 */
package br.com.vpelizzarisilva.dao;

import br.com.vpelizzarisilva.dao.generic.GenericDAO;
import br.com.vpelizzarisilva.domain.Cliente;

/**
 * @author Vinícius Pelizzari
 *
 */
public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super(Cliente.class);
	}

}
