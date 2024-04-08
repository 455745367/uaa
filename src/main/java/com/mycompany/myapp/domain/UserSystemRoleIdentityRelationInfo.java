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

/**
 * 用户系统角色身份关系信息
 */
@ApiModel(description = "用户系统角色身份关系信息")
@Entity
@Table(name = "user_system_role_identity_relation_info")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "usersystemroleidentityrelationinfo")
public class UserSystemRoleIdentityRelationInfo implements Serializable {

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
     * 当前角色
     */
    @Size(max = 64)
    @ApiModelProperty(value = "当前角色")
    @Column(name = "system_role_identity_code", length = 64)
    private String systemRoleIdentityCode;

    /**
     * 当前使用角色
     */
    @ApiModelProperty(value = "当前使用角色")
    @Column(name = "current_use_role")
    private Boolean currentUseRole;

    /**
     * 身份激活状态
     */
    @ApiModelProperty(value = "身份激活状态")
    @Column(name = "activated")
    private Boolean activated;

    /**
     * 升级成长值
     */
    @ApiModelProperty(value = "升级成长值")
    @Column(name = "upgrade_growth_value", precision = 10, scale = 2)
    private BigDecimal upgradeGrowthValue;

    /**
     * 身份扩展信息
     */
    @Size(max = 256)
    @ApiModelProperty(value = "身份扩展信息")
    @Column(name = "extend", length = 256)
    private String extend;

    /**
     * 冗余用户推荐人
     */
    @NotNull
    @Size(max = 100)
    @ApiModelProperty(value = "冗余用户推荐人", required = true)
    @Column(name = "recommend_user", length = 100, nullable = false)
    private String recommendUser;

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

    public UserSystemRoleIdentityRelationInfo loginIdentity(String loginIdentity) {
        this.loginIdentity = loginIdentity;
        return this;
    }

    public void setLoginIdentity(String loginIdentity) {
        this.loginIdentity = loginIdentity;
    }

    public String getSystemRoleIdentityCode() {
        return systemRoleIdentityCode;
    }

    public UserSystemRoleIdentityRelationInfo systemRoleIdentityCode(String systemRoleIdentityCode) {
        this.systemRoleIdentityCode = systemRoleIdentityCode;
        return this;
    }

    public void setSystemRoleIdentityCode(String systemRoleIdentityCode) {
        this.systemRoleIdentityCode = systemRoleIdentityCode;
    }

    public Boolean isCurrentUseRole() {
        return currentUseRole;
    }

    public UserSystemRoleIdentityRelationInfo currentUseRole(Boolean currentUseRole) {
        this.currentUseRole = currentUseRole;
        return this;
    }

    public void setCurrentUseRole(Boolean currentUseRole) {
        this.currentUseRole = currentUseRole;
    }

    public Boolean isActivated() {
        return activated;
    }

    public UserSystemRoleIdentityRelationInfo activated(Boolean activated) {
        this.activated = activated;
        return this;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public BigDecimal getUpgradeGrowthValue() {
        return upgradeGrowthValue;
    }

    public UserSystemRoleIdentityRelationInfo upgradeGrowthValue(BigDecimal upgradeGrowthValue) {
        this.upgradeGrowthValue = upgradeGrowthValue;
        return this;
    }

    public void setUpgradeGrowthValue(BigDecimal upgradeGrowthValue) {
        this.upgradeGrowthValue = upgradeGrowthValue;
    }

    public String getExtend() {
        return extend;
    }

    public UserSystemRoleIdentityRelationInfo extend(String extend) {
        this.extend = extend;
        return this;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public String getRecommendUser() {
        return recommendUser;
    }

    public UserSystemRoleIdentityRelationInfo recommendUser(String recommendUser) {
        this.recommendUser = recommendUser;
        return this;
    }

    public void setRecommendUser(String recommendUser) {
        this.recommendUser = recommendUser;
    }

    public String getDescription() {
        return description;
    }

    public UserSystemRoleIdentityRelationInfo description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isEnableStatus() {
        return enableStatus;
    }

    public UserSystemRoleIdentityRelationInfo enableStatus(Boolean enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }

    public void setEnableStatus(Boolean enableStatus) {
        this.enableStatus = enableStatus;
    }

    public String getCreatedUserId() {
        return createdUserId;
    }

    public UserSystemRoleIdentityRelationInfo createdUserId(String createdUserId) {
        this.createdUserId = createdUserId;
        return this;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public ZonedDateTime getCreatedTime() {
        return createdTime;
    }

    public UserSystemRoleIdentityRelationInfo createdTime(ZonedDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public void setCreatedTime(ZonedDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    public UserSystemRoleIdentityRelationInfo lastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
        return this;
    }

    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    public ZonedDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public UserSystemRoleIdentityRelationInfo lastUpdateTime(ZonedDateTime lastUpdateTime) {
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
        UserSystemRoleIdentityRelationInfo userSystemRoleIdentityRelationInfo = (UserSystemRoleIdentityRelationInfo) o;
        if (userSystemRoleIdentityRelationInfo.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), userSystemRoleIdentityRelationInfo.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "UserSystemRoleIdentityRelationInfo{" +
            "id=" + getId() +
            ", loginIdentity='" + getLoginIdentity() + "'" +
            ", systemRoleIdentityCode='" + getSystemRoleIdentityCode() + "'" +
            ", currentUseRole='" + isCurrentUseRole() + "'" +
            ", activated='" + isActivated() + "'" +
            ", upgradeGrowthValue=" + getUpgradeGrowthValue() +
            ", extend='" + getExtend() + "'" +
            ", recommendUser='" + getRecommendUser() + "'" +
            ", description='" + getDescription() + "'" +
            ", enableStatus='" + isEnableStatus() + "'" +
            ", createdUserId='" + getCreatedUserId() + "'" +
            ", createdTime='" + getCreatedTime() + "'" +
            ", lastUpdateUserId='" + getLastUpdateUserId() + "'" +
            ", lastUpdateTime='" + getLastUpdateTime() + "'" +
            "}";
    }
}
