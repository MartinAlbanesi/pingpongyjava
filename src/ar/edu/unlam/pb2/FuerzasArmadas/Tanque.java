package ar.edu.unlam.pb2.FuerzasArmadas;

public class Tanque extends Vehiculo implements ITerrestre{

	private Double velocidad;
	
	public Tanque(Integer codigo, String modelo, Double velocidad) {
		super(codigo, modelo);
		this.velocidad = velocidad;
	}

	@Override
	public Double getVelocidad() {
		return velocidad;
	}
	
}
