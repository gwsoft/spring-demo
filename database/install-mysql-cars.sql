-- Grzegorz Wieczerzak
-- 08.08.2022

-- DROP TABLE `spring`.`car`;

CREATE TABLE `spring`.`car` (
  `id` int NOT NULL AUTO_INCREMENT,
  `style` varchar(20) DEFAULT NULL,
  `make` varchar(45) NOT NULL,
  `model` varchar(100) DEFAULT NULL,
  `color` varchar(45) DEFAULT NULL,
  `mileage` int DEFAULT NULL,
  `condition` varchar(20) DEFAULT NULL,
  `production_year` int DEFAULT NULL,
  `price` decimal(9,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `spring`.`car` (`style`, `make`, `model`, `color`, `mileage`, `condition`, `production_year`, `price`) VALUES ('Sedan', 'Subaru', 'Impreza', 'blue', '70000', 'used', '2013', '36600');
INSERT INTO `spring`.`car` (`style`, `make`, `model`, `color`, `mileage`, `condition`, `production_year`, `price`) VALUES ('Van/Minivan', 'Toyota', 'Corolla', 'black', '283029', 'used', '2004', '15500');
