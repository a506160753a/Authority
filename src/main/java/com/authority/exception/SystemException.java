package com.authority.exception;

/**
 * 系统业务异常 throw new SystemException("XXXX")
 */
public class SystemException extends RuntimeException {
	private static final long serialVersionUID = 638468634036110252L;

	private String code;

	public SystemException() {
		super();
	}

	public SystemException(String message) {
		super(message);
	}

	public SystemException(String code, String message) {
		super(message);
		this.code = code;
	}

	public SystemException(Throwable cause) {
		super(cause);
	}

	public SystemException(String message, Throwable cause) {
		super(message, cause);
	}

	public SystemException(String code, String message, Throwable cause) {
		super(message, cause);
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
