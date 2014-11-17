package main;

import inhabitant.City;
import inhabitant.DebitException;
import inhabitant.Inhabitant;

import java.util.Random;

import letter.Letter;
import letter.PromissoryNote;
import letter.RegisteredLetter;
import letter.SimpleLetter;
import letter.UrgentLetter;

public class Main {

	public static void main(String[] args) {
		int numberLetter=1;
		int max_letter=5;
		int day = 0;
		City city= new City("Paradise");
		initCity(city);
		Random generator= new Random();
		while(numberLetter!=0){
			System.out.println("---Day "+ day+"---");
			numberLetter = generator.nextInt(max_letter);
			System.out.println(numberLetter);
			city.distributedLetter();

			addXLetter(city,numberLetter);
			day++;
		}
		System.out.println("---Day "+ day+"---");
		city.distributedLetter();

	}

	private static void addXLetter(City city, int numberLetter) {
		for(int i=0;i<numberLetter;i++){
			Letter<?> letter = createLetter(city);
			try {
				city.sendLetter(letter);
			} catch (DebitException e) {
				System.out.println(letter.getSender() +" can't send letter.");
				numberLetter--;
			}
		}
		
	}

	private static Letter<?> createLetter(City city) {
		Random generator= new Random();
		Inhabitant sender = city.getInhabitant(generator.nextInt(100));
		Inhabitant recipient = city.getInhabitant(generator.nextInt(100));
		Double money = (double) generator.nextInt(100);
		switch(generator.nextInt(10)){
		case 0 :System.out.println(sender +" has "+ sender.getAccount().getAccountValue()
				+" on this account after send "+ money);
				return new PromissoryNote(sender,
				recipient, money); 
		case 1 :System.out.println(sender +" has "+ sender.getAccount().getAccountValue()
				+" on this account after send "+ money);
				return new RegisteredLetter(sender,
				recipient, new PromissoryNote(sender,
						recipient, money)); 
		case 2 :return new RegisteredLetter(sender,
				recipient, new SimpleLetter(sender,
						recipient, "blabla")); 
		case 3 :return new UrgentLetter(sender,
				recipient, new SimpleLetter(sender,
						recipient, "blabla")); 
		case 4 :System.out.println(sender +" has "+ sender.getAccount().getAccountValue()
				+" on this account after send "+ money);
				return new UrgentLetter(sender,
				recipient, new PromissoryNote(sender,
						recipient, money)); 
		default : return new SimpleLetter(sender,
				recipient, "blabla");
		}
		
	}

	private static void initCity(City city) {
		for(int i=0; i<100;i++){
			city.addInhabitant(new Inhabitant("Inhabitant-"+i, city));
		}
	}

}
