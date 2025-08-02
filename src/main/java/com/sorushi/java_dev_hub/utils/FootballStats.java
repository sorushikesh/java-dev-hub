package com.sorushi.java_dev_hub.utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class FootballStats {

  public static final String[] topDivisionClubs = {
    "Arsenal",
    "Aston Villa",
    "Bournemouth",
    "Brentford",
    "Brighton & Hove Albion",
    "Burnley",
    "Chelsea",
    "Crystal Palace",
    "Everton",
    "Fulham",
    "Leeds United",
    "Liverpool",
    "Manchester City",
    "Manchester United",
    "Newcastle United",
    "Nottingham Forest",
    "Sunderland",
    "Tottenham Hotspur",
    "West Ham United",
    "Wolverhampton Wanderers",
    "AC Milan",
    "Inter Milan",
    "Juventus",
    "Napoli",
    "AS Roma",
    "Lazio",
    "Atalanta",
    "Fiorentina",
    "Bologna",
    "Cagliari",
    "Como 1907",
    "Cremonese",
    "Genoa",
    "Hellas Verona",
    "Parma Calcio 1913",
    "US Lecce",
    "Sassuolo",
    "Pisa Sporting Club",
    "Torino",
    "Udinese",
    "Real Madrid",
    "FC Barcelona",
    "Atlético Madrid",
    "Real Sociedad",
    "Athletic Bilbao",
    "Valencia CF",
    "Villarreal CF",
    "Real Betis",
    "Sevilla FC",
    "Girona FC",
    "Celta de Vigo",
    "Getafe CF",
    "CA Osasuna",
    "RCD Mallorca",
    "RCD Espanyol",
    "Rayo Vallecano",
    "Deportivo Alavés",
    "Levante UD",
    "Real Oviedo",
    "Elche CF",
    "Bayern Munich",
    "Borussia Dortmund",
    "Bayer Leverkusen",
    "Eintracht Frankfurt",
    "SC Freiburg",
    "VfB Stuttgart",
    "VfL Wolfsburg",
    "Borussia Mönchengladbach",
    "Union Berlin",
    "RB Leipzig",
    "Paris Saint‑Germain",
    "Olympique Marseille",
    "AS Monaco",
    "Lille OSC",
    "OGC Nice",
    "Lens",
    "Rennes",
    "Lyon",
    "Auxerre",
    "Angers SCO",
    "Le Havre AC",
    "Lorient",
    "Paris FC",
    "Metz",
    "Brest",
    "Strasbourg",
    "Toulouse",
    "Nantes",
    "SL Benfica",
    "FC Porto",
    "Sporting CP",
    "SC Braga",
    "Vitória Guimarães",
    "Estoril Praia",
    "Gil Vicente",
    "Casa Pia AC",
    "Moreirense FC",
    "CD Nacional",
    "Rio Ave FC",
    "FC Arouca",
    "CD Alverca",
    "AVS Futebol",
    "CF Estrela Amadora",
    "FC Famalicão",
    "Santa Clara",
    "CD Tondela",
    "Ajax",
    "PSV Eindhoven",
    "Feyenoord",
    "AZ Alkmaar",
    "FC Utrecht",
    "FC Twente",
    "Go Ahead Eagles",
    "NEC Nijmegen",
    "SC Heerenveen",
    "Sparta Rotterdam",
    "FC Groningen",
    "Fortuna Sittard",
    "NAC Breda",
    "Heracles Almelo",
    "Excelsior",
    "SC Telstar",
    "FC Volendam",
    "Royal Antwerp",
    "OH Leuven",
    "Dender EH",
    "La Louvière",
    "Red Bull Salzburg",
    "SK Sturm Graz",
    "SK Rapid Wien",
    "Austria Wien",
    "LASK",
    "SV Ried",
    "Grazer AK",
    "Wolfsberger AC",
    "TSV Hartberg",
    "WSG Tirol",
    "RSC Anderlecht",
    "Union Saint‑Gilloise",
    "KAA Gent",
    "Royal Antwerp FC",
    "KVC Westerlo",
    "Standard Liège",
    "Royal Charleroi SC",
    "KV Mechelen",
    "Cercle Brugge KSV",
    "Club Brugge KV",
    "Oud‑Heverlee Leuven",
    "Sint‑Truidense VV",
    "FCV Dender EH",
    "RAAL La Louvière",
    "Zulte Waregem",
    "KRC Genk"
  };

  private FootballStats() {}

  public static Map<String, String> getClubCountryMap() {
    Map<String, String> map = new LinkedHashMap<>();

    // England
    String[] england = {
      "Arsenal",
      "Aston Villa",
      "Bournemouth",
      "Brentford",
      "Brighton & Hove Albion",
      "Burnley",
      "Chelsea",
      "Crystal Palace",
      "Everton",
      "Fulham",
      "Leeds United",
      "Liverpool",
      "Manchester City",
      "Manchester United",
      "Newcastle United",
      "Nottingham Forest",
      "Sunderland",
      "Tottenham Hotspur",
      "West Ham United",
      "Wolverhampton Wanderers"
    };
    for (String club : england) map.put(club, "England");

    // Italy
    String[] italy = {
      "AC Milan",
      "Inter Milan",
      "Juventus",
      "Napoli",
      "AS Roma",
      "Lazio",
      "Atalanta",
      "Fiorentina",
      "Bologna",
      "Cagliari",
      "Como 1907",
      "Cremonese",
      "Genoa",
      "Hellas Verona",
      "Parma Calcio 1913",
      "US Lecce",
      "Sassuolo",
      "Pisa Sporting Club",
      "Torino",
      "Udinese"
    };
    for (String club : italy) map.put(club, "Italy");

    // Spain
    String[] spain = {
      "Real Madrid",
      "FC Barcelona",
      "Atlético Madrid",
      "Real Sociedad",
      "Athletic Bilbao",
      "Valencia CF",
      "Villarreal CF",
      "Real Betis",
      "Sevilla FC",
      "Girona FC",
      "Celta de Vigo",
      "Getafe CF",
      "CA Osasuna",
      "RCD Mallorca",
      "RCD Espanyol",
      "Rayo Vallecano",
      "Deportivo Alavés",
      "Levante UD",
      "Real Oviedo",
      "Elche CF"
    };
    for (String club : spain) map.put(club, "Spain");

    // Germany
    String[] germany = {
      "Bayern Munich", "Borussia Dortmund", "Bayer Leverkusen", "Eintracht Frankfurt",
          "SC Freiburg",
      "VfB Stuttgart", "VfL Wolfsburg", "Borussia Mönchengladbach", "Union Berlin", "RB Leipzig"
    };
    for (String club : germany) map.put(club, "Germany");

    // France
    String[] france = {
      "Paris Saint‑Germain",
      "Olympique Marseille",
      "AS Monaco",
      "Lille OSC",
      "OGC Nice",
      "Lens",
      "Rennes",
      "Lyon",
      "Auxerre",
      "Angers SCO",
      "Le Havre AC",
      "Lorient",
      "Paris FC",
      "Metz",
      "Brest",
      "Strasbourg",
      "Toulouse",
      "Nantes"
    };
    for (String club : france) map.put(club, "France");

    // Portugal
    String[] portugal = {
      "SL Benfica", "FC Porto", "Sporting CP", "SC Braga", "Vitória Guimarães", "Estoril Praia",
      "Gil Vicente", "Casa Pia AC", "Moreirense FC", "CD Nacional", "Rio Ave FC", "FC Arouca",
      "CD Alverca", "AVS Futebol", "CF Estrela Amadora", "FC Famalicão", "Santa Clara", "CD Tondela"
    };
    for (String club : portugal) map.put(club, "Portugal");

    // Netherlands
    String[] netherlands = {
      "Ajax",
      "PSV Eindhoven",
      "Feyenoord",
      "AZ Alkmaar",
      "FC Utrecht",
      "FC Twente",
      "Go Ahead Eagles",
      "NEC Nijmegen",
      "SC Heerenveen",
      "Sparta Rotterdam",
      "FC Groningen",
      "Fortuna Sittard",
      "NAC Breda",
      "Heracles Almelo",
      "Excelsior",
      "SC Telstar",
      "FC Volendam"
    };
    for (String club : netherlands) map.put(club, "Netherlands");

    // Belgium
    String[] belgium = {
      "RSC Anderlecht",
      "Club Brugge KV",
      "Standard Liège",
      "KAA Gent",
      "Royal Antwerp",
      "Sint‑Truidense VV",
      "Royal Charleroi SC",
      "OH Leuven",
      "KVC Westerlo",
      "Zulte Waregem",
      "Dender EH",
      "La Louvière",
      "Union Saint‑Gilloise",
      "KV Mechelen",
      "Cercle Brugge KSV",
      "Oud‑Heverlee Leuven",
      "FCV Dender EH",
      "RAAL La Louvière",
      "KRC Genk"
    };
    for (String club : belgium) map.put(club, "Belgium");

    // Austria
    String[] austria = {
      "Red Bull Salzburg",
      "SK Sturm Graz",
      "SK Rapid Wien",
      "Austria Wien",
      "LASK",
      "SV Ried",
      "Grazer AK",
      "Wolfsberger AC",
      "TSV Hartberg",
      "WSG Tirol"
    };
    for (String club : austria) map.put(club, "Austria");

    return map;
  }
}
