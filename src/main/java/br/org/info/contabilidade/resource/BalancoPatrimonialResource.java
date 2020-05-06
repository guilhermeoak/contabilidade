package br.org.info.contabilidade.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.org.info.contabilidade.model.BalancoPatrimonial;
import br.org.info.contabilidade.service.BalancoPatrimonialService;

@Path("/listarBalancos")
public class BalancoPatrimonialResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<BalancoPatrimonial> listarBalancos() {
		List<BalancoPatrimonial> balancosListados = new BalancoPatrimonialService().listarBalancos();
		return balancosListados;
	}

}
