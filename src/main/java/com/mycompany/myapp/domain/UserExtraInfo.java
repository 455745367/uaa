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

import com.renmaituan.base.uaa.domain.enumeration.AuditStatusEnum;

/**
 * 用户扩展信息
 */
@ApiModel(description = "用户扩展信息")
@Entity
@Table(name = "user_extra_info")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "userextrainfo")
public class UserExtraInfo implements Serializable {

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
     * 用户ID
     */
    @NotNull
    @Size(max = 64)
    @ApiModelProperty(value = "用户ID", required = true)
    @Column(name = "user_id", length = 64, nullable = false)
    private String userId;

    /**
     * 昵称
     */
    @NotNull
    @Size(max = 20)
    @ApiModelProperty(value = "昵称", required = true)
    @Column(name = "nickname", length = 20, nullable = false)
    private String nickname;

    /**
     * 头像
     */
    @NotNull
    @Size(max = 100)
    @ApiModelProperty(value = "头像", required = true)
    @Column(name = "head_portrait", length = 100, nullable = false)
    private String headPortrait;

    /**
     * 用户名
     */
    @NotNull
    @Size(max = 20)
    @ApiModelProperty(value = "用户名", required = true)
    @Column(name = "user_name", length = 20, nullable = false)
    private String userName;

    /**
     * 密码
     */
    @NotNull
    @Size(max = 60)
    @ApiModelProperty(value = "密码", required = true)
    @Column(name = "jhi_password", length = 60, nullable = false)
    private String password;

    /**
     * 邮箱地址
     */
    @NotNull
    @Size(max = 30)
    @ApiModelProperty(value = "邮箱地址", required = true)
    @Column(name = "email", length = 30, nullable = false)
    private String email;

    /**
     * 注册时间
     */
    @ApiModelProperty(value = "注册时间")
    @Column(name = "register_time")
    private ZonedDateTime registerTime;

    /**
     * 电话号码
     */
    @NotNull
    @Size(max = 25)
    @ApiModelProperty(value = "电话号码", required = true)
    @Column(name = "telephone_number", length = 25, nullable = false)
    private String telephoneNumber;

    /**
     * 手机电话
     */
    @NotNull
    @Size(max = 25)
    @ApiModelProperty(value = "手机电话", required = true)
    @Column(name = "mobile_number", length = 25, nullable = false)
    private String mobileNumber;

    /**
     * 用户基本实名认证（存放：使用身份证号码、姓名实名认证状态）
     */
    @ApiModelProperty(value = "用户基本实名认证（存放：使用身份证号码、姓名实名认证状态）")
    @Column(name = "user_elementary_authentication")
    private Boolean userElementaryAuthentication;

    /**
     * 用户实名认证状态
     */
    @ApiModelProperty(value = "用户实名认证状态")
    @Enumerated(EnumType.STRING)
    @Column(name = "user_authentication")
    private AuditStatusEnum userAuthentication;

    /**
     * 用户绑定银行卡
     */
    @ApiModelProperty(value = "用户绑定银行卡")
    @Column(name = "user_bind_bank_card")
    private Boolean userBindBankCard;

    /**
     * 用户人脸登录
     */
    @ApiModelProperty(value = "用户人脸登录")
    @Column(name = "user_face_login")
    private Boolean userFaceLogin;

    /**
     * 生日
     */
    @Size(max = 20)
    @ApiModelProperty(value = "生日")
    @Column(name = "birthday", length = 20)
    private String birthday;

    /**
     * 性别
     * 0：女
     * 1：男
     * 2：未知
     */
    @ApiModelProperty(value = "性别 0：女 1：男 2：未知")
    @Column(name = "sex")
    private Integer sex;

    /**
     * 推荐用户
     */
    @NotNull
    @Size(max = 64)
    @ApiModelProperty(value = "推荐用户", required = true)
    @Column(name = "recommend_user", length = 64, nullable = false)
    private String recommendUser;

    /**
     * 国籍
     */
    @NotNull
    @Size(max = 20)
    @ApiModelProperty(value = "国籍", required = true)
    @Column(name = "nationality", length = 20, nullable = false)
    private String nationality;

    /**
     * 注册渠道
     */
    @Size(max = 64)
    @ApiModelProperty(value = "注册渠道")
    @Column(name = "register_channel", length = 64)
    private String registerChannel;

    /**
     * 用户权限
     */
    @Size(max = 256)
    @ApiModelProperty(value = "用户权限")
    @Column(name = "user_authorities", length = 256)
    private String userAuthorities;

    /**
     * 用户业务渠道权限
     */
    @Size(max = 256)
    @ApiModelProperty(value = "用户业务渠道权限")
    @Column(name = "user_business_channel_authorities", length = 256)
    private String userBusinessChannelAuthorities;

