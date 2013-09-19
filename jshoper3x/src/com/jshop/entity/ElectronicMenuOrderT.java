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
 * ElectronicMenuOrderT generated by hbm2java
 */
@Entity
@Table(name = "electronic_menu_order_t", catalog = "jshoper3")
public class ElectronicMenuOrderT implements java.io.Serializable {

	private String electronicMenuOrderid;
	private String userid;
	private String username;
	private String paymentid;
	private String paymentname;
	private String delivermode;
	private String deliverynumber;
	private String electronicorderstate;
	private String logisticsid;
	private double freight;
	private double amount;
	private Double points;
	private Date purchasetime;
	private Date deliverytime;
	private String invoice;
	private String shippingaddressid;
	private String customernotes;
	private String logisticswebaddress;
	private Date paytime;
	private String orderTag;
	private String toBuyer;
	private double shouldpay;
	private double usepoints;
	private String vouchersid;
	private String goodid;
	private String goodsname;
	private Integer needquantity;
	private String paystate;
	private String shippingstate;
	private String deliveraddressid;
	private String shippingusername;
	private Date createtime;
	private String hasprintexpress;
	private String hasprintinvoice;
	private String hasprintfpinvoice;
	private String expressnumber;
	private String tradeNo;
	private String tableNumber;
	private String roomName;
	private String tablestate;

	public ElectronicMenuOrderT() {
	}

	public ElectronicMenuOrderT(String electronicMenuOrderid, String paymentid,
			String paymentname, String electronicorderstate, double freight,
			double amount, Date purchasetime, String invoice, double shouldpay,
			double usepoints, String paystate, Date createtime,
			String tableNumber, String tablestate) {
		this.electronicMenuOrderid = electronicMenuOrderid;
		this.paymentid = paymentid;
		this.paymentname = paymentname;
		this.electronicorderstate = electronicorderstate;
		this.freight = freight;
		this.amount = amount;
		this.purchasetime = purchasetime;
		this.invoice = invoice;
		this.shouldpay = shouldpay;
		this.usepoints = usepoints;
		this.paystate = paystate;
		this.createtime = createtime;
		this.tableNumber = tableNumber;
		this.tablestate = tablestate;
	}

	public ElectronicMenuOrderT(String electronicMenuOrderid, String userid,
			String username, String paymentid, String paymentname,
			String delivermode, String deliverynumber,
			String electronicorderstate, String logisticsid, double freight,
			double amount, Double points, Date purchasetime, Date deliverytime,
			String invoice, String shippingaddressid, String customernotes,
			String logisticswebaddress, Date paytime, String orderTag,
			String toBuyer, double shouldpay, double usepoints,
			String vouchersid, String goodid, String goodsname,
			Integer needquantity, String paystate, String shippingstate,
			String deliveraddressid, String shippingusername, Date createtime,
			String hasprintexpress, String hasprintinvoice,
			String hasprintfpinvoice, String expressnumber, String tradeNo,
			String tableNumber, String roomName, String tablestate) {
		this.electronicMenuOrderid = electronicMenuOrderid;
		this.userid = userid;
		this.username = username;
		this.paymentid = paymentid;
		this.paymentname = paymentname;
		this.delivermode = delivermode;
		this.deliverynumber = deliverynumber;
		this.electronicorderstate = electronicorderstate;
		this.logisticsid = logisticsid;
		this.freight = freight;
		this.amount = amount;
		this.points = points;
		this.purchasetime = purchasetime;
		this.deliverytime = deliverytime;
		this.invoice = invoice;
		this.shippingaddressid = shippingaddressid;
		this.customernotes = customernotes;
		this.logisticswebaddress = logisticswebaddress;
		this.paytime = paytime;
		this.orderTag = orderTag;
		this.toBuyer = toBuyer;
		this.shouldpay = shouldpay;
		this.usepoints = usepoints;
		this.vouchersid = vouchersid;
		this.goodid = goodid;
		this.goodsname = goodsname;
		this.needquantity = needquantity;
		this.paystate = paystate;
		this.shippingstate = shippingstate;
		this.deliveraddressid = deliveraddressid;
		this.shippingusername = shippingusername;
		this.createtime = createtime;
		this.hasprintexpress = hasprintexpress;
		this.hasprintinvoice = hasprintinvoice;
		this.hasprintfpinvoice = hasprintfpinvoice;
		this.expressnumber = expressnumber;
		this.tradeNo = tradeNo;
		this.tableNumber = tableNumber;
		this.roomName = roomName;
		this.tablestate = tablestate;
	}

