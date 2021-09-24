package com.first.tag;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class AppleBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {


	/**
	 * 返回属性值所对应的对象
	 *
	 * @param element 正在解析的Element
	 * @return 通过解析提供的Element定义的 bean 的Class ，如果没有则为null
	 */
	@Override
	protected Class<?> getBeanClass(Element element) {
		return Apple.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		// 获取标签具体的属性值
		String color = element.getAttribute("color");
		String source = element.getAttribute("source");

		if (StringUtils.hasText(color)) {
			builder.addPropertyValue("color", color);
		}
		if (StringUtils.hasText(source)) {
			builder.addPropertyValue("source", source);
		}

	}

	@Override
	protected boolean shouldGenerateId() {
		return true;
	}
}
