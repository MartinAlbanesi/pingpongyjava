package ar.edu.unlam.pb2.FuerzasArmadas;

public class Hidroavion extends Vehiculo implements IAcuatico, IVolador{

	private Double profundidad;
	private Double altura;

	public Hidroavion(Integer codigo, String modelo, Double profundidad, Double altura) {
		super(codigo, modelo);
		this.profundidad = profundidad;
		this.altura = altura;
	}

	@Override
	public Double getAltura() {
		return altura;
	}

	@Override
	public Double getProfundidad() {
		return profundidad;
	}

}
