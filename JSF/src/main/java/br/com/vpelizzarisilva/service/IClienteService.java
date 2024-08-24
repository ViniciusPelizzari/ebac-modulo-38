/**
 * 
 */
package br.com.vpelizzarisilva.service;

import br.com.vpelizzarisilva.domain.Cliente;
import br.com.vpelizzarisilva.exceptions.DAOException;
import br.com.vpelizzarisilva.services.generic.IGenericService;

/**
 * @author Vinícius Pelizzari
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

}
