-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-11-2023 a las 01:29:24
-- Versión del servidor: 10.1.36-MariaDB
-- Versión de PHP: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cuartel27`
--
CREATE DATABASE IF NOT EXISTS `cuartel27` DEFAULT CHARACTER SET latin1 COLLATE latin1_spanish_ci;
USE `cuartel27`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bombero`
--

CREATE TABLE `bombero` (
  `codBombero` int(11) NOT NULL,
  `dni` varchar(11) COLLATE latin1_spanish_ci NOT NULL,
  `nombreCompleto` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `grupoSanguineo` varchar(25) COLLATE latin1_spanish_ci NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `telCelular` varchar(25) COLLATE latin1_spanish_ci NOT NULL,
  `codBrigada` int(11) NOT NULL,
  `estadoBombero` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `bombero`
--

INSERT INTO `bombero` (`codBombero`, `dni`, `nombreCompleto`, `grupoSanguineo`, `fechaNacimiento`, `telCelular`, `codBrigada`, `estadoBombero`) VALUES
(2, '01020304', 'Rodriguez, Pedro', 'A (+)', '1981-01-31', '000-1111', 1, 0),
(3, '00000001', 'Perez, Patricio Alejandro', 'B (-)', '1985-02-06', 'xxx-0002', 6, 0),
(4, '02020202', 'Perez, juan Pablo', '0 (-)', '1985-02-06', 'xxx-0002', 1, 0),
(5, '33334444', 'Perez, Patricio', '0 (-)', '1985-02-06', 'xxx-0002', 6, 0),
(6, '11001100', 'Garro, Alfonsina', 'A (-)', '2000-11-06', 'xxx-0006', 7, 0),
(7, '44454445', 'Gastaldi, Aroon', 'B +', '2000-10-23', 'xxx-2121', 8, 1),
(8, '77889977', 'Garino, Esteba', 'AB -', '1987-02-28', 'xxx-2525', 8, 0),
(9, '45454545', 'Jimenez, Andrea', 'A -', '2003-03-30', 'xx-2112', 6, 0),
(10, '32625242', 'Luque, Ezequiel', '0 +', '2003-10-30', 'xxx-020202', 9, 1),
(11, '30303030', 'Lopez, Ramon Oscar', '0 -', '1981-07-30', 'xxx-112211', 9, 0),
(12, '01020102', 'Alvarez, Ignacio Jose', 'B +', '2001-12-31', 'xxx-030303', 4, 1),
(13, '010405041', 'Perez, Juan', 'A +', '1990-07-29', '000251354', 11, 1),
(14, '6656566', 'Bin Laden', ' B +', '2024-11-19', '00215485', 6, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `brigada`
--

CREATE TABLE `brigada` (
  `codBrigada` int(11) NOT NULL,
  `nombreClave` varchar(60) COLLATE latin1_spanish_ci NOT NULL,
  `especialidad` varchar(60) COLLATE latin1_spanish_ci NOT NULL,
  `codCuartel` int(11) NOT NULL,
  `estadoBrigada` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `brigada`
--

INSERT INTO `brigada` (`codBrigada`, `nombreClave`, `especialidad`, `codCuartel`, `estadoBrigada`) VALUES
(1, 'Alfa', 'Incendio', 6, 1),
(3, 'Beta', 'Derrumbe', 6, 1),
(4, 'Epsilon', 'Rescate en Montaña', 6, 0),
(6, 'OmegaII', 'Rescate en Accidente de Tráfico', 6, 1),
(7, 'Rho II', 'Prevencón', 6, 1),
(8, 'Prueba', 'Prevencion', 9, 0),
(9, 'Carbon', 'Incendios', 7, 0),
(10, 'Brasil', 'Inundaciones', 9, 1),
(11, 'America', 'Rescate ', 7, 0),
(12, 'Antartida', 'Prevención', 9, 1),
(13, 'Condor', 'Aguas Abiertas', 7, 0),
(14, 'RompeOla', 'Inundaciones', 8, 1),
(15, 'BloqueI', 'Derrumbes', 8, 1),
(16, 'Rambo', 'Rescate en Accidente de Tráfico', 9, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuartel`
--

CREATE TABLE `cuartel` (
  `codCuartel` int(11) NOT NULL,
  `nombreCuartel` varchar(60) COLLATE latin1_spanish_ci NOT NULL,
  `calleC` int(11) NOT NULL,
  `alturaC` int(11) NOT NULL,
  `telefono` varchar(30) COLLATE latin1_spanish_ci NOT NULL,
  `mail` varchar(30) COLLATE latin1_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `cuartel`
--

INSERT INTO `cuartel` (`codCuartel`, `nombreCuartel`, `calleC`, `alturaC`, `telefono`, `mail`) VALUES
(6, 'CuartelUno', 9, 9, 'xxx-0001', 'cuarteluno@cuartel27.com'),
(7, 'CuartelDos', 2, 8, 'xxx-000022', 'cuarteldos@cuartel27.com'),
(8, 'CuartelTres', 6, 6, 'xxx-000033', 'cuarteltres@cuartel27.com'),
(9, 'CuartelCuatro', 3, 5, '000-000044', 'cuartelcuatro@cuartel27.com'),
(10, 'Cuartel Abismo', 5, 6, '00-232323', 'bhjhdjh@jorjguae');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `siniestro`
--

CREATE TABLE `siniestro` (
  `codSiniestro` int(11) NOT NULL,
  `calleS` int(11) NOT NULL,
  `alturaS` int(11) NOT NULL,
  `fechaSiniestro` date NOT NULL,
  `hora` time NOT NULL,
  `tipo` varchar(60) COLLATE latin1_spanish_ci NOT NULL,
  `detalle` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `fechaResolucion` date DEFAULT NULL,
  `puntuacion` int(11) DEFAULT NULL,
  `codBrigada` int(11) NOT NULL,
  `estadoSiniestro` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `siniestro`
--

INSERT INTO `siniestro` (`codSiniestro`, `calleS`, `alturaS`, `fechaSiniestro`, `hora`, `tipo`, `detalle`, `fechaResolucion`, `puntuacion`, `codBrigada`, `estadoSiniestro`) VALUES
(1, 4, 2, '2009-01-07', '20:14:41', 'Deceso', 'Deceso en vias de tren', '2009-01-06', 8, 1, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD PRIMARY KEY (`codBombero`),
  ADD UNIQUE KEY `dni` (`dni`),
  ADD KEY `codBrigada` (`codBrigada`);

--
-- Indices de la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD PRIMARY KEY (`codBrigada`),
  ADD UNIQUE KEY `nombreClave` (`nombreClave`),
  ADD KEY `codCuartel` (`codCuartel`);

--
-- Indices de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  ADD PRIMARY KEY (`codCuartel`);

--
-- Indices de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD PRIMARY KEY (`codSiniestro`),
  ADD KEY `codBrigada` (`codBrigada`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `bombero`
--
ALTER TABLE `bombero`
  MODIFY `codBombero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `brigada`
--
ALTER TABLE `brigada`
  MODIFY `codBrigada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  MODIFY `codCuartel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  MODIFY `codSiniestro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD CONSTRAINT `bombero_ibfk_1` FOREIGN KEY (`codBrigada`) REFERENCES `brigada` (`codBrigada`);

--
-- Filtros para la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD CONSTRAINT `brigada_ibfk_1` FOREIGN KEY (`codCuartel`) REFERENCES `cuartel` (`codCuartel`);

--
-- Filtros para la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD CONSTRAINT `siniestro_ibfk_1` FOREIGN KEY (`codBrigada`) REFERENCES `brigada` (`codBrigada`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
