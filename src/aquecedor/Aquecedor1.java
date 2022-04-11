/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aquecedor;

/**
 *
 * @author diogo
 */
public class Aquecedor1 {

    private int temperatura;
    private int minTemperature = 0;
    private int maxTemperature = 0;
    private int regulacao;

    /**
     *
     * @param minTemperature
     * @param maxTemperature
     * @see construtor
     */
    public Aquecedor1(int minTemperature, int maxTemperature) {
        this.temperatura = 15;
        this.maxTemperature = maxTemperature;
        this.minTemperature = minTemperature;
        this.regulacao = 3;
    }

    /**
     *
     * @return int
     *
     */
    public int getMinTemperature() {
        return minTemperature;
    }

    /**
     *
     * @return int
     */
    public int getMaxTemperature() {
        return maxTemperature;
    }

    /**
     *
     * @return int
     */
    public int getRegulacao() {
        return regulacao;
    }

    /**
     *
     * @return int
     */
    public int getTemperatura() {
        return temperatura;
    }

    /**
     *
     * @param regulacao
     */
    public void setRegulacao(int regulacao) {
        if (regulacao>0) {
            this.regulacao = regulacao;

        }
    }

    /**
     * @see <b>This Method is used for increase temperature until it reach the
     * maximum</b>
     */
    public void aquecer() {
        while (temperatura < maxTemperature) {
            System.out.println(temperatura);
            temperatura = temperatura + regulacao;
        }
    }

    /**
     * @see this Method is used for decrease temperature until it reach the
     * minimum
     */
    public void arrefecer() {

        while (temperatura > minTemperature) {
            System.out.println(temperatura);
            temperatura = temperatura - regulacao;
        }

    }

   

}
