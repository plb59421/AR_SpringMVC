package com.plb.luyi.controller;

import com.google.protobuf.ServiceException;
import com.plb.luyi.service.ex.*;
import com.plb.luyi.util.JsonResult;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.springframework.web.bind.annotation.ExceptionHandler;


/** 控制器类的基类 */
public class BaseController {
    /** 操作成功的状态码 */
    public static final int OK = 666;


    /** @ExceptionHandler用于统一处理方法抛出的异常 */
    @ExceptionHandler({ServiceException.class, FileUploadException.class})
    public JsonResult<Void> handleException(Throwable e) {
        JsonResult<Void> result = new JsonResult<Void>(e);
            if (e instanceof InsertException) {
                result.setState(500);
                result.setMessage(e.getMessage());
            }else if (e instanceof PasswordException) {
                result.setState(404);
                result.setMessage(e.getMessage());
            }else if(e instanceof DeleteException){
                result.setState(602);
                result.setMessage(e.getMessage());
            }else if (e instanceof SelectException) {
                result.setState(400);
                result.setMessage(e.getMessage());
            } else if (e instanceof UpdateException) {
                result.setState(300);
                result.setMessage(e.getMessage());
            }
        return result;
    }
}


