package com.playlistrec;

import com.playlistrec.model.Artist;
import com.playlistrec.engine.RecommendationEngine;

public class Main {
    public static void main(String[] args) {
        RecommendationEngine engine = new RecommendationEngine();
        Artist himra = new Artist("Himra", "Rap Ivoire", 99);
        Artist didib = new Artist("Didi B", "Rap Ivoire", 97);
        Artist kiffNoBeat = new Artist("Kiff No Beat", "Rap Ivoire", 95);
        Artist djArafat = new Artist("DJ Arafat", "Coupé-Décalé", 98);
        Artist alphaBlondy = new Artist("Alpha Blondy", "Reggae", 90);
        Artist tikenJahFakoly = new Artist("Tiken Jah Fakoly", "Reggae", 92);
        Artist magicSystem = new Artist("Magic System", "Zouglou", 85);
        Artist sergebeynaud = new Artist("Serge Beynaud", "Coupé-Décalé", 88);
        Artist meiway = new Artist("Meiway", "Zouglou", 80);

        engine.addConnection(didib, kiffNoBeat);
        engine.addConnection(didib, djArafat);
        engine.addConnection(djArafat, sergebeynaud);
        engine.addConnection(tikenJahFakoly, alphaBlondy);
        engine.addConnection(magicSystem, didib);
        engine.addConnection(magicSystem, meiway);
        engine.addConnection(himra, djArafat);

        System.out.println("Recommendations for Didi B:");
        for (Artist artist : engine.recommend("Didi B", 5)) {
            System.out.println(artist);
        }
    }
}