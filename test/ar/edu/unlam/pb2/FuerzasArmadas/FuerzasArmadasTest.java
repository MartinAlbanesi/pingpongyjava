package ar.edu.unlam.pb2.FuerzasArmadas;

import static org.junit.Assert.*;

import org.junit.Test;

public class FuerzasArmadasTest {

	@Test
	public void queSePuedaCrearUnObjetoVolador() {
		Avion avion = new Avion(1, "A-10", 50.5);
		assertEquals(50.5, avion.getAltura(), 0.01);
	}

	@Test
	public void queSePuedaCrearUnObjetoTerrestre() {
		Tanque tanque = new Tanque(5, "Renault FT", 50.5);
		assertEquals(50.5, tanque.getVelocidad(), 0.1);
	}

	@Test
	public void queSePuedaCrearUnObjetoAcuatico() {
		Submarino submarino = new Submarino(8, "ARA - San Juan", 50.5);
		assertEquals(50.5, submarino.getProfundidad(), 0.01);
	}

	@Test
	public void queSePuedaCrearUnObjetoAnfibio() {
		Anfibio anfibio = new Anfibio(12, "LARC-5", 50.5, 45.6);

		assertEquals(50.5, anfibio.getVelocidad(), 0.01);
		assertEquals(45.6, anfibio.getProfundidad(), 0.01);
	}

	@Test
	public void queSePuedaCrearUnHidroavion() {
		Hidroavion hidroavion = new Hidroavion(12, "AG600", 50.5, 45.6);
		assertEquals(50.5, hidroavion.getProfundidad(), 0.01);
		assertEquals(45.6, hidroavion.getAltura(), 0.01);
	}

	@Test
	public void queSePuedaArmarElConvoy() {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Avion(0001, "A-00", 45.6));
		argentina.agregarVehiculo(new Avion(0001, "A-10", 45.6));
		argentina.agregarVehiculo(new Avion(0002, "B-11", 90.5));
		argentina.agregarVehiculo(new Avion(0003, "C-22", 55.6));
		argentina.agregarVehiculo(new Avion(0004, "D-33", 56.1));
		argentina.agregarVehiculo(new Tanque(0005, "Renault FT", 99.5));
		argentina.agregarVehiculo(new Camion(0006, "T-72", 105.6));
		argentina.agregarVehiculo(new Camion(0007, "T-72", 105.6));
		argentina.agregarVehiculo(new Submarino(1000, "A-10", 60.4));
		argentina.agregarVehiculo(new Hidroavion(0012, "G-10", 90.6, 55.6));
		argentina.agregarVehiculo(new Anfibio(0013, "B-10", 40.0, 60.2));
		argentina.agregarVehiculo(new Anfibio(0014, "LARC-5", 60.3, 55.6));

		assertEquals((Integer)11, argentina.getCapacidadDeDefensa());
	}


	@Test
	public void queSePuedaCrearUnaBatalla() {
		Batalla batalla = new Batalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		batalla.crearBatalla(batalla);

		assertEquals("San Lorenzo", batalla.getNombre());
	}	
	
	@Test
	public void queSePuedaPresentarBatallaTerrestre() throws VehiculoIncompatible {
		FuerzaArmada argentina = new FuerzaArmada();
		Batalla batalla = new Batalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);
		
		Avion avion1 = new Avion(0001, "A-00", 45.6);
		Avion avion2 = new Avion(0002, "B-11", 90.5);
		Avion avion3 = new Avion(0003, "C-22", 55.6);
		Avion avion4 = new Avion(0004, "D-33", 56.1);
		Tanque tanque1 = new Tanque(0005, "Renault FT", 99.5);
		Camion camion1 = new Camion(0006, "T-72", 105.6);
		Camion camion2 = new Camion(0007, "T-72", 105.6);
		Submarino submarion1 = new Submarino(1000, "A-10", 60.4);
		Hidroavion hidroavion1 = new Hidroavion(0012, "G-10", 90.6, 55.6);
		Anfibio anfibio1 = new Anfibio(0013, "B-10", 40.0, 60.2);
		Anfibio anfibio2 = new Anfibio(0014, "LARC-5", 60.3, 55.6);


		argentina.enviarALaBatalla(batalla, anfibio1);	
	}
	
	/*
	@Test
	public void queSePuedaPresentarBatallaNaval() throws VehiculoInexistente, VehiculoIncompatible {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Submarino(8, "A-10"));
		argentina.agregarVehiculo(new Portaviones(9, "A-10"));
		argentina.agregarVehiculo(new Destructor(10, "A-10"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(12, "A-10"));
		argentina.agregarVehiculo(new Anfibio(13, "A-10"));

		assertEquals(12, argentina.getCapacidadDeDefensa());
		argentina.crearBatalla("Pacifico", TipoDeBatalla.NAVAL, 200.5, 45.8);

		assertTrue(argentina.enviarALaBatalla("Pacifico", 8));
		assertTrue(argentina.enviarALaBatalla("Pacifico", 9));
		assertTrue(argentina.enviarALaBatalla("Pacifico", 10));		
		assertTrue(argentina.enviarALaBatalla("Pacifico", 11));		
		assertTrue(argentina.enviarALaBatalla("Pacifico", 12));		
		assertTrue(argentina.enviarALaBatalla("Pacifico", 13));		
	}

	@Test (expected = VehiculoIncompatible.class)
	public void queSeNoSePuedaEnviarAUnaBatallaEnTierraUnBarco() throws VehiculoInexistente, VehiculoIncompatible {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));

		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		assertFalse(argentina.enviarALaBatalla("San Lorenzo", 11));

	}

	@Test (expected = VehiculoInexistente.class)
	public void queSeNoSePuedaEnviarAUnaBatallaUnVehiculoQueNoExista() throws VehiculoInexistente, VehiculoIncompatible {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));

		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		assertFalse(argentina.enviarALaBatalla("San Lorenzo", 4));

	}
	*/
}
