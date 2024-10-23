/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.adapterplug;

/**
 *
 * @author rafaelamoreira
 */
public class AdapterPlugEuropeu implements PlugAmericano {

    private final PlugEuropeu plugEuropeu;

    public AdapterPlugEuropeu(PlugEuropeu plugEuropeu) {
        this.plugEuropeu = plugEuropeu;
    }

    @Override
    public void conectarNaTomadaAmericana() {
        System.out.println("Usando adaptador para conectar o plug europeu na tomada americana.");
        plugEuropeu.conectarNaTomadaEuropeia();
    }
}
