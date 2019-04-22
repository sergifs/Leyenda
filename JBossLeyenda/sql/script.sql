DROP database IF EXISTS LEYENDA;
create DATABASE LEYENDA;
drop user if exists 'admin'@'localhost';
create USER 'admin'@'localhost' IDENTIFIED BY 'admin';
grant all privileges on LEYENDA.* TO 'admin'@'localhost';
FLUSH PRIVILEGES;
USE LEYENDA;
CREATE TABLE CABALLEROS (
	NOMBRE_CABALLERO VARCHAR(50) NOT NULL, PRIMARY KEY(NOMBRE_CABALLERO),
    PUNTOS_VIDA INT(10) ,
    PUNTOS_DEFENSA INT(10),
    NOMBRE_DRAGON_ENFRENTADO VARCHAR(50)
    );
CREATE TABLE ESPADAS (
	NOMBRE_ESPADA VARCHAR(50) NOT NULL, PRIMARY KEY(NOMBRE_ESPADA),
    PUNTOS_ATAQUE INT(10)
    );
CREATE TABLE CABALLEROS_ESPADAS ( 
	NOMBRE_ESPADA VARCHAR(50),
    NOMBRE_CABALLERO VARCHAR(50),
    ATAQUE_CABALLERO_ESPADA INT(10)
    );
CREATE TABLE ROSAS_CONJUROS (
	NOMBRE_ROSA VARCHAR(50) NOT NULL, PRIMARY KEY(NOMBRE_ROSA),
    CANTIDAD_CONJUROS INT(10)
    );
CREATE TABLE DRAGONES_PRINCESAS (
	NOMBRE_DRAGON VARCHAR(50) NOT NULL, PRIMARY KEY(NOMBRE_DRAGON),
    PUNTOS_VIDA INT(10),
    PUNTOS_ARMADURA INT(10),
    PUNTOS_ATAQUE INT(10),
	NOMBRE_PRINCESA VARCHAR(50),
    COLOR_MAGIA VARCHAR(50),
    NUMEROS_CONJUROS INT(10),
    NOMBRE_ROSA VARCHAR(50)
    );
 #ALTER TABLE PATEIX ADD CONSTRAINT fk_PATEIX_nomMalaltia FOREIGN KEY (nomMalaltia) REFERENCES MALALTIAMEDICACIO(nomMalaltia) ON DELETE CASCADE;   
ALTER TABLE DRAGONES_PRINCESAS ADD CONSTRAINT fk_drgpr_NOMBRE_ROSA FOREIGN KEY (NOMBRE_ROSA) REFERENCES ROSAS_CONJUROS(NOMBRE_ROSA);
ALTER TABLE CABALLEROS ADD CONSTRAINT fk_caballeros_NOMBRE_DRAGON_ENFRENTADO FOREIGN KEY(NOMBRE_DRAGON_ENFRENTADO) REFERENCES DRAGONES_PRINCESAS(NOMBRE_DRAGON);
ALTER TABLE CABALLEROS_ESPADAS ADD CONSTRAINT fk_cabaespada_NOMBRE_CABALLERO FOREIGN KEY(NOMBRE_CABALLERO) REFERENCES CABALLEROS(NOMBRE_CABALLERO),
							   ADD CONSTRAINT fk_cabaespada_nombre_espada FOREIGN KEY(NOMBRE_ESPADA) REFERENCES ESPADAS(NOMBRE_ESPADA);

INSERT INTO ROSAS_CONJUROS VALUES("Espina Afilada",10);
INSERT INTO ROSAS_CONJUROS VALUES("Gota de Sangre",200);

INSERT INTO DRAGONES_PRINCESAS VALUES("Fuego Infernal",400,60,30,"Soja","Roja",13,"Espina Afilada");
INSERT INTO DRAGONES_PRINCESAS VALUES("Avalon",2000,200,80,"Morgana","Negra",50,"Gota de Sangre");

INSERT INTO CABALLEROS VALUES("Sant Jordi",40,60,"Avalon");
INSERT INTO CABALLEROS VALUES("Roland",30,50,"Fuego Infernal");
INSERT INTO CABALLEROS VALUES("Arturo",80,95,"Avalon");

INSERT INTO ESPADAS VALUES("Poesía",100);
INSERT INTO ESPADAS VALUES("Tajo",300);
INSERT INTO ESPADAS VALUES("Excalibur",1000);

INSERT INTO CABALLEROS_ESPADAS VALUES("Poesía","Sant Jordi",75);
INSERT INTO CABALLEROS_ESPADAS VALUES("Excalibur","Arturo",100);
INSERT INTO CABALLEROS_ESPADAS VALUES("Tajo","Roland",20);
INSERT INTO CABALLEROS_ESPADAS VALUES("Poesía","Roland",50);


  