package com.esoon.capitaleasygo.action.capitallibraryhandle.entity;

import com.esoon.capitaleasygo.action.capitallibraryhandle.util.PropertieUtil;

public class ComponentInfoModel extends BaseModel{
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
	private String partNumber;// 设计编码(eg:YMG20T10Z1P40)
	private String description;// 器件描述(eg:YMG系列,10芯,10-Φ1.0)
	private String kth;// 壳体号(eg:20)这个只是建库用，实际在Capital
						// Library中不体现。所以没法从库中提取，所以就没法显示。
	private String typeCode;// 插头CONN/插座CONF(eg:CONN)
	private String symbolNameXPT;// 型谱图（eg:YMG-20-10-Z1)
	private String symbolNameCST;// 侧视图(eg：YMG-T-P）
	// private String xptOrCst;// 型谱图/侧视图
	private String specification;// supplier也下的specification;
	private String maleOrFemale;// 针Pmale/孔Sfemale(eg:male/female)Cavity
								// Attribute:Name
	private String mating;// (eg:YMG20F7K1P40)

	private String bz;// 备注
	private String yl1;// 预留1
	private String yl2;// 预留2

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

	public String[] toArray() {
		String[] str = new String[PropertieUtil.getExcelHeaders_ZH().length];
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
		str[10] = getXh();
		str[11] = getXhgg();
		str[12] = getGysqc();
		str[13] = getZldj();
		str[14] = getZgf();
		str[15] = getXxgf();
		str[16] = getFzxs();
		str[17] = getWxcc();
		str[18] = getZytj();
		str[19] = getFjxy();
		str[20] = getSfjk();
		str[21] = getJldw();
		str[22] = getSsml();
		str[23] = getSjly();
		str[24] = getPartNumber();
		str[25] = getDescription();
		str[26] = getKth();
		str[27] = getTypeCode();
		str[28] = getSymbolNameXPT();
		str[29] = getSymbolNameCST();
		str[30] = getSpecification();
		str[31] = getMaleOrFemale();
		str[32] = getMating();
		str[33] = getBz();
		str[34] = getYl1();
		str[35] = getYl2();

		return str;
	}

	public String getBmyxjb() {
		return bmyxjb;
	}

	public void setBmyxjb(String bmyxjb) {
		this.bmyxjb = bmyxjb;
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

	public String getSyfw() {
		return syfw;
	}

	public void setSyfw(String syfw) {
		this.syfw = syfw;
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

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
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

	// public String getXptOrCst() {
	// return xptOrCst;
	// }
	//
	// public void setXptOrCst(String xptOrCst) {
	// this.xptOrCst = xptOrCst;
	// }

	public String getKth() {
		return kth;
	}

	public void setKth(String kth) {
		this.kth = kth;
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
}
