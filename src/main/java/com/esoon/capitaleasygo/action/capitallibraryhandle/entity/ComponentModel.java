package com.esoon.capitaleasygo.action.capitallibraryhandle.entity;

public class ComponentModel {

	private String bmyxjb;// 编码优选级别(保密)
	private String syfw;// 适用范围(保密)
	private String bmzt;// 编码状态(保密)
	private String bmlx;// 编码类型(保密)
	private String fldm;// 分类代码(eg:0107010102)
	private String flmc;// 分类名称（eg:卡口式低频圆形电连接器)
	private String sjbm;// 设计编码(eg:800199800009008)
	private String groupName;// 元器件分类（eg:Connector)
	private String mc;// 名称
	private String jc;// 简称
	private String xh;// 型号
	private String xhgg;// 型号规格
	private String gysqc;// 供应商全称
	private String zldj;// 质量等级
	private String zgf;// 总规范
	private String xxgf;// 详细规范
	private String fzxs;// 封装形式
	private String wxcc;// 外形尺寸
	private String zytj;// 专用条件
	private String fjxy;// 附加协议
	private String sfjk;// 是否进口
	private String jldw;// 计量单位
	private String ssml;// 所属目录
	private String sjly;// 数据来源
	private String partNumber;// partNumber(eg:YMG20T10Z1P40)
	private String description;// 器件描述(eg:YMG系列,10芯,10-Φ1.0)
	private String kth;// 壳体号(eg:20)这个只是建库用，实际在Capital
						// Library中不体现。所以没法从库中提取，所以就没法显示。
	private String typeCode;// 插头CONN/插座CONF(eg:CONN)
	private String symbolNameXPT;// 型谱图（eg:YMG-20-10-Z1)
	private String symbolNameCST;// 侧视图(eg：YMG-T-P）
	private String specification;// supplier也下的specification;
	private String maleOrFemale;// 针Pmale/孔Sfemale(eg:male/female)Cavity
								// Attribute:Name
	private String mating;// (eg:YMG20F7K1P40)
	private String bz;// 备注
	private String yl1;// 预留1
	private String yl2;// 预留2

	public String getBmyxjb() {
		return bmyxjb;
	}

	public void setBmyxjb(String bmyxjb) {
		this.bmyxjb = bmyxjb;
	}

	public String getSyfw() {
		return syfw;
	}

	public void setSyfw(String syfw) {
		this.syfw = syfw;
	}

	public String getBmzt() {
		return bmzt;
	}

	public void setBmzt(String bmzt) {
		this.bmzt = bmzt;
	}

	public String getBmlx() {
		return bmlx;
	}

	public void setBmlx(String bmlx) {
		this.bmlx = bmlx;
	}

	public String getFldm() {
		return fldm;
	}

	public void setFldm(String fldm) {
		this.fldm = fldm;
	}

	public String getFlmc() {
		return flmc;
	}

	public void setFlmc(String flmc) {
		this.flmc = flmc;
	}

	public String getSjbm() {
		return sjbm;
	}

