package ws.api.commons.exception;

public class BasicRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BasicRuntimeException() {
		super();

	}

	public BasicRuntimeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public BasicRuntimeException(String message, Throwable cause) {
		super(message, cause);

	}

	public BasicRuntimeException(String message) {
		super(message);

	}

	public BasicRuntimeException(Throwable cause) {
		super(cause);

	}

}
