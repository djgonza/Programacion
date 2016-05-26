-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 12-04-2012 a las 11:22:50
-- Versión del servidor: 5.5.8
-- Versión de PHP: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bdpersonas`
--
CREATE DATABASE `bdpersonas` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish2_ci;
USE `bdpersonas`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cursos`
--

CREATE TABLE IF NOT EXISTS `cursos` (
  `idCurso` int(3) NOT NULL,
  `nombreCurso` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `horas` int(3) NOT NULL,
  PRIMARY KEY (`idCurso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcar la base de datos para la tabla `cursos`
--

INSERT INTO `cursos` (`idCurso`, `nombreCurso`, `horas`) VALUES
(1, 'XHTML y CSS', 45),
(2, 'PHP y MySQL', 60),
(3, 'Desarrollo de aplicaciones con Android', 100),
(4, 'Seguridad en PHP', 75),
(5, 'Joomla 1.6', 30);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personas`
--

CREATE TABLE IF NOT EXISTS `personas` (
  `idPersona` int(3) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `apellido` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `edad` int(3) NOT NULL,
  `eCivil` varchar(1) COLLATE utf8_spanish2_ci NOT NULL,
  `genero` varchar(1) COLLATE utf8_spanish2_ci NOT NULL,
  PRIMARY KEY (`idPersona`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci AUTO_INCREMENT=24 ;

--
-- Volcar la base de datos para la tabla `personas`
--

INSERT INTO `personas` (`idPersona`, `nombre`, `apellido`, `edad`, `eCivil`, `genero`) VALUES
(3, 'Elena', 'Redrado', 42, 's', 'h'),
(4, 'David', 'Meca', 36, 's', 'h'),
(5, 'Juan', 'Diego', 44, 'd', 'h'),
(6, 'Luisa', 'Martos', 54, 'd', 'm'),
(7, 'Esteban', 'Adúriz', 62, 'v', 'h'),
(8, 'Pablo', 'Ortega', 71, 'c', 'h'),
(10, 'Susana', 'Garrido', 49, 'c', 'm'),
(14, 'Alejandro', 'Gil', 32, 'c', 'h'),
(15, 'Jesús', 'López', 78, 'v', 'h'),
(16, 'Elena', 'Saenz', 21, 's', 'm'),
(17, 'Cristina', 'Vega', 33, 'c', 'm'),
(23, 'pepa', 'pepa', 11, 's', 'm');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personas_cursos`
--

CREATE TABLE IF NOT EXISTS `personas_cursos` (
  `idPersona` int(3) NOT NULL,
  `idCurso` int(3) NOT NULL,
  PRIMARY KEY (`idPersona`,`idCurso`),
  KEY `idCurso` (`idCurso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcar la base de datos para la tabla `personas_cursos`
--

INSERT INTO `personas_cursos` (`idPersona`, `idCurso`) VALUES
(5, 1),
(6, 1),
(7, 1),
(2, 3),
(7, 3),
(7, 4),
(6, 5),
(7, 5);

--
-- Filtros para las tablas descargadas (dump)
--

--
-- Filtros para la tabla `personas_cursos`
--
ALTER TABLE `personas_cursos`
  ADD CONSTRAINT `personas_cursos_ibfk_1` FOREIGN KEY (`idCurso`) REFERENCES `cursos` (`idCurso`) ON DELETE CASCADE ON UPDATE CASCADE;
