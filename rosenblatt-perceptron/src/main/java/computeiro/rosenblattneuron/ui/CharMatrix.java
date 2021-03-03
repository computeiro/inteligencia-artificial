package computeiro.rosenblattneuron.ui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import computeiro.rosenblattneuron.Trainer;


public class CharMatrix extends JPanel {
	private static final long serialVersionUID = 1L;
	private JPanel[][] panels;

	public CharMatrix(int linhas, int colunas) {
		super();
		this.setLayout(new GridLayout(linhas, colunas, 0, 0));

		panels = new JPanel[linhas][colunas];

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				panels[i][j] = new JPanel();
				panels[i][j].setSize(15, 15);
				panels[i][j].setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
				panels[i][j].setBackground(Color.WHITE);
				panels[i][j].addMouseListener(new MouseListener() {

					public void mouseReleased(MouseEvent arg0) {

					}

					public void mousePressed(MouseEvent arg0) {

					}

					public void mouseExited(MouseEvent arg0) {

					}

					public void mouseEntered(MouseEvent arg0) {

					}

					public void mouseClicked(MouseEvent arg0) {
						JPanel p = (JPanel) arg0.getSource();

						if (p.getBackground() == Color.BLACK) {
							p.setBackground(Color.WHITE);
						} else {
							p.setBackground(Color.BLACK);
						}
					}
				});

				this.add(panels[i][j]);
			}
		}
	}

	public void fill(int[][] values) {
		for (int i = 0; i < panels.length; i++) {
			for (int j = 0; j < panels[i].length; j++) {
				if (values[i][j] == 1) {
					panels[i][j].setBackground(Color.BLACK);
				} else {
					panels[i][j].setBackground(Color.WHITE);
				}
			}
		}
	}

	public JPanel[][] getPanels() {
		return panels;
	}

	public int[][] getValue() {

		int[][] value = new int[panels.length][panels[0].length];

		for (int i = 0; i < panels.length; i++) {
			for (int j = 0; j < panels[i].length; j++) {
				if (panels[i][j].getBackground().equals(Color.BLACK)) {
					value[i][j] = 1;
				} else {
					value[i][j] = -1;
				}
			}
		}

		return value;
	}
	
	public void printAsMatriz(){
		String BLACK_VALUE = " 1";
		String WHITE_VALUE = "-1";
		
		
		StringBuilder out = new StringBuilder();
		out.append("    public static int[][] VARIABLE = new int[][]");
		out.append("\n    {");
		
		for(int l = 0; l < panels.length; l++){
			out.append("\n    	{");
			
			for(int c = 0; c < panels[l].length; c++){
				
				if(Color.BLACK.equals(panels[l][c].getBackground()) ){
					out.append(BLACK_VALUE);
				}else{
					out.append(WHITE_VALUE);
				}
				
				if(c+1 < panels[l].length){
					out.append(", ");
				}
				
			}
			
			out.append("}");
			
			if(l+1 < panels.length){
				out.append(",");
			}
			
			
		}
		out.append("\n    };");
		
		System.out.println(out.toString());
		
	}
	
	
	public static void main(String[] args) {
    	JFrame frame = new JFrame();
		frame.setBounds(100, 100, 200, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final CharMatrix xMatrix = new CharMatrix(Trainer.LINHAS, Trainer.COLUNAS);
		xMatrix.setBounds(20, 20, 140, 180);
		frame.getContentPane().add(xMatrix);
		
		
		JButton btnPrint = new JButton("System.out this!");
		btnPrint.setBounds(20, 220, 140, 25);
		
		btnPrint.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				xMatrix.printAsMatriz();
			}
		});
		
		frame.add(btnPrint);
		frame.setVisible(true);
	}

}
