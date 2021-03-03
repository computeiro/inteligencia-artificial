package computeiro.rosenblattneuron.ui;

import java.awt.GridLayout;

import javax.swing.JPanel;

import computeiro.rosenblattneuron.Trainer;
import computeiro.rosenblattneuron.ui.RNField.RNFieldException;

public class WeightMatriz extends JPanel {

    private RNField[][] campos;

    public WeightMatriz(int linhas, int colunas) {
	super();

	this.setLayout(new GridLayout(linhas, colunas, 1, 1));

	campos = new RNField[linhas][colunas];

	for (int i = 0; i < linhas; i++) {
	    int lin = i + 1;

	    for (int j = 0; j < colunas; j++) {
		int col = j + 1;
		campos[i][j] = new RNField(" na tabela de pesos na linha " + (lin) + " coluna " + (col));
		campos[i][j].setSize(30, 20);
		campos[i][j].setText("0");
		this.add(campos[i][j]);
	    }
	}

    }

    public RNField[][] getCampos() {
	return campos;
    }
    
    public double[][] getValues() throws RNFieldException{
	double[][] values = new double[Trainer.LINHAS][Trainer.COLUNAS];
	
	for (int i = 0; i < campos.length; i++) {
	    for (int j = 0; j < campos[i].length; j++) {
		values[i][j] =  campos[i][j].value();
	    }
	}
	
	return values;
    }
    

}
