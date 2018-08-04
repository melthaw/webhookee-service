package io.picos.webhookee.outgoing.worktile;


//{"code": 200, "message": "invalid parameters"}

/**
 * @auther dz
 */
public class WorkTileResponse {

    private String code;

    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