    /**
     * 系统用户身份切换
     */
    @Size(max = 256)
    @ApiModelProperty(value = "系统用户身份切换")
    @Column(name = "system_user_identity_switchingl", length = 256)
    private String systemUserIdentitySwitchingl;

    /**
     * 账号激活状态
     */
    @ApiModelProperty(value = "账号激活状态")
    @Column(name = "activated")
    private Boolean activated;

    /**
     * 支付密码状态
     */
    @ApiModelProperty(value = "支付密码状态")
    @Column(name = "payment_password")
    private Boolean paymentPassword;

    /**
     * 备注附加说明
     */
    @Size(max = 100)
    @ApiModelProperty(value = "备注附加说明")
    @Column(name = "description", length = 100)
    private String description;

    /**
     * 启用状态
     */
    @ApiModelProperty(value = "启用状态")
    @Column(name = "enable_status")
    private Boolean enableStatus;

    /**
     * 创建人
     */
    @Size(max = 64)
    @ApiModelProperty(value = "创建人")
    @Column(name = "created_user_id", length = 64)
    private String createdUserId;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @Column(name = "created_time")
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

    public UserExtraInfo serialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getLoginIdentity() {
        return loginIdentity;
    }

    public UserExtraInfo loginIdentity(String loginIdentity) {
        this.loginIdentity = loginIdentity;
        return this;
    }

    public void setLoginIdentity(String loginIdentity) {
        this.loginIdentity = loginIdentity;
    }

    public String getUserId() {
        return userId;
    }

    public UserExtraInfo userId(String userId) {
        this.userId = userId;
        return this;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public UserExtraInfo nickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public UserExtraInfo headPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
        return this;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }

    public String getUserName() {
        return userName;
    }

