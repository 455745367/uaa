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
 * 用户实名认证信息
 */
@ApiModel(description = "用户实名认证信息")
@Entity
@Table(name = "user_authentication_info")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "userauthenticationinfo")
public class UserAuthenticationInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户登录身份
     */
    @NotNull
    @Size(max = 64)
    @ApiModelProperty(value = "用户登录身份", required = true)
    @Column(name = "login_identity", length = 64, nullable = false)
    private String loginIdentity;

    /**
     * 身份证号码
     */
    @NotNull
    @Size(max = 20)
    @ApiModelProperty(value = "身份证号码", required = true)
    @Column(name = "jhi_identity", length = 20, nullable = false)
    private String identity;

    /**
     * 名
     */
    @Size(max = 20)
    @ApiModelProperty(value = "名")
    @Column(name = "first_name", length = 20)
    private String firstName;

    /**
     * 姓
     */
    @Size(max = 20)
    @ApiModelProperty(value = "姓")
    @Column(name = "last_name", length = 20)
    private String lastName;

    /**
     * 身份证名称
     */
    @NotNull
    @Size(max = 20)
    @ApiModelProperty(value = "身份证名称", required = true)
    @Column(name = "realname", length = 20, nullable = false)
    private String realname;

    /**
     * 正面相片
     */
    @NotNull
    @Size(max = 255)
    @ApiModelProperty(value = "正面相片", required = true)
    @Column(name = "front_photo", length = 255, nullable = false)
    private String frontPhoto;

    /**
     * 反面相片
     */
    @NotNull
    @Size(max = 255)
    @ApiModelProperty(value = "反面相片", required = true)
    @Column(name = "opposite_photo", length = 255, nullable = false)
    private String oppositePhoto;

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
     * 国籍
     */
    @NotNull
    @Size(max = 20)
    @ApiModelProperty(value = "国籍", required = true)
    @Column(name = "nationality", length = 20, nullable = false)
    private String nationality;

    /**
     * 扫描数据
     */
    @Size(max = 2000)
    @ApiModelProperty(value = "扫描数据")
    @Column(name = "scan_data", length = 2000)
    private String scanData;

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

    public String getLoginIdentity() {
        return loginIdentity;
    }

    public UserAuthenticationInfo loginIdentity(String loginIdentity) {
        this.loginIdentity = loginIdentity;
        return this;
    }

    public void setLoginIdentity(String loginIdentity) {
        this.loginIdentity = loginIdentity;
    }

    public String getIdentity() {
        return identity;
    }

    public UserAuthenticationInfo identity(String identity) {
        this.identity = identity;
        return this;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserAuthenticationInfo firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public UserAuthenticationInfo lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRealname() {
        return realname;
    }

    public UserAuthenticationInfo realname(String realname) {
        this.realname = realname;
        return this;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getFrontPhoto() {
        return frontPhoto;
    }

    public UserAuthenticationInfo frontPhoto(String frontPhoto) {
        this.frontPhoto = frontPhoto;
        return this;
    }

    public void setFrontPhoto(String frontPhoto) {
        this.frontPhoto = frontPhoto;
    }

    public String getOppositePhoto() {
        return oppositePhoto;
    }

    public UserAuthenticationInfo oppositePhoto(String oppositePhoto) {
        this.oppositePhoto = oppositePhoto;
        return this;
    }

    public void setOppositePhoto(String oppositePhoto) {
        this.oppositePhoto = oppositePhoto;
    }

    public Boolean isUserElementaryAuthentication() {
        return userElementaryAuthentication;
    }

    public UserAuthenticationInfo userElementaryAuthentication(Boolean userElementaryAuthentication) {
        this.userElementaryAuthentication = userElementaryAuthentication;
        return this;
    }

    public void setUserElementaryAuthentication(Boolean userElementaryAuthentication) {
        this.userElementaryAuthentication = userElementaryAuthentication;
    }

    public AuditStatusEnum getUserAuthentication() {
        return userAuthentication;
    }

    public UserAuthenticationInfo userAuthentication(AuditStatusEnum userAuthentication) {
        this.userAuthentication = userAuthentication;
        return this;
    }

    public void setUserAuthentication(AuditStatusEnum userAuthentication) {
        this.userAuthentication = userAuthentication;
    }

    public String getNationality() {
        return nationality;
    }

    public UserAuthenticationInfo nationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getScanData() {
        return scanData;
    }

    public UserAuthenticationInfo scanData(String scanData) {
        this.scanData = scanData;
        return this;
    }

    public void setScanData(String scanData) {
        this.scanData = scanData;
    }

    public String getDescription() {
        return description;
    }

    public UserAuthenticationInfo description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isEnableStatus() {
        return enableStatus;
    }

    public UserAuthenticationInfo enableStatus(Boolean enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }

    public void setEnableStatus(Boolean enableStatus) {
        this.enableStatus = enableStatus;
    }

    public String getCreatedUserId() {
        return createdUserId;
    }

    public UserAuthenticationInfo createdUserId(String createdUserId) {
        this.createdUserId = createdUserId;
        return this;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public ZonedDateTime getCreatedTime() {
        return createdTime;
    }

    public UserAuthenticationInfo createdTime(ZonedDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public void setCreatedTime(ZonedDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    public UserAuthenticationInfo lastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
        return this;
    }

    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    public ZonedDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public UserAuthenticationInfo lastUpdateTime(ZonedDateTime lastUpdateTime) {
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
        UserAuthenticationInfo userAuthenticationInfo = (UserAuthenticationInfo) o;
        if (userAuthenticationInfo.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), userAuthenticationInfo.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "UserAuthenticationInfo{" +
            "id=" + getId() +
            ", loginIdentity='" + getLoginIdentity() + "'" +
            ", identity='" + getIdentity() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", realname='" + getRealname() + "'" +
            ", frontPhoto='" + getFrontPhoto() + "'" +
            ", oppositePhoto='" + getOppositePhoto() + "'" +
            ", userElementaryAuthentication='" + isUserElementaryAuthentication() + "'" +
            ", userAuthentication='" + getUserAuthentication() + "'" +
            ", nationality='" + getNationality() + "'" +
            ", scanData='" + getScanData() + "'" +
            ", description='" + getDescription() + "'" +
            ", enableStatus='" + isEnableStatus() + "'" +
            ", createdUserId='" + getCreatedUserId() + "'" +
            ", createdTime='" + getCreatedTime() + "'" +
            ", lastUpdateUserId='" + getLastUpdateUserId() + "'" +
            ", lastUpdateTime='" + getLastUpdateTime() + "'" +
            "}";
    }
}
