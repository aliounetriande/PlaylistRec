package com.playlistrec.engine;
import com.playlistrec.model.Artist;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class RecommendationEngine {
    
    private HashMap<String, List<Artist>> graph;

    public RecommendationEngine() {
        this.graph = new HashMap<>();
    }

    public void addArtist(Artist artist) {
        graph.putIfAbsent(artist.getName(), new java.util.ArrayList<>());
    }

    public void addConnection(Artist a, Artist b) {
        addArtist(a);
        addArtist(b);
        graph.get(a.getName()).add(b);
        graph.get(b.getName()).add(a);
    }

    public List<Artist> recommend(String artistName, int maxResults) {
    List<Artist> recommendations = new ArrayList<>();
    if (!graph.containsKey(artistName)) {
        return recommendations; 
    }
    Set<String> visited = new HashSet<>();
    Queue<String> queue = new LinkedList<>();
    queue.add(artistName);
    while (!queue.isEmpty() && recommendations.size() < maxResults) {
        String current = queue.poll();
        if (!visited.contains(current)) {
            visited.add(current);
            for (Artist neighbor : graph.get(current)) {
                if (!visited.contains(neighbor.getName())) {
                    recommendations.add(neighbor);
                    queue.add(neighbor.getName());
                    if (recommendations.size() >= maxResults) {
                        break;
                    }
                }
            }
        }
    }
    return recommendations;
}
}
