class NewsPaperRunner{
	public static void main(String[] args)
	{
		NewsPaper paper=new NewsPaper("Times of india","Bennet & colleman",NewsLanguage.HINDI);
		{
			System.out.println(paper.name);
			System.out.println(paper.ownerName);
			System.out.println(paper.language);
			//NewsPrice ppr=NewsPrice.price;
			System.out.println(paper.price.H.price);
			NewsPaperType tp=NewsPaperType.DAILY;
			System.out.println(tp);
		}
		NewsPaper paper1=new NewsPaper("The Hindu","Hindu group",NewsLanguage.ENGLISH);
		{
			System.out.println(paper1.name);
			System.out.println(paper1.ownerName);
			System.out.println(paper1.language);
			System.out.println(paper1.price.H.price);
			NewsPaperType tp=NewsPaperType.DAILY;
			System.out.println(tp);
		}
		NewsPaper paper2=new NewsPaper("prajavani","K N guruswamy",NewsLanguage.KANNADA);
		{
			System.out.println(paper2.name);
			System.out.println(paper2.ownerName);
			System.out.println(paper2.language);
			//NewsPrice ppr=NewsPrice.price;
			System.out.println(paper2.price.H.price);
			NewsPaperType tp=NewsPaperType.DAILY;
			System.out.println(tp);
		}
		NewsPaper paper3=new NewsPaper("vijaya karnataka","The times group",NewsLanguage.KANNADA);
		{
			System.out.println(paper3.name);
			System.out.println(paper3.ownerName);
			System.out.println(paper3.language);
			//NewsPrice ppr=NewsPrice.price;
			System.out.println(paper3.price.T.price);
			NewsPaperType tp=NewsPaperType.DAILY;
			System.out.println(tp);
		}
		NewsPaper paper4=new NewsPaper("vijayavani","vijay sankeshwar",NewsLanguage.KANNADA);
		{
			System.out.println(paper4.name);
			System.out.println(paper4.ownerName);
			System.out.println(paper4.language);
			//NewsPrice ppr=NewsPrice.price;
			System.out.println(paper4.price.K.price);
			NewsPaperType tp=NewsPaperType.DAILY;
			System.out.println(tp);
			
			
		}
		
		NewsLanguage[] languageValues=NewsLanguage.values();
		for(int size=0;size<languageValues.length;)
		{
			NewsLanguage temp=languageValues[size];
			System.out.println(temp);
			size++;
		}
		NewsPrice[] priceValues=NewsPrice.values();
		for(int size=0;size<priceValues.length;size++)
		{
			NewsPrice p=priceValues[size];
			System.out.println(p);
		}
	}
}