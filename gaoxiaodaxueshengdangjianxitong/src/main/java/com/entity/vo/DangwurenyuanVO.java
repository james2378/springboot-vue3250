package com.entity.vo;

import com.entity.DangwurenyuanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 党务人员
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("dangwurenyuan")
public class DangwurenyuanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 党务人员姓名
     */

    @TableField(value = "dangwurenyuan_name")
    private String dangwurenyuanName;


    /**
     * 党务人员手机号
     */

    @TableField(value = "dangwurenyuan_phone")
    private String dangwurenyuanPhone;


    /**
     * 党务人员头像
     */

    @TableField(value = "dangwurenyuan_photo")
    private String dangwurenyuanPhoto;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 电子邮箱
     */

    @TableField(value = "dangwurenyuan_email")
    private String dangwurenyuanEmail;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：党务人员姓名
	 */
    public String getDangwurenyuanName() {
        return dangwurenyuanName;
    }


    /**
	 * 获取：党务人员姓名
	 */

    public void setDangwurenyuanName(String dangwurenyuanName) {
        this.dangwurenyuanName = dangwurenyuanName;
    }
    /**
	 * 设置：党务人员手机号
	 */
    public String getDangwurenyuanPhone() {
        return dangwurenyuanPhone;
    }


    /**
	 * 获取：党务人员手机号
	 */

    public void setDangwurenyuanPhone(String dangwurenyuanPhone) {
        this.dangwurenyuanPhone = dangwurenyuanPhone;
    }
    /**
	 * 设置：党务人员头像
	 */
    public String getDangwurenyuanPhoto() {
        return dangwurenyuanPhoto;
    }


    /**
	 * 获取：党务人员头像
	 */

    public void setDangwurenyuanPhoto(String dangwurenyuanPhoto) {
        this.dangwurenyuanPhoto = dangwurenyuanPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：电子邮箱
	 */
    public String getDangwurenyuanEmail() {
        return dangwurenyuanEmail;
    }


    /**
	 * 获取：电子邮箱
	 */

    public void setDangwurenyuanEmail(String dangwurenyuanEmail) {
        this.dangwurenyuanEmail = dangwurenyuanEmail;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
