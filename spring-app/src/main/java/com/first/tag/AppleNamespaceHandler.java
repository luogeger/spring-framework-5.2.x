package com.first.tag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class AppleNamespaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("apple", new AppleBeanDefinitionParser());
	}
}
