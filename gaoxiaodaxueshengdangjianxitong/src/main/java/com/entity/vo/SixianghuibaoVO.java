package com.entity.vo;

import com.entity.SixianghuibaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 思想汇报
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("sixianghuibao")
public class SixianghuibaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 学生
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 汇报标题
     */

    @TableField(value = "sixianghuibao_name")
    private String sixianghuibaoName;


    /**
     * 汇报照片
     */

    @TableField(value = "sixianghuibao_photo")
    private String sixianghuibaoPhoto;


    /**
     * 汇报类型
     */

    @TableField(value = "sixianghuibao_types")
    private Integer sixianghuibaoTypes;


    /**
     * 热度
     */

    @TableField(value = "sixianghuibao_clicknum")
    private Integer sixianghuibaoClicknum;


    /**
     * 思想汇报内容
     */

    @TableField(value = "sixianghuibao_content")
    private String sixianghuibaoContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "sixianghuibao_delete")
    private Integer sixianghuibaoDelete;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 设置：汇报标题
	 */
    public String getSixianghuibaoName() {
        return sixianghuibaoName;
    }


    /**
	 * 获取：汇报标题
	 */

    public void setSixianghuibaoName(String sixianghuibaoName) {
        this.sixianghuibaoName = sixianghuibaoName;
    }
    /**
	 * 设置：汇报照片
	 */
    public String getSixianghuibaoPhoto() {
        return sixianghuibaoPhoto;
    }


    /**
	 * 获取：汇报照片
	 */

    public void setSixianghuibaoPhoto(String sixianghuibaoPhoto) {
        this.sixianghuibaoPhoto = sixianghuibaoPhoto;
    }
    /**
	 * 设置：汇报类型
	 */
    public Integer getSixianghuibaoTypes() {
        return sixianghuibaoTypes;
    }


    /**
	 * 获取：汇报类型
	 */

    public void setSixianghuibaoTypes(Integer sixianghuibaoTypes) {
        this.sixianghuibaoTypes = sixianghuibaoTypes;
    }
    /**
	 * 设置：热度
	 */
    public Integer getSixianghuibaoClicknum() {
        return sixianghuibaoClicknum;
    }


    /**
	 * 获取：热度
	 */

    public void setSixianghuibaoClicknum(Integer sixianghuibaoClicknum) {
        this.sixianghuibaoClicknum = sixianghuibaoClicknum;
    }
    /**
	 * 设置：思想汇报内容
	 */
    public String getSixianghuibaoContent() {
        return sixianghuibaoContent;
    }


    /**
	 * 获取：思想汇报内容
	 */

    public void setSixianghuibaoContent(String sixianghuibaoContent) {
        this.sixianghuibaoContent = sixianghuibaoContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getSixianghuibaoDelete() {
        return sixianghuibaoDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setSixianghuibaoDelete(Integer sixianghuibaoDelete) {
        this.sixianghuibaoDelete = sixianghuibaoDelete;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
