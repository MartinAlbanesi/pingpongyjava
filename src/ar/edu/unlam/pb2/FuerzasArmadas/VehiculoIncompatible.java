package ar.edu.unlam.pb2.FuerzasArmadas;

@SuppressWarnings("serial")
public class VehiculoIncompatible extends Exception {
	public VehiculoIncompatible() {
		super("El veh�culo no est� preparado para esta batalla");
	}
}
