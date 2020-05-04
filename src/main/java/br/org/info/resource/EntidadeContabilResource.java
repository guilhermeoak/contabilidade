package br.org.info.resource;

import java.util.List;

import br.org.info.model.EntidadeContabil;
import br.org.info.service.EntidadeContabilService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path(value = "empresas")
public class EntidadeContabilResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<EntidadeContabil> listarEmpresas() {
		List<EntidadeContabil> empresasListadas = new EntidadeContabilService().listarEmpresas();
		return empresasListadas;
	}

}
