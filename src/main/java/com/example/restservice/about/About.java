package com.example.restservice.about;

public class About {

	private final int status;
	private final Boolean success;
	private final String content;

	public Greeting(int status, String content,Boolean success) {
		this.status = status;
		this.success = success;
		this.content = content;
	}

	public int getStatus() {
		return status;
	}
	public Boolean getSuccess() {
		return success;
	}

	public String getContent() {
		return content;
	}
}
