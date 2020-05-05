package br.org.info.contabilidade.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.org.info.contabilidade.model.EntidadeContabil;
import br.org.info.contabilidade.service.EntidadeContabilService;

@Path(value="/listar")
public class EntidadeContabilResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<EntidadeContabil> listarEmpresas() {
		List<EntidadeContabil> empresasListadas = new EntidadeContabilService().listarEmpresas();
		return empresasListadas;
	}

}
