create table alpha_bdqh_bieudoquyhoach (
	bieuDoQuyHoachId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten nvarchar(255) null,
	ma nvarchar(75) null,
	moTa nvarchar(2000) null,
	urlFile nvarchar(75) null,
	hoatDong bit,
	doUuTien int
);

create table alpha_dghl_cauhoi (
	cauHoiId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten nvarchar(75) null,
	ma nvarchar(75) null,
	moTa nvarchar(75) null,
	hoatDong bit,
	doUuTien int,
	boCauHoi int
);

create table alpha_dghl_danhgiahailong (
	danhGiaHaiLongId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
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
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	cauHoiId bigint,
	noiDung nvarchar(75) null,
	mucDoHaiLong int,
	diem int
);

create table alpha_dm_bieumaubaocao (
	bieuMauBaoCaoId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	chuyenMucBieuMauId bigint,
	ten nvarchar(75) null,
	ma nvarchar(75) null,
	moTa nvarchar(75) null,
	loai int,
	hoatDong bit
);

create table alpha_dm_cauhinh (
	cauHinhId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	portletId nvarchar(75) null,
	resourceCodeId bigint,
	primKey bigint,
	preferences nvarchar(75) null,
	type_ int,
	description nvarchar(75) null
);

create table alpha_dm_filedinhkem (
	resourceCode bigint not null,
	primKey bigint not null,
	fileEntryId bigint not null,
	nhanQuaMang bit,
	extension nvarchar(75) null,
	primary key (resourceCode, primKey, fileEntryId)
);

create table alpha_dm_linhvuc (
	linhVucId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten nvarchar(75) null,
	ma nvarchar(75) null,
	moTa nvarchar(75) null,
	hoatDong bit,
	doUuTien int
);

create table alpha_dm_loaihoso (
	loaiHoSoId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	linhVucId bigint,
	ten nvarchar(75) null,
	ma nvarchar(75) null,
	moTa nvarchar(75) null,
	hoatDong bit,
	doUuTien int,
	baiVietId bigint
);
