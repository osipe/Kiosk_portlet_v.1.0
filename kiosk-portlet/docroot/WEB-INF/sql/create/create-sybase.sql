use master
exec sp_dboption 'lportal', 'allow nulls by default' , true
go

exec sp_dboption 'lportal', 'select into/bulkcopy/pllsort' , true
go

use lportal

create table alpha_bdqh_bieudoquyhoach (
	bieuDoQuyHoachId decimal(20,0) not null primary key,
	groupId decimal(20,0),
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(255) null,
	ma varchar(75) null,
	moTa varchar(1000) null,
	urlFile varchar(75) null,
	hoatDong int,
	doUuTien int
)
go

create table alpha_dghl_cauhoi (
	cauHoiId decimal(20,0) not null primary key,
	groupId decimal(20,0),
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	ma varchar(75) null,
	moTa varchar(75) null,
	hoatDong int,
	doUuTien int,
	boCauHoi int
)
go

create table alpha_dghl_danhgiahailong (
	danhGiaHaiLongId decimal(20,0) not null primary key,
	groupId decimal(20,0),
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	resourceCode decimal(20,0),
	resourcePK decimal(20,0),
	cauHoiId decimal(20,0),
	traLoiId decimal(20,0)
)
go

create table alpha_dghl_traloi (
	traLoiId decimal(20,0) not null primary key,
	groupId decimal(20,0),
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	cauHoiId decimal(20,0),
	noiDung varchar(75) null,
	mucDoHaiLong int,
	diem int
)
go

create table alpha_dm_bieumaubaocao (
	bieuMauBaoCaoId decimal(20,0) not null primary key,
	groupId decimal(20,0),
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	chuyenMucBieuMauId decimal(20,0),
	ten varchar(75) null,
	ma varchar(75) null,
	moTa varchar(75) null,
	loai int,
	hoatDong int
)
go

create table alpha_dm_cauhinh (
	cauHinhId decimal(20,0) not null primary key,
	groupId decimal(20,0),
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	portletId varchar(75) null,
	resourceCodeId decimal(20,0),
	primKey decimal(20,0),
	preferences varchar(75) null,
	type_ int,
	description varchar(75) null
)
go

create table alpha_dm_filedinhkem (
	resourceCode decimal(20,0) not null,
	primKey decimal(20,0) not null,
	fileEntryId decimal(20,0) not null,
	nhanQuaMang int,
	extension varchar(75) null,
	primary key (resourceCode, primKey, fileEntryId)
)
go

create table alpha_dm_linhvuc (
	linhVucId decimal(20,0) not null primary key,
	groupId decimal(20,0),
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	ma varchar(75) null,
	moTa varchar(75) null,
	hoatDong int,
	doUuTien int
)
go

create table alpha_dm_loaihoso (
	loaiHoSoId decimal(20,0) not null primary key,
	groupId decimal(20,0),
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	linhVucId decimal(20,0),
	ten varchar(75) null,
	ma varchar(75) null,
	moTa varchar(75) null,
	hoatDong int,
	doUuTien int,
	baiVietId decimal(20,0)
)
go




