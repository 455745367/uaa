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
 * 用户人脸绑定信息
 */
@ApiModel(description = "用户人脸绑定信息")
@Entity
@Table(name = "user_face_binding_info")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "userfacebindinginfo")
public class UserFaceBindingInfo implements Serializable {

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
     * 用户人脸序列号
     */
    @NotNull
    @Size(max = 64)
    @ApiModelProperty(value = "用户人脸序列号", required = true)
    @Column(name = "face_serial_number", length = 64, nullable = false)
    private String faceSerialNumber;

    /**
     * 用户照片地址
     */
    @NotNull
    @Size(max = 256)
    @ApiModelProperty(value = "用户照片地址", required = true)
    @Column(name = "user_photo_url", length = 256, nullable = false)
    private String userPhotoUrl;

    /**
     * 经度
     */
    @NotNull
    @Size(max = 20)
    @ApiModelProperty(value = "经度", required = true)
    @Column(name = "longitude", length = 20, nullable = false)
    private String longitude;

    /**
     * 纬度
     */
    @NotNull
    @Size(max = 20)
    @ApiModelProperty(value = "纬度", required = true)
    @Column(name = "latitude", length = 20, nullable = false)
    private String latitude;

    /**
     * 省份
     */
    @Size(max = 20)
    @ApiModelProperty(value = "省份")
    @Column(name = "province", length = 20)
    private String province;

    /**
     * 城市
     */
    @Size(max = 20)
    @ApiModelProperty(value = "城市")
    @Column(name = "city", length = 20)
    private String city;

    /**
     * 国家
     */
    @Size(max = 20)
    @ApiModelProperty(value = "国家")
    @Column(name = "country", length = 20)
    private String country;

    /**
     * 验证密文
     */
    @NotNull
    @Size(max = 256)
    @ApiModelProperty(value = "验证密文", required = true)
    @Column(name = "verifying_ciphertext", length = 256, nullable = false)
    private String verifyingCiphertext;

    /**
     * 验证签名
     */
    @NotNull
    @Size(max = 256)
    @ApiModelProperty(value = "验证签名", required = true)
    @Column(name = "verifying_sign", length = 256, nullable = false)
    private String verifyingSign;

    /**
     * 采集终端
     */
    @NotNull
    @Size(max = 20)
    @ApiModelProperty(value = "采集终端", required = true)
    @Column(name = "gather_terminal", length = 20, nullable = false)
    private String gatherTerminal;

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

    public UserFaceBindingInfo loginIdentity(String loginIdentity) {
        this.loginIdentity = loginIdentity;
        return this;
    }

    public void setLoginIdentity(String loginIdentity) {
        this.loginIdentity = loginIdentity;
    }

    public String getFaceSerialNumber() {
        return faceSerialNumber;
    }

    public UserFaceBindingInfo faceSerialNumber(String faceSerialNumber) {
        this.faceSerialNumber = faceSerialNumber;
        return this;
    }

    public void setFaceSerialNumber(String faceSerialNumber) {
        this.faceSerialNumber = faceSerialNumber;
    }

    public String getUserPhotoUrl() {
        return userPhotoUrl;
    }

    public UserFaceBindingInfo userPhotoUrl(String userPhotoUrl) {
        this.userPhotoUrl = userPhotoUrl;
        return this;
    }

    public void setUserPhotoUrl(String userPhotoUrl) {
        this.userPhotoUrl = userPhotoUrl;
    }

    public String getLongitude() {
        return longitude;
    }

    public UserFaceBindingInfo longitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public UserFaceBindingInfo latitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getProvince() {
        return province;
    }

    public UserFaceBindingInfo province(String province) {
        this.province = province;
        return this;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public UserFaceBindingInfo city(String city) {
        this.city = city;
        return this;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public UserFaceBindingInfo country(String country) {
        this.country = country;
        return this;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getVerifyingCiphertext() {
        return verifyingCiphertext;
    }

    public UserFaceBindingInfo verifyingCiphertext(String verifyingCiphertext) {
        this.verifyingCiphertext = verifyingCiphertext;
        return this;
    }

    public void setVerifyingCiphertext(String verifyingCiphertext) {
        this.verifyingCiphertext = verifyingCiphertext;
    }

    public String getVerifyingSign() {
        return verifyingSign;
    }

    public UserFaceBindingInfo verifyingSign(String verifyingSign) {
        this.verifyingSign = verifyingSign;
        return this;
    }

    public void setVerifyingSign(String verifyingSign) {
        this.verifyingSign = verifyingSign;
    }

    public String getGatherTerminal() {
        return gatherTerminal;
    }

    public UserFaceBindingInfo gatherTerminal(String gatherTerminal) {
        this.gatherTerminal = gatherTerminal;
        return this;
    }

    public void setGatherTerminal(String gatherTerminal) {
        this.gatherTerminal = gatherTerminal;
    }

    public String getDescription() {
        return description;
    }

    public UserFaceBindingInfo description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isEnableStatus() {
        return enableStatus;
    }

    public UserFaceBindingInfo enableStatus(Boolean enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }

    public void setEnableStatus(Boolean enableStatus) {
        this.enableStatus = enableStatus;
    }

    public String getCreatedUserId() {
        return createdUserId;
    }

    public UserFaceBindingInfo createdUserId(String createdUserId) {
        this.createdUserId = createdUserId;
        return this;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public ZonedDateTime getCreatedTime() {
        return createdTime;
    }

    public UserFaceBindingInfo createdTime(ZonedDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public void setCreatedTime(ZonedDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    public UserFaceBindingInfo lastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
        return this;
    }

    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    public ZonedDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public UserFaceBindingInfo lastUpdateTime(ZonedDateTime lastUpdateTime) {
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
        UserFaceBindingInfo userFaceBindingInfo = (UserFaceBindingInfo) o;
        if (userFaceBindingInfo.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), userFaceBindingInfo.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "UserFaceBindingInfo{" +
            "id=" + getId() +
            ", loginIdentity='" + getLoginIdentity() + "'" +
            ", faceSerialNumber='" + getFaceSerialNumber() + "'" +
            ", userPhotoUrl='" + getUserPhotoUrl() + "'" +
            ", longitude='" + getLongitude() + "'" +
            ", latitude='" + getLatitude() + "'" +
            ", province='" + getProvince() + "'" +
            ", city='" + getCity() + "'" +
            ", country='" + getCountry() + "'" +
            ", verifyingCiphertext='" + getVerifyingCiphertext() + "'" +
            ", verifyingSign='" + getVerifyingSign() + "'" +
            ", gatherTerminal='" + getGatherTerminal() + "'" +
            ", description='" + getDescription() + "'" +
            ", enableStatus='" + isEnableStatus() + "'" +
            ", createdUserId='" + getCreatedUserId() + "'" +
            ", createdTime='" + getCreatedTime() + "'" +
            ", lastUpdateUserId='" + getLastUpdateUserId() + "'" +
            ", lastUpdateTime='" + getLastUpdateTime() + "'" +
            "}";
    }
}
