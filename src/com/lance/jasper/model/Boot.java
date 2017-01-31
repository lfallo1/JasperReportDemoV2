package com.lance.jasper.model;

import com.lance.jasper.enums.HeelStyle;
import com.lance.jasper.enums.Length;

public class Boot extends SuitAccessory {

	private HeelStyle heelStyle;
	private Length height;

	public HeelStyle getHeelStyle() {
		return heelStyle;
	}

	public void setHeelStyle(HeelStyle heelStyle) {
		this.heelStyle = heelStyle;
	}

	public Length getHeight() {
		return height;
	}

	public void setHeight(Length height) {
		this.height = height;
	}

}
