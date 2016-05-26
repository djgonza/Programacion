-- phpMyAdmin SQL Dump
-- version 3.5.2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 30-05-2013 a las 20:07:58
-- Versión del servidor: 5.5.25a
-- Versión de PHP: 5.4.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bdcarrito`
--
CREATE DATABASE `bdcarrito` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish2_ci;
USE `bdcarrito`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carrito`
--

CREATE TABLE IF NOT EXISTS `carrito` (
  `idProducto` int(3) NOT NULL AUTO_INCREMENT,
  `nombreProducto` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `unidades` int(2) NOT NULL,
  `descuento` varchar(2) COLLATE utf8_spanish2_ci NOT NULL,
  PRIMARY KEY (`idProducto`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci AUTO_INCREMENT=9 ;

--
-- Volcado de datos para la tabla `carrito`
--

INSERT INTO `carrito` (`idProducto`, `nombreProducto`, `precio`, `unidades`, `descuento`) VALUES
(1, 'Leche en polvo', 3.25, 2, 'si'),
(2, 'Mantequilla', 1.75, 1, 'no'),
(3, 'Arroz', 2.90, 3, 'si'),
(4, 'Gel ', 2.15, 2, 'si'),
(5, 'Pasta de dientes', 3.27, 3, 'no'),
(6, 'Pan tostado', 2.18, 1, 'no'),
(7, 'Pan de molde', 1.98, 2, 'si'),
(8, 'Café', 2.45, 4, 'si');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
