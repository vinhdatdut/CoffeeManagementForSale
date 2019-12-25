-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th12 25, 2019 lúc 04:36 PM
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
  `thoigianvao` datetime DEFAULT NULL,
  `thoigianra` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dataad`
--

CREATE TABLE `dataad` (
  `passad` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `dataad`
--

INSERT INTO `dataad` (`passad`) VALUES
('123');

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

--
-- Đang đổ dữ liệu cho bảng `datashop`
--

INSERT INTO `datashop` (`doanhthu`, `tienvoucher`, `giamtichluy`, `d`, `m`, `y`) VALUES
(200000, 30000, 1000, 25, 12, 2019),
(40000, 0, 0, 25, 12, 2019),
(4000000, 30000, 7195, 25, 12, 2019),
(150000, 30000, 10000, 25, 12, 2019),
(30000, 0, 0, 25, 12, 2019),
(160000, 30000, 100000, 25, 12, 2019);

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

--
-- Đang đổ dữ liệu cho bảng `khachhang`
--

INSERT INTO `khachhang` (`MaKH`, `TenKhachHang`, `GioiTinh`, `NgaySinh`, `sdt`, `email`, `DiaChi`, `Diem`) VALUES
('154091223', 'Nguyễn Văn A', 'Nam', '1999-06-15', '123456', '123456@gmail.com', 'Thừa Thiên Huế', 0),
('179090409', 'Nguyễn Tuyết My', 'Nữ', '2002-10-22', '987654312', 'tuyetmy@gmail.com', 'Huế', 0),
('admin', 'Nguyễn Vĩnh Đạt', 'Nam', '1999-09-04', '0965040999', 'vinhdat4999@gmail.com', 'Thừa Thiên Huế', 19784),
('cuong', 'Nguyễn Vĩnh Cường', 'Nam', '2008-09-10', '147852369', 'vinhcuong@gmail.com', 'Thừa Thiên Huế', 4400);

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
('BA001', 'Sữa thêm', 5000, NULL, 0),
('BA002', 'Cheese thêm', 20000, NULL, 0),
('BA003', 'Trân châu thêm', 15000, NULL, 0),
('BCF1', 'Cafe sữa', 16000, '', 0),
('BCF2', 'Cafe expresso', 18000, NULL, 0),
('BCF3', 'Cafe Americano', 18000, NULL, 0),
('BCF4', 'Cafe sữa đá Sài Gòn', 15000, 'null', 1),
('BCF7', 'Cafe trứng', 25000, 'null', 4),
('BK001', 'Nước chanh siêu to khổng lồ', 20000, '', 0),
('BK002', 'Trà đào', 31000, '', 0),
('BTS02', 'Trà sữa matcha', 40000, '', 105),
('BTS03', 'Trà sữa socola', 40000, 'null', 9),
('BTS04', 'Trà sữa đặc biệt', 50000, NULL, 0),
('F001', 'Khô bò lá chanh', 30000, 'null', 2),
('F002', 'Hạt dưa', 15000, 'null', 10),
('F003', 'Hạt hướng dương', 15000, NULL, 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `orderdb`
--

CREATE TABLE `orderdb` (
  `ban` varchar(10) DEFAULT NULL,
  `TenMon` varchar(500) CHARACTER SET utf8 DEFAULT NULL,
  `SoLuong` double DEFAULT NULL
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

--
-- Đang đổ dữ liệu cho bảng `tempdata`
--

INSERT INTO `tempdata` (`tempTable`, `tempKH`, `tempVoucher`, `tempDiem`, `tempMon`) VALUES
('18', '0', '0', 0, 'cuong');

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
-- Đang đổ dữ liệu cho bảng `voucher`
--

INSERT INTO `voucher` (`Ma`, `Giam`, `ApDung`, `NgayBatDau`, `NgayKetThuc`, `giamtoida`, `solandung`, `dadung`, `thoidiemdung`) VALUES
('110344895', 0.2, 'ALL', '2019-12-25', '2020-01-16', 30000, 1, 'chưa', '1999-09-04 10:10:10'),
('114974112', 0.2, 'ALL', '2019-12-25', '2020-01-16', 30000, 1, 'đã dùng', '2019-12-25 21:50:40'),
('116040498', 0.2, 'ALL', '2019-12-25', '2020-01-16', 30000, 1, 'chưa', '1999-09-04 10:10:10'),
('122692692', 0.5, 'ALL', '2019-12-25', '2019-12-26', 50000, 1, 'đã dùng', '2019-12-25 19:14:01'),
('127814504', 0.2, 'ALL', '2019-12-25', '2020-01-16', 30000, 1, 'chưa', '1999-09-04 10:10:10'),
('132865331', 0.2, 'ALL', '2019-12-25', '2020-01-16', 30000, 1, 'chưa', '1999-09-04 10:10:10'),
('135790146', 0.2, 'ALL', '2019-12-25', '2020-01-16', 30000, 1, 'chưa', '1999-09-04 10:10:10'),
('136402421', 0.2, 'ALL', '2019-12-25', '2020-01-16', 30000, 1, 'chưa', '1999-09-04 10:10:10'),
('147856853', 0.2, 'ALL', '2019-12-25', '2020-01-16', 30000, 1, 'chưa', '1999-09-04 10:10:10'),
('157545381', 0.2, 'ALL', '2019-12-25', '2020-01-16', 30000, 1, 'chưa', '1999-09-04 10:10:10'),
('170478953', 0.2, 'ALL', '2019-12-25', '2020-01-16', 30000, 1, 'chưa', '1999-09-04 10:10:10'),
('HAPPY2020', 0.2, 'ALL', '2019-12-25', '2020-01-02', 30000, 0, 'chưa', '1999-09-04 10:10:10');

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
