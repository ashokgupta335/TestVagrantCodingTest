package com.tv.ag.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReturnForeignPlayersCount {

	int foreignPlayersCount = 0;
	Object obj;
	JSONObject jsonObject;
	JSONArray jsonArray;
	
	public JSONArray returnPlayersArray() throws FileNotFoundException, IOException, ParseException{
		
		obj = new JSONParser().parse(new FileReader("src/test/resources/TeamDetails.json"));

		jsonObject = (JSONObject)obj;

		jsonArray = (JSONArray) jsonObject.get("player");
		
		//Returning players JSONarray
		return jsonArray;
		
	}


	public int numberOfForeignPlayers()throws FileNotFoundException, IOException, ParseException{

		
		//To count number of foreign players count
		for(int i =0; i<(returnPlayersArray()).size(); i++){

			JSONObject players = (JSONObject) jsonArray.get(i);
			String playerCountry = (String) players.get("country");
			if(!(playerCountry.equals("India"))){

				foreignPlayersCount += 1;

			}

		}

		//Returning foreign players count
		return foreignPlayersCount;

	}


}
