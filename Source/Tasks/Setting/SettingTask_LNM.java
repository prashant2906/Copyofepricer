package Tasks.Setting;


import Tasks.Task_Common;
import WebElements.Setting.SetObj_LNM;

public class SettingTask_LNM extends Task_Common
{

	SetObj_LNM Sobject = new SetObj_LNM();
	
			
	public void Launch_ManageLSCDFiles_Task()
	{
		try{
		Sobject.LNM_ManageLSCDFiles().click();
		System.out.println("	<PASS> ManageLSCDFile: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageLSCDFile ");
		}
	}
	
	public void Launch_ManageReferenceTables_Task()
	{
		try{
		Sobject.LNM_ManageReferenceTables().click();
		System.out.println("	<PASS> ManageReferenceTables: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageReferenceTables ");
		}
	}
	 public void Launch_AssociateReferenceTablesList_Task()
	{
		try{
		Sobject.LNM_AssociateReferenceTablesList().click();
		System.out.println("	<PASS> AssociateReferenceTablesList: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>AssociateReferenceTablesList ");
		}
	}
	
	public void Launch_ManageRestrictedProducts_Task()
	{
		try{
		Sobject.LNM_ManageRestrictedProducts().click();
		System.out.println("	<PASS> ManageRestrictedProducts: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageRestrictedProducts ");
		}
	}
	
	public void Launch_ManageRoutingParameter_Task()
	{
		try{
		Sobject.LNM_ManageRoutingParameter().click();
		System.out.println("	<PASS> ManageRoutingParameter: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageRoutingParameter ");
		}
	}

	public void Launch_ManageDistributionList_Task()
	{
		try{
		Sobject.LNM_ManageDistributionList().click();
		System.out.println("	<PASS> ManageDistributionList: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageDistributionList ");
		}
	}

	public void Launch_ManageBPParameters_Task()
	{
		try{
		Sobject.LNM_ManageBPParameters().click();
		System.out.println("	<PASS> ManageBPParameters: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageBPParameters ");
		}
	}

	public void Launch_ManageLanguageList_Task()
	{
		try{
		Sobject.LNM_ManageLanguageList().click();
		System.out.println("	<PASS> ManageLanguageList: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageLanguageList ");
		}
	}

	public void Launch_ManageNLS_Task()
	{
		try{
		Sobject.LNM_ManageNLS().click();
		System.out.println("	<PASS> ManageNLS: Launch page");
		}
		catch (Exception e)
		{
			System.out.println("	<Failed>ManageNLS ");	
		}
	}
	
	public void Launch_ManageNLSCurrency_Task()
	{
		try{
		Sobject.LNM_ManageNLSCurrency().click();
		System.out.println("	<PASS> ManageNLSCurrency: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageNLSCurrency ");	
		}
	}

	public void Launch_ManageNLSReference_Task()
	{
		try{
		Sobject.LNM_ManageNLSReference().click();
		System.out.println("	<PASS> ManageNLSReference: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageNLSReference ");
		}
	}
	
	public void Launch_ManageNLSRevenueDivisionCode_Task()
	{
		try{
		Sobject.LNM_ManageNLSRevenueDivisionCode().click();
		System.out.println("	<PASS> ManageNLSRevenueDivisionCode: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageNLSRevenueDivisionCode ");	
		}
	}
	
	public void Launch_ManageNLSSpecialBidCodes_Task()
	{
		try{
		Sobject.LNM_ManageNLSSpecialBidCodes().click();
		System.out.println("	<PASS> ManageNLSSpecialBidCodes: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageNLSSpecialBidCodes ");
		}
	}
	
	public void Launch_ManageNLSTermsAndConditions_Task()
	{
		try{
		Sobject.LNM_ManageNLSTermsAndConditions().click();
		System.out.println("	<PASS> ManageNLSTermsAndConditions: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageNLSTermsAndConditions ");
		}
	}
	
	public void Launch_ManageBPCalculatorParameters_Task()
	{
		try{
		Sobject.LNM_ManageBPCalculatorParameters().click();
		System.out.println("	<PASS> ManageBPCalculatorParameters: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageBPCalculatorParameters ");
		}
	}

	public void Launch_ManageEntitledPrice_Task()
	{
		try{
			Sobject.LNM_ManageEntitledPrice().click();
		System.out.println("	<PASS> ManageEntitledPrice: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageEntitledPrice ");
		}
	}

	public void Launch_ManageTemplatesAssociations_Task()
	{
		try{
		Sobject.LNM_ManageTemplatesAssociations().click();
		System.out.println("	<PASS> ManageTemplatesAssociations: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageTemplatesAssociations ");
		}
	}
	public void Launch_ManageSelectedHouseAccountList_Task()
	{
		try{
		Sobject.LNM_ManageSelectedHouseAccountList().click();
		System.out.println("	<PASS> ManageSelectedHouseAccountList: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageSelectedHouseAccountList ");
		}
	}

	public void Launch_ManageBPTermsAndConditions_Task()
	{
		try{
		Sobject.LNM_ManageBPTermsAndConditions().click();
		System.out.println("	<PASS> ManageBPTermsAndConditions: Launch page");
		}
		catch (Exception e)
		{
			System.out.println("	<Failed>ManageBPTermsAndConditions ");
		}
	}
	
	public void Launch_ManageRegistrationNumber_Task()
	{
		try{
		Sobject.LNM_ManageRegistrationNumber().click();
		System.out.println("	<PASS> ManageRegistrationNumber: Launch page");
		}
		catch (Exception e)
		{
			System.out.println("	<Failed>ManageRegistrationNumber ");
		}
	}
	
