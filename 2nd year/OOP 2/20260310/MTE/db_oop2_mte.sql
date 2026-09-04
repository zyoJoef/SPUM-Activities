-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 17, 2026 at 01:56 PM
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
-- Database: `db_oop2_mte`
--

-- --------------------------------------------------------

--
-- Table structure for table `faces`
--

CREATE TABLE `faces` (
  `user_id` int(11) NOT NULL,
  `face_token` varchar(255) NOT NULL,
  `face_blob` blob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `sessions`
--

CREATE TABLE `sessions` (
  `session_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `login_at` datetime NOT NULL DEFAULT current_timestamp(),
  `logout_at` datetime DEFAULT NULL,
  `session_status` enum('active','complete') NOT NULL DEFAULT 'active'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `first_name` varchar(100) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `email` varchar(255) NOT NULL,
  `role` enum('student','faculty','admin') NOT NULL DEFAULT 'student' COMMENT 'least privilege',
  `status` enum('active','inactive') NOT NULL DEFAULT 'active',
  `created_at` datetime NOT NULL DEFAULT current_timestamp(),
  `updated_at` datetime NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `first_name`, `last_name`, `email`, `role`, `status`, `created_at`, `updated_at`) VALUES
(1, 'Carl Marcus', 'Jimenez', 'cjimenez@spumanila.edu.ph', 'student', 'active', '2026-03-17 19:54:08', '2026-03-17 19:54:08'),
(2, 'Alvey Tyler', 'Rabaya', 'arabaya@spumanila.edu.ph', 'student', 'active', '2026-03-17 19:54:17', '2026-03-17 19:54:17'),
(3, 'Denzel', 'Padua', 'dpadua@spumanila.edu.ph', 'student', 'active', '2026-03-17 19:54:24', '2026-03-17 19:54:24'),
(4, 'Joeffrey', 'Cadorna', 'jcadorna@spumanila.edu.ph', 'student', 'active', '2026-03-17 20:07:58', '2026-03-17 20:07:58'),
(5, 'Kenji', 'Navarro', 'knavarro@spumanila.edu.ph', 'student', 'active', '2026-03-17 20:17:13', '2026-03-17 20:17:13'),
(6, 'Meshari', 'Alnooh', 'malnooh@spumanila.edu.ph', 'student', 'active', '2026-03-17 20:17:22', '2026-03-17 20:17:22'),
(7, 'Peter Paul', 'Ocampo', 'pocampo@spumanila.edu.ph', 'faculty', 'active', '2026-03-17 20:17:44', '2026-03-17 20:17:44'),
(8, 'Kerwin George', 'Fortes', 'kfortes@spumanila.edu.ph', 'faculty', 'active', '2026-03-17 20:18:02', '2026-03-17 20:18:02'),
(9, 'Sheryl', 'Calabig', 'scalabig@spumanila.edu.ph', 'faculty', 'active', '2026-03-17 20:27:42', '2026-03-17 20:27:42'),
(10, 'Henry', 'De Guzman', 'hdeguzman@spumanila.edu.ph', 'faculty', 'active', '2026-03-17 20:33:16', '2026-03-17 20:33:16'),
(11, 'Maria Regina', 'Cachero', 'mcachero@spumanila.edu.ph', 'admin', 'active', '2026-03-17 20:34:32', '2026-03-17 20:55:14'),
(12, 'Julius', 'Riogelon', 'jriogelon@spumanila.edu.ph', 'admin', 'active', '2026-03-17 20:34:52', '2026-03-17 20:34:52');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `faces`
--
ALTER TABLE `faces`
  ADD KEY `fk_user_id` (`user_id`) USING BTREE;

--
-- Indexes for table `sessions`
--
ALTER TABLE `sessions`
  ADD PRIMARY KEY (`session_id`),
  ADD KEY `fk_session_user_id` (`user_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `uq_users_email` (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `sessions`
--
ALTER TABLE `sessions`
  MODIFY `session_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `faces`
--
ALTER TABLE `faces`
  ADD CONSTRAINT `fk_faces_user_id` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `sessions`
--
ALTER TABLE `sessions`
  ADD CONSTRAINT `fk_session_user_id` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
