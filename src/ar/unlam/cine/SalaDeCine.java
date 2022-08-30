package ar.unlam.cine;

public class SalaDeCine {
	private Integer butacasTotales;
	private Integer cantidadDeFilas;
	private Integer butacasPorFila;
	private Boolean [][] butacas;
	
	public SalaDeCine (Integer butacasTotales, Integer cantidadDeFilas, Integer butacasPorFila) {
		this.butacasTotales = butacasTotales;
		this.cantidadDeFilas = cantidadDeFilas;
		this.butacasPorFila = butacasPorFila;
		this.butacas = new Boolean[this.cantidadDeFilas][this.butacasPorFila];
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				butacas[i][j]= false;
			}
		}
	}

	public Boolean estaOcupadaLaButaca(Integer fila, Integer butaca) {
		return butacas[fila][butaca];
		
	}

	public Boolean ocuparButaca(Integer fila, Integer butaca) {
		if(butacas[fila][butaca]) {
			return false;
		}
		butacas[fila][butaca] = true;
		return true;
	}

	public Integer consultarCantidadDeButacasOcupadas() {
		Integer butacasOcupadas = 0;
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				if(butacas[i][j]) {
					butacasOcupadas++;
				}
			}
		}
		return butacasOcupadas;
	}

	public Boolean hayEspacioPara(Integer personas) {
		Integer contadorContiguo = 0;
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				if(butacas[i][j]) {
					contadorContiguo++;
				}
				return false;
			}
		}
		return true;
	}
	
	
	
}
