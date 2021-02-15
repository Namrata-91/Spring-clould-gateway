DROP TABLE IF EXISTS product;
CREATE TABLE product (
  id int NOT NULL AUTO_INCREMENT  PRIMARY KEY,
  name varchar(45) DEFAULT NULL,
  details varchar(45) DEFAULT NULL,
  amount double DEFAULT NULL,
);