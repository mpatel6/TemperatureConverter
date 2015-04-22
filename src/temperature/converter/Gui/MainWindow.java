/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature.converter.Gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import temperature.converter.service.TemperatureConverterService;
import temperature.converter.strategy.CelsiusToFarenheitStrategy;
import temperature.converter.strategy.FarenheitToCelsiusStrategy;
import temperature.converter.strategy.TemperatureConverterStrategy;
import validation.JTextFieldValidateable;
import validation.RequiredFieldValidator;
import validation.Validator;

/**
 *
 * @author Ankita
 */
public class MainWindow extends JFrame {
   // private JTextFieldValidateable txtTemperatureInput;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
       // txtTemperatureInput = new JTextFieldValidateable();
//        txtTemperatureInput.setValidator(new RequiredFieldValidator());
//        txtTemperatureInput.setErrorMsg("Enter a value for temperature");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpChoices = new javax.swing.ButtonGroup();
        lblInputTemperature = new javax.swing.JLabel();
        txtTemperatureInput = new validation.JTextFieldValidateable();
        pnlSelection = new javax.swing.JPanel();
        rbCtoF = new javax.swing.JRadioButton();
        rbFtoC = new javax.swing.JRadioButton();
        txtResult = new javax.swing.JTextField();
        lblHeader = new javax.swing.JLabel();
        btnResult = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblInputTemperature.setText("Enter Temperature");

        pnlSelection.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Enter Choice"));

        btnGrpChoices.add(rbCtoF);
        rbCtoF.setText("Celsius to Farenheit");

        btnGrpChoices.add(rbFtoC);
        rbFtoC.setText("Farenheit to Celsius");

        javax.swing.GroupLayout pnlSelectionLayout = new javax.swing.GroupLayout(pnlSelection);
        pnlSelection.setLayout(pnlSelectionLayout);
        pnlSelectionLayout.setHorizontalGroup(
            pnlSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSelectionLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(pnlSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbFtoC)
                    .addComponent(rbCtoF))
                .addGap(117, 117, 117))
        );
        pnlSelectionLayout.setVerticalGroup(
            pnlSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSelectionLayout.createSequentialGroup()
                .addComponent(rbCtoF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbFtoC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("TEMPERATURE CONVERTER");

        btnResult.setText("RESULT");
        btnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlSelection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtResult)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblInputTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTemperatureInput))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(btnResult, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblInputTemperature, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTemperatureInput, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnResult, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultActionPerformed
      
//        boolean allValid = true;
//        Validator v = txtTemperatureInput.getValidator();
//        v.setTestValue(txtTemperatureInput.getText());
//        if( !v.isValid() ) {
//				JOptionPane.showMessageDialog(null, txtTemperatureInput.getErrorMsg(), 
//						"Validation Error", JOptionPane.ERROR_MESSAGE);
//				allValid = false;
//			}
//		
//
//		if (allValid) {
//			JOptionPane.showMessageDialog(null, "Validation Succeeded", 
//					"Validation Success", JOptionPane.INFORMATION_MESSAGE);
//		}
        
        
        String inputTemperature = txtTemperatureInput.getText();
        String result = null;

        if (rbCtoF.isSelected()) {
            TemperatureConverterStrategy ftoc = new CelsiusToFarenheitStrategy();
            TemperatureConverterService temp1 = new TemperatureConverterService(ftoc, inputTemperature);
            result = temp1.getConvertedTemperature();
        } else if (rbFtoC.isSelected()) {
            TemperatureConverterStrategy ctof = new FarenheitToCelsiusStrategy();
            TemperatureConverterService temp2 = new TemperatureConverterService(ctof, inputTemperature);
            result = temp2.getConvertedTemperature();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Select atleast one choice");
        }

        txtResult.setText(result);


    }//GEN-LAST:event_btnResultActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrpChoices;
    private javax.swing.JButton btnResult;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblInputTemperature;
    private javax.swing.JPanel pnlSelection;
    private javax.swing.JRadioButton rbCtoF;
    private javax.swing.JRadioButton rbFtoC;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextField txtTemperatureInput;
    // End of variables declaration//GEN-END:variables

   
}