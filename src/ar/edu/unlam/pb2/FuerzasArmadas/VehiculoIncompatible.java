package ar.edu.unlam.pb2.FuerzasArmadas;

@SuppressWarnings("serial")
public class VehiculoIncompatible extends Exception {
	public VehiculoIncompatible() {
		super("El vehículo no está preparado para esta batalla");
	}
}
