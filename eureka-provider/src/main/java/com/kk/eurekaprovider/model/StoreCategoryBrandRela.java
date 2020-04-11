package com.kk.eurekaprovider.model;

import com.kk.eurekaprovider.util.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.FieldNameConstants;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * Created with IntelliJ IDEA.
 * author: wk
 * Date: 2020/4/10
 * Time: 17:00
 */
@Data
@Entity
@Table(name = "cb_store_category_brand_rela")
@ApiModel(description = "商家类别品牌关联 商家经营范围")
@FieldNameConstants(prefix = "")
public class StoreCategoryBrandRela extends BaseEntity {

    @Column(name = "store_id")
    @ApiModelProperty("商家id")
    private String storeId;

    @Column(name = "category_id")
    @ApiModelProperty("类别id")
    private String categoryId;

    @Column(name = "brand_id")
    @ApiModelProperty("品牌id")
    private String brandId;

    @Column(name = "check_status")
    @ApiModelProperty("审核状态 1正常/2审核中/3审核失败")
    private Integer checkStatus;

    @Column(name = "`reason_msg")
    @ApiModelProperty("审核失败原因")
    private String reasonMsg;
}