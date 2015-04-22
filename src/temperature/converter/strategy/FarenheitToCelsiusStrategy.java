/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature.converter.strategy;

/**
 *
 * @author Ankita
 */
public class FarenheitToCelsiusStrategy implements TemperatureConverterStrategy {

    private double celsiusTemp;

    public FarenheitToCelsiusStrategy() {
    }
    
    

    public double getFarenheitTemp() {
        return celsiusTemp;
    }

    public void setFarenheitTemp(double farenheitTemp) {
        this.celsiusTemp = farenheitTemp;
    }

    @Override
    public String getConvertedTemperature(String inputTemperature) {

        celsiusTemp = ((Double.parseDouble(inputTemperature)) - 32) * (5 / 9.0);

        return Double.toString(celsiusTemp);
    }

}
