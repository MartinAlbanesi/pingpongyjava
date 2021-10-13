package ar.edu.unlam.pb2.FuerzasArmadas;

public class Avion extends Vehiculo implements IVolador{

	private Double altura;

	public Avion(Integer codigo, String modelo, Double altura) {
		super(codigo, modelo);
		this.altura = altura;
	}

	@Override
	public Double getAltura() {
		return altura;
	}

}
