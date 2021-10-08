class MiPhoneStarter{
	public static void main(String... bats)
	{
		MiPhone miPhone=new MiPhone();
		miPhone.setBrand("Mi");
		System.out.println(miPhone.brand);
		miPhone.setPrice(11500f);
		System.out.println(miPhone.price);
		miPhone.setColor("Blue");
		System.out.println(miPhone.color);
		miPhone.setImei("123mji987");
		System.out.println(miPhone.imei);
		PhonePay phonePay=new phonePay();
		phonePay.companyName="xiomi";
		phonePay.version=12.3.4.5f;
		phonePay.architect="Ambika";
		phonePay.working=true;
		miPhone.setPhonePay(phonePay);
		System.out.println(miPhone.phonePay.companyName);
		System.out.println(miPhone.phonePay.version);
		System.out.println(miPhone.phonePay.architect);
		System.out.println(miPhone.phonePay.working);

	}
}