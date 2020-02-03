package com.xiaoman.keep_system.result;

public class CodeMsg {
    private int code;
    private String msg;

    //通用模块错误码
    public static CodeMsg SERVER_ERROR = new CodeMsg(500100, "服务端异常");
    public static CodeMsg BIND_ERROR = new CodeMsg(500101, "参数校验异常：%s");

    //用户模块错误码1
    public static CodeMsg USER_NULL = new CodeMsg(1101, "用户名不存在");
    public static CodeMsg PASSWORD_ERROR = new CodeMsg(1102, "密码错误");
    public static CodeMsg USER_EXIST = new CodeMsg(1103, "用户名已存在");
    public static CodeMsg ADDRESS_NULL = new CodeMsg(1104, "尚未添加地址");
    public static CodeMsg NOT_LOGIN = new CodeMsg(1105, "未登录，请先进行登录");
    public static CodeMsg CODE_ERROR = new CodeMsg(1106, "验证码错误");
    public static CodeMsg NOT_CONFIRM = new CodeMsg(1107, "该用户还未通过验证");

    //分享模块错误码2
    public static CodeMsg NO_COMMENT = new CodeMsg(2101, "目前还没有评论");

    //我的模块错误码3
    public static CodeMsg COACH_EXIST = new CodeMsg(3101, "您已选择教练，若需更换教练可与管理员沟通。");
    public static CodeMsg INFO_NULL = new CodeMsg(3102, "您未完善个人信息。");


    private CodeMsg() {
    }

    private CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    //可以返回带参数的校验码
    public CodeMsg fillArgs(Object... args) {
        int code = this.code;
        String message = String.format(this.msg, args);
        return new CodeMsg(code, message);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "CodeMsg{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
