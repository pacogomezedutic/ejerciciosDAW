import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;


public class EjemploJComboBox extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjemploJComboBox frame = new EjemploJComboBox();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EjemploJComboBox() {
		
		//CReando ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Creando ComboBox para almacenar Equipos
		JComboBox<Equipo> comboBox = new JComboBox<Equipo>();
		comboBox.setBounds(10, 23, 414, 20);
		//Como añadir equipos
		comboBox.addItem(new Equipo("vlc",0,0,0,0));
		comboBox.addItem(new Equipo("bcn",0,0,0,0));
		contentPane.add(comboBox);
		
		//Como saber que equipo se ha seleccionado
		Equipo elegido=(Equipo) comboBox.getItemAt(1);
		
		//Como cambiar el nombre del equipo
		System.out.println(elegido.getNombre());
		elegido.setNombre("bcn2");

	}

}
