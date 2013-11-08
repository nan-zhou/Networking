/**
 * Copyright (c) 2012, 2013, Huawei Technologies Co., Ltd.
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met: 
 * 
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer. 
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution. 
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.huawei.ipr.pof.gui.comm;

import net.floodlightcontroller.core.module.IFloodlightService;

import org.openflow.protocol.OFError;
import org.openflow.protocol.OFFeaturesReply;
import org.openflow.protocol.OFMessage;
import org.openflow.protocol.OFPacketIn;
import org.openflow.protocol.OFPortStatus;
import org.openflow.protocol.table.OFFlowTableResource;

/**
 * @author Song Jian (jack.songjian@huawei.com), Huawei Technologies Co., Ltd.
 *
 */
public interface IGUIService extends IFloodlightService{
    public void addSwitch(int switchId);

    public void displayDeviceInfo(int switchId, OFFeaturesReply featureReply);    
  
    public void displayPortInfo(int switchId, OFPortStatus portStatus);

    public void displayResourceReport(int switchId, OFFlowTableResource flowTableResource);

    public void displayOFError(int switchId, OFError error);

    public void displayPacketIn(int switchId, OFPacketIn packetIn);

    public void removeSwitch(int switchId);
    
    public void rollBack(int switchId, OFMessage sendedMsg);
    
    public void reloadUI();

}
