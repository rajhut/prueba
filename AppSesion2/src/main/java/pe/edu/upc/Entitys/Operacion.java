package pe.edu.upc.Entitys;

public class Operacion {
	// Atributo
	private char operacion;
	private double numeroA;
	private double numeroB;

	// Constructor: Metodo - reservar espacio memoria
	public Operacion() {
		super();
	}

	// Metodos acceso a datos (get - set)
	public char getOperacion() {
		return operacion;
	}

	public void setOperacion(char operacion) {
		this.operacion = operacion;
	}

	public double getNumeroA() {
		return numeroA;
	}

	public void setNumeroA(double numeroA) {
		this.numeroA = numeroA;
	}

	public double getNumeroB() {
		return numeroB;
	}

	public void setNumeroB(double numeroB) {
		this.numeroB = numeroB;
	}

	// Metodo de usuario
	public double Calcular() {
		try {
			switch (this.operacion) {
			case '+':
				return this.numeroA + this.numeroB;
			case '-':
				return this.numeroA - this.numeroB;
			case '*':
				return this.numeroA * this.numeroB;
			case '/':
				return this.numeroA / this.numeroB;

			default:
				return 0;
			}

		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Calculadora";
	}
}
