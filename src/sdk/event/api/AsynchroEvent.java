/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdk.event.api;

import sdk.coolq.api.IEvent;
import sdk.event.CoolQEvent;

/**
 *
 * @author zyp
 * @param <H>
 */
public abstract class AsynchroEvent<H extends IEvent> extends CoolQEvent<H> {

    public AsynchroEvent(H handle) {
        super(handle,true);
    }
}
