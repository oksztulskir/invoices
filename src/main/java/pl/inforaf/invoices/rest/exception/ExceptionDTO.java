package pl.inforaf.invoices.rest.exception;

/**
 */
public class ExceptionDTO {
    private String message;
    private String code;
    private String path;
    private String stackTrace;

    public ExceptionDTO(String message, String code, String path) {
        this.message = message;
        this.code = code;
        this.path = path;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }
}
