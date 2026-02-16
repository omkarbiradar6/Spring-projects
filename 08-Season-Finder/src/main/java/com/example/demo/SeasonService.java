package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class SeasonService 
{

	
	public String getSeason(int month)
	{
		return switch(month)
		{
		case 2, 3 -> "summer";
		case 4, 5 -> "Summer";
        case 6, 7 -> "Monsoon";
        case 8, 9 -> "Autumn";
        case 10, 11, 12, 1 -> "Winter";
		default -> "invalid bc";
		};
	}
}
