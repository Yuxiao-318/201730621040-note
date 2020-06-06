package cn.jsbintask.memo.exception;



//自定义异常，便于统一处理
public class MemoException extends RuntimeException {
    public MemoException(Throwable t) {
        super(t);
    }

    public MemoException(){}
}
