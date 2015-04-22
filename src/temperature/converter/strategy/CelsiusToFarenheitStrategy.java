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
public class CelsiusToFarenheitStrategy implements TemperatureConverterStrategy {

    private double farenheitTemp;

    public CelsiusToFarenheitStrategy() {
    }

    public double getFarenheitTemp() {
        return farenheitTemp;
    }

    public void setFarenheitTemp(double farenheitTemp) {
        this.farenheitTemp = farenheitTemp;
    }

    @Override
    public String getConvertedTemperature(String inputTemperature) {

        farenheitTemp = ((9 / 5.0) * (Double.parseDouble(inputTemperature))) + 32;
        return Double.toString(farenheitTemp);
    }

}
