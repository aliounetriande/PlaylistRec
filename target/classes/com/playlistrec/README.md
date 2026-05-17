# PlaylistRec

A music artist recommendation engine built in Java using graph traversal algorithms.

## What it does

Given an artist name, PlaylistRec explores a graph of musical connections and returns a ranked list of similar artists starting with direct collaborators and expanding to their networks.

## How it works

Artists and their connections are modeled as a graph. BFS traverses this graph level by level starting from the chosen artist, it first discovers direct connections, then connections of connections. A HashSet tracks visited nodes to avoid infinite loops, while a Queue ensures artists are explored in discovery order.

## Tech Stack

| Layer | Technology |
|-------|------------|
| Language | Java 21 |
| Build | Maven |
| Algorithm | BFS (Breadth First Search) |
| Data Structures | HashMap, Queue, HashSet, ArrayList |

## Run locally

**Prerequisites:** Java 21, Maven

```bash
git clone https://github.com/ton-username/playlistrec.git
cd playlistrec
mvn compile exec:java -Dexec.mainClass="com.playlistrec.Main"
```

## Key concepts

**Graph (Adjacency List)** — artists and their connections are stored as a HashMap where each key is an artist and each value is their list of connected artists.

**BFS** — explores the graph level by level, finding the closest artists first.

**HashSet for visited nodes** — prevents infinite loops in cyclic graphs.

## License

MIT