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
public class RequiredFieldValidator implements Validator {

    private String fieldValue;

    @Override
    public boolean isValid() {
        boolean testResult = false;

        if (fieldValue != null && fieldValue.length() > 0) {
            testResult = true;
        }
        return testResult;
    }

    @Override
    public void setTestValue(String value) {
        this.fieldValue = value;

    }

}
