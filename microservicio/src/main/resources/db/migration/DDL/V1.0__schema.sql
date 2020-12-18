CREATE TABLE producto (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(100) NOT NULL,
  tipo_producto enum('BLUSA','FALDA','VESTIDO') NOT NULL,
  cantidad INT NOT NULL,
  precio DECIMAL(9) NOT NULL,
  PRIMARY KEY (id));