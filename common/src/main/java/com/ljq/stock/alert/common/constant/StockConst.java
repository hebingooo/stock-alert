package com.ljq.stock.alert.common.constant;

import java.math.BigDecimal;

/**
 * @Description: 股票相关常量
 * @Author: junqiang.lu
 * @Date: 2021/3/24
 */
public class StockConst {

    private StockConst(){
    }

    /**
     * 证券市场类型
     * 1: 上海证券交易所
     * 2: 深圳证券交易所
     * 3: 香港证券交易所
     * 4: 美国证券市场
     */
    public static final int MARKET_TYPE_SHANGHAI = 1;
    public static final int MARKET_TYPE_SHENZHEN = 2;
    public static final int MARKET_TYPE_HK = 3;
    public static final int MARKET_TYPE_USA = 4;

    /**
     * (A股)默认最大涨跌停限制
     */
    public static final BigDecimal DEFAULT_MAX_INCREASE_PER = BigDecimal.valueOf(9.9);

    /**
     * 默认涨跌幅限制值
     */
    public static final int DEFAULT_INCREASE_PER_VALUE = -1;

    /**
     * 所有股票源数据缓存 key
     */
    public static final String CACHE_KEY_STOCK_SOURCE_ALL = "STOCK_SOURCE_ALL";

    /**
     * 股票数据接口
     * sina: 新浪
     * tencent: 腾讯
     * netease: 网易
     */
    public static final String STOCK_API_SINA = "sina";
    public static final String STOCK_API_TENCENT = "tencent";
    public static final String STOCK_API_NETEASE = "netease";


}
