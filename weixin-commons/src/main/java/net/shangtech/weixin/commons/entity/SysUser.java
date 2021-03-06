package net.shangtech.weixin.commons.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import net.shangtech.framework.hibername3.annotation.IBaseEntity;

@Entity
@Table(name = "sys_user")
public class SysUser extends IBaseEntity {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "username")
	private String username; //用户登录名
	
	@Column(name = "password")
	private String password; //用户登录密码
	
	@Column(name = "mobile")
	private String mobile; //用户手机号码
	
	@Column(name = "email")
	private String email; //用户邮箱地址
	
	@Column(name = "qq")
	private String qq; //用户qq号码
	
	@Column(name = "create_time")
	private Date createTime; //用户创建时间
	
	@Column(name = "wx_name")
	private String wxName;	//用户微信名
	
	@Column(name = "wx_number")
	private String wxNumber; //微信号
	
	@Column(name = "token")
	private String token; //token也用来作为用户的唯一标识,使用用户ID生成MD5就作为token
	
	@Column(name = "appid")
	private String appid;
	
	@Column(name = "appkey")
	private String appkey;
	
	@Column(name = "province")
	private String province;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "openid")
	private String openid;
	
	@Column(name = "user_type")
	private Integer userType;
	
	@Column(name = "site_logo")
	private String siteLogo;
	
	@Column(name = "site_tel")
	private String siteTel;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getWxName() {
		return wxName;
	}

	public void setWxName(String wxName) {
		this.wxName = wxName;
	}

	public String getWxNumber() {
		return wxNumber;
	}

	public void setWxNumber(String wxNumber) {
		this.wxNumber = wxNumber;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getAppkey() {
		return appkey;
	}

	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public String getSiteLogo() {
		return siteLogo;
	}

	public void setSiteLogo(String siteLogo) {
		this.siteLogo = siteLogo;
	}

	public String getSiteTel() {
		return siteTel;
	}

	public void setSiteTel(String siteTel) {
		this.siteTel = siteTel;
	}
}
