class TeamProgram{
	public static void main (String[] team)
	{
		IplTeams.printteam1("RCB");
		IplTeams.printteam2("MI");
		IplTeams.printteam3("DC");
		IplTeams.printteam4("PBKS");
		IplTeams.printteam5("KKR");
		IplTeams.printteam6("RR");
		IplTeams.printteam7("SRH");
		IplTeams.printteam8();
		String[] iplTeams={"RCB","DL","CSK"};
		String lastteam=IplTeams.printteam(iplTeams);
		System.out.println(lastteam);
		}
		}