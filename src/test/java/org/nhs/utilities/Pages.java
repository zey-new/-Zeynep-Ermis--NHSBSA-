package org.nhs.utilities;


import org.nhs.pages.*;

public class Pages {
    private StartPage StartPage;
    private WhereYouLive_Page WhereYouLive_Page;
    private DOB_Page DOB_Page;
    private PartnerPage PartnerPage;
    private ClaimBenefitsTaxCreditsPage ClaimBenefitsTaxCreditsPage;
    private Paid_uc_page Paid_uc_page;
    private UC_claim_page UC_claim_page;
    private UC_take_home_pay_page UC_take_home_pay_page;
    private resultClaimingQualifyingPensionCreditPage resultClaimingQualifyingPensionCreditPage;


    public StartPage StartPage() {
        if (StartPage == null) {
            StartPage = new StartPage();
        }
        return StartPage;
    }


    public WhereYouLive_Page WhereYouLive_Page() {
        if (WhereYouLive_Page == null) {
            WhereYouLive_Page = new WhereYouLive_Page();
        }
        return WhereYouLive_Page;
    }

    public DOB_Page DOB_Page() {
        if (DOB_Page == null) {
            DOB_Page = new DOB_Page();
        }
        return DOB_Page;
    }

    public PartnerPage PartnerPage() {
        if (PartnerPage == null) {
            PartnerPage = new PartnerPage();
        }
        return PartnerPage;
    }

    public ClaimBenefitsTaxCreditsPage Claim_benefits_tax_credits_Page() {
        if (ClaimBenefitsTaxCreditsPage == null) {
            ClaimBenefitsTaxCreditsPage = new ClaimBenefitsTaxCreditsPage();
        }
        return ClaimBenefitsTaxCreditsPage;
    }
    public Paid_uc_page Paid_uc_page() {
        if (Paid_uc_page == null) {
            Paid_uc_page = new Paid_uc_page();
        }
        return Paid_uc_page;
    }
    public UC_claim_page UC_claim_page() {
        if (UC_claim_page == null) {
            UC_claim_page = new UC_claim_page();
        }
        return UC_claim_page;
    }
    public UC_take_home_pay_page UC_take_home_pay_page() {
        if (UC_take_home_pay_page == null) {
            UC_take_home_pay_page = new UC_take_home_pay_page();
        }
        return UC_take_home_pay_page;
    }
    public resultClaimingQualifyingPensionCreditPage resultClaimingQualifyingPensionCreditPage() {
        if (resultClaimingQualifyingPensionCreditPage == null) {
            resultClaimingQualifyingPensionCreditPage = new resultClaimingQualifyingPensionCreditPage();
        }
        return resultClaimingQualifyingPensionCreditPage;
    }

}
