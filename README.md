## Athlete Registration And Visualization Project
 
Projeto desenvolvido como prova do Segundo semestre na faculdade de ADS, no qual podemos efetuar o cadastro e também visualizar os atletas, essas informações são gravadas no Banco de Dados MySql, projeto foi desenvolvido com interface em Java Swing e utilizamos a API JDBC para efetuar a conexão com o banco.

O Banco de Dados é próprio da máquina e não está na rede, por conta disso segue o código do MySql para a criação da database e tabela.

##### Comandos MySql:
    CREATE DATABASE nbb;

    CREATE TABLE atleta (
        codigo int auto_increment,
        nome varchar(255),
        altura double,
        dataNascimento date,
        peso double,
        timeBasquete varchar(255),
        posicaoTime varchar(255),
        envergadura double,
        classificacaoNBB int,
        primary key (codigo)
    );

Obs: o código da tabela a cima foi executado no MySql Workbench 8.0 CE, no qual não foi preciso digitar ao lado das colunas o NULL ou NOT NULL.

##### Como fazer a conexão com o Banco:
    1 - Você deve acessar o arquivo ConnectionDB.java na pasta "conn".
    
    2 - Linha 17 "private static final String URL_MYSQL = "jdbc:mysql://localhost/nbb";" caso você tenha seguido passo a passo não precisará fazer qualquer tipo de  modificação, mas caso tenha alterado o nome da database, substitua o nome no qual você colocou no lugar de nbb depois de localhost.
    
    3 - Linha 19, você irá colocar o seu usuário do MySql, por padrão é root, porém caso você tenha modificado em algum momento, substitua no local pelo usuário no qual o mesmo está utilizando.
    
    4 - Linha 20, você irá colocar a senha deste usuário, mas caso você esteja utilizando o Apache, poderá deixar da seguinte forma:
    private static final String PASS = "";
    
    5 - Agora só executar o programa e utilizar.

## Tela principal do Sistema:

<div align="center">
<img src="https://github.com/gustavocarmomendes/Athlete-Registration-And-Visualization-Project/assets/112448190/7bdc6f52-482f-4a1c-8180-2ec3e4d2a9ef" width="450px" />
</div

## Tela de Cadastro:

<div align="center">
<img src="https://github.com/gustavocarmomendes/Athlete-Registration-And-Visualization-Project/assets/112448190/721da558-da87-492c-866e-b03431757f20" width="450px" />
</div

## Tela de Visualização dos Atletas:

<div align="center">
<img src="https://github.com/gustavocarmomendes/Athlete-Registration-And-Visualization-Project/assets/112448190/9898beb2-cae5-477d-af01-35e2bf4e0e65" width="550px" />
</div

#OBS: AS INFORMAÇÕES DOS ATLETAS SÓ SERÃO MOSTRADAS NA TABELA APÓS CLICAR EM PESQUISAR, POIS O MESMO IRÁ LISTAR TODOS OS ATLETAS QUE FORAM CADASTRADOS.
