package cycle;
import java.util.Random;

public class velo {
	
	private static double DEFAUT_BRAQUET = 13.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea;
	
	public static double getDEFAUT_BRAQUET() {
		return DEFAUT_BRAQUET;
	}
	public static void setDEFAUT_BRAQUET(double dEFAUT_BRAQUET) {
		DEFAUT_BRAQUET = dEFAUT_BRAQUET;
	}
	
	public velo(double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
	}
	
	public velo(double braquet) {
		this.braquet = braquet;
	}
	
	public velo() {
		
	}
	
	public double getBraquet() {
		return braquet;
	}
	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}
	public double getDiamRoue() {
		return diamRoue;
	}
	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}
	public Random getGenAlea() {
		return genAlea;
	}
	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}
	
	public String toString() {
		return "velo [braquet=" + braquet + ", diamRoue=" + diamRoue + ", genAlea=" + genAlea + "]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale){
		return FrequenceCoupsDePedale * braquet * diamRoue * genAlea.nextDouble();
	}
	
	public static void main(String[] args) {
		velo v1 = new velo ();
		System.out.println(v1);
	}
}


