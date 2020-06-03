create table alpha_bdqh_bieudoquyhoach (
	bieuDoQuyHoachId int8 not null primary key,
	groupId int8,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	ten varchar(255),
	ma varchar(75),
	moTa lvarchar,
	urlFile varchar(75),
	hoatDong boolean,
	doUuTien int
)
extent size 16 next size 16
lock mode row;

create table alpha_dghl_cauhoi (
	cauHoiId int8 not null primary key,
	groupId int8,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	ten varchar(75),
	ma varchar(75),
	moTa varchar(75),
	hoatDong boolean,
	doUuTien int,
	boCauHoi int
)
extent size 16 next size 16
lock mode row;

create table alpha_dghl_danhgiahailong (
	danhGiaHaiLongId int8 not null primary key,
	groupId int8,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	resourceCode int8,
	resourcePK int8,
	cauHoiId int8,
	traLoiId int8
)
extent size 16 next size 16
lock mode row;

create table alpha_dghl_traloi (
	traLoiId int8 not null primary key,
	groupId int8,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	cauHoiId int8,
	noiDung varchar(75),
	mucDoHaiLong int,
	diem int
)
extent size 16 next size 16
lock mode row;

create table alpha_dm_bieumaubaocao (
	bieuMauBaoCaoId int8 not null primary key,
	groupId int8,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	chuyenMucBieuMauId int8,
	ten varchar(75),
	ma varchar(75),
	moTa varchar(75),
	loai int,
	hoatDong boolean
)
extent size 16 next size 16
lock mode row;

create table alpha_dm_cauhinh (
	cauHinhId int8 not null primary key,
	groupId int8,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	portletId varchar(75),
	resourceCodeId int8,
	primKey int8,
	preferences varchar(75),
	type_ int,
	description varchar(75)
)
extent size 16 next size 16
lock mode row;

create table alpha_dm_filedinhkem (
	resourceCode int8 not null,
	primKey int8 not null,
	fileEntryId int8 not null,
	nhanQuaMang boolean,
	extension varchar(75),
	primary key (resourceCode, primKey, fileEntryId)
)
extent size 16 next size 16
lock mode row;

create table alpha_dm_linhvuc (
	linhVucId int8 not null primary key,
	groupId int8,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	ten varchar(75),
	ma varchar(75),
	moTa varchar(75),
	hoatDong boolean,
	doUuTien int
)
extent size 16 next size 16
lock mode row;

create table alpha_dm_loaihoso (
	loaiHoSoId int8 not null primary key,
	groupId int8,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	linhVucId int8,
	ten varchar(75),
	ma varchar(75),
	moTa varchar(75),
	hoatDong boolean,
	doUuTien int,
	baiVietId int8
)
extent size 16 next size 16
lock mode row;
