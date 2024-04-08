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
 * 用户反馈信息
 */
@ApiModel(description = "用户反馈信息")
@Entity
@Table(name = "user_feed_back_info")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "userfeedbackinfo")
public class UserFeedBackInfo implements Serializable {

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
    @ApiModelProperty(value = "用户登录身份", required = true)
    @Column(name = "login_identity", nullable = false)
    private String loginIdentity;

    /**
     * 联系电话
     */
    @Size(max = 20)
    @ApiModelProperty(value = "联系电话")
    @Column(name = "contact_number", length = 20)
    private String contactNumber;

    /**
     * 反馈名称
     */
    @NotNull
    @Size(max = 128)
    @ApiModelProperty(value = "反馈名称", required = true)
    @Column(name = "feedback_name", length = 128, nullable = false)
    private String feedbackName;

    /**
     * 反馈编码
     */
    @NotNull
    @Size(max = 64)
    @ApiModelProperty(value = "反馈编码", required = true)
    @Column(name = "feedback_code", length = 64, nullable = false)
    private String feedbackCode;

    /**
     * 业务KEY
     */
    @NotNull
    @Size(max = 64)
    @ApiModelProperty(value = "业务KEY", required = true)
    @Column(name = "business_key", length = 64, nullable = false)
    private String businessKey;

    /**
     * 标题
     */
    @Size(max = 128)
    @ApiModelProperty(value = "标题")
    @Column(name = "title", length = 128)
    private String title;

    /**
     * 反馈内容
     */
    @NotNull
    @Size(max = 512)
    @ApiModelProperty(value = "反馈内容", required = true)
    @Column(name = "content", length = 512, nullable = false)
    private String content;

    /**
     * 图片地址
     */
    @NotNull
    @Size(max = 512)
    @ApiModelProperty(value = "图片地址", required = true)
    @Column(name = "images_url", length = 512, nullable = false)
    private String imagesUrl;

    /**
     * 系统渠道来源
     */
    @NotNull
    @Size(max = 64)
    @ApiModelProperty(value = "系统渠道来源", required = true)
    @Column(name = "system_channel_source", length = 64, nullable = false)
    private String systemChannelSource;

    /**
     * 扩展
     */
    @Size(max = 512)
    @ApiModelProperty(value = "扩展")
    @Column(name = "extend", length = 512)
    private String extend;

    /**
     * 备注附加说明
     */
    @ApiModelProperty(value = "备注附加说明")
    @Column(name = "description")
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
    @ApiModelProperty(value = "创建人")
    @Column(name = "created_user_id")
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
    @ApiModelProperty(value = "最后修改人")
    @Column(name = "last_update_user_id")
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

    public UserFeedBackInfo serialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getLoginIdentity() {
        return loginIdentity;
    }

    public UserFeedBackInfo loginIdentity(String loginIdentity) {
        this.loginIdentity = loginIdentity;
        return this;
    }

    public void setLoginIdentity(String loginIdentity) {
        this.loginIdentity = loginIdentity;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public UserFeedBackInfo contactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
        return this;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getFeedbackName() {
        return feedbackName;
    }

    public UserFeedBackInfo feedbackName(String feedbackName) {
        this.feedbackName = feedbackName;
        return this;
    }

    public void setFeedbackName(String feedbackName) {
        this.feedbackName = feedbackName;
    }

    public String getFeedbackCode() {
        return feedbackCode;
    }

    public UserFeedBackInfo feedbackCode(String feedbackCode) {
        this.feedbackCode = feedbackCode;
        return this;
    }

    public void setFeedbackCode(String feedbackCode) {
        this.feedbackCode = feedbackCode;
    }

    public String getBusinessKey() {
        return businessKey;
    }

    public UserFeedBackInfo businessKey(String businessKey) {
        this.businessKey = businessKey;
        return this;
    }

    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    public String getTitle() {
        return title;
    }

    public UserFeedBackInfo title(String title) {
        this.title = title;
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public UserFeedBackInfo content(String content) {
        this.content = content;
        return this;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImagesUrl() {
        return imagesUrl;
    }

    public UserFeedBackInfo imagesUrl(String imagesUrl) {
        this.imagesUrl = imagesUrl;
        return this;
    }

    public void setImagesUrl(String imagesUrl) {
        this.imagesUrl = imagesUrl;
    }

    public String getSystemChannelSource() {
        return systemChannelSource;
    }

    public UserFeedBackInfo systemChannelSource(String systemChannelSource) {
        this.systemChannelSource = systemChannelSource;
        return this;
    }

    public void setSystemChannelSource(String systemChannelSource) {
        this.systemChannelSource = systemChannelSource;
    }

    public String getExtend() {
        return extend;
    }

    public UserFeedBackInfo extend(String extend) {
        this.extend = extend;
        return this;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public String getDescription() {
        return description;
    }

    public UserFeedBackInfo description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isEnableStatus() {
        return enableStatus;
    }

    public UserFeedBackInfo enableStatus(Boolean enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }

    public void setEnableStatus(Boolean enableStatus) {
        this.enableStatus = enableStatus;
    }

    public String getCreatedUserId() {
        return createdUserId;
    }

    public UserFeedBackInfo createdUserId(String createdUserId) {
        this.createdUserId = createdUserId;
        return this;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public ZonedDateTime getCreatedTime() {
        return createdTime;
    }

    public UserFeedBackInfo createdTime(ZonedDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public void setCreatedTime(ZonedDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    public UserFeedBackInfo lastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
        return this;
    }

    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    public ZonedDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public UserFeedBackInfo lastUpdateTime(ZonedDateTime lastUpdateTime) {
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
        UserFeedBackInfo userFeedBackInfo = (UserFeedBackInfo) o;
        if (userFeedBackInfo.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), userFeedBackInfo.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "UserFeedBackInfo{" +
            "id=" + getId() +
            ", serialNumber='" + getSerialNumber() + "'" +
            ", loginIdentity='" + getLoginIdentity() + "'" +
            ", contactNumber='" + getContactNumber() + "'" +
            ", feedbackName='" + getFeedbackName() + "'" +
            ", feedbackCode='" + getFeedbackCode() + "'" +
            ", businessKey='" + getBusinessKey() + "'" +
            ", title='" + getTitle() + "'" +
            ", content='" + getContent() + "'" +
            ", imagesUrl='" + getImagesUrl() + "'" +
            ", systemChannelSource='" + getSystemChannelSource() + "'" +
            ", extend='" + getExtend() + "'" +
            ", description='" + getDescription() + "'" +
            ", enableStatus='" + isEnableStatus() + "'" +
            ", createdUserId='" + getCreatedUserId() + "'" +
            ", createdTime='" + getCreatedTime() + "'" +
            ", lastUpdateUserId='" + getLastUpdateUserId() + "'" +
            ", lastUpdateTime='" + getLastUpdateTime() + "'" +
            "}";
    }
}
