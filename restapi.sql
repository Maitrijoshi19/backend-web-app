-- phpMyAdmin SQL Dump
-- version 4.5.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 06, 2019 at 04:08 PM
-- Server version: 5.7.11
-- PHP Version: 5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `restapi`
--

-- --------------------------------------------------------

--
-- Table structure for table `address`
--

CREATE TABLE `address` (
  `address_id` int(11) NOT NULL,
  `street` varchar(255) NOT NULL,
  `suite` varchar(255) NOT NULL,
  `city` varchar(255) NOT NULL,
  `zipcode` varchar(255) NOT NULL,
  `user_id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `address`
--

INSERT INTO `address` (`address_id`, `street`, `suite`, `city`, `zipcode`, `user_id`) VALUES
(1, 'Kulas Light', 'Apt. 556', 'Gwenborough', '92998-3874', 1),
(2, 'Victor Plains', 'Suite 879', 'Wisokyburgh', '90566-7771', 2);

-- --------------------------------------------------------

--
-- Table structure for table `album`
--

CREATE TABLE `album` (
  `album_id` int(11) NOT NULL,
  `title` varchar(255) NOT NULL,
  `user_id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `album`
--

INSERT INTO `album` (`album_id`, `title`, `user_id`) VALUES
(1, 'omnis laborum odio', 1),
(2, 'non esse culpa molestiae omnis sed optio', 1),
(3, 'quam nostrum impedit mollitia quod et dolor', 2);

-- --------------------------------------------------------

--
-- Table structure for table `company`
--

CREATE TABLE `company` (
  `company_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `catch_phrase` text NOT NULL,
  `bs` text NOT NULL,
  `user_id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `company`
--

INSERT INTO `company` (`company_id`, `name`, `catch_phrase`, `bs`, `user_id`) VALUES
(1, 'Romaguera-Crona', 'Multi-layered client-server neural-net', 'harness real-time e-markets', 1),
(2, 'Deckow-Crist', 'Proactive didactic contingency', 'synergize scalable supply-chains', 2);

-- --------------------------------------------------------

--
-- Table structure for table `geo`
--

CREATE TABLE `geo` (
  `geo_id` int(11) NOT NULL,
  `lat` varchar(255) NOT NULL,
  `lng` varchar(255) NOT NULL,
  `address_id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `geo`
--

INSERT INTO `geo` (`geo_id`, `lat`, `lng`, `address_id`) VALUES
(1, '-37.3159', '81.1496', 1),
(2, '-43.9509', '-34.4618', 2);

-- --------------------------------------------------------

--
-- Table structure for table `photo`
--

CREATE TABLE `photo` (
  `photo_id` int(11) NOT NULL,
  `title` varchar(255) NOT NULL,
  `url` text NOT NULL,
  `thumbnail_url` text NOT NULL,
  `album_id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `photo`
--

INSERT INTO `photo` (`photo_id`, `title`, `url`, `thumbnail_url`, `album_id`) VALUES
(1, 'accusamus beatae ad facilis cum similique qui sunt', 'https://via.placeholder.com/600/92c952', 'https://via.placeholder.com/150/92c952', 1),
(2, 'reprehenderit est deserunt velit ipsam', 'https://via.placeholder.com/600/771796', 'https://via.placeholder.com/150/771796', 1),
(3, 'officia porro iure quia iusto qui ipsa ut modi', 'https://via.placeholder.com/600/24f355', 'https://via.placeholder.com/150/24f355', 2),
(4, 'culpa odio esse rerum omnis laboriosam voluptate repudiandae', 'https://via.placeholder.com/600/d32776', 'https://via.placeholder.com/150/d32776', 3),
(5, 'natus nisi omnis corporis facere molestiae rerum in', 'https://via.placeholder.com/600/f66b97', 'https://via.placeholder.com/150/f66b97', 3);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `website` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `name`, `username`, `password`, `email`, `phone`, `website`) VALUES
(1, 'Leanne Graham', 'admin', '$2a$10$Gf5yLqYFr.Srp2bv1dvdp.IJxaLAwpMybGChfuLg7.nh/dKF9Upou', 'Sincere@april.biz', '1-770-736-8031 x56442', 'hildegard.org'),
(2, 'Ervin Howell', 'Antonette', '', 'Shanna@melissa.tv', '010-692-6593 x09125', 'anastasia.net'),
(3, 'Sunil Agrawal', 'sunil', '$2a$10$x9LrIQhGZtvEH5tHX6O3sOhUZ4/rvaDlDbO2WYldITTLEZ1c7JG5q', 'sun.agr86@gmail.com', '9909413561', 'www.tech.com');

-- --------------------------------------------------------

--
-- Table structure for table `user1`
--

CREATE TABLE `user1` (
  `userId` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `address` json NOT NULL,
  `phone` varchar(255) NOT NULL,
  `website` varchar(255) NOT NULL,
  `company` json NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user1`
--

INSERT INTO `user1` (`userId`, `name`, `username`, `email`, `address`, `phone`, `website`, `company`) VALUES
(1, 'Leanne Graham', 'Bret', 'Sincere@april.biz', '{"geo": {"lat": "-37.3159", "lng": "81.1496"}, "city": "Gwenborough", "suite": "Apt.556", "street": "Kulas Light", "zipcode": "92998-3874"}', '1-770-736-8031 x56442', 'hildegard.org', '{"bs": "harness real-time e-markets", "name": "Romaguera-Crona", "catchPhrase": "Multi-layered client-server neural-net"}'),
(2, 'Ervin Howell', 'Antonette', 'Shanna@melissa.tv', '{"geo": {"lat": "-43.9509", "lng": "-34.4618"}, "city": "Wisokyburgh", "suite": "Suite 879", "street": "Victor Plains", "zipcode": "90566-7771"}', '010-692-6593 x09125', 'anastasia.net', '{"bs": "synergize scalable supply-chains", "name": "Deckow-Crist", "catchPhrase": "Proactive didactic contingency"}');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `address`
--
ALTER TABLE `address`
  ADD PRIMARY KEY (`address_id`),
  ADD UNIQUE KEY `UK_7rod8a71yep5vxasb0ms3osbg` (`user_id`);

--
-- Indexes for table `album`
--
ALTER TABLE `album`
  ADD PRIMARY KEY (`album_id`);

--
-- Indexes for table `company`
--
ALTER TABLE `company`
  ADD PRIMARY KEY (`company_id`),
  ADD UNIQUE KEY `UK_7rod8a71yep5vxasb0ms3osbg` (`user_id`);

--
-- Indexes for table `geo`
--
ALTER TABLE `geo`
  ADD PRIMARY KEY (`geo_id`),
  ADD UNIQUE KEY `UK_7rod8a71yep5vxasb0ms3osbg` (`address_id`);

--
-- Indexes for table `photo`
--
ALTER TABLE `photo`
  ADD PRIMARY KEY (`photo_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `user1`
--
ALTER TABLE `user1`
  ADD PRIMARY KEY (`userId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `address`
--
ALTER TABLE `address`
  MODIFY `address_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `album`
--
ALTER TABLE `album`
  MODIFY `album_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `company`
--
ALTER TABLE `company`
  MODIFY `company_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `geo`
--
ALTER TABLE `geo`
  MODIFY `geo_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `photo`
--
ALTER TABLE `photo`
  MODIFY `photo_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `user1`
--
ALTER TABLE `user1`
  MODIFY `userId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
