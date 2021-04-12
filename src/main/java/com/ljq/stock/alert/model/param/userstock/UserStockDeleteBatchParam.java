package com.ljq.stock.alert.model.param.userstock;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * 用户股票批量删除
 *
 * @author junqiang.lu
 * @date 2021-03-22 17:17:06
 */
@Data
@ApiModel(value = "用户股票批量删除", description = "用户股票删除批量")
public class UserStockDeleteBatchParam implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id 列表
     **/
    @NotEmpty(message = "请选择需要删除的对象")
    @ApiModelProperty(value = "id不能为空", name = "idList")
    private List<Long> idList;
    /**
     * 用户 id
     * */
    @NotNull(message = "用户 id 不能为空")
    @Min(value = 1, message = "用户 id 至少为 1")
    @ApiModelProperty(value = "用户 id 不能为空,至少为 1", name = "userId", required = true, example = "0")
    private Long userId;


}
