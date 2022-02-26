/**
 * @author Daniel TG
 * @version 1.2
 */
public class Rectangulo_DTG extends FiguraGeometrica_DTG {
	private double l1;
	private double l2;
	
	public Rectangulo_DTG(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	
	/** 
	 * multiplica lado por lado
	 * @return double (lado por lado)
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	
	/** 
	 * saca el perimetro del rectangulo
	 * @return double ((lado*2)+(lado*2))
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
