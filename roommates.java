import java.util.*;
import java.io.*;

public class Main {
  public static class Person {
    String name;
    Set<String> categories;
    
    Person(String name, Set<String> categories) {
      this.name = name;
      this.categories = categories;
    }
    
    public String toString() {
      return "Name: " + this.name + ", rooms: " + this.categories;
    }
  }
  
  public static boolean fruh(Map<String, List<String>> adjacentNodes) {
    Stack<String> pairs = new Stack<>();
    int pairsMax = (adjacentNodes.size() % 2 == 0) ? adjacentNodes.size() / 2 : adjacentNodes.size() / 2 + 1;

    List<String> keys = new ArrayList<>(adjacentNodes.keySet());

    while (pairs.size() < pairsMax) {
        boolean isPaired = false;

        for (int i = 0; i < keys.size(); i++) {
            String person1 = keys.get(i);

            for (String neighbor : adjacentNodes.get(person1)) {
                if (pairs.contains(person1) || pairs.contains(neighbor)) {
                    continue;
                }

                pairs.push(person1);
                pairs.push(neighbor);

                isPaired = true;
                break;
            }

            if (isPaired) {
                break;
            }
        }
        
        if (!isPaired) {
            if (pairs.size() == 0) {
                return false;
            }
            
            String person2 = pairs.pop();
            String person1 = pairs.pop();
            
            adjacentNodes.get(person2).remove(person1);
            adjacentNodes.get(person1).remove(person2);
        }
    }

    return true;
  }
  
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("pr155.dat"));
    
    int iterThru = scan.nextInt();
    scan.nextLine();
    
    for (int z = 0; z < iterThru; z++) {
      int pplRn = scan.nextInt();
      
      scan.nextLine();
      
      List<Person> people = new ArrayList<>();
      for (int k = 0; k < pplRn; k++) {
        String[] personData = scan.nextLine().split("[\\s+]");
        Set<String> categories = new HashSet<>(Arrays.asList(personData).subList(1, personData.length));
        people.add(new Person(personData[0], categories));
      }
      
      
      Map<String, List<String>> adjacentNodes = new HashMap<>();
      
      for (int i = 0; i < people.size(); i++) {
        Person A = people.get(i);
        
       adjacentNodes.putIfAbsent(A.name, new ArrayList<>());

        
        for (int j = i + 1; j < people.size(); j++) {
          Person B = people.get(j);
          adjacentNodes.putIfAbsent(B.name, new ArrayList<>());
          
          if (!Collections.disjoint(A.categories, B.categories)) {
            adjacentNodes.get(A.name).add(B.name);
            adjacentNodes.get(B.name).add(A.name);
          }
        }
        
      }
      
      System.out.println((fruh(adjacentNodes)) ? "YES" : "NO");
    }
  }
}
