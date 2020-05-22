package com.project01.lucumapi.main;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        final ControllerGpio gpio = new ControllerGpio();
        gpio.ControllerGpioExample();
        System.out.println("Project is running");
        
    }
}
