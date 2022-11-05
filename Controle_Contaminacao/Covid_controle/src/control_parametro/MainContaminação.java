package control_parametro;
import java.awt.Dimension;
import javax.swing.JFrame;

public class MainContaminação {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// controles controle = new controles(horas, contaminacão inicial, constante de proporcionalidade);
		/*  ---------------  COMO UTILIZAR -------------------
		 *  controles controle = new controles(horas, contaminacão inicial, constante de proporcionalidade);
		 */
		Controles controle = new Controles(1, 2, 1);
		JFrame frame = new Tela(3, 2, 2);
	    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   	frame.setSize(new Dimension(400, 400));
	    	frame.setVisible(true);
	}

}
