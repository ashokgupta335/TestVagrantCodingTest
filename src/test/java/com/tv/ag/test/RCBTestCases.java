package com.tv.ag.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.tv.ag.main.ReturnForeignPlayersCount;
import com.tv.ag.main.ReturnWicketKeepersCount;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RCBTestCases {



	@Test
	public void verifyForeignPlayersExistence() throws FileNotFoundException, IOException, ParseException {


		boolean foreignPlayer = false;

		ReturnForeignPlayersCount fpCount = new ReturnForeignPlayersCount();

		//Capturing actual number of foreign players
		int actualForeignPlayersCount = fpCount.numberOfForeignPlayers();

		//Changing foreignPlayer to true if Foreign Player count is at least 4
		if(actualForeignPlayersCount>=4){
			foreignPlayer = true;
		}

		//Assertion for at least 4 foreign players existence in team
		Assert.assertTrue(foreignPlayer,"Atleast 4 foreign players does not present in the team");
		
		System.out.println("Atleast 4 foreign players are present in the team \n");
	}

	@Test
	public void verifyWicketKeeperExistence() throws FileNotFoundException, IOException, ParseException{

		boolean wcktKeeper = false;

		ReturnWicketKeepersCount wckCount = new ReturnWicketKeepersCount();

		//Capturing actual number wicket keepers
		int actualWcktKeeperCount = wckCount.numberOfWicketKeepers();

		//Changing wcktKeeper to true if Wicket Keeper count is at least 1
		if(actualWcktKeeperCount>=1){
			wcktKeeper = true;
		}

		//Assertion for at least one wicket keeper existence in team
		Assert.assertTrue(wcktKeeper,"Atleast 1 wicket keeper does not present in the team");
		
		System.out.println("Atleast 1 wicket keeper is present in the team");
	}
}
