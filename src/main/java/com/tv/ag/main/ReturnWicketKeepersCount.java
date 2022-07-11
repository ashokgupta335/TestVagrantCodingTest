package com.tv.ag.main;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public class ReturnWicketKeepersCount extends ReturnForeignPlayersCount{

	int wcktKeeperCount = 0;

	public int numberOfWicketKeepers() throws FileNotFoundException, IOException, ParseException{
		
		
		//To count number of wicket keepers
		for(int i =0; i<(returnPlayersArray()).size(); i++){

			JSONObject players = (JSONObject) jsonArray.get(i);
			String playerRole = (String) players.get("role");
			if((playerRole.equals("Wicket-keeper"))){

				wcktKeeperCount += 1;

			}	
		}
		
		//Returning wicket keepers count
		return wcktKeeperCount;
	}
}
