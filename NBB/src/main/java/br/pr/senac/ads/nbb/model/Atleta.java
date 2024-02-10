/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.pr.senac.ads.nbb.model;

import java.util.Date;

/**
 *
 * @author gustavo.8965
 */
public class Atleta {
    
    private int Codigo;
    private String nome;
    private double altura;
    private Date dataNascimento;
    private double peso;
    private String time;
    private String posicaoTime;
    private double envergadura;
    private int classificacaoNBB;

    public Atleta() {};

    /**
     * @return the Codigo
     */
    public int getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigo the Codigo to set
     */
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the posicaoTime
     */
    public String getPosicaoTime() {
        return posicaoTime;
    }

    /**
     * @param posicaoTime the posicaoTime to set
     */
    public void setPosicaoTime(String posicaoTime) {
        this.posicaoTime = posicaoTime;
    }

    /**
     * @return the envergadura
     */
    public double getEnvergadura() {
        return envergadura;
    }

    /**
     * @param envergadura the envergadura to set
     */
    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }

    /**
     * @return the classificacaoNBB
     */
    public int getClassificacaoNBB() {
        return classificacaoNBB;
    }

    /**
     * @param classificacaoNBB the classificacaoNBB to set
     */
    public void setClassificacaoNBB(int classificacaoNBB) {
        this.classificacaoNBB = classificacaoNBB;
    }
    
}
