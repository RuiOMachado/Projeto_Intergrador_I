/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.com.apoio;

/**
 *
 * @author Douglas
 */
public class ArduinoProtocolo {
    private String tipoDado;
    private String botao;
    private String led;
    private String leituraComando;
    private String luminosidade;
    private String potenciometro;
    
    private void interpretaComando(){
        //separa a string de comando em substring
        String aux []  = leituraComando.split(";");
        if(aux.length == 6){
        tipoDado       = aux[0];
        botao          = aux[1];
        led            = aux[2];
        leituraComando = aux[3];
        luminosidade   = aux[4];
        potenciometro  = aux[5];
        }
    }

    public String getTipoDado() {
        return tipoDado;
    }

    public void setTipoDado(String tipoDado) {
        this.tipoDado = tipoDado;
    }

    public String getBotao() {
        return botao;
    }

    public void setBotao(String botao) {
        this.botao = botao;
    }

    public String getLed() {
        return led;
    }

    public void setLed(String led) {
        this.led = led;
    }

    public String getLeituraComando() {
        return leituraComando;
    }

    public void setLeituraComando(String leituraComando) {
        this.leituraComando = leituraComando;//string dos dados
        interpretaComando();//interpreta string
    }

    public String getLuminosidade() {
        return luminosidade;
    }

    public void setLuminosidade(String luminosidade) {
        this.luminosidade = luminosidade;
    }

    public String getPotenciometro() {
        return potenciometro;
    }

    public void setPotenciometro(String potenciometro) {
        this.potenciometro = potenciometro;
    }
}
