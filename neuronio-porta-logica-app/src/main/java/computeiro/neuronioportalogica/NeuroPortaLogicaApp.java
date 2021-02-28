package computeiro.neuronioportalogica;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import computeiro.neuronioportalogica.resources.ImgMgr;

public class NeuroPortaLogicaApp {

	private JFrame frame;
	private RNField txX1;
	private RNField txW1;

	private RNField txX2;
	private RNField txW2;

	private RNField txBias;
	private RNField txY;
	private RNField txLimiar;

	private RNField txTabX11;
	private RNField txTabX21;
	private RNField txTabX31;
	private RNField txTabX41;

	private RNField txTabX12;
	private RNField txTabX22;
	private RNField txTabX32;
	private RNField txTabX42;

	private RNField txTabR1;
	private RNField txTabR2;
	private RNField txTabR3;
	private RNField txTabR4;

	private RNField txVlrAtivo;
	private RNField txVlrInativo;

	private JLabel lbIfxAtivo;
	private JLabel label;
	private JLabel lblFx;
	private JLabel lbHeaderTabX;
	private JLabel lblX;
	private JLabel lblResultado;
	private JLabel lblIf;

	private JButton btnPreencherPesos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NeuroPortaLogicaApp window = new NeuroPortaLogicaApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
		 * Create the application.
		 */
		public NeuroPortaLogicaApp() {
			initialize();
		}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		KeyAdapter onlyNumberKeyAdapter = new OnlyNumberKeyAdapter();

		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 530, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnCalcularSada = new JButton("Calcular Sa\u00EDda");
		btnCalcularSada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					txY.setText(String.valueOf(ativacao(mult(txX1, txW1) + mult(txX2, txW2) + toInt(txBias))));

				} catch (RNFillException fe) {
					JOptionPane.showMessageDialog(frame, fe.getMessage(), "Campo com valor inv�lido!",
							JOptionPane.WARNING_MESSAGE);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(frame, "Por favor verifique os valores informados",
							"Valores inv�lidos", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnCalcularSada.setBounds(344, 159, 150, 23);
		frame.getContentPane().add(btnCalcularSada);

		txY = new RNField("Resultado do Neur�nio");
		txY.setHorizontalAlignment(SwingConstants.RIGHT);
		txY.setColumns(10);
		txY.setBounds(376, 193, 51, 20);
		txY.addKeyListener(onlyNumberKeyAdapter);
		frame.getContentPane().add(txY);

		txX1 = new RNField("X1");
		txX1.setHorizontalAlignment(SwingConstants.RIGHT);
		txX1.setBounds(10, 136, 51, 20);
		txX1.setColumns(10);
		txX1.addKeyListener(onlyNumberKeyAdapter);
		frame.getContentPane().add(txX1);

		txW2 = new RNField("W2");
		txW2.setHorizontalAlignment(SwingConstants.RIGHT);
		txW2.setColumns(10);
		txW2.setBounds(83, 250, 51, 20);
		txW2.addKeyListener(onlyNumberKeyAdapter);
		frame.getContentPane().add(txW2);

		txBias = new RNField("bias");
		txBias.setHorizontalAlignment(SwingConstants.RIGHT);
		txBias.setColumns(10);
		txBias.setBounds(226, 84, 51, 20);
		txBias.addKeyListener(onlyNumberKeyAdapter);
		frame.getContentPane().add(txBias);

		txW1 = new RNField("W1");
		txW1.setHorizontalAlignment(SwingConstants.RIGHT);
		txW1.setColumns(10);
		txW1.setBounds(83, 136, 51, 20);
		txW1.addKeyListener(onlyNumberKeyAdapter);
		frame.getContentPane().add(txW1);

		txX2 = new RNField("X2");
		txX2.setHorizontalAlignment(SwingConstants.RIGHT);
		txX2.setColumns(10);
		txX2.setBounds(10, 250, 51, 20);
		txX2.addKeyListener(onlyNumberKeyAdapter);
		frame.getContentPane().add(txX2);

		txLimiar = new RNField("Limiar");
		txLimiar.setHorizontalAlignment(SwingConstants.RIGHT);
		txLimiar.setColumns(10);
		txLimiar.setBounds(313, 241, 51, 20);
		txLimiar.setText("0");
		txLimiar.addKeyListener(onlyNumberKeyAdapter);
		frame.getContentPane().add(txLimiar);

		JLabel lbX1 = new JLabel("x1");
		lbX1.setHorizontalAlignment(SwingConstants.CENTER);
		lbX1.setBounds(10, 118, 51, 14);
		frame.getContentPane().add(lbX1);

		JLabel lbW1 = new JLabel("w1");
		lbW1.setHorizontalAlignment(SwingConstants.CENTER);
		lbW1.setBounds(83, 118, 51, 14);
		frame.getContentPane().add(lbW1);

		JLabel lbX2 = new JLabel("x2");
		lbX2.setHorizontalAlignment(SwingConstants.CENTER);
		lbX2.setBounds(10, 232, 51, 14);
		frame.getContentPane().add(lbX2);

		JLabel lbW2 = new JLabel("w1");
		lbW2.setHorizontalAlignment(SwingConstants.CENTER);
		lbW2.setBounds(83, 232, 51, 14);
		frame.getContentPane().add(lbW2);

		JLabel lbBias = new JLabel("bias");
		lbBias.setHorizontalAlignment(SwingConstants.CENTER);
		lbBias.setBounds(226, 70, 51, 14);
		frame.getContentPane().add(lbBias);

		lblFx = new JLabel("f(\u2206x)");
		lblFx.setHorizontalAlignment(SwingConstants.CENTER);
		lblFx.setBounds(313, 77, 51, 14);
		frame.getContentPane().add(lblFx);

		JLabel lblCalcularPesosAtraves = new JLabel("Redes Neurais Artificias - Neur\u00F4nio");
		lblCalcularPesosAtraves.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCalcularPesosAtraves.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalcularPesosAtraves.setBounds(10, 11, 471, 14);
		frame.getContentPane().add(lblCalcularPesosAtraves);

		JLabel lblClculoDosPesos = new JLabel("C\u00E1lculo dos pesos atrav\u00E9s da tabela verdade");
		lblClculoDosPesos.setHorizontalAlignment(SwingConstants.CENTER);
		lblClculoDosPesos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblClculoDosPesos.setBounds(10, 308, 471, 14);
		frame.getContentPane().add(lblClculoDosPesos);

		lbHeaderTabX = new JLabel("x1");
		lbHeaderTabX.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbHeaderTabX.setHorizontalAlignment(SwingConstants.CENTER);
		lbHeaderTabX.setBounds(30, 333, 51, 14);
		frame.getContentPane().add(lbHeaderTabX);

		txTabX11 = new RNField("x11 da tabela verdade");
		txTabX11.setText("-1");
		txTabX11.setEditable(false);
		txTabX11.setHorizontalAlignment(SwingConstants.RIGHT);
		txTabX11.setColumns(10);
		txTabX11.setBounds(30, 351, 51, 20);
		txTabX11.addKeyListener(onlyNumberKeyAdapter);
		frame.getContentPane().add(txTabX11);

		lblX = new JLabel("x2");
		lblX.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(103, 333, 51, 14);
		frame.getContentPane().add(lblX);

		txTabX12 = new RNField("x12 da tabela verdade");
		txTabX12.setText("-1");
		txTabX12.setEditable(false);
		txTabX12.setHorizontalAlignment(SwingConstants.RIGHT);
		txTabX12.setColumns(10);
		txTabX12.setBounds(103, 351, 51, 20);
		txTabX12.addKeyListener(onlyNumberKeyAdapter);
		frame.getContentPane().add(txTabX12);

		lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(176, 333, 74, 14);
		frame.getContentPane().add(lblResultado);

		txTabR1 = new RNField("resultado 1 da tabela verdade");
		txTabR1.setHorizontalAlignment(SwingConstants.RIGHT);
		txTabR1.setColumns(10);
		txTabR1.setBounds(187, 351, 51, 20);
		txTabR1.addKeyListener(onlyNumberKeyAdapter);
		frame.getContentPane().add(txTabR1);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 292, 471, 5);
		frame.getContentPane().add(separator);

		btnPreencherPesos = new JButton("Treinar rede");
		btnPreencherPesos.setBounds(266, 388, 138, 23);
		btnPreencherPesos.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				try {

					int[][] tab = new int[][] { { toInt(txTabX11), toInt(txTabX12), toInt(txTabR1) },
							{ toInt(txTabX21), toInt(txTabX22), toInt(txTabR2) },
							{ toInt(txTabX31), toInt(txTabX32), toInt(txTabR3) },
							{ toInt(txTabX41), toInt(txTabX42), toInt(txTabR4) }, };

					int w1 = 0;
					int w2 = 0;
					int bias = 0;

					for (int linha = 0; linha < tab.length; linha++) {
						w1 = w1 + tab[linha][0] * tab[linha][2];
						w2 = w2 + tab[linha][1] * tab[linha][2];
						bias = bias + tab[linha][2];
					}

					txW1.setText(String.valueOf(w1));
					txW2.setText(String.valueOf(w2));
					txBias.setText(String.valueOf(bias));

				} catch (RNFillException fe) {
					JOptionPane.showMessageDialog(frame, fe.getMessage(), "Campo com valor inválido!",
							JOptionPane.WARNING_MESSAGE);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(frame, "Por favor verifique os valores informados",
							"Valores inválidos", JOptionPane.WARNING_MESSAGE);
				}

			}
		});

		frame.getContentPane().add(btnPreencherPesos);

		txTabX21 = new RNField("x21 da tabela verdade");
		txTabX21.setText("-1");
		txTabX21.setHorizontalAlignment(SwingConstants.RIGHT);
		txTabX21.setEditable(false);
		txTabX21.setColumns(10);
		txTabX21.setBounds(30, 376, 51, 20);
		txTabX21.addKeyListener(onlyNumberKeyAdapter);
		frame.getContentPane().add(txTabX21);

		txTabX22 = new RNField("x22 da tabela verdade");
		txTabX22.setText("1");
		txTabX22.setHorizontalAlignment(SwingConstants.RIGHT);
		txTabX22.setEditable(false);
		txTabX22.setColumns(10);
		txTabX22.setBounds(103, 376, 51, 20);
		txTabX22.addKeyListener(onlyNumberKeyAdapter);
		frame.getContentPane().add(txTabX22);

		txTabR2 = new RNField("Resultado 2 da tabela verdade");
		txTabR2.setHorizontalAlignment(SwingConstants.RIGHT);
		txTabR2.setColumns(10);
		txTabR2.setBounds(187, 376, 51, 20);
		txTabR2.addKeyListener(onlyNumberKeyAdapter);
		frame.getContentPane().add(txTabR2);

		txTabX31 = new RNField("x31 da tabela verdade");
		txTabX31.setText("1");
		txTabX31.setHorizontalAlignment(SwingConstants.RIGHT);
		txTabX31.setEditable(false);
		txTabX31.setColumns(10);
		txTabX31.setBounds(30, 401, 51, 20);
		txTabX31.addKeyListener(onlyNumberKeyAdapter);
		frame.getContentPane().add(txTabX31);

		txTabX32 = new RNField("x32 da tabela verdade");
		;
		txTabX32.setText("-1");
		txTabX32.setHorizontalAlignment(SwingConstants.RIGHT);
		txTabX32.setEditable(false);
		txTabX32.setColumns(10);
		txTabX32.setBounds(103, 401, 51, 20);
		txTabX32.addKeyListener(onlyNumberKeyAdapter);
		frame.getContentPane().add(txTabX32);

		txTabR3 = new RNField("Resultado 3 da tabela verdade");
		;
		txTabR3.setHorizontalAlignment(SwingConstants.RIGHT);
		txTabR3.setColumns(10);
		txTabR3.setBounds(187, 401, 51, 20);
		txTabR3.addKeyListener(onlyNumberKeyAdapter);
		frame.getContentPane().add(txTabR3);

		txTabX41 = new RNField("x41 da tabela verdade");
		txTabX41.setText("1");
		txTabX41.setHorizontalAlignment(SwingConstants.RIGHT);
		txTabX41.setEditable(false);
		txTabX41.setColumns(10);
		txTabX41.setBounds(30, 426, 51, 20);
		txTabX41.addKeyListener(onlyNumberKeyAdapter);
		frame.getContentPane().add(txTabX41);

		txTabX42 = new RNField("x42 da tabela verdade");
		txTabX42.setText("1");
		txTabX42.setHorizontalAlignment(SwingConstants.RIGHT);
		txTabX42.setEditable(false);
		txTabX42.setColumns(10);
		txTabX42.setBounds(103, 426, 51, 20);
		txTabX42.addKeyListener(onlyNumberKeyAdapter);
		frame.getContentPane().add(txTabX42);

		txTabR4 = new RNField("Resultado 4 da tabela verdade");
		txTabR4.setHorizontalAlignment(SwingConstants.RIGHT);
		txTabR4.setColumns(10);
		txTabR4.setBounds(187, 426, 51, 20);
		txTabR4.addKeyListener(onlyNumberKeyAdapter);
		frame.getContentPane().add(txTabR4);

		lbIfxAtivo = new JLabel("Se \u2206x \u2265 \u0398");
		lbIfxAtivo.setHorizontalAlignment(SwingConstants.CENTER);
		lbIfxAtivo.setBounds(386, 64, 69, 20);
		frame.getContentPane().add(lbIfxAtivo);

		txVlrAtivo = new RNField("que repsenta o valor da sa�da caso a somat�ria atinga o limiar");
		txVlrAtivo.setText("1");
		txVlrAtivo.setHorizontalAlignment(SwingConstants.RIGHT);
		txVlrAtivo.setColumns(10);
		txVlrAtivo.setBounds(361, 64, 29, 20);
		txVlrAtivo.addKeyListener(onlyNumberKeyAdapter);
		frame.getContentPane().add(txVlrAtivo);

		txVlrInativo = new RNField("que repsenta o valor da sa�da caso a somat�ria N�O atinga o limiar");
		txVlrInativo.setText("-1");
		txVlrInativo.setHorizontalAlignment(SwingConstants.RIGHT);
		txVlrInativo.setColumns(10);
		txVlrInativo.setBounds(361, 90, 29, 20);
		txVlrInativo.addKeyListener(onlyNumberKeyAdapter);
		frame.getContentPane().add(txVlrInativo);

		lblIf = new JLabel("Se \u2206x < \u0398");
		lblIf.setHorizontalAlignment(SwingConstants.CENTER);
		lblIf.setBounds(386, 90, 69, 20);
		frame.getContentPane().add(lblIf);

		label = new JLabel(ImgMgr.get("chaveFuncaoDegrau.gif"));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(344, 36, 29, 96);
		frame.getContentPane().add(label);

		JLabel lbBackGround = new JLabel(ImgMgr.get("neuronio.gif"));
		lbBackGround.setBounds(126, 93, 258, 189);
		frame.getContentPane().add(lbBackGround);
	}

	private static class OnlyNumberKeyAdapter extends KeyAdapter {

		@Override
		public void keyTyped(KeyEvent e) {
			char c = e.getKeyChar();

			if (c == '-') {
				JTextField tx = (JTextField) e.getSource();

				int carret = tx.getCaretPosition();

				if ((tx.getText() != null && tx.getText().contains("-")) || carret > 0) {
					e.consume();
				}

			} else if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
				e.consume();
			}

		}
	}

	private static int toInt(RNField tx) throws RNFillException {
		try {
			return Integer.parseInt(tx.getText());
		} catch (Exception e) {
			RNFillException fe = new RNFillException("Por favor verifique o campo " + tx.getDescription() + "!");
			throw fe;
		}
	}

	private static int mult(RNField tx1, RNField tx2) throws RNFillException {
		return toInt(tx1) * toInt(tx2);
	}

	private int ativacao(int somatoria) throws RNFillException {
		if (somatoria >= toInt(txLimiar)) {
			return toInt(txVlrAtivo);
		}

		return toInt(txVlrInativo);
	}

	private static class RNFillException extends Exception {
		private static final long serialVersionUID = -4640840736320866268L;

		RNFillException(String s) {
			super(s);
		}
	}

	private static class RNField extends JTextField {
		private static final long serialVersionUID = -8727800126500230065L;
		
		private String description;

		RNField(String description) {
			super();
			this.description = description;
		}

		public String getDescription() {
			return description;
		}
	}
}
