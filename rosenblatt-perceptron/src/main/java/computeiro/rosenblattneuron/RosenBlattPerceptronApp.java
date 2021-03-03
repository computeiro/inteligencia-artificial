package computeiro.rosenblattneuron;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import computeiro.rosenblattneuron.resources.ImgMgr;
import computeiro.rosenblattneuron.ui.CharMatrix;
import computeiro.rosenblattneuron.ui.MatrixConstants;
import computeiro.rosenblattneuron.ui.RNField;
import computeiro.rosenblattneuron.ui.WeightMatriz;

public class RosenBlattPerceptronApp {
    public static final int COLUNAS = 7;
    public static final int LINHAS = 9;

    private JFrame frmPerceptron;

    private CharMatrix xMatrix;
    private WeightMatriz wMatrix;

    private RNField txSaida;
    private RNField txLimiar;
    private RNField txBias;

    private RNField txVlrAtivo;
    private RNField txVlrInativo;
    private RNField txVa;
    private RNField txVb;
    private RNField txVc;
    private RNField txVd;
    private RNField txMaxEpoca;
    private RNField txAlfa;
    
    private JLabel lbQtdEpocas;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    RosenBlattPerceptronApp window = new RosenBlattPerceptronApp();
		    window.frmPerceptron.setVisible(true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
     * Create the application.
     */
    public RosenBlattPerceptronApp() {
	initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
	frmPerceptron = new JFrame();
	frmPerceptron.setResizable(false);
	frmPerceptron.getContentPane().setBackground(Color.WHITE);
	frmPerceptron.setTitle("Wender - Perceptron de Rosenblatt");
	frmPerceptron.setBounds(100, 100, 908, 394);
	frmPerceptron.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frmPerceptron.getContentPane().setLayout(null);

	JButton btnA = new JButton("A");
	btnA.setBounds(20, 270, 68, 23);
	frmPerceptron.getContentPane().add(btnA);

	JButton btnB = new JButton("B");
	btnB.setBounds(92, 270, 68, 23);
	frmPerceptron.getContentPane().add(btnB);

	JButton btnC = new JButton("C");
	btnC.setBounds(20, 296, 68, 23);
	frmPerceptron.getContentPane().add(btnC);

	JButton btnD = new JButton("D");
	btnD.setBounds(92, 296, 68, 23);
	frmPerceptron.getContentPane().add(btnD);

	wMatrix = new WeightMatriz(LINHAS, COLUNAS);
	wMatrix.setBounds(182, 55, 280, 180);
	frmPerceptron.getContentPane().add(wMatrix);

	txSaida = new RNField("resultado do neurônio");
	txSaida.setEditable(false);
	txSaida.setBounds(678, 134, 50, 20);
	frmPerceptron.getContentPane().add(txSaida);
	txSaida.setColumns(10);

	JLabel lbEntrada = new JLabel("Entradas");
	lbEntrada.setFont(new Font("Tahoma", Font.BOLD, 11));
	lbEntrada.setHorizontalAlignment(SwingConstants.CENTER);
	lbEntrada.setBounds(20, 33, 140, 20);
	frmPerceptron.getContentPane().add(lbEntrada);

	JLabel lbPesos = new JLabel("Pesos");
	lbPesos.setFont(new Font("Tahoma", Font.BOLD, 11));
	lbPesos.setHorizontalAlignment(SwingConstants.CENTER);
	lbPesos.setBounds(182, 33, 280, 20);
	frmPerceptron.getContentPane().add(lbPesos);

	JLabel lbSaida = new JLabel("Y (Sa\u00EDda)");
	lbSaida.setHorizontalAlignment(SwingConstants.CENTER);
	lbSaida.setFont(new Font("Tahoma", Font.BOLD, 11));
	lbSaida.setBounds(660, 109, 70, 20);
	frmPerceptron.getContentPane().add(lbSaida);

	JLabel lbTeta = new JLabel("\u0398");
	lbTeta.setHorizontalAlignment(SwingConstants.CENTER);
	lbTeta.setFont(new Font("Tahoma", Font.BOLD, 13));
	lbTeta.setBounds(552, 192, 21, 20);
	frmPerceptron.getContentPane().add(lbTeta);

	txLimiar = new RNField("limiar");
	txLimiar.setColumns(10);
	txLimiar.setBounds(562, 215, 50, 20);
	txLimiar.setText("0");
	frmPerceptron.getContentPane().add(txLimiar);

	JLabel lbBias = new JLabel("Bias");
	lbBias.setHorizontalAlignment(SwingConstants.CENTER);
	lbBias.setFont(new Font("Tahoma", Font.BOLD, 11));
	lbBias.setBounds(472, 33, 50, 20);
	frmPerceptron.getContentPane().add(lbBias);

	txBias = new RNField("Bias");
	txBias.setColumns(10);
	txBias.setBounds(472, 55, 50, 20);
	txBias.setText("0");
	frmPerceptron.getContentPane().add(txBias);

	JLabel lbLimiar = new JLabel("(limiar)");
	lbLimiar.setHorizontalAlignment(SwingConstants.CENTER);
	lbLimiar.setFont(new Font("Tahoma", Font.BOLD, 11));
	lbLimiar.setBounds(569, 192, 50, 20);
	frmPerceptron.getContentPane().add(lbLimiar);

	JLabel lbIfxAtivo = new JLabel("Se y\u2113 \u2265 \u0398");
	lbIfxAtivo.setHorizontalAlignment(SwingConstants.LEFT);
	lbIfxAtivo.setBounds(733, 203, 69, 20);
	frmPerceptron.getContentPane().add(lbIfxAtivo);

	txVlrAtivo = new RNField("que repsenta o valor da saída caso a somatória atinga o limiar");
	txVlrAtivo.setEditable(false);
	txVlrAtivo.setText("1");
	txVlrAtivo.setHorizontalAlignment(SwingConstants.RIGHT);
	txVlrAtivo.setColumns(10);
	txVlrAtivo.setBounds(697, 203, 29, 20);
	frmPerceptron.getContentPane().add(txVlrAtivo);

	txVlrInativo = new RNField("que repsenta o valor da saída caso a somatória NÃO atinga o limiar");
	txVlrInativo.setEditable(false);
	txVlrInativo.setText("-1");
	txVlrInativo.setHorizontalAlignment(SwingConstants.RIGHT);
	txVlrInativo.setColumns(10);
	txVlrInativo.setBounds(697, 234, 29, 20);
	frmPerceptron.getContentPane().add(txVlrInativo);

	JLabel lbIfxInativo = new JLabel("Se y\u2113 < \u0398");
	lbIfxInativo.setHorizontalAlignment(SwingConstants.LEFT);
	lbIfxInativo.setBounds(733, 234, 69, 20);
	frmPerceptron.getContentPane().add(lbIfxInativo);

	JLabel lbFyL = new JLabel("\u0192(y\u2113)");
	lbFyL.setHorizontalAlignment(SwingConstants.RIGHT);
	lbFyL.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lbFyL.setBounds(649, 217, 35, 20);
	frmPerceptron.getContentPane().add(lbFyL);

	JLabel lbChave = new JLabel(ImgMgr.get("chaveFuncaoDegrau.gif"));
	lbChave.setHorizontalAlignment(SwingConstants.CENTER);
	lbChave.setBounds(679, 178, 29, 96);
	frmPerceptron.getContentPane().add(lbChave);

	JLabel bground = new JLabel(ImgMgr.get("neuronio.gif"));
	bground.setBounds(455, 55, 226, 180);
	frmPerceptron.getContentPane().add(bground);

	JButton btnTreinar = new JButton("Treinar");
	btnTreinar.setBounds(182, 331, 280, 23);
	frmPerceptron.getContentPane().add(btnTreinar);

	JButton btnSaida = new JButton("Calcular sa\u00EDda");
	btnSaida.setBounds(738, 133, 150, 23);
	frmPerceptron.getContentPane().add(btnSaida);

	lbQtdEpocas = new JLabel("");
	lbQtdEpocas.setFont(new Font("Tahoma", Font.PLAIN, 11));
	lbQtdEpocas.setHorizontalAlignment(SwingConstants.CENTER);
	lbQtdEpocas.setBounds(10, 2, 858, 20);
	frmPerceptron.getContentPane().add(lbQtdEpocas);

	JLabel lbTabelaVerdade = new JLabel("Tabela Verdade");
	lbTabelaVerdade.setHorizontalAlignment(SwingConstants.CENTER);
	lbTabelaVerdade.setFont(new Font("Tahoma", Font.BOLD, 11));
	lbTabelaVerdade.setBounds(182, 246, 105, 20);
	frmPerceptron.getContentPane().add(lbTabelaVerdade);

	JLabel lbAmostras = new JLabel("Amostras");
	lbAmostras.setHorizontalAlignment(SwingConstants.CENTER);
	lbAmostras.setFont(new Font("Tahoma", Font.BOLD, 11));
	lbAmostras.setBounds(20, 246, 140, 20);
	frmPerceptron.getContentPane().add(lbAmostras);

	xMatrix = new CharMatrix(LINHAS, COLUNAS);
	xMatrix.setBounds(20, 55, 140, 180);

	frmPerceptron.getContentPane().add(xMatrix);

	txVa = new RNField("valor de 'A' na tabela verdade");
	txVa.setText("1");
	txVa.setColumns(10);
	txVa.setBounds(182, 272, 50, 20);
	frmPerceptron.getContentPane().add(txVa);

	txVb = new RNField("valor de 'B' na tabela verdade");
	txVb.setText("-1");
	txVb.setColumns(10);
	txVb.setBounds(238, 272, 50, 20);
	frmPerceptron.getContentPane().add(txVb);

	txVc = new RNField("valor de 'C' na tabela verdade");
	txVc.setText("-1");
	txVc.setColumns(10);
	txVc.setBounds(182, 297, 50, 20);
	frmPerceptron.getContentPane().add(txVc);

	txVd = new RNField("valor de 'D' na tabela verdade");
	txVd.setText("-1");
	txVd.setColumns(10);
	txVd.setBounds(238, 297, 50, 20);
	frmPerceptron.getContentPane().add(txVd);

	JLabel lbAlfa = new JLabel("\u0251");
	lbAlfa.setHorizontalAlignment(SwingConstants.RIGHT);
	lbAlfa.setFont(new Font("Tahoma", Font.PLAIN, 14));
	lbAlfa.setBounds(295, 271, 84, 20);
	frmPerceptron.getContentPane().add(lbAlfa);

	txAlfa = new RNField("Alfa");
	txAlfa.setText("0.01");
	txAlfa.setColumns(10);
	txAlfa.setBounds(389, 271, 73, 20);
	frmPerceptron.getContentPane().add(txAlfa);
	
	JLabel lblMaxpocas = new JLabel("Max. \u00E9pocas");
	lblMaxpocas.setHorizontalAlignment(SwingConstants.RIGHT);
	lblMaxpocas.setFont(new Font("Tahoma", Font.BOLD, 11));
	lblMaxpocas.setBounds(294, 296, 84, 20);
	frmPerceptron.getContentPane().add(lblMaxpocas);
	
	txMaxEpoca = new RNField("quantidade máxima de épocas");
	txMaxEpoca.setText("999");
	txMaxEpoca.setColumns(10);
	txMaxEpoca.setBounds(389, 297, 73, 20);
	frmPerceptron.getContentPane().add(txMaxEpoca);

	btnA.addActionListener(new ActionListener() {

	    public void actionPerformed(ActionEvent arg0) {
		xMatrix.fill(MatrixConstants.A);
	    }

	});

	btnB.addActionListener(new ActionListener() {

	    public void actionPerformed(ActionEvent arg0) {
		xMatrix.fill(MatrixConstants.B);
	    }

	});

	btnC.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		xMatrix.fill(MatrixConstants.C);
	    }
	});

	btnD.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		xMatrix.fill(MatrixConstants.D);
	    }
	});

	btnTreinar.addActionListener(new ActionListener() {

	    public void actionPerformed(ActionEvent arg0) {
		inicializaTreino();
	    }
	});

	btnSaida.addActionListener(new ActionListener() {

	    public void actionPerformed(ActionEvent arg0) {
		try {
		    txSaida.setText(String.valueOf(saida(xMatrix.getValue(), wMatrix.getValues(), txBias.value(), txLimiar.value())));
		} catch (Exception e) {
		    e.printStackTrace();
		    String msg = e.getMessage();

		    if (msg == null) {
			msg = "Ocorreu alguma falha não prevista no cáculo da saída.\nVerifique se todos os campos estão devidamente preenchidos.";
		    }

		    JOptionPane.showMessageDialog(frmPerceptron, msg, "Erro no cálculo da saída!", JOptionPane.ERROR_MESSAGE);
		}
	    }
	});

    }

    private void inicializaTreino() {
	frmPerceptron.setCursor(new Cursor(Cursor.WAIT_CURSOR));
	try {
	    int[] target = new int[]{txVa.intValue(), txVb.intValue(), txVc.intValue(), txVd.intValue() };
	    
	    //(int[] target, int bias, int limiar, double alfa, int maxEpoca) {
	    PerceptionTrainer trainer = new PerceptionTrainer(target, txBias.value(), txLimiar.value(), txAlfa.value(), txMaxEpoca.intValue() );

	    if (trainer.treinar()) {
		lbQtdEpocas.setText("O último treinamento gastou " + trainer.getEpoca() + " épocas.");

	    } else {
		StringBuilder err = new StringBuilder();
		err.append("O treino durante ").append(trainer.getMaxEpoca()).append(" não encontrou pesos adequados talves a taxa de aprendizado esteja inadequada ou o problema não é linearmente separável.");

		JOptionPane.showMessageDialog(frmPerceptron, err.toString(), "Treino falhou!", JOptionPane.ERROR_MESSAGE);
	    }

	    double[][] pesos = trainer.getPesos();
	    RNField[][] pesosFields = wMatrix.getCampos();

	    for (int i = 0; i < pesos.length; i++) {
		for (int j = 0; j < pesos[i].length; j++) {
		    pesosFields[i][j].setValue(pesos[i][j]);
		}
	    }

	    txBias.setValue(trainer.getBias());
	    txLimiar.setValue(trainer.getLimiar());
	    
	}catch(Exception e){
	    JOptionPane.showMessageDialog(frmPerceptron, e.getLocalizedMessage(), "Não foi possível iniciar o treinamento da rede", JOptionPane.ERROR_MESSAGE);
	} finally {
	    frmPerceptron.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}

    }

    public static int saida(int entrada[][], double[][] pesos, double bias, double limiar) {
	double yL = 0;

	for (int i = 0; i < entrada.length; i++) {
	    for (int j = 0; j < entrada[i].length; j++) {
		yL += entrada[i][j] * pesos[i][j];
	    }
	}

	yL += bias;

	if (yL >= limiar) {
	    return 1;
	} else {
	    return -1;
	}
    }
}
