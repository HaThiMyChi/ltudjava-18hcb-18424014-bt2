-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Aug 25, 2019 at 08:23 AM
-- Server version: 5.7.26
-- PHP Version: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_studentmanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `tblaccount`
--

DROP TABLE IF EXISTS `tblaccount`;
CREATE TABLE IF NOT EXISTS `tblaccount` (
  `AccountID` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `StudentID` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`AccountID`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tblaccount`
--

INSERT INTO `tblaccount` (`AccountID`, `username`, `password`, `StudentID`) VALUES
(1, 'giaovu', '123', ''),
(3, '1742001', '1742001', '1742001'),
(4, '1842001', '1842001', '1842001');

-- --------------------------------------------------------

--
-- Table structure for table `tbldiem`
--

DROP TABLE IF EXISTS `tbldiem`;
CREATE TABLE IF NOT EXISTS `tbldiem` (
  `MaLop` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `MaMon` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `StudentID` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `DiemGK` float DEFAULT NULL,
  `DiemCK` float DEFAULT NULL,
  `DiemKhac` float DEFAULT NULL,
  `DiemTong` float DEFAULT NULL,
  PRIMARY KEY (`MaLop`,`MaMon`,`StudentID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tbldiem`
--

INSERT INTO `tbldiem` (`MaLop`, `MaMon`, `StudentID`, `DiemGK`, `DiemCK`, `DiemKhac`, `DiemTong`) VALUES
('17HCB', 'CTT011', '1742001', 1, 2, 3, 2);

-- --------------------------------------------------------

--
-- Table structure for table `tbllop`
--

DROP TABLE IF EXISTS `tbllop`;
CREATE TABLE IF NOT EXISTS `tbllop` (
  `MaLop` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `TenLop` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `Ghichu` text COLLATE utf8_unicode_ci,
  PRIMARY KEY (`MaLop`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tbllop`
--

INSERT INTO `tbllop` (`MaLop`, `TenLop`, `Ghichu`) VALUES
('18HCB', NULL, NULL),
('17HCB', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `tbllopmonhoc`
--

DROP TABLE IF EXISTS `tbllopmonhoc`;
CREATE TABLE IF NOT EXISTS `tbllopmonhoc` (
  `MaLop` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `MaMon` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `StudentID` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `Status` int(11) DEFAULT NULL,
  PRIMARY KEY (`MaLop`,`MaMon`,`StudentID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tbllopmonhoc`
--

INSERT INTO `tbllopmonhoc` (`MaLop`, `MaMon`, `StudentID`, `Status`) VALUES
('17HCB', 'CTT011', '1742001', 0),
('17HCB', 'CTT012', '1742002', 0),
('17HCB', 'CTT012', '1742003', 0);

-- --------------------------------------------------------

--
-- Table structure for table `tblmonhoc`
--

DROP TABLE IF EXISTS `tblmonhoc`;
CREATE TABLE IF NOT EXISTS `tblmonhoc` (
  `MaMon` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `TenMon` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `Ghichu` text COLLATE utf8_unicode_ci,
  PRIMARY KEY (`MaMon`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tblmonhoc`
--

INSERT INTO `tblmonhoc` (`MaMon`, `TenMon`, `Ghichu`) VALUES
('CTT011', 'Thiết kế giao diện', NULL),
('CTT012', 'Kiểm chứng phần mềm', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `tblphuckhaodiem`
--

DROP TABLE IF EXISTS `tblphuckhaodiem`;
CREATE TABLE IF NOT EXISTS `tblphuckhaodiem` (
  `StudentID` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `MaLop` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `MaMon` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `CotDiemCanPhucKhao` text COLLATE utf8_unicode_ci,
  `DiemMongMuon` float DEFAULT NULL,
  `LiDo` text COLLATE utf8_unicode_ci,
  `NgayDangKy` date DEFAULT NULL,
  `IDtinhtrang` int(11) DEFAULT NULL,
  PRIMARY KEY (`StudentID`,`MaLop`,`MaMon`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tblphuckhaodiem`
--

INSERT INTO `tblphuckhaodiem` (`StudentID`, `MaLop`, `MaMon`, `CotDiemCanPhucKhao`, `DiemMongMuon`, `LiDo`, `NgayDangKy`, `IDtinhtrang`) VALUES
('1742001', '17HCB', 'CTT011', 'Điểm Cuối Kỳ', 8, 'Chấm sót', '2019-08-25', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tblsinhvien`
--

DROP TABLE IF EXISTS `tblsinhvien`;
CREATE TABLE IF NOT EXISTS `tblsinhvien` (
  `StudentID` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `Fullname` text COLLATE utf8_unicode_ci,
  `Sex` bit(1) DEFAULT NULL,
  `IdentityCard` varchar(13) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MaLop` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`StudentID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tblsinhvien`
--

INSERT INTO `tblsinhvien` (`StudentID`, `Fullname`, `Sex`, `IdentityCard`, `MaLop`) VALUES
('1742003', 'Huỳnh Thị C', b'1', '345678912', '17HCB'),
('1742002', 'Trần Văn B', b'0', '234567891', '17HCB'),
('1842001', 'Lý Văn F', b'0', '678912345', '18HCB'),
('1742001', 'Nguyễn Văn A', b'0', '123456789', '17HCB');

-- --------------------------------------------------------

--
-- Table structure for table `tblthoigianphuckhao`
--

DROP TABLE IF EXISTS `tblthoigianphuckhao`;
CREATE TABLE IF NOT EXISTS `tblthoigianphuckhao` (
  `ID` int(11) NOT NULL,
  `ngaybatdau` date DEFAULT NULL,
  `ngayketthuc` date DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tblthoigianphuckhao`
--

INSERT INTO `tblthoigianphuckhao` (`ID`, `ngaybatdau`, `ngayketthuc`) VALUES
(1, '2019-08-01', '2019-08-28');

-- --------------------------------------------------------

--
-- Table structure for table `tblthoikhoabieu`
--

DROP TABLE IF EXISTS `tblthoikhoabieu`;
CREATE TABLE IF NOT EXISTS `tblthoikhoabieu` (
  `MaLop` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `MaMon` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `Hocky` int(11) NOT NULL,
  `NamHoc` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `PhongHoc` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Ghichu` text COLLATE utf8_unicode_ci,
  PRIMARY KEY (`MaLop`,`MaMon`,`Hocky`,`NamHoc`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tblthoikhoabieu`
--

INSERT INTO `tblthoikhoabieu` (`MaLop`, `MaMon`, `Hocky`, `NamHoc`, `PhongHoc`, `Ghichu`) VALUES
('17HCB', 'CTT011', 1, '18-19', 'C32', NULL),
('17HCB', 'CTT012', 1, '18-19', 'C32', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `tbltinhtrangphuckhao`
--

DROP TABLE IF EXISTS `tbltinhtrangphuckhao`;
CREATE TABLE IF NOT EXISTS `tbltinhtrangphuckhao` (
  `ID` int(11) NOT NULL,
  `Tentinhtrangphuckhao` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tbltinhtrangphuckhao`
--

INSERT INTO `tbltinhtrangphuckhao` (`ID`, `Tentinhtrangphuckhao`) VALUES
(1, 'Chưa xem'),
(2, 'Đã cập nhật điểm'),
(3, 'Không cập nhật điểm');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
