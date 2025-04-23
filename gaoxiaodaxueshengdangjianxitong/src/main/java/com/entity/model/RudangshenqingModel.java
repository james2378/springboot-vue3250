package com.entity.model;

import com.entity.RudangshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 入党申请
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class RudangshenqingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生
     */
    private Integer yonghuId;


    /**
     * 入党申请标题
     */
    private String rudangshenqingName;


    /**
     * 入党申请内容
     */
    private String rudangshenqingContent;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 审核状态
     */
    private Integer rudangshenqingYesnoTypes;


    /**
     * 审核意见
     */
    private String rudangshenqingYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date rudangshenqingShenheTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：学生
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：入党申请标题
	 */
    public String getRudangshenqingName() {
        return rudangshenqingName;
    }


    /**
	 * 设置：入党申请标题
	 */
    public void setRudangshenqingName(String rudangshenqingName) {
        this.rudangshenqingName = rudangshenqingName;
    }
    /**
	 * 获取：入党申请内容
	 */
    public String getRudangshenqingContent() {
        return rudangshenqingContent;
    }


    /**
	 * 设置：入党申请内容
	 */
    public void setRudangshenqingContent(String rudangshenqingContent) {
        this.rudangshenqingContent = rudangshenqingContent;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：申请时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：审核状态
	 */
    public Integer getRudangshenqingYesnoTypes() {
        return rudangshenqingYesnoTypes;
    }


    /**
	 * 设置：审核状态
	 */
    public void setRudangshenqingYesnoTypes(Integer rudangshenqingYesnoTypes) {
        this.rudangshenqingYesnoTypes = rudangshenqingYesnoTypes;
    }
    /**
	 * 获取：审核意见
	 */
    public String getRudangshenqingYesnoText() {
        return rudangshenqingYesnoText;
    }


    /**
	 * 设置：审核意见
	 */
    public void setRudangshenqingYesnoText(String rudangshenqingYesnoText) {
        this.rudangshenqingYesnoText = rudangshenqingYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getRudangshenqingShenheTime() {
        return rudangshenqingShenheTime;
    }


    /**
	 * 设置：审核时间
	 */
    public void setRudangshenqingShenheTime(Date rudangshenqingShenheTime) {
        this.rudangshenqingShenheTime = rudangshenqingShenheTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
