package com.renmaituan.base.uaa.domain;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Objects;

import com.renmaituan.base.uaa.domain.enumeration.SystemRoleIdentityStrategyEnum;

import com.renmaituan.base.uaa.domain.enumeration.SystemChannelSourceEnum;

/**
 * 系统角色身份信息
 */
@ApiModel(description = "系统角色身份信息")
@Entity
@Table(name = "system_role_identity_info")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "systemroleidentityinfo")
public class SystemRoleIdentityInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 角色编码
     */
    @Size(max = 64)
    @ApiModelProperty(value = "角色编码")
    @Column(name = "code", length = 64)
    private String code;

    /**
     * 角色名称
     */
    @Size(max = 64)
    @ApiModelProperty(value = "角色名称")
    @Column(name = "name", length = 64)
    private String name;

    /**
     * 角色图标
     */
    @Size(max = 256)
    @ApiModelProperty(value = "角色图标")
    @Column(name = "icon", length = 256)
    private String icon;

    /**
     * 系统角色身份策略
     */
    @ApiModelProperty(value = "系统角色身份策略")
    @Enumerated(EnumType.STRING)
    @Column(name = "system_role_identity_strategy")
    private SystemRoleIdentityStrategyEnum systemRoleIdentityStrategy;

    /**
     * 升级成长值
     */
    @ApiModelProperty(value = "升级成长值")
    @Column(name = "upgrade_growth_value", precision = 10, scale = 2)
    private BigDecimal upgradeGrowthValue;

    /**
     * 适用渠道
     */
    @ApiModelProperty(value = "适用渠道")
    @Enumerated(EnumType.STRING)
    @Column(name = "applicable_channel")
    private SystemChannelSourceEnum applicableChannel;

    /**
     * 代理编码
     */
    @NotNull
    @Size(max = 64)
    @ApiModelProperty(value = "代理编码", required = true)
    @Column(name = "agent_code", length = 64, nullable = false)
    private String agentCode;

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

    public String getCode() {
        return code;
    }

    public SystemRoleIdentityInfo code(String code) {
        this.code = code;
        return this;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public SystemRoleIdentityInfo name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public SystemRoleIdentityInfo icon(String icon) {
        this.icon = icon;
        return this;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public SystemRoleIdentityStrategyEnum getSystemRoleIdentityStrategy() {
        return systemRoleIdentityStrategy;
    }

    public SystemRoleIdentityInfo systemRoleIdentityStrategy(SystemRoleIdentityStrategyEnum systemRoleIdentityStrategy) {
        this.systemRoleIdentityStrategy = systemRoleIdentityStrategy;
        return this;
    }

    public void setSystemRoleIdentityStrategy(SystemRoleIdentityStrategyEnum systemRoleIdentityStrategy) {
        this.systemRoleIdentityStrategy = systemRoleIdentityStrategy;
    }

    public BigDecimal getUpgradeGrowthValue() {
        return upgradeGrowthValue;
    }

    public SystemRoleIdentityInfo upgradeGrowthValue(BigDecimal upgradeGrowthValue) {
        this.upgradeGrowthValue = upgradeGrowthValue;
        return this;
    }

    public void setUpgradeGrowthValue(BigDecimal upgradeGrowthValue) {
        this.upgradeGrowthValue = upgradeGrowthValue;
    }

    public SystemChannelSourceEnum getApplicableChannel() {
        return applicableChannel;
    }

    public SystemRoleIdentityInfo applicableChannel(SystemChannelSourceEnum applicableChannel) {
        this.applicableChannel = applicableChannel;
        return this;
    }

    public void setApplicableChannel(SystemChannelSourceEnum applicableChannel) {
        this.applicableChannel = applicableChannel;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public SystemRoleIdentityInfo agentCode(String agentCode) {
        this.agentCode = agentCode;
        return this;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public String getDescription() {
        return description;
    }

    public SystemRoleIdentityInfo description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isEnableStatus() {
        return enableStatus;
    }

    public SystemRoleIdentityInfo enableStatus(Boolean enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }

    public void setEnableStatus(Boolean enableStatus) {
        this.enableStatus = enableStatus;
    }

    public String getCreatedUserId() {
        return createdUserId;
    }

    public SystemRoleIdentityInfo createdUserId(String createdUserId) {
        this.createdUserId = createdUserId;
        return this;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public ZonedDateTime getCreatedTime() {
        return createdTime;
    }

    public SystemRoleIdentityInfo createdTime(ZonedDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public void setCreatedTime(ZonedDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    public SystemRoleIdentityInfo lastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
        return this;
    }

    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    public ZonedDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public SystemRoleIdentityInfo lastUpdateTime(ZonedDateTime lastUpdateTime) {
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
        SystemRoleIdentityInfo systemRoleIdentityInfo = (SystemRoleIdentityInfo) o;
        if (systemRoleIdentityInfo.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), systemRoleIdentityInfo.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "SystemRoleIdentityInfo{" +
            "id=" + getId() +
            ", code='" + getCode() + "'" +
            ", name='" + getName() + "'" +
            ", icon='" + getIcon() + "'" +
            ", systemRoleIdentityStrategy='" + getSystemRoleIdentityStrategy() + "'" +
            ", upgradeGrowthValue=" + getUpgradeGrowthValue() +
            ", applicableChannel='" + getApplicableChannel() + "'" +
            ", agentCode='" + getAgentCode() + "'" +
            ", description='" + getDescription() + "'" +
            ", enableStatus='" + isEnableStatus() + "'" +
            ", createdUserId='" + getCreatedUserId() + "'" +
            ", createdTime='" + getCreatedTime() + "'" +
            ", lastUpdateUserId='" + getLastUpdateUserId() + "'" +
            ", lastUpdateTime='" + getLastUpdateTime() + "'" +
            "}";
    }
}