	@Id
	@Column(name = "ELECTRONIC_MENU_ORDERID", unique = true, nullable = false, length = 20)
	public String getElectronicMenuOrderid() {
		return this.electronicMenuOrderid;
	}

	public void setElectronicMenuOrderid(String electronicMenuOrderid) {
		this.electronicMenuOrderid = electronicMenuOrderid;
	}

	@Column(name = "USERID", length = 20)
	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Column(name = "USERNAME", length = 50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "PAYMENTID", nullable = false, length = 20)
	public String getPaymentid() {
		return this.paymentid;
	}

	public void setPaymentid(String paymentid) {
		this.paymentid = paymentid;
	}

	@Column(name = "PAYMENTNAME", nullable = false, length = 50)
	public String getPaymentname() {
		return this.paymentname;
	}

	public void setPaymentname(String paymentname) {
		this.paymentname = paymentname;
	}

	@Column(name = "DELIVERMODE", length = 50)
	public String getDelivermode() {
		return this.delivermode;
	}

	public void setDelivermode(String delivermode) {
		this.delivermode = delivermode;
	}

	@Column(name = "DELIVERYNUMBER", length = 50)
	public String getDeliverynumber() {
		return this.deliverynumber;
	}

	public void setDeliverynumber(String deliverynumber) {
		this.deliverynumber = deliverynumber;
	}

	@Column(name = "ELECTRONICORDERSTATE", nullable = false, length = 1)
	public String getElectronicorderstate() {
		return this.electronicorderstate;
	}

	public void setElectronicorderstate(String electronicorderstate) {
		this.electronicorderstate = electronicorderstate;
	}

	@Column(name = "LOGISTICSID", length = 20)
	public String getLogisticsid() {
		return this.logisticsid;
	}

	public void setLogisticsid(String logisticsid) {
		this.logisticsid = logisticsid;
	}

	@Column(name = "FREIGHT", nullable = false, precision = 10)
	public double getFreight() {
		return this.freight;
	}

	public void setFreight(double freight) {
		this.freight = freight;
	}

	@Column(name = "AMOUNT", nullable = false, precision = 10)
	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Column(name = "POINTS", precision = 10)
	public Double getPoints() {
		return this.points;
	}

