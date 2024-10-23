/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.adapterplug;

/**
 *
 * @author rafaelamoreira
 */
public class TomadaAmericana {

    public void conectarPlug(PlugAmericano plug) {
        plug.conectarNaTomadaAmericana();
        System.out.println("Plug conectado na tomada americana.");
    }
}
