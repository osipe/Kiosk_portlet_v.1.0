create table alpha_bdqh_bieudoquyhoach (
	bieuDoQuyHoachId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(255) null,
	ma varchar(75) null,
	moTa longvarchar null,
	urlFile varchar(75) null,
	hoatDong bit,
	doUuTien int
);

create table alpha_dghl_cauhoi (
	cauHoiId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(75) null,
	ma varchar(75) null,
	moTa varchar(75) null,
	hoatDong bit,
	doUuTien int,
	boCauHoi int
);

create table alpha_dghl_danhgiahailong (
	danhGiaHaiLongId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
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
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	cauHoiId bigint,
	noiDung varchar(75) null,
	mucDoHaiLong int,
	diem int
);

create table alpha_dm_bieumaubaocao (
	bieuMauBaoCaoId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	chuyenMucBieuMauId bigint,
	ten varchar(75) null,
	ma varchar(75) null,
	moTa varchar(75) null,
	loai int,
	hoatDong bit
);

create table alpha_dm_cauhinh (
	cauHinhId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	portletId varchar(75) null,
	resourceCodeId bigint,
	primKey bigint,
	preferences varchar(75) null,
	type_ int,
	description varchar(75) null
);

create table alpha_dm_filedinhkem (
	resourceCode bigint not null,
	primKey bigint not null,
	fileEntryId bigint not null,
	nhanQuaMang bit,
	extension varchar(75) null,
	primary key (resourceCode, primKey, fileEntryId)
);

create table alpha_dm_linhvuc (
	linhVucId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(75) null,
	ma varchar(75) null,
	moTa varchar(75) null,
	hoatDong bit,
	doUuTien int
);

create table alpha_dm_loaihoso (
	loaiHoSoId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	linhVucId bigint,
	ten varchar(75) null,
	ma varchar(75) null,
	moTa varchar(75) null,
	hoatDong bit,
	doUuTien int,
	baiVietId bigint
);