    public UserExtraInfo userName(String userName) {
        this.userName = userName;
        return this;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public UserExtraInfo password(String password) {
        this.password = password;
        return this;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public UserExtraInfo email(String email) {
        this.email = email;
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ZonedDateTime getRegisterTime() {
        return registerTime;
    }

    public UserExtraInfo registerTime(ZonedDateTime registerTime) {
        this.registerTime = registerTime;
        return this;
    }

    public void setRegisterTime(ZonedDateTime registerTime) {
        this.registerTime = registerTime;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public UserExtraInfo telephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        return this;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public UserExtraInfo mobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Boolean isUserElementaryAuthentication() {
        return userElementaryAuthentication;
    }

    public UserExtraInfo userElementaryAuthentication(Boolean userElementaryAuthentication) {
        this.userElementaryAuthentication = userElementaryAuthentication;
        return this;
    }

    public void setUserElementaryAuthentication(Boolean userElementaryAuthentication) {
        this.userElementaryAuthentication = userElementaryAuthentication;
    }

    public AuditStatusEnum getUserAuthentication() {
        return userAuthentication;
    }

    public UserExtraInfo userAuthentication(AuditStatusEnum userAuthentication) {
        this.userAuthentication = userAuthentication;
        return this;
    }

    public void setUserAuthentication(AuditStatusEnum userAuthentication) {
        this.userAuthentication = userAuthentication;
    }

    public Boolean isUserBindBankCard() {
        return userBindBankCard;
    }

    public UserExtraInfo userBindBankCard(Boolean userBindBankCard) {
        this.userBindBankCard = userBindBankCard;
        return this;
    }

    public void setUserBindBankCard(Boolean userBindBankCard) {
        this.userBindBankCard = userBindBankCard;
    }

    public Boolean isUserFaceLogin() {
        return userFaceLogin;
    }

    public UserExtraInfo userFaceLogin(Boolean userFaceLogin) {
        this.userFaceLogin = userFaceLogin;
        return this;
    }

    public void setUserFaceLogin(Boolean userFaceLogin) {
        this.userFaceLogin = userFaceLogin;
    }

    public String getBirthday() {
        return birthday;
    }

    public UserExtraInfo birthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getSex() {
        return sex;
    }

    public UserExtraInfo sex(Integer sex) {
        this.sex = sex;
        return this;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getRecommendUser() {
        return recommendUser;
    }

    public UserExtraInfo recommendUser(String recommendUser) {
        this.recommendUser = recommendUser;
        return this;
    }

    public void setRecommendUser(String recommendUser) {
        this.recommendUser = recommendUser;
    }

    public String getNationality() {
        return nationality;
    }

    public UserExtraInfo nationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getRegisterChannel() {
        return registerChannel;
    }

    public UserExtraInfo registerChannel(String registerChannel) {
        this.registerChannel = registerChannel;
        return this;
    }

    public void setRegisterChannel(String registerChannel) {
        this.registerChannel = registerChannel;
    }

    public String getUserAuthorities() {
        return userAuthorities;
    }

    public UserExtraInfo userAuthorities(String userAuthorities) {
        this.userAuthorities = userAuthorities;
        return this;
    }

    public void setUserAuthorities(String userAuthorities) {
        this.userAuthorities = userAuthorities;
    }

    public String getUserBusinessChannelAuthorities() {
        return userBusinessChannelAuthorities;
    }

    public UserExtraInfo userBusinessChannelAuthorities(String userBusinessChannelAuthorities) {
        this.userBusinessChannelAuthorities = userBusinessChannelAuthorities;
        return this;
    }

    public void setUserBusinessChannelAuthorities(String userBusinessChannelAuthorities) {
        this.userBusinessChannelAuthorities = userBusinessChannelAuthorities;
    }

    public String getSystemUserIdentitySwitchingl() {
        return systemUserIdentitySwitchingl;
    }

    public UserExtraInfo systemUserIdentitySwitchingl(String systemUserIdentitySwitchingl) {
        this.systemUserIdentitySwitchingl = systemUserIdentitySwitchingl;
        return this;
    }

    public void setSystemUserIdentitySwitchingl(String systemUserIdentitySwitchingl) {
        this.systemUserIdentitySwitchingl = systemUserIdentitySwitchingl;
    }

    public Boolean isActivated() {
        return activated;
    }

    public UserExtraInfo activated(Boolean activated) {
        this.activated = activated;
        return this;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public Boolean isPaymentPassword() {
        return paymentPassword;
    }

    public UserExtraInfo paymentPassword(Boolean paymentPassword) {
        this.paymentPassword = paymentPassword;
        return this;
    }

    public void setPaymentPassword(Boolean paymentPassword) {
        this.paymentPassword = paymentPassword;
    }

    public String getDescription() {
        return description;
    }

    public UserExtraInfo description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isEnableStatus() {
        return enableStatus;
    }

    public UserExtraInfo enableStatus(Boolean enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }

    public void setEnableStatus(Boolean enableStatus) {
        this.enableStatus = enableStatus;
    }

    public String getCreatedUserId() {
        return createdUserId;
    }

    public UserExtraInfo createdUserId(String createdUserId) {
        this.createdUserId = createdUserId;
        return this;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public ZonedDateTime getCreatedTime() {
        return createdTime;
    }

    public UserExtraInfo createdTime(ZonedDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public void setCreatedTime(ZonedDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    public UserExtraInfo lastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
        return this;
    }

    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    public ZonedDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public UserExtraInfo lastUpdateTime(ZonedDateTime lastUpdateTime) {
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
        UserExtraInfo userExtraInfo = (UserExtraInfo) o;
        if (userExtraInfo.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), userExtraInfo.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "UserExtraInfo{" +
            "id=" + getId() +
            ", serialNumber='" + getSerialNumber() + "'" +
            ", loginIdentity='" + getLoginIdentity() + "'" +
            ", userId='" + getUserId() + "'" +
            ", nickname='" + getNickname() + "'" +
            ", headPortrait='" + getHeadPortrait() + "'" +
            ", userName='" + getUserName() + "'" +
            ", password='" + getPassword() + "'" +
            ", email='" + getEmail() + "'" +
            ", registerTime='" + getRegisterTime() + "'" +
            ", telephoneNumber='" + getTelephoneNumber() + "'" +
            ", mobileNumber='" + getMobileNumber() + "'" +
            ", userElementaryAuthentication='" + isUserElementaryAuthentication() + "'" +
            ", userAuthentication='" + getUserAuthentication() + "'" +
            ", userBindBankCard='" + isUserBindBankCard() + "'" +
            ", userFaceLogin='" + isUserFaceLogin() + "'" +
            ", birthday='" + getBirthday() + "'" +
            ", sex=" + getSex() +
            ", recommendUser='" + getRecommendUser() + "'" +
            ", nationality='" + getNationality() + "'" +
            ", registerChannel='" + getRegisterChannel() + "'" +
            ", userAuthorities='" + getUserAuthorities() + "'" +
            ", userBusinessChannelAuthorities='" + getUserBusinessChannelAuthorities() + "'" +
            ", systemUserIdentitySwitchingl='" + getSystemUserIdentitySwitchingl() + "'" +
            ", activated='" + isActivated() + "'" +
            ", paymentPassword='" + isPaymentPassword() + "'" +
            ", description='" + getDescription() + "'" +
            ", enableStatus='" + isEnableStatus() + "'" +
            ", createdUserId='" + getCreatedUserId() + "'" +
            ", createdTime='" + getCreatedTime() + "'" +
            ", lastUpdateUserId='" + getLastUpdateUserId() + "'" +
            ", lastUpdateTime='" + getLastUpdateTime() + "'" +
            "}";
    }
}
