package ar.edu.unlam.pb2.FuerzasArmadas;

public class Submarino extends Vehiculo implements IAcuatico{

	private Double profundidad;

	public Submarino(Integer codigo, String modelo, Double profundidad) {
		super(codigo, modelo);
		this.profundidad = profundidad;
	}

	@Override
	public Double getProfundidad() {
		return profundidad;
	}

}
