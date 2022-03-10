package dmacc.controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Phone;
@Configuration
public class BeanConfiguration {
	@Bean
	public Phone phone() {
		Phone bean = new Phone("Samsung Galaxy S22");
		bean.setNumberOfCameras(5);
		bean.setProcesser("Snapdragon 8 Gen 1");
		bean.setResolution("1080 x 2340");
		return bean;
	}
}
