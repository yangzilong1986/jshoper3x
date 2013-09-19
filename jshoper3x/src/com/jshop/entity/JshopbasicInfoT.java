package com.jshop.entity;

// Generated 2013-9-19 19:12:29 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * JshopbasicInfoT generated by hbm2java
 */
@Entity
@Table(name = "jshopbasic_info_t", catalog = "jshoper3")
public class JshopbasicInfoT implements java.io.Serializable {

	private String basicinfoid;
	private String jshopname;
	private String jshopslogan;
	private String country;
	private String province;
	private String city;
	private String street;
	private String qqservice;
	private String skypeservice;
	private String weixinservice;
	private String sinaweiboservice;
	private String emailservice;
	private String phoneservice;
	private String openstate;
	private String siteclosenotes;
	private String sitelogo;
	private String licensed;
	private String icpnum;
	private String state;
	private String district;
	private String creatorid;
	private Date createtime;
	private String metaKeywords;
	private String metaDes;

	public JshopbasicInfoT() {
	}

	public JshopbasicInfoT(String basicinfoid, String jshopname, String state,
			String creatorid, Date createtime) {
		this.basicinfoid = basicinfoid;
		this.jshopname = jshopname;
		this.state = state;
		this.creatorid = creatorid;
		this.createtime = createtime;
	}

	public JshopbasicInfoT(String basicinfoid, String jshopname,
			String jshopslogan, String country, String province, String city,
			String street, String qqservice, String skypeservice,
			String weixinservice, String sinaweiboservice, String emailservice,
			String phoneservice, String openstate, String siteclosenotes,
			String sitelogo, String licensed, String icpnum, String state,
			String district, String creatorid, Date createtime,
			String metaKeywords, String metaDes) {
		this.basicinfoid = basicinfoid;
		this.jshopname = jshopname;
		this.jshopslogan = jshopslogan;
		this.country = country;
		this.province = province;
		this.city = city;
		this.street = street;
		this.qqservice = qqservice;
		this.skypeservice = skypeservice;
		this.weixinservice = weixinservice;
		this.sinaweiboservice = sinaweiboservice;
		this.emailservice = emailservice;
		this.phoneservice = phoneservice;
		this.openstate = openstate;
		this.siteclosenotes = siteclosenotes;
		this.sitelogo = sitelogo;
		this.licensed = licensed;
		this.icpnum = icpnum;
		this.state = state;
		this.district = district;
		this.creatorid = creatorid;
		this.createtime = createtime;
		this.metaKeywords = metaKeywords;
		this.metaDes = metaDes;
	}

	@Id
	@Column(name = "BASICINFOID", unique = true, nullable = false, length = 20)
	public String getBasicinfoid() {
		return this.basicinfoid;
	}

	public void setBasicinfoid(String basicinfoid) {
		this.basicinfoid = basicinfoid;
	}

	@Column(name = "JSHOPNAME", nullable = false, length = 45)
	public String getJshopname() {
		return this.jshopname;
	}

	public void setJshopname(String jshopname) {
		this.jshopname = jshopname;
	}

	@Column(name = "JSHOPSLOGAN", length = 45)
	public String getJshopslogan() {
		return this.jshopslogan;
	}

	public void setJshopslogan(String jshopslogan) {
		this.jshopslogan = jshopslogan;
	}

	@Column(name = "COUNTRY", length = 12)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "PROVINCE", length = 12)
	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Column(name = "CITY", length = 12)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "STREET", length = 50)
	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Column(name = "QQSERVICE", length = 100)
	public String getQqservice() {
		return this.qqservice;
	}

	public void setQqservice(String qqservice) {
		this.qqservice = qqservice;
	}

	@Column(name = "SKYPESERVICE", length = 100)
	public String getSkypeservice() {
		return this.skypeservice;
	}

	public void setSkypeservice(String skypeservice) {
		this.skypeservice = skypeservice;
	}

	@Column(name = "WEIXINSERVICE", length = 100)
	public String getWeixinservice() {
		return this.weixinservice;
	}

	public void setWeixinservice(String weixinservice) {
		this.weixinservice = weixinservice;
	}

	@Column(name = "SINAWEIBOSERVICE", length = 100)
	public String getSinaweiboservice() {
		return this.sinaweiboservice;
	}

	public void setSinaweiboservice(String sinaweiboservice) {
		this.sinaweiboservice = sinaweiboservice;
	}

	@Column(name = "EMAILSERVICE", length = 200)
	public String getEmailservice() {
		return this.emailservice;
	}

	public void setEmailservice(String emailservice) {
		this.emailservice = emailservice;
	}

	@Column(name = "PHONESERVICE", length = 20)
	public String getPhoneservice() {
		return this.phoneservice;
	}

	public void setPhoneservice(String phoneservice) {
		this.phoneservice = phoneservice;
	}

	@Column(name = "OPENSTATE", length = 1)
	public String getOpenstate() {
		return this.openstate;
	}

	public void setOpenstate(String openstate) {
		this.openstate = openstate;
	}

	@Column(name = "SITECLOSENOTES", length = 200)
	public String getSiteclosenotes() {
		return this.siteclosenotes;
	}

	public void setSiteclosenotes(String siteclosenotes) {
		this.siteclosenotes = siteclosenotes;
	}

	@Column(name = "SITELOGO")
	public String getSitelogo() {
		return this.sitelogo;
	}

	public void setSitelogo(String sitelogo) {
		this.sitelogo = sitelogo;
	}

	@Column(name = "LICENSED", length = 1)
	public String getLicensed() {
		return this.licensed;
	}

	public void setLicensed(String licensed) {
		this.licensed = licensed;
	}

	@Column(name = "ICPNUM", length = 45)
	public String getIcpnum() {
		return this.icpnum;
	}

	public void setIcpnum(String icpnum) {
		this.icpnum = icpnum;
	}

	@Column(name = "STATE", nullable = false, length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "DISTRICT", length = 12)
	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "META_KEYWORDS")
	public String getMetaKeywords() {
		return this.metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	@Column(name = "META_DES")
	public String getMetaDes() {
		return this.metaDes;
	}

	public void setMetaDes(String metaDes) {
		this.metaDes = metaDes;
	}

}
