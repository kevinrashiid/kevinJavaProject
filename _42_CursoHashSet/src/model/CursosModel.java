package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data //es como pusieras @Setter @Getter
 @Data
@NoArgsConstructor
@AllArgsConstructor
public class CursosModel {
	private String nombreCurso;
	private double dMediaCurso;
	private double precio;
	private String tematica;
}