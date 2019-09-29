package com.example.codelinc6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Resource resource1 = new Resource("Greensboro Urban Ministry", "https://greensborourbanministry.org/", "Christian based organization food, shelter, and solutions for the local community", FilterType.HOUSING, FilterType.FOOD);
    Resource resource2 = new Resource("UNCG Vet Center", "https://military.uncg.edu/", "", FilterType.GENERAL, FilterType.DUMMY);
    Resource resource3 = new Resource("Goodwill Industries", "https://www.goodwillnwnc.org/veterans-services-info-session/", "Resources for employment through Goodwill Industries", FilterType.GOODS, FilterType.DUMMY);
    Resource resource4 = new Resource("American Legion", "https://www.legion.org/about", "A patriotic veterans organization devoted to mutual helpfulness", FilterType.GENERAL, FilterType.DUMMY);
    Resource resource5 = new Resource("Social Serve", "http://www.socialserve.com/", "Resource for finding afforadable housing in NC", FilterType.HOUSING, FilterType.DUMMY);
    Resource resource6 = new Resource("Veteran Resources", "https://nvf.org/veteran-resources/", "Main website for information on Veteran Resources", FilterType.GENERAL, FilterType.DUMMY);
    Resource resource7 = new Resource("UNCG Military and Veteran Services", "https://military.uncg.edu/va-benefits/", "Information on Veteran's Benefits at UNCG ", FilterType.EDUCATION, FilterType.BENEFITS);
    Resource resource8 = new Resource("Greensboro College Veteran's Benefits", "https://www.greensboro.edu/academics/registrar/veterans-benefits/", "Information on Veteran's Benefits at Greensboro College", FilterType.EDUCATION, FilterType.BENEFITS);
    Resource resource9 = new Resource("US Veterans Employment Services", "https://library.greensboro-nc.gov/services/job-career/us-veterans-employment-services", "A library of resources for employment services in Greensboro", FilterType.JOBS, FilterType.DUMMY);
    Resource resource10 = new Resource("Hire a Veteran", "https://hireaveteran.com/veteran-jobs/north-carolina-veteran-jobs/", "Resource for veteran job searching locally", FilterType.JOBS, FilterType.DUMMY);
    Resource resource11 = new Resource("Greensboro Veteran's Center", "https://www.va.gov/directory/guide/facility.asp?ID=719", "Greensboro local general Veteran's Services", FilterType.VA, FilterType.GENERAL);
    Resource resource12 = new Resource("Guilford County Veteran's Center", " https://www.guilfordcountync.gov/services/veteran-s-services", "Guilford local general Veteran's Services", FilterType.VA, FilterType.GENERAL);
    Resource resource13 = new Resource("The Servant Center", " https://theservantcenter.org/", "Organization whose goal is to aid Veterans who are homeless or disabled, need housing, healthcare and restorative services", FilterType.DISABILITY, FilterType.HOUSING);
    Resource resource14 = new Resource("United States Department of Veterans Affairs - GI Bill", "https://www.gibill.va.gov/apply-for-benefits/", "Detailed information on the GI Bill and how to apply", FilterType.GIBILL, FilterType.BENEFITS);
    Resource resource15 = new Resource("ARMY.MIL", "https://www.army.mil/info/armylife/veterans/", "General resources for Army Veterans", FilterType.ARMY, FilterType.GENERAL);
    Resource resource16 = new Resource("Air Force's Personnel Center", "https://www.afpc.af.mil/Separation/Veteran-Information/", "General resources for Air Force Veterans", FilterType.AIRFORCE, FilterType.GENERAL);
    Resource resource17 = new Resource("Navy Cool", "https://www.cool.navy.mil/usn/resources_and_links/for_veterans.htm", "General resources for Navy Veterans", FilterType.NAVY, FilterType.GENERAL);
    Resource resource18 = new Resource("Marine Corps Association & Foundation", "https://mca-marines.org/resource/resources-for-veteran-marines/", "General resources for Marine Veterans", FilterType.MARINES, FilterType.GENERAL);
    Resource resource19 = new Resource("US Coast Guard - Office of Civilian Human Resources", "https://www.dcms.uscg.mil/Our-Organization/Assistant-Commandant-for-Human-Resources-CG-1/Civilian-Human-Resources-Diversity-and-Leadership-Directorate-CG-12/Civilian-HR/Staffing-and-Recruitment/Veterans-Preference/", "General resources for Coast Guard Veterans", FilterType.COASTGUARD, FilterType.GENERAL);
    Resource resource20 = new Resource("Salvation Army", "https://www.salvationarmycarolinas.org/greensboro/programs/programs-that-help/shelter", "", FilterType.GOODS, FilterType.HOUSING);
    Resource resource21 = new Resource("FindLaw", "https://lawyers.findlaw.com/lawyer/firm/veterans-benefit/greensboro/north-carolina", "Local Resources for Veteran Legal Services", FilterType.LEGAL, FilterType.DUMMY);
    Resource resource22 = new Resource("LawHelpNC", "https://www.lawhelpnc.org/issues/military-and-veterans-affairs", "Information on North Carolina Veteran legal issues", FilterType.LEGAL, FilterType.DUMMY);
    Resource resource23 = new Resource("The Way To Move - Greensboro Transit Agency", "https://www.greensboro-nc.gov/departments/transportation/gdot-divisions/greensboro-transit-agency-public-transportation-division", "Information on GTA Transportation - Discount Identification Card - half-price fares if they: are a veteran, senior citizen (60 years or older), are a student (6-18 years), receive Medicaid/Medicare, or have a disability.", FilterType.TRANSPORTATION, FilterType.DUMMY);
    Resource resource24 = new Resource("Super Lawyers", "https://attorneys.superlawyers.com/military-and-veterans-law/north-carolina/greensboro/", "Resources for legal assistance in North Carolina", FilterType.LEGAL, FilterType.DUMMY);
    Resource resource25 = new Resource("NCServes", "https://raleigh.americaserves.org/veteran-services/","Network of public, private and non-profit organizations serving veterans, service members and their families in the Raleigh area",FilterType.HEALTHCARE, FilterType.DUMMY);
    Resource resource26 = new Resource("W. G. (Bill) Hefner VA Medical Center", "https://www.salisbury.va.gov/locations/Kernersville.asp", "Health Care services located in Salisbury", FilterType.HEALTHCARE, FilterType.DUMMY);
    Resource resource27 = new Resource("Psychology Today", "https://www.psychologytoday.com/us/treatment-rehab/veterans/north-carolina", "Local list of rehabilitation programs and centers", FilterType.ABUSE, FilterType.MENTALHEALTH);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button firstActivityBtn = findViewById(R.id.firstActivityBtn);
        firstActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = Resource.getNAME(resource1);
                String url = Resource.getURL(resource1);
                Uri webAddress = Uri.parse(url);

                Intent launchUrl = new Intent(Intent.ACTION_VIEW, webAddress);
                if (launchUrl.resolveActivity(getPackageManager()) != null) {
                    startActivity(launchUrl);
                }
            }
        });
    }
}