	public void setSjbm(String sjbm) {
		this.sjbm = sjbm;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getMc() {
		return mc;
	}

	public void setMc(String mc) {
		this.mc = mc;
	}

	public String getJc() {
		return jc;
	}

	public void setJc(String jc) {
		this.jc = jc;
	}

	public String getXh() {
		return xh;
	}

	public void setXh(String xh) {
		this.xh = xh;
	}

	public String getXhgg() {
		return xhgg;
	}

	public void setXhgg(String xhgg) {
		this.xhgg = xhgg;
	}

	public String getGysqc() {
		return gysqc;
	}

	public void setGysqc(String gysqc) {
		this.gysqc = gysqc;
	}

	public String getZldj() {
		return zldj;
	}

	public void setZldj(String zldj) {
		this.zldj = zldj;
	}

	public String getZgf() {
		return zgf;
	}

	public void setZgf(String zgf) {
		this.zgf = zgf;
	}

	public String getXxgf() {
		return xxgf;
	}

	public void setXxgf(String xxgf) {
		this.xxgf = xxgf;
	}

	public String getFzxs() {
		return fzxs;
	}

	public void setFzxs(String fzxs) {
		this.fzxs = fzxs;
	}

	public String getWxcc() {
		return wxcc;
	}

	public void setWxcc(String wxcc) {
		this.wxcc = wxcc;
	}

	public String getZytj() {
		return zytj;
	}

	public void setZytj(String zytj) {
		this.zytj = zytj;
	}

	public String getFjxy() {
		return fjxy;
	}

	public void setFjxy(String fjxy) {
		this.fjxy = fjxy;
	}

	public String getSfjk() {
		return sfjk;
	}

	public void setSfjk(String sfjk) {
		this.sfjk = sfjk;
	}

	public String getJldw() {
		return jldw;
	}

	public void setJldw(String jldw) {
		this.jldw = jldw;
	}

	public String getSsml() {
		return ssml;
	}

	public void setSsml(String ssml) {
		this.ssml = ssml;
	}

	public String getSjly() {
		return sjly;
	}

	public void setSjly(String sjly) {
		this.sjly = sjly;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getKth() {
		return kth;
	}

	public void setKth(String kth) {
		this.kth = kth;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getSymbolNameXPT() {
		return symbolNameXPT;
	}

	public void setSymbolNameXPT(String symbolNameXPT) {
		this.symbolNameXPT = symbolNameXPT;
	}

	public String getSymbolNameCST() {
		return symbolNameCST;
	}

	public void setSymbolNameCST(String symbolNameCST) {
		this.symbolNameCST = symbolNameCST;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getMaleOrFemale() {
		return maleOrFemale;
	}

	public void setMaleOrFemale(String maleOrFemale) {
		this.maleOrFemale = maleOrFemale;
	}

	public String getMating() {
		return mating;
	}

	public void setMating(String mating) {
		this.mating = mating;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getYl1() {
		return yl1;
	}

	public void setYl1(String yl1) {
		this.yl1 = yl1;
	}

	public String getYl2() {
		return yl2;
	}

	public void setYl2(String yl2) {
		this.yl2 = yl2;
	}

	@Override
	public String toString() {
		return "ComponentModel [bmyxjb=" + bmyxjb + ", syfw=" + syfw
				+ ", bmzt=" + bmzt + ", bmlx=" + bmlx + ", fldm=" + fldm
				+ ", flmc=" + flmc + ", sjbm=" + sjbm + ", groupName="
				+ groupName + ", mc=" + mc + ", jc=" + jc + ", xh=" + xh
				+ ", xhgg=" + xhgg + ", gysqc=" + gysqc + ", zldj=" + zldj
				+ ", zgf=" + zgf + ", xxgf=" + xxgf + ", fzxs=" + fzxs
				+ ", wxcc=" + wxcc + ", zytj=" + zytj + ", fjxy=" + fjxy
				+ ", sfjk=" + sfjk + ", jldw=" + jldw + ", ssml=" + ssml
				+ ", sjly=" + sjly + ", partNumber=" + partNumber
				+ ", description=" + description + ", kth=" + kth
				+ ", typeCode=" + typeCode + ", symbolNameXPT=" + symbolNameXPT
				+ ", symbolNameCST=" + symbolNameCST + ", specification="
				+ specification + ", maleOrFemale=" + maleOrFemale
				+ ", mating=" + mating + ", bz=" + bz + ", yl1=" + yl1
				+ ", yl2=" + yl2 + "]";
	}

	public String[] toArray() {
		String[] str = new String[36];
//		ComponentModel component = new ComponentModel();
//		component.setBmyxjb(getValue(hssfRow.getCell(0)));// 编码优选级别(保密)
//		component.setSyfw(getValue(hssfRow.getCell(1)));// 适用范围(保密)
//		component.setBmzt(getValue(hssfRow.getCell(2)));// 编码状态(保密)
//		component.setBmlx(getValue(hssfRow.getCell(3)));// 编码类型(保密)
//		component.setFldm(getValue(hssfRow.getCell(4)));// 分类代码(eg:0107010102)
//		component.setFlmc(getValue(hssfRow.getCell(5)));// 分类名称（eg:卡口式低频圆形电连接器)
//		component.setSjbm(getValue(hssfRow.getCell(6)));// 设计编码(eg:800199800009008)
//		component.setGroupName(getValue(hssfRow.getCell(7)));// 元器件分类（eg:Connector)
//		component.setMc(getValue(hssfRow.getCell(8)));// 名称
//		component.setJc(getValue(hssfRow.getCell(9)));// 简称
//		component.setXh(getValue(hssfRow.getCell(10)));// 型号
//		component.setXhgg(getValue(hssfRow.getCell(11)));// 型号规格
//		component.setGysqc(getValue(hssfRow.getCell(12)));// 供应商全称
//		component.setZldj(getValue(hssfRow.getCell(13)));// 质量等级
//		component.setZgf(getValue(hssfRow.getCell(14)));// 总规范
//		component.setXxgf(getValue(hssfRow.getCell(15)));// 详细规范
//		component.setFzxs(getValue(hssfRow.getCell(16)));// 封装形式
//		component.setWxcc(getValue(hssfRow.getCell(17)));// 外形尺寸
//		component.setZytj(getValue(hssfRow.getCell(18)));// 专用条件
//		component.setFjxy(getValue(hssfRow.getCell(19)));// 附加协议
//		component.setSfjk(getValue(hssfRow.getCell(20)));// 是否进口
//		component.setJldw(getValue(hssfRow.getCell(21)));// 计量单位
//		component.setSsml(getValue(hssfRow.getCell(22)));// 所属目录
//		component.setSjly(getValue(hssfRow.getCell(23)));// 数据来源
//		component.setPartNumber(getValue(hssfRow.getCell(24)));// partNumber(eg:YMG20T10Z1P40)
//		component.setDescription(getValue(hssfRow.getCell(25)));// 器件描述(eg:YMG系列,10芯,10-Φ1.0)
//		component.setKth((getValue(hssfRow.getCell(26))));// 壳体号(eg:20)这个只是建库用，实际在Capital
//						// Library中不体现。所以没法从库中提取，所以就没法显示。
//		component.setTypeCode(getValue(hssfRow.getCell(27)));// 插头CONN/插座CONF(eg:CONN)
//		component.setSymbolNameXPT(getValue(hssfRow.getCell(28)));// 型谱图（eg:YMG-20-10-Z1)
//		component.setSymbolNameCST(getValue(hssfRow.getCell(29)));// 侧视图(eg：YMG-T-P）
//		component.setSpecification(getValue(hssfRow.getCell(30)));// supplier也下的specification;
//		component.setMaleOrFemale(getValue(hssfRow.getCell(31)));// 针Pmale/孔Sfemale(eg:male/female)Cavity
//									// Attribute:Name
//		component.setMating(getValue(hssfRow.getCell(32)));// (eg:YMG20F7K1P40)
//		component.setBz(getValue(hssfRow.getCell(33)));// 备注
//		component.setYl1(getValue(hssfRow.getCell(34)));// 预留1
//		component.setYl2(getValue(hssfRow.getCell(35)));// 预留2
		str[0] = getBmyxjb();
		str[1] = getSyfw();
		str[2] = getBmzt();
		str[3] = getBmlx(); 
		str[4] = getFldm();
		str[5] = getFlmc();
		str[6] = getSjbm();
		str[7] = getGroupName();
		str[8] = getMc();
		str[9] = getJc();
		str[10] =getXh();
		str[11] = getXhgg();
		str[12] = getGysqc();
		str[13] = getZldj();
		str[14] = getZgf();
		str[15] = getXxgf();
		str[16] = getFzxs();
		str[17] =getWxcc();
		str[18] =getZytj();
		str[19] =getSfjk();
		str[20] =getFjxy();
		str[21] =getJldw();
		str[22] =getSsml();
		str[23] =getSjly();
		str[24] =getPartNumber();
		str[25] =getDescription();
		str[26] =getKth();
		str[27] =getTypeCode();
		str[28] =getSymbolNameXPT();
		str[29] =getSymbolNameCST();
		str[30] =getSpecification();
		str[31] =getMaleOrFemale();
		str[32] =getMating();
		str[33] =getBz();
		str[34] =getYl1();
		str[35] =getYl2();
		return str;
	}

}
