package com.itheima._09自定义异常;
// 自定义运行时时异常：AgeXiaChuanException
// 必须继承RuntimeException
public class AgeXiaChuanRuntimeException extends RuntimeException{
    public AgeXiaChuanRuntimeException() {
    }

    public AgeXiaChuanRuntimeException(String message) {
        super(message);
    }

    public AgeXiaChuanRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public AgeXiaChuanRuntimeException(Throwable cause) {
        super(cause);
    }

    public AgeXiaChuanRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
