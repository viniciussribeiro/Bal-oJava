package balao;

public class Balao {
	double inflar;
	double subir;
	double desinflar;
	double fogo = 100;
	double gas = 0;
	boolean bot = false;
	public Balao () {
		this.inflar = inflar;
		this.subir = subir;
		this.desinflar = desinflar;
		this.fogo = fogo;
		this.gas = gas;
        this.bot = bot;
	}
	public boolean Inflar () {
		System.out.println("Enchendo o balãoooo!");
		bot = true;
		return bot;
	}
	public void Subir() {
		if(Inflar()) {
			System.out.println("O balão está subindo!!!");
			subir += 10;
			System.out.println(subir+" m   ");
		}
	}
    public void Descer() {
    
    }
}


