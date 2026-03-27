package temperaturas;

import javax.swing.*;
import java.awt.event.*;

public class AppTemperaturaEmpresa extends JFrame {

    private JTextField txtCelsius;
    private JTextField txtFahrenheit;
    private JTextField txtKelvin;
    private JButton btnCalcular;

    public AppTemperaturaEmpresa() {

        setTitle("Sistema de Conversión de Temperatura - Empresa");
        setSize(400, 250);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel lblCelsius = new JLabel("Temperatura en Celsius:");
        lblCelsius.setBounds(20, 20, 200, 25);
        add(lblCelsius);

        txtCelsius = new JTextField();
        txtCelsius.setBounds(200, 20, 150, 25);
        add(txtCelsius);

        JLabel lblFahrenheit = new JLabel("Fahrenheit:");
        lblFahrenheit.setBounds(20, 70, 200, 25);
        add(lblFahrenheit);

        txtFahrenheit = new JTextField();
        txtFahrenheit.setBounds(200, 70, 150, 25);
        txtFahrenheit.setEditable(false);
        add(txtFahrenheit);

        JLabel lblKelvin = new JLabel("Kelvin:");
        lblKelvin.setBounds(20, 110, 200, 25);
        add(lblKelvin);

        txtKelvin = new JTextField();
        txtKelvin.setBounds(200, 110, 150, 25);
        txtKelvin.setEditable(false);
        add(txtKelvin);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 160, 120, 30);
        add(btnCalcular);

                btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularTemperaturas();
            }
        });
    }

    private void calcularTemperaturas() {

        try {

            double celsius = Double.parseDouble(txtCelsius.getText());

            double fahrenheit = ConversorTemperatura.celsiusAFahrenheit(celsius);
            double kelvin = ConversorTemperatura.celsiusAKelvin(celsius);

            txtFahrenheit.setText(String.valueOf(fahrenheit));
            txtKelvin.setText(String.valueOf(kelvin));

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(this, "Error en los datos introducidos");

        }
    }

    public static void main(String[] args) {
        new AppTemperaturaEmpresa().setVisible(true);
    }
}