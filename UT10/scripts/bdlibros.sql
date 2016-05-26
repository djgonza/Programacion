-- phpMyAdmin SQL Dump
-- version 3.5.2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 30-05-2013 a las 20:07:37
-- Versión del servidor: 5.5.25a
-- Versión de PHP: 5.4.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bdlibros`
--
CREATE DATABASE `bdlibros` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish2_ci;
USE `bdlibros`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libros`
--

CREATE TABLE IF NOT EXISTS `libros` (
  `idLibro` int(4) NOT NULL AUTO_INCREMENT,
  `titulo` varchar(75) NOT NULL,
  `año` int(4) NOT NULL,
  `paginas` int(4) NOT NULL,
  `idTema` int(3) NOT NULL,
  PRIMARY KEY (`idLibro`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Volcado de datos para la tabla `libros`
--

INSERT INTO `libros` (`idLibro`, `titulo`, `año`, `paginas`, `idTema`) VALUES
(1, 'La noche de los tiempos', 2009, 960, 1),
(2, 'El traje gris', 2011, 160, 1),
(3, 'El ángel perdido', 2011, 522, 1),
(4, 'Desarrollo de aplicaciones para Android', 2011, 400, 3),
(5, 'Creación de un portal con pHP y MySQL', 2010, 268, 3),
(6, 'Australia (Guía azul)', 2011, 239, 2),
(7, 'Guía de Tahití y sus islas', 2010, 221, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `temas`
--

CREATE TABLE IF NOT EXISTS `temas` (
  `idTema` int(3) NOT NULL AUTO_INCREMENT,
  `nombreTema` varchar(50) NOT NULL,
  PRIMARY KEY (`idTema`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `temas`
--

INSERT INTO `temas` (`idTema`, `nombreTema`) VALUES
(1, 'Literatura'),
(2, 'Viajes'),
(3, 'Informática'),
(4, 'Gastronomía');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
