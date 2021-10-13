package ar.edu.unlam.pb2.FuerzasArmadas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class FuerzaArmada {
	
	private Set<Vehiculo> convoy;
	private Map<Batalla, Vehiculo> vehiculosEnBatalla;

	
	public FuerzaArmada() {
		this.convoy = new HashSet<>();
		this.vehiculosEnBatalla = new HashMap<>();
	}

	
	public Boolean agregarVehiculo(Vehiculo vehiculo) {
		//	if(!this.convoy.contains(vehiculo))
				return this.convoy.add(vehiculo);
		//	return false;
	}

	public Object getCapacidadDeDefensa() {
		return this.convoy.size();
	}


	public void enviarALaBatalla(Batalla batalla, Vehiculo vehiculo) throws VehiculoIncompatible {
		if(batalla.tipo.equals(TipoDeBatalla.TERRESTRE) && vehiculo instanceof ITerrestre ||
			batalla.tipo.equals(TipoDeBatalla.AEREA) && vehiculo instanceof IVolador ||
			batalla.tipo.equals(TipoDeBatalla.NAVAL) && vehiculo instanceof IAcuatico)
				this.vehiculosEnBatalla.put(batalla, vehiculo);
		
		else
			throw new VehiculoIncompatible();
	}


	
}
