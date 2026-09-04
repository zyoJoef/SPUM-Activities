-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 02, 2025 at 11:29 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `examdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_examresults`
--

CREATE TABLE `tbl_examresults` (
  `examresultsID` int(11) NOT NULL,
  `studentName` varchar(255) NOT NULL,
  `subject` varchar(255) NOT NULL,
  `score` varchar(255) NOT NULL,
  `dateTaken` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_examresults`
--

INSERT INTO `tbl_examresults` (`examresultsID`, `studentName`, `subject`, `score`, `dateTaken`) VALUES
(5, 'Jose Rizal', 'History', '100/100', '2025-10-02 09:24:12'),
(6, 'Jose Mari Chan', 'Music ', '40/50', '2025-10-02 09:24:34'),
(7, 'Aristotle ', 'Philosophy', '80/100', '2025-10-02 09:26:14'),
(8, 'Noli de Castro', 'Broadcasting', '60/60', '2025-10-02 09:26:58'),
(9, 'Steve Jobs', 'Computer Engineering ', '100/100', '2025-10-02 09:27:49');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_examresults`
--
ALTER TABLE `tbl_examresults`
  ADD PRIMARY KEY (`examresultsID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_examresults`
--
ALTER TABLE `tbl_examresults`
  MODIFY `examresultsID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
