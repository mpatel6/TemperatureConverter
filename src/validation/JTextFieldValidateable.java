/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;


import javax.swing.JTextField;

/**
 *
 * @author Ankita
 */
public class JTextFieldValidateable extends JTextField implements Validateable {
    
    private Validator validator;
    private String errMsg;

    public JTextFieldValidateable() {
    }
    
    

    @Override
    public void setValidator(Validator v) {
        this.validator = v;
        
    }

    @Override
    public Validator getValidator() {
        return validator;
        
    }

    @Override
    public void setErrorMsg(String msg) {
        this.errMsg = msg;
    }

    @Override
    public String getErrorMsg() {
        return errMsg;
        
    }
    
}
