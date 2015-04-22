/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

/**
 *
 * @author Ankita
 */
public interface Validateable {
    
    public void setValidator(Validator v);
    public Validator getValidator();
    public abstract void setErrorMsg(String msg);
    public abstract String getErrorMsg();
    
}
