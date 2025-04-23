package com.entity.model;

import com.entity.SixianghuibaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 思想汇报
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class SixianghuibaoModel implements Serializable {
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
     * 汇报标题
     */
    private String sixianghuibaoName;


    /**
     * 汇报照片
     */
    private String sixianghuibaoPhoto;


    /**
     * 汇报类型
     */
    private Integer sixianghuibaoTypes;


    /**
     * 热度
     */
    private Integer sixianghuibaoClicknum;


    /**
     * 思想汇报内容
     */
    private String sixianghuibaoContent;


    /**
     * 逻辑删除
     */
    private Integer sixianghuibaoDelete;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：汇报标题
	 */
    public String getSixianghuibaoName() {
        return sixianghuibaoName;
    }


    /**
	 * 设置：汇报标题
	 */
    public void setSixianghuibaoName(String sixianghuibaoName) {
        this.sixianghuibaoName = sixianghuibaoName;
    }
    /**
	 * 获取：汇报照片
	 */
    public String getSixianghuibaoPhoto() {
        return sixianghuibaoPhoto;
    }


    /**
	 * 设置：汇报照片
	 */
    public void setSixianghuibaoPhoto(String sixianghuibaoPhoto) {
        this.sixianghuibaoPhoto = sixianghuibaoPhoto;
    }
    /**
	 * 获取：汇报类型
	 */
    public Integer getSixianghuibaoTypes() {
        return sixianghuibaoTypes;
    }


    /**
	 * 设置：汇报类型
	 */
    public void setSixianghuibaoTypes(Integer sixianghuibaoTypes) {
        this.sixianghuibaoTypes = sixianghuibaoTypes;
    }
    /**
	 * 获取：热度
	 */
    public Integer getSixianghuibaoClicknum() {
        return sixianghuibaoClicknum;
    }


    /**
	 * 设置：热度
	 */
    public void setSixianghuibaoClicknum(Integer sixianghuibaoClicknum) {
        this.sixianghuibaoClicknum = sixianghuibaoClicknum;
    }
    /**
	 * 获取：思想汇报内容
	 */
    public String getSixianghuibaoContent() {
        return sixianghuibaoContent;
    }


    /**
	 * 设置：思想汇报内容
	 */
    public void setSixianghuibaoContent(String sixianghuibaoContent) {
        this.sixianghuibaoContent = sixianghuibaoContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getSixianghuibaoDelete() {
        return sixianghuibaoDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setSixianghuibaoDelete(Integer sixianghuibaoDelete) {
        this.sixianghuibaoDelete = sixianghuibaoDelete;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
