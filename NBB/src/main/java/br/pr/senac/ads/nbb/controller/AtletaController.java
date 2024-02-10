/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.pr.senac.ads.nbb.controller;

import br.pr.senac.ads.nbb.dao.AtletaDAO;
import br.pr.senac.ads.nbb.model.Atleta;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author gustavo.8965
 */
public class AtletaController {
    
    private String Codigo;
    private String nome;
    private String altura;
    private String dataNascimento;
    private String peso;
    private String time;
    private String posicaoTime;
    private String envergadura;
    private String classificacaoNBB;

    private Date formatarData(String data) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return new Date(formatter.parse(data).getTime());
    }
    
    public void salvar(
            String nome,
            String altura,
            String dataNascimento,
            String peso,
            String time,
            String posicaoTime,
            String envergadura,
            String classificacaoNBB)
            throws SQLException, ParseException {
        Atleta atleta = new Atleta();
        atleta.setNome(nome);
        atleta.setAltura(Double.parseDouble(altura));
        atleta.setDataNascimento(formatarData(dataNascimento));
        atleta.setPeso((Double.parseDouble(peso)));
        atleta.setTime(time);
        atleta.setPosicaoTime(posicaoTime);
        atleta.setEnvergadura((Double.parseDouble(envergadura)));
        atleta.setClassificacaoNBB((Integer.parseInt(classificacaoNBB)));
        new AtletaDAO().salvar(atleta);
    }
    
    public void atualizar(
            String codigo,
            String nome,
            String altura,
            String dataNascimento,
            String peso,
            String time,
            String posicaoTime,
            String envergadura,
            String classificacaoNBB)
            throws SQLException, ParseException {
        Atleta atleta = new Atleta();
        atleta.setCodigo(Integer.parseInt(codigo));
        atleta.setNome(nome);
        atleta.setAltura(Double.parseDouble(altura));
        atleta.setDataNascimento(formatarData(dataNascimento));
        atleta.setPeso((Double.parseDouble(peso)));
        atleta.setTime(time);
        atleta.setPosicaoTime(posicaoTime);
        atleta.setEnvergadura((Double.parseDouble(envergadura)));
        atleta.setClassificacaoNBB((Integer.parseInt(classificacaoNBB)));
        new AtletaDAO().atualizar(atleta);
    }
    
    public void deletar(
            String codigo,
            String nome,
            String altura,
            String dataNascimento,
            String peso,
            String time,
            String posicaoTime,
            String envergadura,
            String classificacaoNBB)
            throws SQLException, ParseException {
        Atleta atleta = new Atleta();
        atleta.setCodigo(Integer.parseInt(codigo));
        atleta.setNome(nome);
        atleta.setAltura(Double.parseDouble(altura));
        atleta.setDataNascimento(formatarData(dataNascimento));
        atleta.setPeso((Double.parseDouble(peso)));
        atleta.setTime(time);
        atleta.setPosicaoTime(posicaoTime);
        atleta.setEnvergadura((Double.parseDouble(envergadura)));
        atleta.setClassificacaoNBB((Integer.parseInt(classificacaoNBB)));
        new AtletaDAO().deletar(atleta);
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
    public String getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(String altura) {
        this.altura = altura;
    }

    /**
     * @return the dataNascimento
     */
    public String getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the peso
     */
    public String getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(String peso) {
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
    public String getEnvergadura() {
        return envergadura;
    }

    /**
     * @param envergadura the envergadura to set
     */
    public void setEnvergadura(String envergadura) {
        this.envergadura = envergadura;
    }

    /**
     * @return the classificacaoNBB
     */
    public String getClassificacaoNBB() {
        return classificacaoNBB;
    }

    /**
     * @param classificacaoNBB the classificacaoNBB to set
     */
    public void setClassificacaoNBB(String classificacaoNBB) {
        this.classificacaoNBB = classificacaoNBB;
    }

    /**
     * @return the Codigo
     */
    public String getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigo the Codigo to set
     */
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    
    
    
}
