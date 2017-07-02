package com.fts.domain.insurance;

import io.swagger.annotations.ApiModel;

import java.util.List;

/**
 * Created by WangYue on 2017/7/2.
 */

@ApiModel(value = "保险DTO")
public class InsuranceDTO {
    String insuranceNotice;
    String productFeature;
    List<InsuranceCause> insuranceCauseList;
    String insurancePeriodUnit;
    String productSeries;
    String channelID;
    String productShortName;
    int maxInsureAge;
    String URLLiPeiFuWu;
    int benificiaryType;
    int sigleOrderQuata;
    String insuraceScope;
    int maxInsuredNum;
    int singlePersonQuota;
    String productSide;
    String productSlogan;
    String productStatus;
    int frozenInventory;
    String basicImage;
    String maxInsureAgeUnit;
    List<Price> priceList;
    int minInsureAge;
    List<AttachmentInfo> attachmentInfos;
    SupplierInfo supplierInfo;
    String supplierProductCode;
    int minPremium;
    String minInsureAgeUnit;
    String secondLevelType;
    String productIntroduce;
    List<IDType> idTypeList;
    int minInsuredNum;
    List<CommonIssue> commonIssueList;
    String platformType;
    List<InsuranceRep> insuranceRepList;
    String insuranceStatement;
    int maxEnsure;
    List<PolicyHolderRep> policyHolderRepList;
    String productBannerURL;
    int minEnsure;
    int insurancePriod;
    int totalInventory;
    String productIntroduction;
    String productCode;
    int maxPremium;
    List<CommonIssueRef> commonIssueRefList;
    String salesAreaDesc;
    String minEffectDelay;
    String productId;
    int unit;
    String productName;
    int investmentAmount;
}
