/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdk.coolq.api;

/**
 *
 * @author zyp
 */
public class CoolQAPIFailException extends Exception {

    public CoolQAPIFailException(String message) {
        super(message);
    }

    public CoolQAPIFailException(Throwable e) {
        super(e);
    }
}