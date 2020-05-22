/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project01.lucumapi.main;
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.PinState;
/**
 *
 * @author inori
 */
public class ControllerGpio {
   public void ControllerGpioExample() throws InterruptedException{
       System.out.println("<--Pi4J--> GPIO Control Example ...started.");
       final GpioController gpio = GpioFactory.getInstance();
       
       final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01,"MyLed",PinState.HIGH);
       
       pin.setShutdownOptions(true, PinState.LOW);
       
       System.out.println("--> GPIO state should be: ON");
       Thread.sleep(5000);
       pin.low();
       System.out.println("--> GPIO state should be: OFF");
       pin.toggle();
       System.out.println("--> GPIO state should be: ON");
       Thread.sleep(5000);
       
       System.out.println("--> GPIO state should be: ON for only 1 second");
       pin.pulse(1000, true);
       
       gpio.shutdown();
       System.out.println("Exiting ControlGpioExample");
   } 
}
