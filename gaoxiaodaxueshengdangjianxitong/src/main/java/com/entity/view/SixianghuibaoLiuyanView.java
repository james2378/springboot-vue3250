package com.entity.view;

import com.entity.SixianghuibaoLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 思想汇报留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("sixianghuibao_liuyan")
public class SixianghuibaoLiuyanView extends SixianghuibaoLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 sixianghuibao
			/**
			* 思想汇报 的 学生
			*/
			private Integer sixianghuibaoYonghuId;
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
				* 汇报类型的值
				*/
				private String sixianghuibaoValue;
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

		//级联表 yonghu
			/**
			* 学生姓名
			*/
			private String yonghuName;
			/**
			* 学生手机号
			*/
			private String yonghuPhone;
			/**
			* 学生身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 学生头像
			*/
			private String yonghuPhoto;
			/**
			* 学生状态
			*/
			private Integer yonghuTypes;
				/**
				* 学生状态的值
				*/
				private String yonghuValue;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public SixianghuibaoLiuyanView() {

	}

	public SixianghuibaoLiuyanView(SixianghuibaoLiuyanEntity sixianghuibaoLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, sixianghuibaoLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


































				//级联表的get和set sixianghuibao

					/**
					* 获取：思想汇报 的 学生
					*/
					public Integer getSixianghuibaoYonghuId() {
						return sixianghuibaoYonghuId;
					}
					/**
					* 设置：思想汇报 的 学生
					*/
					public void setSixianghuibaoYonghuId(Integer sixianghuibaoYonghuId) {
						this.sixianghuibaoYonghuId = sixianghuibaoYonghuId;
					}


					/**
					* 获取： 汇报标题
					*/
					public String getSixianghuibaoName() {
						return sixianghuibaoName;
					}
					/**
					* 设置： 汇报标题
					*/
					public void setSixianghuibaoName(String sixianghuibaoName) {
						this.sixianghuibaoName = sixianghuibaoName;
					}

					/**
					* 获取： 汇报照片
					*/
					public String getSixianghuibaoPhoto() {
						return sixianghuibaoPhoto;
					}
					/**
					* 设置： 汇报照片
					*/
					public void setSixianghuibaoPhoto(String sixianghuibaoPhoto) {
						this.sixianghuibaoPhoto = sixianghuibaoPhoto;
					}

					/**
					* 获取： 汇报类型
					*/
					public Integer getSixianghuibaoTypes() {
						return sixianghuibaoTypes;
					}
					/**
					* 设置： 汇报类型
					*/
					public void setSixianghuibaoTypes(Integer sixianghuibaoTypes) {
						this.sixianghuibaoTypes = sixianghuibaoTypes;
					}


						/**
						* 获取： 汇报类型的值
						*/
						public String getSixianghuibaoValue() {
							return sixianghuibaoValue;
						}
						/**
						* 设置： 汇报类型的值
						*/
						public void setSixianghuibaoValue(String sixianghuibaoValue) {
							this.sixianghuibaoValue = sixianghuibaoValue;
						}

					/**
					* 获取： 热度
					*/
					public Integer getSixianghuibaoClicknum() {
						return sixianghuibaoClicknum;
					}
					/**
					* 设置： 热度
					*/
					public void setSixianghuibaoClicknum(Integer sixianghuibaoClicknum) {
						this.sixianghuibaoClicknum = sixianghuibaoClicknum;
					}

					/**
					* 获取： 思想汇报内容
					*/
					public String getSixianghuibaoContent() {
						return sixianghuibaoContent;
					}
					/**
					* 设置： 思想汇报内容
					*/
					public void setSixianghuibaoContent(String sixianghuibaoContent) {
						this.sixianghuibaoContent = sixianghuibaoContent;
					}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getSixianghuibaoDelete() {
						return sixianghuibaoDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setSixianghuibaoDelete(Integer sixianghuibaoDelete) {
						this.sixianghuibaoDelete = sixianghuibaoDelete;
					}







				//级联表的get和set yonghu

					/**
					* 获取： 学生姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 学生手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 学生手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 学生身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 学生身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 学生头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 学生头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 学生状态
					*/
					public Integer getYonghuTypes() {
						return yonghuTypes;
					}
					/**
					* 设置： 学生状态
					*/
					public void setYonghuTypes(Integer yonghuTypes) {
						this.yonghuTypes = yonghuTypes;
					}


						/**
						* 获取： 学生状态的值
						*/
						public String getYonghuValue() {
							return yonghuValue;
						}
						/**
						* 设置： 学生状态的值
						*/
						public void setYonghuValue(String yonghuValue) {
							this.yonghuValue = yonghuValue;
						}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}






}
