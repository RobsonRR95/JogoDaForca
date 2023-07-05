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

-- Copiando estrutura para tabela jogo_da_forca.palavra
CREATE TABLE IF NOT EXISTS `palavra` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `palavra` varchar(255) DEFAULT NULL,
  `dificuldade` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=449 DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

-- Copiando dados para a tabela jogo_da_forca.palavra: ~148 rows (aproximadamente)
INSERT INTO `palavra` (`id`, `palavra`, `dificuldade`) VALUES
	(301, 'ABACAXI', 'Facil'),
	(302, 'AMOR', 'Facil'),
	(303, 'BICICLETA', 'Medio'),
	(304, 'CACHORRO', 'Facil'),
	(305, 'DENTE', 'Facil'),
	(306, 'ESCADA', 'Medio'),
	(307, 'FELICIDADE', 'Medio'),
	(308, 'GATO', 'Facil'),
	(309, 'HOTEL', 'Facil'),
	(310, 'INVERNO', 'Medio'),
	(311, 'JANELA', 'Facil'),
	(312, 'LIVRO', 'Facil'),
	(313, 'MACA', 'Facil'),
	(314, 'NOITE', 'Facil'),
	(315, 'OURO', 'Facil'),
	(316, 'PATO', 'Facil'),
	(317, 'QUEIJO', 'Facil'),
	(318, 'RATO', 'Facil'),
	(319, 'SOL', 'Facil'),
	(320, 'TIGRE', 'Facil'),
	(321, 'UVA', 'Facil'),
	(322, 'VENTO', 'Facil'),
	(323, 'XADREZ', 'Medio'),
	(324, 'ZEBRA', 'Facil'),
	(325, 'AVIAO', 'Facil'),
	(326, 'BORBOLETA', 'Facil'),
	(327, 'CAMA', 'Facil'),
	(328, 'DANCA', 'Facil'),
	(329, 'ELEFANTE', 'Facil'),
	(330, 'FOGO', 'Facil'),
	(331, 'GIRAFA', 'Facil'),
	(332, 'HIPOPOTAMO', 'Medio'),
	(333, 'IGREJA', 'Facil'),
	(334, 'JACARE', 'Facil'),
	(335, 'KIWI', 'Facil'),
	(336, 'LEAO', 'Facil'),
	(337, 'MONTANHA', 'Medio'),
	(338, 'NAVIO', 'Facil'),
	(339, 'OCULOS', 'Facil'),
	(340, 'PAO', 'Facil'),
	(341, 'QUARTO', 'Facil'),
	(342, 'RUA', 'Facil'),
	(343, 'SAPO', 'Facil'),
	(344, 'TESOURO', 'Medio'),
	(345, 'UNICORNIO', 'Medio'),
	(346, 'VELA', 'Facil'),
	(347, 'XICARA', 'Facil'),
	(348, 'ZUMBIDO', 'Facil'),
	(349, 'ARVORE', 'Facil'),
	(350, 'BOLA', 'Facil'),
	(351, 'CADEIRA', 'Facil'),
	(352, 'DRAGAO', 'Medio'),
	(353, 'ESCOLA', 'Facil'),
	(354, 'FADA', 'Facil'),
	(355, 'GELO', 'Facil'),
	(356, 'HORA', 'Facil'),
	(357, 'ILHA', 'Facil'),
	(358, 'JARDIM', 'Facil'),
	(359, 'LOBO', 'Facil'),
	(360, 'MUSICA', 'Facil'),
	(361, 'NUVEM', 'Facil'),
	(362, 'ONDA', 'Facil'),
	(363, 'PINCEL', 'Facil'),
	(364, 'QUEIMADURA', 'Medio'),
	(365, 'RELOGIO', 'Facil'),
	(366, 'SEMENTE', 'Facil'),
	(367, 'TATUAGEM', 'Facil'),
	(368, 'URSO', 'Facil'),
	(369, 'VIOLAO', 'Facil'),
	(370, 'XALE', 'Facil'),
	(371, 'ZOOLOGICO', 'Medio'),
	(372, 'ABRACO', 'Facil'),
	(373, 'BEBIDA', 'Facil'),
	(374, 'CACHECOL', 'Facil'),
	(375, 'DIAMANTE', 'Facil'),
	(376, 'ESTRELA', 'Facil'),
	(377, 'FUTEBOL', 'Facil'),
	(378, 'GAVETA', 'Facil'),
	(379, 'HELICOPTERO', 'Medio'),
	(380, 'INJECAO', 'Medio'),
	(381, 'JORNAL', 'Facil'),
	(382, 'LAGRIMA', 'Facil'),
	(383, 'MOCHILA', 'Facil'),
	(384, 'NUVEM', 'Facil'),
	(385, 'OCEANO', 'Facil'),
	(386, 'PISCINA', 'Facil'),
	(387, 'QUADRO', 'Facil'),
	(388, 'REDE', 'Facil'),
	(389, 'SORRISO', 'Facil'),
	(390, 'TARTARUGA', 'Facil'),
	(391, 'UNIVERSO', 'Medio'),
	(392, 'VASSOURA', 'Facil'),
	(393, 'XICARA', 'Facil'),
	(394, 'YOGA', 'Facil'),
	(395, 'ZIPER', 'Facil'),
	(396, 'ABACATE', 'Facil'),
	(397, 'BALAO', 'Facil'),
	(398, 'CAMISA', 'Facil'),
	(399, 'DINHEIRO', 'Facil'),
	(400, 'ELETRICIDADE', 'Medio'),
	(401, 'ACRIMONIA', 'Dificil'),
	(402, 'BIZANTINO', 'Dificil'),
	(403, 'CIRCUNSPECCAO', 'Dificil'),
	(404, 'DESIDRATAR', 'Dificil'),
	(405, 'EFIGIE', 'Dificil'),
	(406, 'FORTUITO', 'Dificil'),
	(407, 'GARGULA', 'Dificil'),
	(408, 'HIATO', 'Dificil'),
	(409, 'INCUMBENCIA', 'Dificil'),
	(410, 'JARGAO', 'Dificil'),
	(411, 'LUDIBRIAR', 'Dificil'),
	(412, 'MAGNANIMO', 'Dificil'),
	(413, 'NENIA', 'Dificil'),
	(414, 'OBSTINADO', 'Dificil'),
	(415, 'PACIENCIA', 'Dificil'),
	(416, 'QUOTIDIANO', 'Dificil'),
	(417, 'RAZAO', 'Dificil'),
	(418, 'SARCOFAGO', 'Dificil'),
	(419, 'TEMPERO', 'Dificil'),
	(420, 'UMBELIFERA', 'Dificil'),
	(421, 'VISCERAL', 'Dificil'),
	(422, 'WENIA', 'Dificil'),
	(423, 'XADREZISTA', 'Dificil'),
	(424, 'ZOMBARIA', 'Dificil'),
	(425, 'AMBITO', 'Dificil'),
	(426, 'BONUS', 'Dificil'),
	(427, 'CATAFALCO', 'Dificil'),
	(428, 'DISSERTACAO', 'Dificil'),
	(429, 'EFICACIA', 'Dificil'),
	(430, 'FALACIA', 'Dificil'),
	(431, 'GENTILEZA', 'Dificil'),
	(432, 'HIPOTETICO', 'Dificil'),
	(433, 'INTIMO', 'Dificil'),
	(434, 'JACENTE', 'Dificil'),
	(435, 'LABIRINTICO', 'Dificil'),
	(436, 'MAXIMA', 'Dificil'),
	(437, 'NUCLEO', 'Dificil'),
	(438, 'OBSTRUCAO', 'Dificil'),
	(439, 'PAVIMENTO', 'Dificil'),
	(440, 'QUIMERA', 'Dificil'),
	(441, 'RAQUITICO', 'Dificil'),
	(442, 'SINTAXE', 'Dificil'),
	(443, 'TUNEL', 'Dificil'),
	(444, 'UTILITARIO', 'Dificil'),
	(445, 'VICIO', 'Dificil'),
	(446, 'WATIO', 'Dificil'),
	(447, 'XAROPE', 'Dificil'),
	(448, 'ZANGAO', 'Dificil');

