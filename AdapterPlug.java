/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ex01.adapterplug;

/**
 *
 * @author rafaelamoreira
 */
public class AdapterPlug {

    public static void main(String[] args) {
        
        PlugEuropeu plugEuropeu = new PlugEuropeu();

        // Adaptador que permite conectar o plug europeu na tomada americana
        PlugAmericano adaptador = new AdapterPlugEuropeu(plugEuropeu);

        // Tomada americana que só aceita plugs americanos ou adaptados
        TomadaAmericana tomadaAmericana = new TomadaAmericana();

        // Conectar o plug europeu usando o adaptador
        tomadaAmericana.conectarPlug(adaptador);
    }
}
