-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 22-Nov-2020 às 23:00
-- Versão do servidor: 10.1.38-MariaDB
-- versão do PHP: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `armazenagem`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `armazenagem`
--

CREATE TABLE `armazenagem` (
  `id_pedido` int(10) NOT NULL,
  `id_pessoa` int(10) NOT NULL,
  `id_formapagamento` int(10) NOT NULL,
  `id_plano` int(10) NOT NULL,
  `id_tipoarmazenagem` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `armazenagem`
--

INSERT INTO `armazenagem` (`id_pedido`, `id_pessoa`, `id_formapagamento`, `id_plano`, `id_tipoarmazenagem`) VALUES
(1, 1, 1, 1, 1),
(2, 4, 4, 7, 4);

-- --------------------------------------------------------

--
-- Estrutura da tabela `formapagamento`
--

CREATE TABLE `formapagamento` (
  `id_formapagamento` int(10) NOT NULL,
  `nome_formapagamento` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `formapagamento`
--

INSERT INTO `formapagamento` (`id_formapagamento`, `nome_formapagamento`) VALUES
(4, 'A vista');

-- --------------------------------------------------------

--
-- Estrutura da tabela `perfil`
--

CREATE TABLE `perfil` (
  `id_perfil` int(10) NOT NULL,
  `nome_perfil` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `perfil`
--

INSERT INTO `perfil` (`id_perfil`, `nome_perfil`) VALUES
(1, 'Administrador');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoa`
--

CREATE TABLE `pessoa` (
  `id_pessoa` int(10) NOT NULL,
  `nome_pessoa` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `cnpjcpf_pessoa` varchar(18) COLLATE utf8_unicode_ci NOT NULL,
  `data_inicio` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `ehfuncionario` varchar(1) COLLATE utf8_unicode_ci NOT NULL,
  `ehcliente` varchar(1) COLLATE utf8_unicode_ci NOT NULL,
  `telefone_pessoa` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `email_pessoa` varchar(40) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `pessoa`
--

INSERT INTO `pessoa` (`id_pessoa`, `nome_pessoa`, `cnpjcpf_pessoa`, `data_inicio`, `ehfuncionario`, `ehcliente`, `telefone_pessoa`, `email_pessoa`) VALUES
(4, 'Ana Paula Antunes Araujo', '15.442.121/2512-12', '11/13/1955', 'N', 'S', '(51) 26662-6266', 'teste@teste.com.br'),
(5, 'Gerson Orofino LTDA', '11.515.623/2659-56', '02/10/1956', 'N', 'S', '(47) 99112-5453', 'gerson@orofino.com.br');

-- --------------------------------------------------------

--
-- Estrutura da tabela `plano`
--

CREATE TABLE `plano` (
  `id_plano` int(10) NOT NULL,
  `nome_plano` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `plano`
--

INSERT INTO `plano` (`id_plano`, `nome_plano`) VALUES
(7, 'Mensal');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tabelapreco`
--

CREATE TABLE `tabelapreco` (
  `id_tabelapreco` int(10) NOT NULL,
  `nome_tabelapreco` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `id_plano` int(10) NOT NULL,
  `id_pessoa` int(10) NOT NULL,
  `valor_servico` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tipoarmazenagem`
--

CREATE TABLE `tipoarmazenagem` (
  `id_tipoarmazenagem` int(10) NOT NULL,
  `nome_tipoarmazenagem` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `tipoarmazenagem`
--

INSERT INTO `tipoarmazenagem` (`id_tipoarmazenagem`, `nome_tipoarmazenagem`) VALUES
(4, 'Geral'),
(5, 'Produtos esportivos');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(10) NOT NULL,
  `id_pessoa` int(10) NOT NULL,
  `id_perfil` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `id_pessoa`, `id_perfil`) VALUES
(1, 1, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `armazenagem`
--
ALTER TABLE `armazenagem`
  ADD PRIMARY KEY (`id_pedido`);

--
-- Indexes for table `formapagamento`
--
ALTER TABLE `formapagamento`
  ADD PRIMARY KEY (`id_formapagamento`);

--
-- Indexes for table `perfil`
--
ALTER TABLE `perfil`
  ADD PRIMARY KEY (`id_perfil`);

--
-- Indexes for table `pessoa`
--
ALTER TABLE `pessoa`
  ADD PRIMARY KEY (`id_pessoa`);

--
-- Indexes for table `plano`
--
ALTER TABLE `plano`
  ADD PRIMARY KEY (`id_plano`);

--
-- Indexes for table `tabelapreco`
--
ALTER TABLE `tabelapreco`
  ADD PRIMARY KEY (`id_tabelapreco`);

--
-- Indexes for table `tipoarmazenagem`
--
ALTER TABLE `tipoarmazenagem`
  ADD PRIMARY KEY (`id_tipoarmazenagem`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `armazenagem`
--
ALTER TABLE `armazenagem`
  MODIFY `id_pedido` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `formapagamento`
--
ALTER TABLE `formapagamento`
  MODIFY `id_formapagamento` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `perfil`
--
ALTER TABLE `perfil`
  MODIFY `id_perfil` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `pessoa`
--
ALTER TABLE `pessoa`
  MODIFY `id_pessoa` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `plano`
--
ALTER TABLE `plano`
  MODIFY `id_plano` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tabelapreco`
--
ALTER TABLE `tabelapreco`
  MODIFY `id_tabelapreco` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tipoarmazenagem`
--
ALTER TABLE `tipoarmazenagem`
  MODIFY `id_tipoarmazenagem` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
