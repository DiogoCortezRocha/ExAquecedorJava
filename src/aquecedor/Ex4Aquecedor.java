/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aquecedor;

/**
 *
 * @author diogo
 */
public class Ex4Aquecedor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Aquecedor1 aquecedor1 = new Aquecedor1(10, 30);
        System.out.println(aquecedor1.getMaxTemperature());
        System.out.println(aquecedor1.getMinTemperature());
        aquecedor1.setRegulacao(-5);
        aquecedor1.aquecer();
        System.out.println(aquecedor1.getTemperatura());
        //aquecedor1.setRegulacao(10);
        //aquecedor1.arrefecer();
        //System.out.println(aquecedor1.getTemperatura());

    }

}
