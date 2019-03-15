package cn.stylefeng.qins.config.datasource;

import cn.stylefeng.roses.core.datascope.DataScopeInterceptor;
import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 数据源配置
 *
 * @author wangan on 2019/3/15
 * @description
 */
@Configuration
@ConditionalOnProperty(prefix = "guns.muti-datasource",name = "open",havingValue = "false",matchIfMissing = true)
public class SingleDataSourceConfig {

	/**
	 * 数据范围mybatis插件
	 */
	@Bean
	public DataScopeInterceptor dataScopeInterceptor() {
		return new DataScopeInterceptor();
	}

	/**
	 * 乐观锁mybatis插件
	 */
	@Bean
	public OptimisticLockerInterceptor optimisticLockerInterceptor() {
		return new OptimisticLockerInterceptor();
	}

}
