-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-10-2023 a las 01:36:12
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bomberos_27`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bombero`
--

CREATE TABLE `bombero` (
  `idBombero` int(11) NOT NULL,
  `dni` varchar(8) NOT NULL,
  `nombre_apellido` varchar(50) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `celular` varchar(15) NOT NULL,
  `codigoBrigada` int(3) NOT NULL,
  `grupoSanguineo` varchar(5) NOT NULL,
  `estadoBombero` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `brigada`
--

CREATE TABLE `brigada` (
  `codigoBrigada` int(3) NOT NULL,
  `nombreBrigada` varchar(20) NOT NULL,
  `especialidad` varchar(20) NOT NULL,
  `Libre` tinyint(1) NOT NULL,
  `numeroCuartel` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuartel`
--

CREATE TABLE `cuartel` (
  `numeroCuartel` int(3) NOT NULL,
  `nombreCuartel` varchar(20) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `coordX` int(11) NOT NULL,
  `coordY` int(11) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `correo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `siniestros`
--

CREATE TABLE `siniestros` (
  `codigoSiniestro` int(11) NOT NULL,
  `tipoSiniestro` varchar(20) NOT NULL,
  `fechaSiniestro` date NOT NULL,
  `coordSX` int(11) NOT NULL,
  `coordSY` int(11) NOT NULL,
  `detalleSiniestro` text NOT NULL,
  `fechaResolucionS` date NOT NULL,
  `puntuacion` int(11) NOT NULL,
  `codigoBrigada` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD PRIMARY KEY (`idBombero`),
  ADD UNIQUE KEY `idBombero` (`idBombero`,`dni`,`celular`,`codigoBrigada`),
  ADD KEY `codigoBrigada` (`codigoBrigada`);

--
-- Indices de la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD PRIMARY KEY (`codigoBrigada`),
  ADD UNIQUE KEY `codigoBrigada` (`codigoBrigada`,`numeroCuartel`),
  ADD KEY `numeroCuartel` (`numeroCuartel`);

--
-- Indices de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  ADD PRIMARY KEY (`numeroCuartel`),
  ADD UNIQUE KEY `numeroCuartel` (`numeroCuartel`,`nombreCuartel`,`direccion`,`telefono`,`correo`);

--
-- Indices de la tabla `siniestros`
--
ALTER TABLE `siniestros`
  ADD PRIMARY KEY (`codigoSiniestro`),
  ADD UNIQUE KEY `codigoBrigada` (`codigoBrigada`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `bombero`
--
ALTER TABLE `bombero`
  MODIFY `idBombero` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `brigada`
--
ALTER TABLE `brigada`
  MODIFY `codigoBrigada` int(3) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD CONSTRAINT `bombero_ibfk_1` FOREIGN KEY (`codigoBrigada`) REFERENCES `brigada` (`codigoBrigada`);

--
-- Filtros para la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD CONSTRAINT `brigada_ibfk_1` FOREIGN KEY (`numeroCuartel`) REFERENCES `cuartel` (`numeroCuartel`);

--
-- Filtros para la tabla `siniestros`
--
ALTER TABLE `siniestros`
  ADD CONSTRAINT `siniestros_ibfk_1` FOREIGN KEY (`codigoBrigada`) REFERENCES `brigada` (`codigoBrigada`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
