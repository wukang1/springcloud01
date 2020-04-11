package com.kk.eurekaprovider.util;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.FieldNameConstants;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by QiYuXiang
 */

@Data
@MappedSuperclass
@FieldNameConstants(prefix = "")
public class BaseEntity implements Serializable {

    @Id
    @Column(name = "id")
    protected String id;

    @Column(name = "create_date")
    @ApiModelProperty("创建时间")
    protected Date createDate;// 创建日期

    @Column(name = "modify_date")
    @ApiModelProperty("修改时间")
    protected Date modifyDate;// 修改日期

    @Column(name = "data_status")
    @ApiModelProperty("数据状态 0=正常，1=删除")
    protected Integer dataStatus;
    public BaseEntity() {

        this.id = (int)(Math.random() * 50000000) + 50000000 + "" + System.currentTimeMillis();
        this.createDate = new Date();
        this.modifyDate = new Date();
        this.dataStatus=0;
    }

}
