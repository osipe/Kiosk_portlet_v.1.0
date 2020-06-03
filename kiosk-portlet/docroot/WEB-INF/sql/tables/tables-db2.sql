create table alpha_bdqh_bieudoquyhoach (
	bieuDoQuyHoachId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(255),
	ma varchar(75),
	moTa varchar(750),
	urlFile varchar(75),
	hoatDong smallint,
	doUuTien integer
);

create table alpha_dghl_cauhoi (
	cauHoiId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
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
	danhGiaHaiLongId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	resourceCode bigint,
	resourcePK bigint,
	cauHoiId bigint,
	traLoiId bigint
);

create table alpha_dghl_traloi (
	traLoiId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	cauHoiId bigint,
	noiDung varchar(75),
	mucDoHaiLong integer,
	diem integer
);

create table alpha_dm_bieumaubaocao (
	bieuMauBaoCaoId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	chuyenMucBieuMauId bigint,
	ten varchar(75),
	ma varchar(75),
	moTa varchar(75),
	loai integer,
	hoatDong smallint
);

create table alpha_dm_cauhinh (
	cauHinhId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	portletId varchar(75),
	resourceCodeId bigint,
	primKey bigint,
	preferences varchar(75),
	type_ integer,
	description varchar(75)
);

create table alpha_dm_filedinhkem (
	resourceCode bigint not null,
	primKey bigint not null,
	fileEntryId bigint not null,
	nhanQuaMang smallint,
	extension varchar(75),
	primary key (resourceCode, primKey, fileEntryId)
);

create table alpha_dm_linhvuc (
	linhVucId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
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
	loaiHoSoId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	linhVucId bigint,
	ten varchar(75),
	ma varchar(75),
	moTa varchar(75),
	hoatDong smallint,
	doUuTien integer,
	baiVietId bigint
);
