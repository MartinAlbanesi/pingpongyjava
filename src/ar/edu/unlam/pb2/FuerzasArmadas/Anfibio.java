package ar.edu.unlam.pb2.FuerzasArmadas;

public class Anfibio extends Vehiculo implements ITerrestre, IAcuatico{

	private Double velocidad;
	private Double profundidad;

	public Anfibio(Integer codigo, String modelo, Double velocidad, Double profundidad) {
		super(codigo, modelo);
		this.velocidad = velocidad;
		this.profundidad = profundidad;
	}

	@Override
	public Double getProfundidad() {
		return profundidad;
	}

	@Override
	public Double getVelocidad() {
		return velocidad;
	}

}