-- Copiando estrutura para procedure jogo_da_forca.somarPontuacao
DELIMITER //
CREATE PROCEDURE `somarPontuacao`(IN nomeParam VARCHAR(255), IN pontuacaoNova INT)
BEGIN
    UPDATE usuario SET pontuacao = pontuacao + pontuacaoNova WHERE nome = nomeParam;
END//
DELIMITER ;

-- Copiando estrutura para tabela jogo_da_forca.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(50) NOT NULL,
  `SENHA` varchar(50) NOT NULL DEFAULT '',
  `TIPO` int(11) NOT NULL,
  `PONTUACAO` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

-- Copiando dados para a tabela jogo_da_forca.usuario: ~56 rows (aproximadamente)
INSERT INTO `usuario` (`ID`, `NOME`, `SENHA`, `TIPO`, `PONTUACAO`) VALUES
	(1, 'bruno', '123', 1, 25),
	(2, 'robson', '1234', 2, 0),
	(3, 'joao', '789', 1, 0),
	(4, '', '', 2, 0),
	(5, 'karen', 'karen', 2, 0),
	(6, 'fernando', '123', 2, 0),
	(7, 'joaosilva', '', 2, 0),
	(8, 'mariasilva', '', 2, 0),
	(9, 'pedroalmeida', '', 2, 0),
	(10, 'anacosta', '', 2, 0),
	(11, 'luizpereira', '', 2, 0),
	(12, 'fernandaoliveira', '', 2, 0),
	(13, 'andresouza', '', 2, 0),
	(14, 'carolinarodrigues', '', 2, 0),
	(15, 'ricardoferreira', '', 2, 0),
	(16, 'marianabarbosa', '', 2, 0),
	(17, 'alexandrecardoso', '', 2, 0),
	(18, 'julianagomes', '', 2, 0),
	(19, 'gabrielsantos', '', 2, 0),
	(20, 'lauramendes', '', 2, 0),
	(21, 'brunolima', '', 2, 0),
	(22, 'camilacastro', '', 2, 0),
	(23, 'thiagorocha', '', 2, 0),
	(24, 'patriciafernandes', '', 2, 0),
	(25, 'rafaeltorres', '', 2, 0),
	(26, 'isabelanunes', '', 2, 0),
	(27, 'carlosmello', '', 2, 0),
	(28, 'vanessacarvalho', '', 2, 0),
	(29, 'lucasmartins', '', 2, 0),
	(30, 'renataoliveira', '', 2, 0),
	(31, 'diegorocha', '', 2, 0),
	(32, 'leticiacosta', '', 2, 0),
	(33, 'marceloramos', '', 2, 0),
	(34, 'beatrizalves', '', 2, 0),
	(35, 'guilhermecarvalho', '', 2, 0),
	(36, 'amandapereira', '', 2, 0),
	(37, 'andreiarodrigues', '', 2, 0),
	(38, 'leandroferreira', '', 2, 0),
	(39, 'larissamendonca', '', 2, 0),
	(40, 'felipealmeida', '', 2, 0),
	(41, 'vivianasantos', '', 2, 0),
	(42, 'gustavocosta', '', 2, 0),
	(43, 'sandramelo', '', 2, 0),
	(44, 'paulosilveira', '', 2, 0),
	(45, 'isabellasilva', '', 2, 0),
	(46, 'viniciusrocha', '', 2, 0),
	(47, 'anapereira', '', 2, 0),
	(48, 'matheusoliveira', '', 2, 0),
	(49, 'gabrielarodrigues', '', 2, 0),
	(50, 'lucianacarvalho', '', 2, 0),
	(51, 'rafaelmendes', '', 2, 0),
	(52, 'fernandomelo', '', 2, 0),
	(53, 'elisabarbosa', '', 2, 0),
	(54, 'ricardorodrigues', '', 2, 0),
	(55, 'jessicasouza', '', 2, 0),
	(56, 'caioferreira', '', 2, 13);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
palavrapalavrapalavrapalavrapalavra