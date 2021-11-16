-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 16, 2021 at 06:24 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `travel-microservice`
--

-- --------------------------------------------------------

--
-- Table structure for table `destination`
--

CREATE TABLE `destination` (
  `id` varchar(10) NOT NULL,
  `country` varchar(30) NOT NULL,
  `destination` varchar(30) NOT NULL,
  `location` varchar(30) NOT NULL,
  `maps` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `destination`
--

INSERT INTO `destination` (`id`, `country`, `destination`, `location`, `maps`) VALUES
('1', 'Spain', 'Generalife Gardens', 'Granada', 'https://goo.gl/maps/D9SypC69h4s5LYqSA'),
('10', 'Ukraine', 'St. Sophia\'s Cathedral', 'Kyiv', 'https://goo.gl/maps/cPT1zJCcbAnMoSKw9'),
('11', 'India', 'Mysore Palace', 'Mysore', 'https://goo.gl/maps/H4Z8pYTqfaHQjRY19'),
('12', 'Ukraine', 'Tarakaniv Fort', 'Dubno', 'https://goo.gl/maps/zfMdAme3sufZcSDQ7'),
('2', 'Spain', 'Alhambra Gardens', 'Granada', 'https://goo.gl/maps/mzFfDmeiPkcXzoXf8'),
('3', 'Japan', 'Mount Fuji', 'Fuji-Hakone-Izu National Park', 'https://goo.gl/maps/xt3Zcb4xR5DV9ot17'),
('4', 'Japan', 'Hiroshima Peace Memorial Park', 'Hiroshima', 'https://goo.gl/maps/fA1kasK3TAabJAVt8'),
('5', 'Thailand', 'Railay Beach', 'Krabi', 'https://goo.gl/maps/44svrhutKrBbsxicA'),
('6', 'Thailand', 'The Grand Palace', 'Bangkok', 'https://goo.gl/maps/a7DqcmCY2bKXgqFMA'),
('7', 'India', 'Taj Mahal', 'Agra', 'https://goo.gl/maps/zrZkvkXYDWNbFjJy6'),
('8', 'Thailand', 'Doi Suthep', 'Chiang Mai', 'https://goo.gl/maps/gEJCqPBGihUaTMVa7'),
('9', 'India', 'Ellora Caves', 'Aurangabad', 'https://goo.gl/maps/JyBtzx8xxcBysjLo7');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `destination`
--
ALTER TABLE `destination`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
