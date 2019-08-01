/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.linkedmall.model.v20180116;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class InitApplyRefundRequest extends RpcAcsRequest<InitApplyRefundResponse> {
	
	public InitApplyRefundRequest() {
		super("linkedmall", "2018-01-16", "InitApplyRefund", "linkedmall");
	}

	private Integer goodsStatus;

	private String subLmOrderId;

	private String thirdPartyUserId;

	private String bizUid;

	private Integer bizClaimType;

	private String bizId;

	private Boolean useAnonymousTbAccount;

	public Integer getGoodsStatus() {
		return this.goodsStatus;
	}

	public void setGoodsStatus(Integer goodsStatus) {
		this.goodsStatus = goodsStatus;
		if(goodsStatus != null){
			putQueryParameter("GoodsStatus", goodsStatus.toString());
		}
	}

	public String getSubLmOrderId() {
		return this.subLmOrderId;
	}

	public void setSubLmOrderId(String subLmOrderId) {
		this.subLmOrderId = subLmOrderId;
		if(subLmOrderId != null){
			putQueryParameter("SubLmOrderId", subLmOrderId);
		}
	}

	public String getThirdPartyUserId() {
		return this.thirdPartyUserId;
	}

	public void setThirdPartyUserId(String thirdPartyUserId) {
		this.thirdPartyUserId = thirdPartyUserId;
		if(thirdPartyUserId != null){
			putQueryParameter("ThirdPartyUserId", thirdPartyUserId);
		}
	}

	public String getBizUid() {
		return this.bizUid;
	}

	public void setBizUid(String bizUid) {
		this.bizUid = bizUid;
		if(bizUid != null){
			putQueryParameter("BizUid", bizUid);
		}
	}

	public Integer getBizClaimType() {
		return this.bizClaimType;
	}

	public void setBizClaimType(Integer bizClaimType) {
		this.bizClaimType = bizClaimType;
		if(bizClaimType != null){
			putQueryParameter("BizClaimType", bizClaimType.toString());
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public Boolean getUseAnonymousTbAccount() {
		return this.useAnonymousTbAccount;
	}

	public void setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
		this.useAnonymousTbAccount = useAnonymousTbAccount;
		if(useAnonymousTbAccount != null){
			putQueryParameter("UseAnonymousTbAccount", useAnonymousTbAccount.toString());
		}
	}

	@Override
	public Class<InitApplyRefundResponse> getResponseClass() {
		return InitApplyRefundResponse.class;
	}

}
