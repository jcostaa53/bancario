/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bancario.negocio;

import br.com.bancario.entidade.ContaCorrente;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author silvio.junior
 */
public class ContaNegocio {

    public void salvarCorrentista(ContaCorrente conta) {
        String senha = gerarSenha();
        conta.setSenha(senha);
        conta.setNumero(gerarNumeroConta());
    }

    private String gerarNumeroConta() {
        String numeroAleatorio = "";
        int numero;
        for (int i = 0; i < 5; i++) {
            numero = (int) (Math.random() * 10);
//            numeroAleatorio = numeroAleatorio + numero;
            numeroAleatorio += numero;
        }
        return numeroAleatorio;
    }

    private String gerarSenha() {
        String[] letras = {"a", "b",
            "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
            "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H",
            "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int tamanho = letras.length;
        String senha = "";
        int indice;
        for (int i = 0; i < 4; i++) {
            indice = (int) (Math.random() * tamanho);
            senha = senha + letras[indice];
        }
        return senha;
    }

    public void depositar(ContaCorrente conta, double dep) {
        conta.setSaldo(conta.getSaldo() + dep);
        String linhaExtrato = "\n" + gerarDataHoraAtual() + " Deposito " + dep;
        conta.setExtrato(conta.getExtrato() + linhaExtrato);
    }

    public void sacar2(ContaCorrente conta, double saque) {
        if (saque <= conta.getSaldo()) {
            conta.setSaldo(conta.getSaldo() - saque);
            String linhaExtrato = "\n" + gerarDataHoraAtual() + " Saque " + saque;
            conta.setExtrato(conta.getExtrato() + linhaExtrato);
        }else{
            JOptionPane.showMessageDialog(null, "Saldo Insuficiênte!!"); 
        }
    }
    
    private String gerarDataHoraAtual(){
        LocalDateTime dataAtual = LocalDateTime.now();
        DateTimeFormatter conversorData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return conversorData.format(dataAtual);
    }

}
