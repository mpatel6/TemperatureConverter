/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature.converter.service;

import javax.swing.UIManager;
import temperature.converter.Gui.MainWindow;
import temperature.converter.strategy.CelsiusToFarenheitStrategy;
import temperature.converter.strategy.FarenheitToCelsiusStrategy;
import temperature.converter.strategy.TemperatureConverterStrategy;

/**
 *
 * @author Ankita
 */
public class StartUp {

    public static void main(String[] args) {

        try {

            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {

        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });

    }

}
