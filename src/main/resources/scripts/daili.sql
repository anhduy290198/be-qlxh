CREATE
DATABASE  IF NOT EXISTS `quanlybanhang`;
USE
`quanlybanhang`;

DROP TABLE IF EXISTS `daili`;
CREATE TABLE `daili`
(
    `idDL`   int(11) NOT NULL AUTO_INCREMENT,
    `tenDL`  varchar(45)  DEFAULT NULL,
    `sdt`    varchar(45)  DEFAULT NULL,
    `diaChi` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`idDL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;