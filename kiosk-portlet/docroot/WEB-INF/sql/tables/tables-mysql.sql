create table alpha_bdqh_bieudoquyhoach (
	bieuDoQuyHoachId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(255) null,
	ma varchar(75) null,
	moTa longtext null,
	urlFile varchar(75) null,
	hoatDong tinyint,
	doUuTien integer
) engine InnoDB;

create table alpha_dghl_cauhoi (
	cauHoiId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	ma varchar(75) null,
	moTa varchar(75) null,
	hoatDong tinyint,
	doUuTien integer,
	boCauHoi integer
) engine InnoDB;

create table alpha_dghl_danhgiahailong (
	danhGiaHaiLongId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	resourceCode bigint,
	resourcePK bigint,
	cauHoiId bigint,
	traLoiId bigint
) engine InnoDB;

create table alpha_dghl_traloi (
	traLoiId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	cauHoiId bigint,
	noiDung varchar(75) null,
	mucDoHaiLong integer,
	diem integer
) engine InnoDB;

create table alpha_dm_bieumaubaocao (
	bieuMauBaoCaoId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	chuyenMucBieuMauId bigint,
	ten varchar(75) null,
	ma varchar(75) null,
	moTa varchar(75) null,
	loai integer,
	hoatDong tinyint
) engine InnoDB;

create table alpha_dm_cauhinh (
	cauHinhId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	portletId varchar(75) null,
	resourceCodeId bigint,
	primKey bigint,
	preferences varchar(75) null,
	type_ integer,
	description varchar(75) null
) engine InnoDB;

create table alpha_dm_filedinhkem (
	resourceCode bigint not null,
	primKey bigint not null,
	fileEntryId bigint not null,
	nhanQuaMang tinyint,
	extension varchar(75) null,
	primary key (resourceCode, primKey, fileEntryId)
) engine InnoDB;

create table alpha_dm_linhvuc (
	linhVucId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	ma varchar(75) null,
	moTa varchar(75) null,
	hoatDong tinyint,
	doUuTien integer
) engine InnoDB;

create table alpha_dm_loaihoso (
	loaiHoSoId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	linhVucId bigint,
	ten varchar(75) null,
	ma varchar(75) null,
	moTa varchar(75) null,
	hoatDong tinyint,
	doUuTien integer,
	baiVietId bigint
) engine InnoDB;