	public void setPoints(Double points) {
		this.points = points;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PURCHASETIME", nullable = false, length = 0)
	public Date getPurchasetime() {
		return this.purchasetime;
	}

	public void setPurchasetime(Date purchasetime) {
		this.purchasetime = purchasetime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DELIVERYTIME", length = 0)
	public Date getDeliverytime() {
		return this.deliverytime;
	}

	public void setDeliverytime(Date deliverytime) {
		this.deliverytime = deliverytime;
	}

	@Column(name = "INVOICE", nullable = false, length = 1)
	public String getInvoice() {
		return this.invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	@Column(name = "SHIPPINGADDRESSID", length = 20)
	public String getShippingaddressid() {
		return this.shippingaddressid;
	}

	public void setShippingaddressid(String shippingaddressid) {
		this.shippingaddressid = shippingaddressid;
	}

	@Column(name = "CUSTOMERNOTES", length = 2000)
	public String getCustomernotes() {
		return this.customernotes;
	}

	public void setCustomernotes(String customernotes) {
		this.customernotes = customernotes;
	}

	@Column(name = "LOGISTICSWEBADDRESS", length = 225)
	public String getLogisticswebaddress() {
		return this.logisticswebaddress;
	}

	public void setLogisticswebaddress(String logisticswebaddress) {
		this.logisticswebaddress = logisticswebaddress;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PAYTIME", length = 0)
	public Date getPaytime() {
		return this.paytime;
	}

	public void setPaytime(Date paytime) {
		this.paytime = paytime;
	}

	@Column(name = "ORDER_TAG", length = 1)
	public String getOrderTag() {
		return this.orderTag;
	}

	public void setOrderTag(String orderTag) {
		this.orderTag = orderTag;
	}

	@Column(name = "TO_BUYER", length = 100)
	public String getToBuyer() {
		return this.toBuyer;
	}

	public void setToBuyer(String toBuyer) {
		this.toBuyer = toBuyer;
	}

	@Column(name = "SHOULDPAY", nullable = false, precision = 10)
	public double getShouldpay() {
		return this.shouldpay;
	}

	public void setShouldpay(double shouldpay) {
		this.shouldpay = shouldpay;
	}

	@Column(name = "USEPOINTS", nullable = false, precision = 10)
	public double getUsepoints() {
		return this.usepoints;
	}

	public void setUsepoints(double usepoints) {
		this.usepoints = usepoints;
	}

	@Column(name = "VOUCHERSID", length = 20)
	public String getVouchersid() {
		return this.vouchersid;
	}

	public void setVouchersid(String vouchersid) {
		this.vouchersid = vouchersid;
	}

	@Column(name = "GOODID", length = 1000)
	public String getGoodid() {
		return this.goodid;
	}

	public void setGoodid(String goodid) {
		this.goodid = goodid;
	}

	@Column(name = "GOODSNAME", length = 5000)
	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	@Column(name = "NEEDQUANTITY")
	public Integer getNeedquantity() {
		return this.needquantity;
	}

	public void setNeedquantity(Integer needquantity) {
		this.needquantity = needquantity;
	}

	@Column(name = "PAYSTATE", nullable = false, length = 1)
	public String getPaystate() {
		return this.paystate;
	}

	public void setPaystate(String paystate) {
		this.paystate = paystate;
	}

	@Column(name = "SHIPPINGSTATE", length = 1)
	public String getShippingstate() {
		return this.shippingstate;
	}

	public void setShippingstate(String shippingstate) {
		this.shippingstate = shippingstate;
	}

	@Column(name = "DELIVERADDRESSID", length = 1)
	public String getDeliveraddressid() {
		return this.deliveraddressid;
	}

	public void setDeliveraddressid(String deliveraddressid) {
		this.deliveraddressid = deliveraddressid;
	}

	@Column(name = "SHIPPINGUSERNAME", length = 50)
	public String getShippingusername() {
		return this.shippingusername;
	}

	public void setShippingusername(String shippingusername) {
		this.shippingusername = shippingusername;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "HASPRINTEXPRESS", length = 1)
	public String getHasprintexpress() {
		return this.hasprintexpress;
	}

	public void setHasprintexpress(String hasprintexpress) {
		this.hasprintexpress = hasprintexpress;
	}

	@Column(name = "HASPRINTINVOICE", length = 1)
	public String getHasprintinvoice() {
		return this.hasprintinvoice;
	}

	public void setHasprintinvoice(String hasprintinvoice) {
		this.hasprintinvoice = hasprintinvoice;
	}

	@Column(name = "HASPRINTFPINVOICE", length = 1)
	public String getHasprintfpinvoice() {
		return this.hasprintfpinvoice;
	}

	public void setHasprintfpinvoice(String hasprintfpinvoice) {
		this.hasprintfpinvoice = hasprintfpinvoice;
	}

	@Column(name = "EXPRESSNUMBER", length = 50)
	public String getExpressnumber() {
		return this.expressnumber;
	}

	public void setExpressnumber(String expressnumber) {
		this.expressnumber = expressnumber;
	}

	@Column(name = "TRADE_NO", length = 45)
	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	@Column(name = "TABLE_NUMBER", nullable = false, length = 20)
	public String getTableNumber() {
		return this.tableNumber;
	}

	public void setTableNumber(String tableNumber) {
		this.tableNumber = tableNumber;
	}

	@Column(name = "ROOM_NAME", length = 45)
	public String getRoomName() {
		return this.roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	@Column(name = "TABLESTATE", nullable = false, length = 1)
	public String getTablestate() {
		return this.tablestate;
	}

	public void setTablestate(String tablestate) {
		this.tablestate = tablestate;
	}

}
