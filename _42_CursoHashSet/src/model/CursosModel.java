package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Data //es como pusieras @Setter @Getter
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CursosModel {
	private String nombreCurso;
	private double dMediaCurso;
	private int precio;
	private String tematica;
}

