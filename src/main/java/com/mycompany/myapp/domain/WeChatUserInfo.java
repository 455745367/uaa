package com.renmaituan.base.uaa.domain;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * 微信用户信息
 */
@ApiModel(description = "微信用户信息")
@Entity
@Table(name = "we_chat_user_info")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "wechatuserinfo")
public class WeChatUserInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 序列号
     */
    @NotNull
    @Size(max = 64)
    @ApiModelProperty(value = "序列号", required = true)
    @Column(name = "serial_number", length = 64, nullable = false)
    private String serialNumber;

    /**
     * 用户登录身份
     */
    @NotNull
    @Size(max = 64)
    @ApiModelProperty(value = "用户登录身份", required = true)
    @Column(name = "login_identity", length = 64, nullable = false)
    private String loginIdentity;

    /**
     * 用户昵称
     */
    @NotNull
    @Size(max = 64)
    @ApiModelProperty(value = "用户昵称", required = true)
    @Column(name = "nick_name", length = 64, nullable = false)
    private String nickName;

    /**
     * 用户头像图片
     */
    @NotNull
    @Size(max = 256)
    @ApiModelProperty(value = "用户头像图片", required = true)
    @Column(name = "avatar_url", length = 256, nullable = false)
    private String avatarUrl;

    /**
     * 用户性别
     * 0：未知
     * 1：男性
     * 2：女性
     */
    @ApiModelProperty(value = "用户性别 0：未知 1：男性 2：女性")
    @Column(name = "gender")
    private Integer gender;

    /**
     * 用户所在国家
     */
    @NotNull
    @Size(max = 64)
    @ApiModelProperty(value = "用户所在国家", required = true)
    @Column(name = "country", length = 64, nullable = false)
    private String country;

    /**
     * 用户所在省份
     */
    @NotNull
    @Size(max = 64)
    @ApiModelProperty(value = "用户所在省份", required = true)
    @Column(name = "province", length = 64, nullable = false)
    private String province;

    /**
     * 用户所在城市
     */
    @NotNull
    @Size(max = 64)
    @ApiModelProperty(value = "用户所在城市", required = true)
    @Column(name = "city", length = 64, nullable = false)
    private String city;

    /**
     * 语言
     */
    @NotNull
    @Size(max = 64)
    @ApiModelProperty(value = "语言", required = true)
    @Column(name = "language", length = 64, nullable = false)
    private String language;

    /**
     * 手机电话
     */
    @Size(max = 25)
    @ApiModelProperty(value = "手机电话")
    @Column(name = "mobile_number", length = 25)
    private String mobileNumber;

    /**
     * 扩展
     */
    @ApiModelProperty(value = "扩展")
    @Column(name = "extend")
    private String extend;

    /**
     * 用户唯一标识
     */
    @Size(max = 64)
    @ApiModelProperty(value = "用户唯一标识")
    @Column(name = "openid", length = 64)
    private String openid;

    /**
     * 会话密钥
     */
    @Size(max = 64)
    @ApiModelProperty(value = "会话密钥")
    @Column(name = "session_key", length = 64)
    private String sessionKey;

    /**
     * 用户在开放平台的唯一标识符
     */
    @Size(max = 64)
    @ApiModelProperty(value = "用户在开放平台的唯一标识符")
    @Column(name = "unionid", length = 64)
    private String unionid;

    /**
     * 注册状态
     */
    @NotNull
    @ApiModelProperty(value = "注册状态", required = true)
    @Column(name = "regist_status", nullable = false)
    private Boolean registStatus;

    /**
     * 验证HASH签名
     */
    @Size(max = 128)
    @ApiModelProperty(value = "验证HASH签名")
    @Column(name = "checking_hash_sign", length = 128)
    private String checkingHashSign;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    @Column(name = "description")
    private String description;

    /**
     * 启用状态
     */
    @NotNull
    @ApiModelProperty(value = "启用状态", required = true)
    @Column(name = "enable_status", nullable = false)
    private Boolean enableStatus;

    /**
     * 创建人
     */
    @NotNull
    @Size(max = 64)
    @ApiModelProperty(value = "创建人", required = true)
    @Column(name = "created_user_id", length = 64, nullable = false)
    private String createdUserId;

    /**
     * 创建时间
     */
    @NotNull
    @ApiModelProperty(value = "创建时间", required = true)
    @Column(name = "created_time", nullable = false)
    private ZonedDateTime createdTime;

    /**
     * 最后修改人
     */
    @Size(max = 64)
    @ApiModelProperty(value = "最后修改人")
    @Column(name = "last_update_user_id", length = 64)
    private String lastUpdateUserId;

    /**
     * 最后修改时间
     */
    @ApiModelProperty(value = "最后修改时间")
    @Column(name = "last_update_time")
    private ZonedDateTime lastUpdateTime;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public WeChatUserInfo serialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getLoginIdentity() {
        return loginIdentity;
    }

    public WeChatUserInfo loginIdentity(String loginIdentity) {
        this.loginIdentity = loginIdentity;
        return this;
    }

    public void setLoginIdentity(String loginIdentity) {
        this.loginIdentity = loginIdentity;
    }

    public String getNickName() {
        return nickName;
    }

    public WeChatUserInfo nickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public WeChatUserInfo avatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Integer getGender() {
        return gender;
    }

    public WeChatUserInfo gender(Integer gender) {
        this.gender = gender;
        return this;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public WeChatUserInfo country(String country) {
        this.country = country;
        return this;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public WeChatUserInfo province(String province) {
        this.province = province;
        return this;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public WeChatUserInfo city(String city) {
        this.city = city;
        return this;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLanguage() {
        return language;
    }

    public WeChatUserInfo language(String language) {
        this.language = language;
        return this;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public WeChatUserInfo mobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getExtend() {
        return extend;
    }

    public WeChatUserInfo extend(String extend) {
        this.extend = extend;
        return this;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public String getOpenid() {
        return openid;
    }

    public WeChatUserInfo openid(String openid) {
        this.openid = openid;
        return this;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public WeChatUserInfo sessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
        return this;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getUnionid() {
        return unionid;
    }

    public WeChatUserInfo unionid(String unionid) {
        this.unionid = unionid;
        return this;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public Boolean isRegistStatus() {
        return registStatus;
    }

    public WeChatUserInfo registStatus(Boolean registStatus) {
        this.registStatus = registStatus;
        return this;
    }

    public void setRegistStatus(Boolean registStatus) {
        this.registStatus = registStatus;
    }

    public String getCheckingHashSign() {
        return checkingHashSign;
    }

    public WeChatUserInfo checkingHashSign(String checkingHashSign) {
        this.checkingHashSign = checkingHashSign;
        return this;
    }

    public void setCheckingHashSign(String checkingHashSign) {
        this.checkingHashSign = checkingHashSign;
    }

    public String getDescription() {
        return description;
    }

    public WeChatUserInfo description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isEnableStatus() {
        return enableStatus;
    }

    public WeChatUserInfo enableStatus(Boolean enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }

    public void setEnableStatus(Boolean enableStatus) {
        this.enableStatus = enableStatus;
    }

    public String getCreatedUserId() {
        return createdUserId;
    }

    public WeChatUserInfo createdUserId(String createdUserId) {
        this.createdUserId = createdUserId;
        return this;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public ZonedDateTime getCreatedTime() {
        return createdTime;
    }

    public WeChatUserInfo createdTime(ZonedDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public void setCreatedTime(ZonedDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    public WeChatUserInfo lastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
        return this;
    }

    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    public ZonedDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public WeChatUserInfo lastUpdateTime(ZonedDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    public void setLastUpdateTime(ZonedDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WeChatUserInfo weChatUserInfo = (WeChatUserInfo) o;
        if (weChatUserInfo.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), weChatUserInfo.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "WeChatUserInfo{" +
            "id=" + getId() +
            ", serialNumber='" + getSerialNumber() + "'" +
            ", loginIdentity='" + getLoginIdentity() + "'" +
            ", nickName='" + getNickName() + "'" +
            ", avatarUrl='" + getAvatarUrl() + "'" +
            ", gender=" + getGender() +
            ", country='" + getCountry() + "'" +
            ", province='" + getProvince() + "'" +
            ", city='" + getCity() + "'" +
            ", language='" + getLanguage() + "'" +
            ", mobileNumber='" + getMobileNumber() + "'" +
            ", extend='" + getExtend() + "'" +
            ", openid='" + getOpenid() + "'" +
            ", sessionKey='" + getSessionKey() + "'" +
            ", unionid='" + getUnionid() + "'" +
            ", registStatus='" + isRegistStatus() + "'" +
            ", checkingHashSign='" + getCheckingHashSign() + "'" +
            ", description='" + getDescription() + "'" +
            ", enableStatus='" + isEnableStatus() + "'" +
            ", createdUserId='" + getCreatedUserId() + "'" +
            ", createdTime='" + getCreatedTime() + "'" +
            ", lastUpdateUserId='" + getLastUpdateUserId() + "'" +
            ", lastUpdateTime='" + getLastUpdateTime() + "'" +
            "}";
    }
}
