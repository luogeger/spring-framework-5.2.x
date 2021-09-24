package com.first.tag;

import lombok.Data;


public class Apple {

	/**
	 * 颜色
	 */
	private String color;

	/**
	 * 原产地
	 */
	private String source;


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public String
	toString() {
		return "Apple{" +
				"color='" + color + '\'' +
				", source='" + source + '\'' +
				'}';
	}
}
