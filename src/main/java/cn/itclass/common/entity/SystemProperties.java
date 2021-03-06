package cn.itclass.common.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 系统配置文件
 */
@Component
@ConfigurationProperties(prefix = "df.goods")
@PropertySource(value = "system.properties")
public class SystemProperties {
    private Integer pageSize;

    private Integer addressMaxNum;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getAddressMaxNum() {
        return addressMaxNum;
    }

    public void setAddressMaxNum(Integer addressMaxNum) {
        this.addressMaxNum = addressMaxNum;
    }
}
