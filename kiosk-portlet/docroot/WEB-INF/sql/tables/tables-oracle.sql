create table alpha_bdqh_bieudoquyhoach (
	bieuDoQuyHoachId number(30,0) not null primary key,
	groupId number(30,0),
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten VARCHAR2(255 CHAR) null,
	ma VARCHAR2(75 CHAR) null,
	moTa varchar2(4000) null,
	urlFile VARCHAR2(75 CHAR) null,
	hoatDong number(1, 0),
	doUuTien number(30,0)
);

create table alpha_dghl_cauhoi (
	cauHoiId number(30,0) not null primary key,
	groupId number(30,0),
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten VARCHAR2(75 CHAR) null,
	ma VARCHAR2(75 CHAR) null,
	moTa VARCHAR2(75 CHAR) null,
	hoatDong number(1, 0),
	doUuTien number(30,0),
	boCauHoi number(30,0)
);

create table alpha_dghl_danhgiahailong (
	danhGiaHaiLongId number(30,0) not null primary key,
	groupId number(30,0),
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	resourceCode number(30,0),
	resourcePK number(30,0),
	cauHoiId number(30,0),
	traLoiId number(30,0)
);

create table alpha_dghl_traloi (
	traLoiId number(30,0) not null primary key,
	groupId number(30,0),
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	cauHoiId number(30,0),
	noiDung VARCHAR2(75 CHAR) null,
	mucDoHaiLong number(30,0),
	diem number(30,0)
);

create table alpha_dm_bieumaubaocao (
	bieuMauBaoCaoId number(30,0) not null primary key,
	groupId number(30,0),
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	chuyenMucBieuMauId number(30,0),
	ten VARCHAR2(75 CHAR) null,
	ma VARCHAR2(75 CHAR) null,
	moTa VARCHAR2(75 CHAR) null,
	loai number(30,0),
	hoatDong number(1, 0)
);

create table alpha_dm_cauhinh (
	cauHinhId number(30,0) not null primary key,
	groupId number(30,0),
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	portletId VARCHAR2(75 CHAR) null,
	resourceCodeId number(30,0),
	primKey number(30,0),
	preferences VARCHAR2(75 CHAR) null,
	type_ number(30,0),
	description VARCHAR2(75 CHAR) null
);

create table alpha_dm_filedinhkem (
	resourceCode number(30,0) not null,
	primKey number(30,0) not null,
	fileEntryId number(30,0) not null,
	nhanQuaMang number(1, 0),
	extension VARCHAR2(75 CHAR) null,
	primary key (resourceCode, primKey, fileEntryId)
);

create table alpha_dm_linhvuc (
	linhVucId number(30,0) not null primary key,
	groupId number(30,0),
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten VARCHAR2(75 CHAR) null,
	ma VARCHAR2(75 CHAR) null,
	moTa VARCHAR2(75 CHAR) null,
	hoatDong number(1, 0),
	doUuTien number(30,0)
);

create table alpha_dm_loaihoso (
	loaiHoSoId number(30,0) not null primary key,
	groupId number(30,0),
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	linhVucId number(30,0),
	ten VARCHAR2(75 CHAR) null,
	ma VARCHAR2(75 CHAR) null,
	moTa VARCHAR2(75 CHAR) null,
	hoatDong number(1, 0),
	doUuTien number(30,0),
	baiVietId number(30,0)
);
