package io.ctws.layer_app.services;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@ToString
public class MyService {

	private int index;
	private String message;

	public MyService(int index, String message) {
		this.index = index;
		this.message = message;
	}

}
