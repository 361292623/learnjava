package com.itheima._09自定义异常;
// 自定义编译时异常：AgeXiaChuanException
// 必须继承Exception
public class AgeXiaChuanException extends Exception{
    public AgeXiaChuanException() {
    }

    public AgeXiaChuanException(String message) {
        super(message);
    }

    public AgeXiaChuanException(String message, Throwable cause) {
        super(message, cause);
    }

    public AgeXiaChuanException(Throwable cause) {
        super(cause);
    }

    public AgeXiaChuanException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
