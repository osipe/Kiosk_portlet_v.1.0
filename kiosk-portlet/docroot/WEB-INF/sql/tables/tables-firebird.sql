create table alpha_bdqh_bieudoquyhoach (
	bieuDoQuyHoachId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(255),
	ma varchar(75),
	moTa varchar(4000),
	urlFile varchar(75),
	hoatDong smallint,
	doUuTien integer
);

create table alpha_dghl_cauhoi (
	cauHoiId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	ma varchar(75),
	moTa varchar(75),
	hoatDong smallint,
	doUuTien integer,
	boCauHoi integer
);

create table alpha_dghl_danhgiahailong (
	danhGiaHaiLongId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	resourceCode int64,
	resourcePK int64,
	cauHoiId int64,
	traLoiId int64
);

create table alpha_dghl_traloi (
	traLoiId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	cauHoiId int64,
	noiDung varchar(75),
	mucDoHaiLong integer,
	diem integer
);

create table alpha_dm_bieumaubaocao (
	bieuMauBaoCaoId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	chuyenMucBieuMauId int64,
	ten varchar(75),
	ma varchar(75),
	moTa varchar(75),
	loai integer,
	hoatDong smallint
);

create table alpha_dm_cauhinh (
	cauHinhId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	portletId varchar(75),
	resourceCodeId int64,
	primKey int64,
	preferences varchar(75),
	type_ integer,
	description varchar(75)
);

create table alpha_dm_filedinhkem (
	resourceCode int64 not null,
	primKey int64 not null,
	fileEntryId int64 not null,
	nhanQuaMang smallint,
	extension varchar(75),
	primary key (resourceCode, primKey, fileEntryId)
);

create table alpha_dm_linhvuc (
	linhVucId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	ma varchar(75),
	moTa varchar(75),
	hoatDong smallint,
	doUuTien integer
);

create table alpha_dm_loaihoso (
	loaiHoSoId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	linhVucId int64,
	ten varchar(75),
	ma varchar(75),
	moTa varchar(75),
	hoatDong smallint,
	doUuTien integer,
	baiVietId int64
);
