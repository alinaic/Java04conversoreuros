import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/* ejercicio:
 * crear un nuevo proyecto de JAVA para crear un conversor de euros a dolares
 */

public class PrincipalJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame ventana = new JFrame();
		JPanel panel = new JPanel();
		JLabel texto = new JLabel(
				"Introduce la cantidad de dolares a transformar");
		final JTextField entradaDolares = new JTextField(15);
		JButton botonConvertir = new JButton("Convertir a euros");

		// vamos a decir que es lo que queremos que haga el boton

		botonConvertir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// lo que queramos que haga el boton lo pondremos en este metodo

				System.out.println("boton pulsado");
				System.out.println("dolares insertados:"
						+ entradaDolares.getText());

				double dolares = Double.parseDouble(entradaDolares.getText());
				double euros = dolares * 0.81090;
				JOptionPane.showMessageDialog(null, "Euros: " + euros);
			}

		});
		panel.add(texto);
		panel.add(entradaDolares);
		panel.add(botonConvertir);

		ventana.add(panel);

		ventana.setSize(400, 200);
		ventana.setLocation(100, 100);
		ventana.setVisible(true);

	}
}
