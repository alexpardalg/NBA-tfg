SET NAMES utf8;
DROP DATABASE Nba;
CREATE DATABASE IF NOT EXISTS Nba;
    
USE Nba;

CREATE TABLE IF NOT EXISTS conferencia (
nombre				VARCHAR (20),
PRIMARY KEY (nombre)
);

CREATE TABLE IF NOT EXISTS equipo (
nombre		        VARCHAR (40),
nombre_conferencia  VARCHAR (20),
PRIMARY KEY (nombre),
FOREIGN KEY (nombre_conferencia) References conferencia(nombre)
);

CREATE TABLE IF NOT EXISTS jugador (
id					INT AUTO_INCREMENT,
nombre				VARCHAR (20) NOT NULL,
apellidos		    VARCHAR (40) NOT NULL,
posicion            VARCHAR (20) NOT NULL,
nombre_equipo		VARCHAR (20) NOT NULL,
conferencia		    VARCHAR (20) NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (nombre_equipo) References equipo(nombre)
);


CREATE TABLE IF NOT EXISTS equipo_usuario (
nombre		        VARCHAR (40),
PRIMARY KEY (nombre)
);

CREATE TABLE IF NOT EXISTS jugador_equipo_usuario (
id_jugador INT,
nombre_equipo VARCHAR (40),
PRIMARY KEY (id_jugador, nombre_equipo),
FOREIGN KEY (id_jugador) References jugador(id),
FOREIGN KEY (nombre_equipo) References equipo_usuario(nombre)

);