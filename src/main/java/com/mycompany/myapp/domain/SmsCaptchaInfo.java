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

import com.renmaituan.base.uaa.domain.enumeration.SystemCaptchaTypeEnum;

import com.renmaituan.base.uaa.domain.enumeration.SendCaptchaTypeEnum;

/**
 * 短信验证码信息
 */
@ApiModel(description = "短信验证码信息")
@Entity
@Table(name = "sms_captcha_info")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "smscaptchainfo")
public class SmsCaptchaInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 手机号
     */
    @Size(max = 50)
    @ApiModelProperty(value = "手机号")
    @Column(name = "mobile", length = 50)
    private String mobile;

    /**
     * 验证码
     */
    @Size(max = 8)
    @ApiModelProperty(value = "验证码")
    @Column(name = "captcha", length = 8)
    private String captcha;

    /**
     * 系统验证码类型
     */
    @ApiModelProperty(value = "系统验证码类型")
    @Enumerated(EnumType.STRING)
    @Column(name = "system_captcha_type")
    private SystemCaptchaTypeEnum systemCaptchaType;

    /**
     * 系统验证码类型
     */
    @ApiModelProperty(value = "系统验证码类型")
    @Enumerated(EnumType.STRING)
    @Column(name = "send_captcha_type")
    private SendCaptchaTypeEnum sendCaptchaType;

    /**
     * 发送时间
     */
    @ApiModelProperty(value = "发送时间")
    @Column(name = "send_time")
    private ZonedDateTime sendTime;

    /**
     * 过期时间
     */
    @ApiModelProperty(value = "过期时间")
    @Column(name = "overdue_time")
    private ZonedDateTime overdueTime;

    /**
     * 是否使用
     */
    @ApiModelProperty(value = "是否使用")
    @Column(name = "used")
    private Boolean used;

    /**
     * 错误码
     */
    @NotNull
    @Size(max = 20)
    @ApiModelProperty(value = "错误码", required = true)
    @Column(name = "failure_code", length = 20, nullable = false)
    private String failureCode;

    /**
     * 错误消息的描述
     */
    @NotNull
    @Size(max = 100)
    @ApiModelProperty(value = "错误消息的描述", required = true)
    @Column(name = "failure_msg", length = 100, nullable = false)
    private String failureMsg;

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

    public String getMobile() {
        return mobile;
    }

    public SmsCaptchaInfo mobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCaptcha() {
        return captcha;
    }

    public SmsCaptchaInfo captcha(String captcha) {
        this.captcha = captcha;
        return this;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public SystemCaptchaTypeEnum getSystemCaptchaType() {
        return systemCaptchaType;
    }

    public SmsCaptchaInfo systemCaptchaType(SystemCaptchaTypeEnum systemCaptchaType) {
        this.systemCaptchaType = systemCaptchaType;
        return this;
    }

    public void setSystemCaptchaType(SystemCaptchaTypeEnum systemCaptchaType) {
        this.systemCaptchaType = systemCaptchaType;
    }

    public SendCaptchaTypeEnum getSendCaptchaType() {
        return sendCaptchaType;
    }

    public SmsCaptchaInfo sendCaptchaType(SendCaptchaTypeEnum sendCaptchaType) {
        this.sendCaptchaType = sendCaptchaType;
        return this;
    }

    public void setSendCaptchaType(SendCaptchaTypeEnum sendCaptchaType) {
        this.sendCaptchaType = sendCaptchaType;
    }

    public ZonedDateTime getSendTime() {
        return sendTime;
    }

    public SmsCaptchaInfo sendTime(ZonedDateTime sendTime) {
        this.sendTime = sendTime;
        return this;
    }

    public void setSendTime(ZonedDateTime sendTime) {
        this.sendTime = sendTime;
    }

    public ZonedDateTime getOverdueTime() {
        return overdueTime;
    }

    public SmsCaptchaInfo overdueTime(ZonedDateTime overdueTime) {
        this.overdueTime = overdueTime;
        return this;
    }

    public void setOverdueTime(ZonedDateTime overdueTime) {
        this.overdueTime = overdueTime;
    }

    public Boolean isUsed() {
        return used;
    }

    public SmsCaptchaInfo used(Boolean used) {
        this.used = used;
        return this;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }

    public String getFailureCode() {
        return failureCode;
    }

    public SmsCaptchaInfo failureCode(String failureCode) {
        this.failureCode = failureCode;
        return this;
    }

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    public String getFailureMsg() {
        return failureMsg;
    }

    public SmsCaptchaInfo failureMsg(String failureMsg) {
        this.failureMsg = failureMsg;
        return this;
    }

    public void setFailureMsg(String failureMsg) {
        this.failureMsg = failureMsg;
    }

    public String getDescription() {
        return description;
    }

    public SmsCaptchaInfo description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isEnableStatus() {
        return enableStatus;
    }

    public SmsCaptchaInfo enableStatus(Boolean enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }

    public void setEnableStatus(Boolean enableStatus) {
        this.enableStatus = enableStatus;
    }

    public String getCreatedUserId() {
        return createdUserId;
    }

    public SmsCaptchaInfo createdUserId(String createdUserId) {
        this.createdUserId = createdUserId;
        return this;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public ZonedDateTime getCreatedTime() {
        return createdTime;
    }

    public SmsCaptchaInfo createdTime(ZonedDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public void setCreatedTime(ZonedDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    public SmsCaptchaInfo lastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
        return this;
    }

    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    public ZonedDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public SmsCaptchaInfo lastUpdateTime(ZonedDateTime lastUpdateTime) {
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
        SmsCaptchaInfo smsCaptchaInfo = (SmsCaptchaInfo) o;
        if (smsCaptchaInfo.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), smsCaptchaInfo.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "SmsCaptchaInfo{" +
            "id=" + getId() +
            ", mobile='" + getMobile() + "'" +
            ", captcha='" + getCaptcha() + "'" +
            ", systemCaptchaType='" + getSystemCaptchaType() + "'" +
            ", sendCaptchaType='" + getSendCaptchaType() + "'" +
            ", sendTime='" + getSendTime() + "'" +
            ", overdueTime='" + getOverdueTime() + "'" +
            ", used='" + isUsed() + "'" +
            ", failureCode='" + getFailureCode() + "'" +
            ", failureMsg='" + getFailureMsg() + "'" +
            ", description='" + getDescription() + "'" +
            ", enableStatus='" + isEnableStatus() + "'" +
            ", createdUserId='" + getCreatedUserId() + "'" +
            ", createdTime='" + getCreatedTime() + "'" +
            ", lastUpdateUserId='" + getLastUpdateUserId() + "'" +
            ", lastUpdateTime='" + getLastUpdateTime() + "'" +
            "}";
    }
}
