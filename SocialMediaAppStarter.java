class SocialMediaAppStarter
{
public static void main(String [] cofee)
{

SocialMediaApp mediaApp=new SocialMediaApp();
mediaApp.setName("Instagram");
System.out.println(mediaApp.name);

mediaApp.setSize(200);
System.out.println(mediaApp.size);

mediaApp.setLan("english");
System.out.println(mediaApp.lan);

mediaApp.setPlatform("windows");
System.out.println(mediaApp.platform);

mediaApp.setVersion(208.99f);
System.out.println(mediaApp.version);

CompanyDetail comp=new CompanyDetail();

mediaApp.setCompanyDetails(comp);
System.out.println(mediaApp.companyDetails.name);
}




}