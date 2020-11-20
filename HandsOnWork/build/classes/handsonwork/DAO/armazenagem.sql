-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 16-Nov-2020 às 23:26
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

-- --------------------------------------------------------

--
-- Estrutura da tabela `formapagamento`
--

CREATE TABLE `formapagamento` (
  `id_formapagamento` int(10) NOT NULL,
  `nome_formapagamento` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `perfil`
--

CREATE TABLE `perfil` (
  `id_perfil` int(10) NOT NULL,
  `nome_perfil` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoa`
--

CREATE TABLE `pessoa` (
  `id_pessoa` int(10) NOT NULL,
  `nome_pessoa` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `cnpjcpf_pessoa` varchar(18) COLLATE utf8_unicode_ci NOT NULL,
  `data_inicio` date NOT NULL,
  `ehfuncionario` varchar(1) COLLATE utf8_unicode_ci NOT NULL,
  `ehcliente` varchar(1) COLLATE utf8_unicode_ci NOT NULL,
  `telefone_pessoa` varchar(14) COLLATE utf8_unicode_ci NOT NULL,
  `email_pessoa` varchar(40) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `plano`
--

CREATE TABLE `plano` (
  `id_plano` int(10) NOT NULL,
  `nome_plano` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

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
  MODIFY `id_pedido` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `formapagamento`
--
ALTER TABLE `formapagamento`
  MODIFY `id_formapagamento` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `perfil`
--
ALTER TABLE `perfil`
  MODIFY `id_perfil` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pessoa`
--
ALTER TABLE `pessoa`
  MODIFY `id_pessoa` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `plano`
--
ALTER TABLE `plano`
  MODIFY `id_plano` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tabelapreco`
--
ALTER TABLE `tabelapreco`
  MODIFY `id_tabelapreco` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tipoarmazenagem`
--
ALTER TABLE `tipoarmazenagem`
  MODIFY `id_tipoarmazenagem` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(10) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
