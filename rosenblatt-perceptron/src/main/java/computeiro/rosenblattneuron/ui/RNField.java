package computeiro.rosenblattneuron.ui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class RNField extends JTextField {
    private String description;

    public RNField(String description) {
	super();
	this.description = description;
	addKeyListener(new OnlyNumberKeyAdapter());
	setHorizontalAlignment(SwingConstants.RIGHT);
    }

    public String getDescription() {
	return description;
    }

    public double value() throws RNFieldException {
	try {
	    return Double.parseDouble(getText().replaceAll(",", "."));
	} catch (Exception e) {
	    throw new RNFieldException("Por favor, preencha corretamente o campo " + description);
	}

    }
    
    public int intValue() throws RNFieldException {
	try {
	    return Double.valueOf(getText().replaceAll(",", ".")).intValue();
	} catch (Exception e) {
	    throw new RNFieldException("Por favor, preencha corretamente o campo " + description);
	}
	
    }
    
    
    
    public void setValue(double value){
	setText(String.valueOf(value));
    }
    
    public static class RNFieldException extends IllegalStateException {
	private static final long serialVersionUID = 1L;

	public RNFieldException(String msg) {
	    super(msg);
	}
    }

    private static class OnlyNumberKeyAdapter extends KeyAdapter {

	@Override
	public void keyTyped(KeyEvent e) {
	    char c = e.getKeyChar();

	    if (c == ',') {
		JTextField tx = (JTextField) e.getSource();

		int carret = tx.getCaretPosition();

		if ((tx.getText() != null && tx.getText().contains(",")) || carret == 0) {
		    e.consume();
		}
	    } else if (c == '-') {
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

}
