-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.4.28-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              12.5.0.6677
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Copiando estrutura do banco de dados para jogo_da_forca
CREATE DATABASE IF NOT EXISTS `jogo_da_forca` /*!40100 DEFAULT CHARACTER SET armscii8 COLLATE armscii8_bin */;
USE `jogo_da_forca`;

-- Copiando estrutura para tabela jogo_da_forca.administrador
CREATE TABLE IF NOT EXISTS `administrador` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `administrador_ibfk_1` FOREIGN KEY (`id`) REFERENCES `usuario` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

-- Copiando dados para a tabela jogo_da_forca.administrador: ~0 rows (aproximadamente)
INSERT INTO `administrador` (`id`, `nome`) VALUES
	(1, 'Bruno');

-- Copiando estrutura para tabela jogo_da_forca.jogador
CREATE TABLE IF NOT EXISTS `jogador` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `pontuacao` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `jogador_ibfk_1` FOREIGN KEY (`id`) REFERENCES `usuario` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

-- Copiando dados para a tabela jogo_da_forca.jogador: ~0 rows (aproximadamente)
INSERT INTO `jogador` (`id`, `nome`, `pontuacao`) VALUES
	(1, 'Bruno', 0);

-- Copiando estrutura para tabela jogo_da_forca.palavras
CREATE TABLE IF NOT EXISTS `palavras` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `palavra` varchar(255) DEFAULT NULL,
  `dificuldade` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

-- Copiando dados para a tabela jogo_da_forca.palavras: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela jogo_da_forca.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(50) NOT NULL,
  `SENHA` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

-- Copiando dados para a tabela jogo_da_forca.usuario: ~0 rows (aproximadamente)
INSERT INTO `usuario` (`ID`, `NOME`, `SENHA`) VALUES
	(1, 'Bruno', 123);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
