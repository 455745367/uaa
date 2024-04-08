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
 * 用户通讯录信息
 */
@ApiModel(description = "用户通讯录信息")
@Entity
@Table(name = "user_address_book_info")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "useraddressbookinfo")
public class UserAddressBookInfo implements Serializable {

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
     * 照片
     */
    @NotNull
    @Size(max = 128)
    @ApiModelProperty(value = "照片", required = true)
    @Column(name = "photo", length = 128, nullable = false)
    private String photo;

    /**
     * 姓氏
     */
    @NotNull
    @Size(max = 32)
    @ApiModelProperty(value = "姓氏", required = true)
    @Column(name = "first_name", length = 32, nullable = false)
    private String firstName;

    /**
     * 名字
     */
    @NotNull
    @Size(max = 32)
    @ApiModelProperty(value = "名字", required = true)
    @Column(name = "last_name", length = 32, nullable = false)
    private String lastName;

    /**
     * 公司
     */
    @NotNull
    @Size(max = 32)
    @ApiModelProperty(value = "公司", required = true)
    @Column(name = "commpany", length = 32, nullable = false)
    private String commpany;

    /**
     * 电话集合
     */
    @NotNull
    @Size(max = 512)
    @ApiModelProperty(value = "电话集合", required = true)
    @Column(name = "phones", length = 512, nullable = false)
    private String phones;

    /**
     * 电子邮件集合
     */
    @NotNull
    @Size(max = 512)
    @ApiModelProperty(value = "电子邮件集合", required = true)
    @Column(name = "emails", length = 512, nullable = false)
    private String emails;

    /**
     * 地址集合
     */
    @NotNull
    @Size(max = 128)
    @ApiModelProperty(value = "地址集合", required = true)
    @Column(name = "addresss", length = 128, nullable = false)
    private String addresss;

    /**
     * 生日
     */
    @NotNull
    @Size(max = 128)
    @ApiModelProperty(value = "生日", required = true)
    @Column(name = "birthday", length = 128, nullable = false)
    private String birthday;

    /**
     * 日期集合
     */
    @NotNull
    @Size(max = 512)
    @ApiModelProperty(value = "日期集合", required = true)
    @Column(name = "dates", length = 512, nullable = false)
    private String dates;

    /**
     * 地址集合
     */
    @NotNull
    @Size(max = 512)
    @ApiModelProperty(value = "地址集合", required = true)
    @Column(name = "address", length = 512, nullable = false)
    private String address;

    /**
     * 关联人集合
     */
    @NotNull
    @Size(max = 512)
    @ApiModelProperty(value = "关联人集合", required = true)
    @Column(name = "related_names", length = 512, nullable = false)
    private String relatedNames;

    /**
     * 个人社交资料集合
     */
    @NotNull
    @Size(max = 512)
    @ApiModelProperty(value = "个人社交资料集合", required = true)
    @Column(name = "social_profiles", length = 512, nullable = false)
    private String socialProfiles;

    /**
     * 即时信息集合
     */
    @NotNull
    @Size(max = 512)
    @ApiModelProperty(value = "即时信息集合", required = true)
    @Column(name = "instant_messages", length = 512, nullable = false)
    private String instantMessages;

    /**
     * 备注
     */
    @NotNull
    @Size(max = 128)
    @ApiModelProperty(value = "备注", required = true)
    @Column(name = "notes", length = 128, nullable = false)
    private String notes;

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

    public UserAddressBookInfo loginIdentity(String loginIdentity) {
        this.loginIdentity = loginIdentity;
        return this;
    }

    public void setLoginIdentity(String loginIdentity) {
        this.loginIdentity = loginIdentity;
    }

    public String getPhoto() {
        return photo;
    }

