package com.coderhouse.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(description = "Modelo de asignacion de Categoria DTO", title = "Asignacion DTO")
public class AsignacionCategoriaCursoDTO {
	
	@Schema( description = "Curso ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
	private Long CursoId;
	@Schema( description = "Categroia ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
	private Long categoriaId;
}
