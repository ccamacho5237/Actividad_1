package actividad_1;

public class Actividad_1{
	
	public static void main(String [ ] args) {
		Dupla primerPar = new Dupla();
		int x=0,y=0;
		primerPar.Guarda(12,32);
		primerPar.Lee(x, y);
		System.out.print("Valor de primerPar.a: "+ primerPar.getA() +"\n");
		System.out.print("Valor de primerPar.b: "+ primerPar.getB() +"\n");
	}
	
}