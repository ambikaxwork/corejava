class SocialMediaAppStarter{
public  static void main(String[] coffee)
{
SocialMediaApp mediaApp=new SocialMediaApp();
mediaApp.setName("Instagram");
//primitive
// non primitive
//ref or null  
System.out.println(mediaApp.name);
String version="208.0.0.32.135";
mediaApp.setVersion(version);
mediaApp.setLang("English");
mediaApp.setPlatform("socialmedia");
System.out.println(mediaApp.lang);
System.out.println(mediaApp.platform);
System.out.println(mediaApp.version);
Company company=new Company();
company.setFounder("MArk");
company.setName("facebook");
company.setNoOfEmployees(37000);
company.setEst(2015);
mediaApp.setCompany(company);
System.out.println(mediaApp.company.noOfEmployees);
System.out.println(mediaApp.company.founder);
System.out.println(mediaApp.company.est);
System.out.println(mediaApp.company.founder);





}


}