    public UserAddressBookInfo photo(String photo) {
        this.photo = photo;
        return this;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserAddressBookInfo firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public UserAddressBookInfo lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCommpany() {
        return commpany;
    }

    public UserAddressBookInfo commpany(String commpany) {
        this.commpany = commpany;
        return this;
    }

    public void setCommpany(String commpany) {
        this.commpany = commpany;
    }

    public String getPhones() {
        return phones;
    }

    public UserAddressBookInfo phones(String phones) {
        this.phones = phones;
        return this;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    public String getEmails() {
        return emails;
    }

    public UserAddressBookInfo emails(String emails) {
        this.emails = emails;
        return this;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public String getAddresss() {
        return addresss;
    }

    public UserAddressBookInfo addresss(String addresss) {
        this.addresss = addresss;
        return this;
    }

    public void setAddresss(String addresss) {
        this.addresss = addresss;
    }

    public String getBirthday() {
        return birthday;
    }

    public UserAddressBookInfo birthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDates() {
        return dates;
    }

    public UserAddressBookInfo dates(String dates) {
        this.dates = dates;
        return this;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public String getAddress() {
        return address;
    }

    public UserAddressBookInfo address(String address) {
        this.address = address;
        return this;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRelatedNames() {
        return relatedNames;
    }

    public UserAddressBookInfo relatedNames(String relatedNames) {
        this.relatedNames = relatedNames;
        return this;
    }

    public void setRelatedNames(String relatedNames) {
        this.relatedNames = relatedNames;
    }

    public String getSocialProfiles() {
        return socialProfiles;
    }

    public UserAddressBookInfo socialProfiles(String socialProfiles) {
        this.socialProfiles = socialProfiles;
        return this;
    }

    public void setSocialProfiles(String socialProfiles) {
        this.socialProfiles = socialProfiles;
    }

    public String getInstantMessages() {
        return instantMessages;
    }

    public UserAddressBookInfo instantMessages(String instantMessages) {
        this.instantMessages = instantMessages;
        return this;
    }

    public void setInstantMessages(String instantMessages) {
        this.instantMessages = instantMessages;
    }

    public String getNotes() {
        return notes;
    }

    public UserAddressBookInfo notes(String notes) {
        this.notes = notes;
        return this;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getLongitude() {
        return longitude;
    }

    public UserAddressBookInfo longitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public UserAddressBookInfo latitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getVerifyingCiphertext() {
        return verifyingCiphertext;
    }

    public UserAddressBookInfo verifyingCiphertext(String verifyingCiphertext) {
        this.verifyingCiphertext = verifyingCiphertext;
        return this;
    }

    public void setVerifyingCiphertext(String verifyingCiphertext) {
        this.verifyingCiphertext = verifyingCiphertext;
    }

    public String getVerifyingSign() {
        return verifyingSign;
    }

    public UserAddressBookInfo verifyingSign(String verifyingSign) {
        this.verifyingSign = verifyingSign;
        return this;
    }

    public void setVerifyingSign(String verifyingSign) {
        this.verifyingSign = verifyingSign;
    }

    public String getGatherTerminal() {
        return gatherTerminal;
    }

    public UserAddressBookInfo gatherTerminal(String gatherTerminal) {
        this.gatherTerminal = gatherTerminal;
        return this;
    }

    public void setGatherTerminal(String gatherTerminal) {
        this.gatherTerminal = gatherTerminal;
    }

    public String getDescription() {
        return description;
    }

    public UserAddressBookInfo description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isEnableStatus() {
        return enableStatus;
    }

    public UserAddressBookInfo enableStatus(Boolean enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }

    public void setEnableStatus(Boolean enableStatus) {
        this.enableStatus = enableStatus;
    }

    public String getCreatedUserId() {
        return createdUserId;
    }

    public UserAddressBookInfo createdUserId(String createdUserId) {
        this.createdUserId = createdUserId;
        return this;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public ZonedDateTime getCreatedTime() {
        return createdTime;
    }

    public UserAddressBookInfo createdTime(ZonedDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public void setCreatedTime(ZonedDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    public UserAddressBookInfo lastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
        return this;
    }

    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    public ZonedDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public UserAddressBookInfo lastUpdateTime(ZonedDateTime lastUpdateTime) {
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
        UserAddressBookInfo userAddressBookInfo = (UserAddressBookInfo) o;
        if (userAddressBookInfo.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), userAddressBookInfo.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "UserAddressBookInfo{" +
            "id=" + getId() +
            ", loginIdentity='" + getLoginIdentity() + "'" +
            ", photo='" + getPhoto() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", commpany='" + getCommpany() + "'" +
            ", phones='" + getPhones() + "'" +
            ", emails='" + getEmails() + "'" +
            ", addresss='" + getAddresss() + "'" +
            ", birthday='" + getBirthday() + "'" +
            ", dates='" + getDates() + "'" +
            ", address='" + getAddress() + "'" +
            ", relatedNames='" + getRelatedNames() + "'" +
            ", socialProfiles='" + getSocialProfiles() + "'" +
            ", instantMessages='" + getInstantMessages() + "'" +
            ", notes='" + getNotes() + "'" +
            ", longitude='" + getLongitude() + "'" +
            ", latitude='" + getLatitude() + "'" +
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
