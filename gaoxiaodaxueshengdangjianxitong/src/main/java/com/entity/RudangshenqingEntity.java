package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 入党申请
 *
 * @author 
 * @email
 */
@TableName("rudangshenqing")
public class RudangshenqingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public RudangshenqingEntity() {

	}

	public RudangshenqingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 学生
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 入党申请标题
     */
    @TableField(value = "rudangshenqing_name")

    private String rudangshenqingName;


    /**
     * 入党申请内容
     */
    @TableField(value = "rudangshenqing_content")

    private String rudangshenqingContent;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 审核状态
     */
    @TableField(value = "rudangshenqing_yesno_types")

    private Integer rudangshenqingYesnoTypes;


    /**
     * 审核意见
     */
    @TableField(value = "rudangshenqing_yesno_text")

    private String rudangshenqingYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "rudangshenqing_shenhe_time")

    private Date rudangshenqingShenheTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：入党申请标题
	 */
    public String getRudangshenqingName() {
        return rudangshenqingName;
    }
    /**
	 * 获取：入党申请标题
	 */

    public void setRudangshenqingName(String rudangshenqingName) {
        this.rudangshenqingName = rudangshenqingName;
    }
    /**
	 * 设置：入党申请内容
	 */
    public String getRudangshenqingContent() {
        return rudangshenqingContent;
    }
    /**
	 * 获取：入党申请内容
	 */

    public void setRudangshenqingContent(String rudangshenqingContent) {
        this.rudangshenqingContent = rudangshenqingContent;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：审核状态
	 */
    public Integer getRudangshenqingYesnoTypes() {
        return rudangshenqingYesnoTypes;
    }
    /**
	 * 获取：审核状态
	 */

    public void setRudangshenqingYesnoTypes(Integer rudangshenqingYesnoTypes) {
        this.rudangshenqingYesnoTypes = rudangshenqingYesnoTypes;
    }
    /**
	 * 设置：审核意见
	 */
    public String getRudangshenqingYesnoText() {
        return rudangshenqingYesnoText;
    }
    /**
	 * 获取：审核意见
	 */

    public void setRudangshenqingYesnoText(String rudangshenqingYesnoText) {
        this.rudangshenqingYesnoText = rudangshenqingYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getRudangshenqingShenheTime() {
        return rudangshenqingShenheTime;
    }
    /**
	 * 获取：审核时间
	 */

    public void setRudangshenqingShenheTime(Date rudangshenqingShenheTime) {
        this.rudangshenqingShenheTime = rudangshenqingShenheTime;
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

    @Override
    public String toString() {
        return "Rudangshenqing{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", rudangshenqingName=" + rudangshenqingName +
            ", rudangshenqingContent=" + rudangshenqingContent +
            ", insertTime=" + insertTime +
            ", rudangshenqingYesnoTypes=" + rudangshenqingYesnoTypes +
            ", rudangshenqingYesnoText=" + rudangshenqingYesnoText +
            ", rudangshenqingShenheTime=" + rudangshenqingShenheTime +
            ", createTime=" + createTime +
        "}";
    }
}
