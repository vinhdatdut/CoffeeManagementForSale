-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th2 27, 2020 lúc 06:32 PM
-- Phiên bản máy phục vụ: 10.4.8-MariaDB
-- Phiên bản PHP: 7.1.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `caffeemanagement`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `bill`
--

CREATE TABLE `bill` (
  `MaKhachHang` varchar(10) DEFAULT NULL,
  `ban` varchar(10) DEFAULT NULL,
  `thoigianvao` varchar(100) DEFAULT NULL,
  `thoigianra` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dataad`
--

CREATE TABLE `dataad` (
  `passad` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `datashop`
--

CREATE TABLE `datashop` (
  `doanhthu` double DEFAULT NULL,
  `tienvoucher` double DEFAULT NULL,
  `giamtichluy` double DEFAULT NULL,
  `d` int(11) DEFAULT NULL,
  `m` int(11) DEFAULT NULL,
  `y` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khachhang`
--

CREATE TABLE `khachhang` (
  `MaKH` varchar(10) NOT NULL,
  `TenKhachHang` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `GioiTinh` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  `NgaySinh` date DEFAULT NULL,
  `sdt` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `DiaChi` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  `Diem` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `menu`
--

CREATE TABLE `menu` (
  `MaMon` varchar(10) NOT NULL,
  `TenMon` varchar(500) CHARACTER SET utf8 DEFAULT NULL,
  `DonGia` double DEFAULT NULL,
  `ChuThich` varchar(500) CHARACTER SET utf8 DEFAULT NULL,
  `solandat` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `menu`
--

INSERT INTO `menu` (`MaMon`, `TenMon`, `DonGia`, `ChuThich`, `solandat`) VALUES
('BC01', 'AMERICANO', 39000, '', 0),
('BC02', 'BẠC SỈU', 29000, '', 0),
('BC03', 'CÀ PHÊ ĐEN', 29000, '', 5),
('BC04', 'CÀ PHÊ SỮA', 29000, '', 0),
('BC05', 'CAPPUCINNO', 45000, '', 1),
('BC06', 'CARAMEL MACCHIATO', 55000, '', 3),
('BC07', 'COLD BREW CAM SẢ', 55000, '', 0),
('BC08', 'COLD BREW PHÚC BỒN TỬ', 55000, '', 0),
('BC09', 'COLD BREW SỮA TƯƠI', 50000, '', 0),
('BC10', 'COLD BREW SỮA TƯƠI MACCHIATO', 50000, '', 3),
('BC11', 'COLD BREW TRUYỀN THỐNG', 45000, '', 0),
('BC12', 'ESPRESSO', 30000, '', 0),
('BC13', 'LATTE', 45000, '', 0),
('BC14', 'MOCHA', 49000, '', 0),
('BC15', 'SÔ-CÔ-LA ĐÁ', 55000, '', 3),
('BF01', 'SINH TỐ CAM XOÀI', 59000, '', 0),
('BF02', 'SINH TỐ VIỆT QUẤT', 59000, '', 1),
('BI01', 'CHANH SẢ ĐÁ XAY', 49000, '', 1),
('BI02', 'CHOCOLATE ĐÁ XAY', 59000, '', 0),
('BI03', 'COOKIES ĐÁ XAY', 59000, '', 0),
('BI04', 'ĐÀO VIỆT QUẤT ĐÁ XAY', 59000, '', 2),
('BI05', 'MATCHA ĐÁ XAY', 59000, '', 0),
('BI06', 'ỔI HỒNG VIỆT QUẤT ĐÁ XAY', 59000, '', 0),
('BI07', 'PHÚC BỒN TỬ CAM ĐÁ XAY', 59000, '', 3),
('BT01', 'TRÀ CHERRY MACCHIATO', 55000, '', 0),
('BT02', 'TRÀ ĐÀO CAM SẢ', 45000, '', 8),
('BT03', 'TRÀ ĐEN MACCHIATO', 42000, '', 2),
('BT04', 'TRÀ MATCHA LATTE', 59000, '', 2),
('BT05', 'TRÀ MATCHA MACCHIATO', 45000, '', 0),
('BT06', 'TRÀ OOLONG SEN AN NHIÊN', 45000, '', 0),
('BT07', 'TRÀ OOLONG VẢI NHƯ Ý', 45000, '', 0),
('BT08', 'TRÀ PHÚC BỒN TỬ', 49000, '', 0),
('BT09', 'TRÀ XOÀI MACCHIATO', 55000, '', 0),
('FC01', 'BÁNH BÔNG LAN TRỨNG MUỐI', 29000, '', 0),
('FC02', 'BÁNH CHOCOLATE', 29000, '', 5),
('FC03', 'BÁNH CROISSANT BƠ TỎI', 29000, '', 0),
('FC04', 'BÁNH GẤU CHOCOLATE', 39000, '', 3),
('FC05', 'BÁNH MATCHA', 29000, '', 3),
('FC06', 'BÁNH MÌ CHÀ BÔNG PHÔ MAI', 32000, '', 0),
('FC07', 'BÁNH PASSION CHEESE', 29000, '', 0),
('FC08', 'BÁNH TIRAMISU', 29000, '', 3);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `orderdb`
--

CREATE TABLE `orderdb` (
  `ban` varchar(10) DEFAULT NULL,
  `TenMon` varchar(500) CHARACTER SET utf8 DEFAULT NULL,
  `SoLuong` double DEFAULT NULL,
  `mamon` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tempdata`
--

CREATE TABLE `tempdata` (
  `tempTable` varchar(20) DEFAULT NULL,
  `tempKH` varchar(100) DEFAULT NULL,
  `tempVoucher` varchar(100) DEFAULT NULL,
  `tempDiem` int(11) DEFAULT NULL,
  `tempMon` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `voucher`
--

CREATE TABLE `voucher` (
  `Ma` varchar(100) NOT NULL,
  `Giam` double DEFAULT NULL,
  `ApDung` varchar(100) DEFAULT NULL,
  `NgayBatDau` date DEFAULT NULL,
  `NgayKetThuc` date DEFAULT NULL,
  `giamtoida` double DEFAULT NULL,
  `solandung` int(11) DEFAULT NULL,
  `dadung` varchar(10) DEFAULT NULL,
  `thoidiemdung` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`MaKH`);

--
-- Chỉ mục cho bảng `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`MaMon`),
  ADD UNIQUE KEY `TenMon` (`TenMon`);

--
-- Chỉ mục cho bảng `orderdb`
--
ALTER TABLE `orderdb`
  ADD KEY `fk` (`TenMon`);

--
-- Chỉ mục cho bảng `voucher`
--
ALTER TABLE `voucher`
  ADD PRIMARY KEY (`Ma`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `orderdb`
--
ALTER TABLE `orderdb`
  ADD CONSTRAINT `fk` FOREIGN KEY (`TenMon`) REFERENCES `menu` (`TenMon`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
