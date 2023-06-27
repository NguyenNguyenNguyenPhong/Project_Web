-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3307
-- Generation Time: Jun 25, 2023 at 04:30 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `updatepttkht`
--

-- --------------------------------------------------------

--
-- Table structure for table `blog`
--

CREATE TABLE `blog` (
  `blogID` int(11) NOT NULL,
  `category` varchar(256) NOT NULL,
  `name` varchar(256) NOT NULL,
  `content` text DEFAULT NULL,
  `image` text NOT NULL,
  `userID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `categoryID` int(11) NOT NULL,
  `parentCategoryID` int(11) DEFAULT NULL,
  `categoryName` varchar(255) NOT NULL,
  `isSubCategory` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `courseID` int(11) NOT NULL,
  `courseName` varchar(256) NOT NULL,
  `courseDescription` varchar(256) NOT NULL,
  `courseImg` text NOT NULL,
  `courseCost` int(11) DEFAULT NULL,
  `courseRating` int(1) DEFAULT NULL,
  `createdAt` datetime NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `courseTotalStudent` int(11) DEFAULT NULL,
  `lastUpdate` timestamp NOT NULL DEFAULT current_timestamp(),
  `categoryID` int(11) DEFAULT NULL,
  `userID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `coursesegment`
--

CREATE TABLE `coursesegment` (
  `segmentID` int(11) NOT NULL,
  `description` varchar(256) DEFAULT NULL,
  `Content` text NOT NULL,
  `courseID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `course_teach`
--

CREATE TABLE `course_teach` (
  `course_teach_id` int(11) NOT NULL,
  `courseID` int(11) NOT NULL,
  `teacherID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `exam`
--

CREATE TABLE `exam` (
  `examID` int(11) NOT NULL,
  `finishTime` timestamp NULL DEFAULT NULL,
  `examLink` text NOT NULL,
  `state` varchar(256) NOT NULL,
  `score` int(11) DEFAULT NULL,
  `segmentID` int(11) NOT NULL,
  `startTime` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci COMMENT='store finish and start time in a same time or update ';

-- --------------------------------------------------------

--
-- Table structure for table `learnhistory`
--

CREATE TABLE `learnhistory` (
  `id` int(11) NOT NULL,
  `isCompleted` tinyint(1) NOT NULL,
  `timeToComplete` int(11) DEFAULT NULL,
  `grade` int(11) DEFAULT NULL,
  `lectureID` int(11) NOT NULL,
  `userID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci COMMENT='shoud save or drop this table cause of exam table is wellinf';

-- --------------------------------------------------------

--
-- Table structure for table `lecture`
--

CREATE TABLE `lecture` (
  `lectureID` int(11) NOT NULL,
  `lectureName` varchar(256) DEFAULT NULL,
  `lectureDescription` varchar(256) DEFAULT NULL,
  `lectureVideoLink` text NOT NULL,
  `lectureImage` text NOT NULL,
  `lectureSlug` text NOT NULL,
  `createdAt` timestamp NOT NULL DEFAULT current_timestamp(),
  `lastUpdate` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `segmentID` int(11) NOT NULL,
  `lectureSeqNumber` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `mentee`
--

CREATE TABLE `mentee` (
  `menteeID` int(11) NOT NULL,
  `name` varchar(256) NOT NULL,
  `profile` text DEFAULT NULL,
  `image` text NOT NULL,
  `userID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `mentor`
--

CREATE TABLE `mentor` (
  `mentorID` int(11) NOT NULL,
  `name` varchar(256) NOT NULL,
  `profile` text DEFAULT NULL,
  `image` text NOT NULL,
  `teacherid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `mentor_mentee`
--

CREATE TABLE `mentor_mentee` (
  `mentorID` int(11) NOT NULL,
  `menteeID` int(11) NOT NULL,
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `roleID` int(11) NOT NULL,
  `create` tinyint(1) NOT NULL DEFAULT 0,
  `update` tinyint(1) NOT NULL DEFAULT 0,
  `read` tinyint(1) NOT NULL DEFAULT 1,
  `delete` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`roleID`, `create`, `update`, `read`, `delete`) VALUES
(1, 0, 0, 1, 0),
(2, 1, 1, 1, 1),
(3, 0, 1, 1, 1),
(4, 0, 0, 1, 0);

-- --------------------------------------------------------

--
-- Table structure for table `scope`
--

CREATE TABLE `scope` (
  `ScopeID` int(11) NOT NULL,
  `admin` tinyint(1) NOT NULL DEFAULT 0,
  `teacher` tinyint(1) NOT NULL DEFAULT 0,
  `student` tinyint(1) NOT NULL DEFAULT 0,
  `user` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `scope`
--

INSERT INTO `scope` (`ScopeID`, `admin`, `teacher`, `student`, `user`) VALUES
(1, 0, 0, 0, 1),
(2, 1, 0, 0, 0),
(3, 0, 1, 0, 0),
(4, 0, 0, 1, 0);

-- --------------------------------------------------------

--
-- Table structure for table `scopepermission`
--

CREATE TABLE `scopepermission` (
  `scopeID` int(11) NOT NULL,
  `roleID` int(11) NOT NULL,
  `status` varchar(256) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci COMMENT='relation between scope and role is 1-1, so we don''t need it';

--
-- Dumping data for table `scopepermission`
--

INSERT INTO `scopepermission` (`scopeID`, `roleID`, `status`) VALUES
(1, 1, 'enabled'),
(2, 2, 'disabled'),
(3, 3, 'enabled'),
(4, 4, 'enabled');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `teacherid` int(11) NOT NULL,
  `fullName` varchar(50) NOT NULL,
  `phoneNumber` varchar(11) NOT NULL,
  `img` text DEFAULT NULL,
  `intro` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `token`
--

CREATE TABLE `token` (
  `id` int(11) NOT NULL,
  `expired` bit(1) NOT NULL,
  `revoked` bit(1) NOT NULL,
  `token` varchar(255) DEFAULT NULL,
  `token_type` varchar(255) DEFAULT NULL,
  `userID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `transactionhistory`
--

CREATE TABLE `transactionhistory` (
  `transactionID` int(11) NOT NULL,
  `cost` int(11) DEFAULT NULL,
  `time` timestamp NOT NULL DEFAULT current_timestamp(),
  `state` varchar(16) DEFAULT NULL,
  `courseID` int(11) NOT NULL,
  `userID` int(11) NOT NULL,
  `isPermissionEnabled` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `userID` int(11) NOT NULL COMMENT 'split into two table to ???\r\n',
  `email` varchar(256) NOT NULL,
  `passWord` varchar(256) NOT NULL,
  `scopeID` int(11) NOT NULL,
  `fullName` varchar(256) NOT NULL,
  `phoneNumber` varchar(11) NOT NULL,
  `img` text DEFAULT NULL,
  `createdAt` timestamp NOT NULL DEFAULT current_timestamp(),
  `isVerified` tinyint(1) DEFAULT NULL,
  `roleID` int(11) NOT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `full_name` varchar(255) DEFAULT NULL,
  `is_verified` bit(1) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  `pass_word` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `_user_seq`
--

CREATE TABLE `_user_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `_user_seq`
--

INSERT INTO `_user_seq` (`next_val`) VALUES
(251),
(1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `blog`
--
ALTER TABLE `blog`
  ADD PRIMARY KEY (`blogID`),
  ADD KEY `userID` (`userID`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`categoryID`),
  ADD KEY `parentCategoryID` (`parentCategoryID`);

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`courseID`),
  ADD KEY `categoryID` (`categoryID`),
  ADD KEY `userID` (`userID`);

--
-- Indexes for table `coursesegment`
--
ALTER TABLE `coursesegment`
  ADD PRIMARY KEY (`segmentID`),
  ADD KEY `courseID` (`courseID`);

--
-- Indexes for table `course_teach`
--
ALTER TABLE `course_teach`
  ADD PRIMARY KEY (`course_teach_id`),
  ADD KEY `courseID` (`courseID`),
  ADD KEY `teacherid` (`teacherID`);

--
-- Indexes for table `exam`
--
ALTER TABLE `exam`
  ADD PRIMARY KEY (`examID`),
  ADD KEY `lectureID` (`segmentID`);

--
-- Indexes for table `learnhistory`
--
ALTER TABLE `learnhistory`
  ADD PRIMARY KEY (`id`),
  ADD KEY `lectureID` (`lectureID`),
  ADD KEY `userID` (`userID`);

--
-- Indexes for table `lecture`
--
ALTER TABLE `lecture`
  ADD PRIMARY KEY (`lectureID`),
  ADD KEY `segmentID` (`segmentID`);

--
-- Indexes for table `mentee`
--
ALTER TABLE `mentee`
  ADD PRIMARY KEY (`menteeID`),
  ADD KEY `userID` (`userID`);

--
-- Indexes for table `mentor`
--
ALTER TABLE `mentor`
  ADD PRIMARY KEY (`mentorID`),
  ADD KEY `teacherid` (`teacherid`);

--
-- Indexes for table `mentor_mentee`
--
ALTER TABLE `mentor_mentee`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `menteeID` (`menteeID`),
  ADD KEY `mentorID` (`mentorID`);

--
-- Indexes for table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`roleID`);

--
-- Indexes for table `scope`
--
ALTER TABLE `scope`
  ADD PRIMARY KEY (`ScopeID`);

--
-- Indexes for table `scopepermission`
--
ALTER TABLE `scopepermission`
  ADD PRIMARY KEY (`scopeID`,`roleID`),
  ADD KEY `roleID` (`roleID`);

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`teacherid`);

--
-- Indexes for table `token`
--
ALTER TABLE `token`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_pddrhgwxnms2aceeku9s2ewy5` (`token`),
  ADD KEY `FKiblu4cjwvyntq3ugo31klp1c6` (`userID`);

--
-- Indexes for table `transactionhistory`
--
ALTER TABLE `transactionhistory`
  ADD PRIMARY KEY (`transactionID`),
  ADD KEY `transactionhistory_ibfk_1` (`courseID`),
  ADD KEY `userID` (`userID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`userID`),
  ADD KEY `scopeID` (`scopeID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `blog`
--
ALTER TABLE `blog`
  MODIFY `blogID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `categoryID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `course`
--
ALTER TABLE `course`
  MODIFY `courseID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `coursesegment`
--
ALTER TABLE `coursesegment`
  MODIFY `segmentID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT for table `exam`
--
ALTER TABLE `exam`
  MODIFY `examID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `learnhistory`
--
ALTER TABLE `learnhistory`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `lecture`
--
ALTER TABLE `lecture`
  MODIFY `lectureID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `role`
--
ALTER TABLE `role`
  MODIFY `roleID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `scope`
--
ALTER TABLE `scope`
  MODIFY `ScopeID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `teacher`
--
ALTER TABLE `teacher`
  MODIFY `teacherid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `transactionhistory`
--
ALTER TABLE `transactionhistory`
  MODIFY `transactionID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `userID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'split into two table to ???\r\n', AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `blog`
--
ALTER TABLE `blog`
  ADD CONSTRAINT `blog_ibfk_1` FOREIGN KEY (`userID`) REFERENCES `user` (`userID`);

--
-- Constraints for table `category`
--
ALTER TABLE `category`
  ADD CONSTRAINT `category_ibfk_1` FOREIGN KEY (`parentCategoryID`) REFERENCES `category` (`categoryID`);

--
-- Constraints for table `course`
--
ALTER TABLE `course`
  ADD CONSTRAINT `course_ibfk_1` FOREIGN KEY (`categoryID`) REFERENCES `category` (`categoryID`),
  ADD CONSTRAINT `course_ibfk_2` FOREIGN KEY (`userID`) REFERENCES `user` (`userID`);

--
-- Constraints for table `coursesegment`
--
ALTER TABLE `coursesegment`
  ADD CONSTRAINT `coursesegment_ibfk_1` FOREIGN KEY (`courseID`) REFERENCES `course` (`courseID`);

--
-- Constraints for table `course_teach`
--
ALTER TABLE `course_teach`
  ADD CONSTRAINT `courseID` FOREIGN KEY (`courseID`) REFERENCES `course` (`courseID`),
  ADD CONSTRAINT `teacherid` FOREIGN KEY (`teacherID`) REFERENCES `teacher` (`teacherid`);

--
-- Constraints for table `exam`
--
ALTER TABLE `exam`
  ADD CONSTRAINT `exam_ibfk_1` FOREIGN KEY (`segmentID`) REFERENCES `lecture` (`lectureID`);

--
-- Constraints for table `learnhistory`
--
ALTER TABLE `learnhistory`
  ADD CONSTRAINT `learnhistory_ibfk_1` FOREIGN KEY (`lectureID`) REFERENCES `lecture` (`lectureID`),
  ADD CONSTRAINT `learnhistory_ibfk_2` FOREIGN KEY (`userID`) REFERENCES `user` (`userID`);

--
-- Constraints for table `lecture`
--
ALTER TABLE `lecture`
  ADD CONSTRAINT `lecture_ibfk_1` FOREIGN KEY (`segmentID`) REFERENCES `coursesegment` (`segmentID`);

--
-- Constraints for table `mentee`
--
ALTER TABLE `mentee`
  ADD CONSTRAINT `Mentee_ibfk_1` FOREIGN KEY (`userID`) REFERENCES `user` (`userID`);

--
-- Constraints for table `mentor`
--
ALTER TABLE `mentor`
  ADD CONSTRAINT `mentor_ibfk_1` FOREIGN KEY (`mentorID`) REFERENCES `mentor_mentee` (`mentorID`);

--
-- Constraints for table `mentor_mentee`
--
ALTER TABLE `mentor_mentee`
  ADD CONSTRAINT `mentor_mentee_ibfk_1` FOREIGN KEY (`menteeID`) REFERENCES `mentee` (`menteeID`),
  ADD CONSTRAINT `mentor_mentee_ibfk_2` FOREIGN KEY (`mentorID`) REFERENCES `mentor` (`mentorID`);

--
-- Constraints for table `scopepermission`
--
ALTER TABLE `scopepermission`
  ADD CONSTRAINT `scopepermission_ibfk_1` FOREIGN KEY (`roleID`) REFERENCES `role` (`roleID`),
  ADD CONSTRAINT `scopepermission_ibfk_2` FOREIGN KEY (`scopeID`) REFERENCES `scope` (`ScopeID`);

--
-- Constraints for table `teacher`
--
ALTER TABLE `teacher`
  ADD CONSTRAINT `teacher_ibfk_1` FOREIGN KEY (`teacherid`) REFERENCES `mentor` (`teacherid`);

--
-- Constraints for table `token`
--
ALTER TABLE `token`
  ADD CONSTRAINT `FKiblu4cjwvyntq3ugo31klp1c6` FOREIGN KEY (`userID`) REFERENCES `user` (`userID`);

--
-- Constraints for table `transactionhistory`
--
ALTER TABLE `transactionhistory`
  ADD CONSTRAINT `transactionhistory_ibfk_1` FOREIGN KEY (`courseID`) REFERENCES `course` (`courseID`) ON DELETE CASCADE,
  ADD CONSTRAINT `transactionhistory_ibfk_2` FOREIGN KEY (`userID`) REFERENCES `user` (`userID`) ON DELETE CASCADE;

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `user_ibfk_1` FOREIGN KEY (`scopeID`) REFERENCES `scope` (`ScopeID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
