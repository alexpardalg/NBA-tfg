SET NAMES utf8;
DROP DATABASE Nba;
CREATE DATABASE IF NOT EXISTS Nba;
    
USE Library;

CREATE TABLE IF NOT EXISTS jugador (
nombre				VARCHAR (20) PRIMARY KEY,
apellido		        VARCHAR (40) NOT NULL,
numero				INT NOT NULL,
equipo		        VARCHAR (20) NOT NULL,
conferencia		        VARCHAR (20) NOT NULL
);

CREATE TABLE IF NOT EXISTS equipo (
nombre		        VARCHAR (20) PRIMARY KEY,
ciudad		        VARCHAR (20) NOT NULL,
conferencia		        VARCHAR (20) NOT NULL,

);

CREATE TABLE IF NOT EXISTS conferencia (
nombre				VARCHAR (20) PRIMARY KEY,
"name		        VARCHAR (40) NOT NULL"
);
