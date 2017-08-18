package com.cecgw.keystone.entity;

public class UserEntity {

	private Long id;
	private String userCode;
	private String userName;
	private String password;
	private String tel;
	private String email;
	private String description;
	private Long roleId;
	private Long tenantId;
	private String lastLogin;
	private Integer isLogin;
	private Integer pwErrorCount;
	private String loginLockedTime;
	private String themeFlag;
	private Integer isEnable;
	private Integer visible;
	

	public Integer getVisible() {
		return visible;
	}

	public void setVisible(Integer visible) {
		this.visible = visible;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(Integer isEnable) {
		this.isEnable = isEnable;
	}

	public String getThemeFlag() {
		return themeFlag;
	}

	public void setThemeFlag(String themeFlag) {
		this.themeFlag = themeFlag;
	}

	public Long getId() {

		return id;
	}

	public void setId(Long id) {

		this.id = id;
	}

	public String getUserCode() {

		return userCode;
	}

	public void setUserCode(String userCode) {

		this.userCode = userCode;
	}

	public String getUserName() {

		return userName;
	}

	public void setUserName(String userName) {

		this.userName = userName;
	}

	public String getPassword() {

		return password;
	}

	public void setPassword(String password) {

		this.password = password;
	}

	public String getDescription() {

		return description;
	}

	public void setDescription(String description) {

		this.description = description;
	}

	public Long getRoleId() {

		return roleId;
	}
	
	public Long getTenantId() {
		return tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}

	public void setRoleId(Long roleId) {

		this.roleId = roleId;
	}

	public String getLastLogin() {

		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {

		this.lastLogin = lastLogin;
	}

	public Integer getIsLogin() {

		return isLogin;
	}

	public void setIsLogin(Integer isLogin) {

		this.isLogin = isLogin;
	}

	public Integer getPwErrorCount() {

		return pwErrorCount;
	}

	public void setPwErrorCount(Integer pwErrorCount) {

		this.pwErrorCount = pwErrorCount;
	}

	public String getLoginLockedTime() {

		return loginLockedTime;
	}

	public void setLoginLockedTime(String loginLockedTime) {

		this.loginLockedTime = loginLockedTime;
	}
}
