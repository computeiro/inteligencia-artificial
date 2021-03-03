package computeiro.rosenblattneuron;

public abstract class Trainer {
	public static final int COLUNAS = 7;
	public static final int LINHAS = 9;

	protected int[][][] amostras;
	protected int[] target;
	protected double[][] pesos;
	protected double bias;
	protected int epoca;
	protected double alfa;
	protected int maxEpoca;
	protected double limiar;

	public abstract void treinar();

	public abstract String getDescription();

	public Trainer() {
		inicializaPesos();
	}
	
	@Override
	public String toString() {
		return getDescription();
	}


	public void prepare(int[][][] amostras, int[] target, double bias, double limiar, double alfa, int maxEpoca) {
		this.amostras = amostras;
		this.target = target;
		this.bias = bias;
		this.limiar = limiar;
		this.alfa = alfa;
		this.maxEpoca = maxEpoca;
	}

	public double[][] getPesos() {
		return pesos;
	}

	public double getBias() {
		return bias;
	}

	public int getEpoca() {
		return epoca;
	}

	
	private void inicializaPesos() {

		pesos = new double[LINHAS][COLUNAS];

		for (int i = 0; i < LINHAS; i++) {
			for (int j = 0; j < COLUNAS; j++) {
				pesos[i][j] = 0;
			}
		}

	}
	
	public boolean teste(){
		for(int a = 0; a < amostras.length; a++){
			if(calculaY(amostras[a], pesos, bias, limiar) != target[a] ){
				return false;
			}
		}
		
		return true;
	}
	

	public static int calculaY(int entrada[][], double[][] pesos, double bias, double limiar) {
		double yL = 0;

		for (int i = 0; i < entrada.length; i++) {
			for (int j = 0; j < entrada[i].length; j++) {
				yL += entrada[i][j] * pesos[i][j];
			}
		}

		yL += bias;

		if (yL > limiar) {
			return 1;
		} else {
			return -1;
		}
	}
}