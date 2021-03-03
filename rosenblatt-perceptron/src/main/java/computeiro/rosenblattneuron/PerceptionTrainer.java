package computeiro.rosenblattneuron;

import computeiro.rosenblattneuron.ui.MatrixConstants;

public class PerceptionTrainer {
    private int[][][] amostras;
    private double[][] pesos;
    private double bias;
    private double limiar;
    private int[] target;
    private int epoca;
    private boolean treinou;
    private int maxEpoca;
    private double alfa;

    public PerceptionTrainer(int[] target, double bias, double limiar, double alfa, int maxEpoca) {
	this.amostras = new int[][][] { MatrixConstants.A, MatrixConstants.B, MatrixConstants.C, MatrixConstants.D };
	this.target = target;

	this.pesos = initValues(RosenBlattPerceptronApp.LINHAS, RosenBlattPerceptronApp.COLUNAS);

	this.bias = bias;
	this.limiar = limiar;
	this.epoca = 0;
	this.maxEpoca = maxEpoca;
	this.alfa = alfa;
    }

    public boolean treinar() {
	int saida;
	treinou = false;

	while (!treinou && epoca <= maxEpoca) {
	    epoca++;

	    for (int i = 0; i < amostras.length; i++) {
		saida = RosenBlattPerceptronApp.saida(amostras[i], pesos, bias, limiar);

		if (saida != target[i]) {
		    atualizaPesos(i, saida, target[i]);
		    treinou = false;
		    break;
		} else {
		    treinou = true;
		}

	    }

	}

	return treinou;
    }

    private void atualizaPesos(int amostraIndx, int saida, int target) {
	// StringBuilder out = new StringBuilder();
	// out.append("\n\nEpoca: ").append(epoca);
	for (int i = 0; i < pesos.length; i++) {
	    // out.append("\n   ");
	    for (int j = 0; j < pesos[i].length; j++) {
		pesos[i][j] = pesos[i][j] + alfa * target * amostras[amostraIndx][i][j];
		// out.append(pesos[i][j]).append(" ");
	    }
	}

	bias = bias + alfa * target;
	// out.append("\nBias: ").append(bias);

	// System.out.print(out.toString());
    }

    private double[][] initValues(int linhas, int colunas) {
	double[][] values = new double[linhas][colunas];

	for (int i = 0; i < linhas; i++) {
	    for (int j = 0; j < colunas; j++) {
		values[i][j] = 0;
	    }
	}

	return values;
    }

    public int[][][] getAmostras() {
	return amostras;
    }

    public void setAmostras(int[][][] amostras) {
	this.amostras = amostras;
    }

    public double[][] getPesos() {
	return pesos;
    }

    public void setPesos(double[][] pesos) {
	this.pesos = pesos;
    }

    public double getBias() {
	return bias;
    }

    public void setBias(double bias) {
	this.bias = bias;
    }

    public double getLimiar() {
	return limiar;
    }

    public void setLimiar(double limiar) {
	this.limiar = limiar;
    }

    public int[] getTarget() {
	return target;
    }

    public void setTarget(int[] target) {
	this.target = target;
    }

    public int getEpoca() {
	return epoca;
    }

    public void setEpoca(int epoca) {
	this.epoca = epoca;
    }

    public boolean isTreinou() {
        return treinou;
    }

    public void setTreinou(boolean treinou) {
        this.treinou = treinou;
    }

    public int getMaxEpoca() {
        return maxEpoca;
    }

    public void setMaxEpoca(int maxEpoca) {
        this.maxEpoca = maxEpoca;
    }

    public double getAlfa() {
        return alfa;
    }
    
    
}
