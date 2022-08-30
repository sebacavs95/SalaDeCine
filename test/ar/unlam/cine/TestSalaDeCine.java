package ar.unlam.cine;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSalaDeCine {
	
	Integer butacasTotales = 60;
	Integer cantidadDeFilas = 15;
	Integer butacasPorFila = 20;
	SalaDeCine cinemark = new SalaDeCine(butacasTotales, cantidadDeFilas, butacasPorFila);
	
	@Test
	public void queSePuedaConsultarSiUnaButacaEstaOcupada() {
		assertFalse(cinemark.estaOcupadaLaButaca(0,1));
	}
	
	@Test
	public void queSePuedaOcuparUnaButaca() {
		Integer fila = 10;
		Integer butaca = 8;
		Boolean ve = true;
		Boolean vo = cinemark.ocuparButaca(fila,butaca);
		assertEquals(vo,ve);
		
		assertTrue(cinemark.estaOcupadaLaButaca(fila,butaca));
	}
	
	@Test
	public void queSePuedaConsultarCantidadDeButacasOcupadas() {
		cinemark.ocuparButaca(1,2);
		cinemark.ocuparButaca(1,4);
		cinemark.ocuparButaca(1,6);
		cinemark.ocuparButaca(1,8);
		
		Integer ve = 4;
		Integer vo = cinemark.consultarCantidadDeButacasOcupadas();
		assertEquals(vo,ve);
	}
	
	@Test
	public void queSePuedaAcomodarAVariasPersonasALaVez() {
		cinemark.ocuparButaca(1,2);
		cinemark.ocuparButaca(1,4);
		cinemark.ocuparButaca(1,6);
		cinemark.ocuparButaca(1,8);
		
		cinemark.hayEspacioPara(6);
		
		Integer ve = 4;
		Integer vo = cinemark.consultarCantidadDeButacasOcupadas();
		assertEquals(vo,ve);
	}
	
}