	public void Launch_ManageAdditionalSBCCriteria_Task()
	{
		try{
		Sobject.LNM_ManageAdditionalSBCCriteria().click();
		System.out.println("	<PASS> ManageAdditionalSBCCriteria: Launch page");
		}
		catch (Exception e)
		{
			System.out.println("	<Failed>ManageAdditionalSBCCriteria ");
		}
	}
	
	public void Launch_ManageSBCTermsAndConditions_Task()
	{
		try{
		Sobject.LNM_ManageSBCTermsAndConditions().click();
		System.out.println("	<PASS> ManageSBCTermsAndConditions: Launch page");
		}
		catch (Exception e)
		{
			System.out.println("	<Failed>ManageSBCTermsAndConditions ");
		}
	}
	
	public void Launch_UploadBPPCLogic_Task()
	{
		try{
		Sobject.LNM_UploadBPPCLogic().click();
		System.out.println("	<PASS> UploadBPPCLogic: Launch page");
		}
		catch (Exception e)
		{
			System.out.println("	<Failed>UploadBPPCLogic ");
		}
	}
	public void Launch_ManageBidTypeRules_Task()
	{
		try{
		Sobject.LNM_ManageBidTypeRules().click();
		System.out.println("	<PASS> ManageBidTypeRules: Launch page");
		}
		catch (Exception e)
		{
			System.out.println("	<Failed>ManageBidTypeRules ");
		}
	}
	public void Launch_ManageBidTypeTermsandCondition_Task()
	{
		try{
		Sobject.LNM_ManageBidTypeTermsandCondition().click();
		System.out.println("	<PASS>  ManageBidTypeTermsandCondition: Launch page");
		}
		catch (Exception e)
		{
			System.out.println("	<Failed>ManageBidTypeTermsandCondition ");
		}
	}
	
	public void Launch_RetrieveQuoteAttachments_Task()
	{
		try{
		Sobject.LNM_RetrieveQuoteAttachments().click();
		System.out.println("	<PASS>  RetrieveQuoteAttachments: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>RetrieveQuoteAttachments ");
		}
	}

	 
	public void Launch_ManageGeoHierarchy_Task()
	{
		try{
		Sobject.LNM_ManageGeoHierarchy().click();
		System.out.println("	<PASS>  ManageGeoHierarchy: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageGeoHierarchy ");
		}
	}
	 
	public void Launch_ManagePricingAnalysis_Task()
	{
		try{
		Sobject.LNM_ManagePricingAnalysis().click();
		System.out.println("	<PASS>  ManagePricingAnalysis: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManagePricingAnalysis ");	
		}
	}
	 
	public void Launch_ManageValueSellerPrice_Task()
	{
		try{
		Sobject.LNM_ManageValueSellerPrice().click();
		System.out.println("	<PASS>  ManageValueSellerPrice: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageValueSellerPrice ");
		}
	}
	
	public void Launch_ManageWarningParameters_Task()
	{
		try{
		Sobject.LNM_ManageWarningParameters().click();
		System.out.println("	<PASS>  ManageWarningParameters: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageWarningParameters ");
		}
	}
	 
	public void Launch_ManageAgogConfiguration_Task()
	{
		try{
		Sobject.LNM_ManageAgogConfiguration().click();
		System.out.println("	<PASS>  ManageAgogConfiguration: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageAgogConfiguration ");
		}
	}
	 
	public void Launch_ManageBpMarginParameters_Task()
	{
		try{
		Sobject.LNM_ManageBpMarginParameters().click();
		System.out.println("	<PASS>  ManageBpMarginParameters: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageBpMarginParameters ");
		}
	}
	

	
	public void Launch_ManageEROAccount_Task()
	{
		try{
		Sobject.LNM_ManageEROAccount().click();
		System.out.println("	<PASS>  ManageEAOAccount: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageEAOAccount "); 
		}
	}
	
	public void Launch_ManageLTEAccount_Task()
	{
		try{
		Sobject.LNM_ManageLTEAccount().click();
		System.out.println("	<PASS>  ManageLTEAccount: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageLTEAccount "); 
		}
	}
	public void Launch_ManageP4VParameters_Task()
	{
		try{
		Sobject.LNM_ManageP4VParameters().click();
		System.out.println("	<PASS>  ManageP4VParameters: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageP4VParameters "); 
		}
	}
	public void Launch_ManageP4VProductGroups_Task()
	{
		try{
		Sobject.LNM_ManageP4VProductGroups().click();
		System.out.println("	<PASS>  ManageP4VProductGroups: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageP4VProductGroups "); 
		}
	}
	public void Launch_ManageP4VBPMarginParameters_Task()
	{
		try{
		Sobject.LNM_ManageP4VBPMarginParameters().click();
		System.out.println("	<PASS>  ManageP4VBPMarginParameters: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageP4VBPMarginParameters "); 
		}
	}
	public void Launch_ManageCountryOption_Task()
	{
		try{
		Sobject.LNM_ManageCountryOption().click();
		System.out.println("	<PASS>  ManageCountryOption: Launch page");
		}
		catch(Exception e)
		{
			System.out.println("	<Failed>ManageCountryOption "); 
		}
	}
	
	public void Launch_ManageNewsLink_Task()
	{
		try{
		Sobject.LNM_ManageNewsLink().click();
		System.out.println("	<PASS>  ManageNewsLink: Launch page");
	}
		 catch(Exception e)
		{
			 System.out.println("	<Failed>ManageNewsLink "); 
		}
	}

}
