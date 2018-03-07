/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdk.coolq.request;

import sdk.coolq.api.GroupRequest;
import sdk.coolq.request.reply.NewGroupMemberReply;
import sdk.event.syncro.NewGroupMemberApplyEvent;

/**
 * 加群请求
 *
 * @author zyp
 */
public class NewGroupMemberApply extends GroupRequest<NewGroupMemberApplyEvent, NewGroupMemberReply> {
    @Override
    public Class<NewGroupMemberApplyEvent> getEventClass() {
        return NewGroupMemberApplyEvent.class;
    }
}
