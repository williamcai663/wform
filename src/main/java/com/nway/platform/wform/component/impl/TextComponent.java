package com.nway.platform.wform.component.impl;

import org.springframework.stereotype.Component;

import com.nway.platform.wform.component.BaseComponent;

@Component("text")
public class TextComponent implements BaseComponent {

	@Override
	public Object getValue(Object value) {
		
		return value;
	}

}
