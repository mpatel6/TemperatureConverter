/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature.converter.service;

import temperature.converter.strategy.TemperatureConverterStrategy;

/**
 *
 * @author Ankita
 */
public class TemperatureConverterService {
    
    private String inputTemperature;    
    private TemperatureConverterStrategy temperatureConversion;

    public TemperatureConverterService(TemperatureConverterStrategy temperatureConversion, String inputTemperature) {
        this.setInputTemperature(inputTemperature);
        this.temperatureConversion = temperatureConversion;
    }

    public String getInputTemperature() {
        return inputTemperature;
    }

    public void setInputTemperature(String inputTemperature) {
        this.inputTemperature = inputTemperature;
    }

   
    
    
    
    
    public String getConvertedTemperature( ){
        return temperatureConversion.getConvertedTemperature(inputTemperature);
    }
    
}
