package CollectionExercise;

import java.util.*;

public class Test implements Comparable<Test> {


    private String name;
    private String sport;
    private String country;
    private int world_rank;
    private List<String> medals;


    public Test(String name, String sport, String country, int world_rank, List<String> medals) {
        this.name = name;
        this.sport = sport;
        this.country = country;
        this.world_rank = world_rank;
        this.medals = medals;
    }

    public static void main(String[] args) {

        List<Test> testList = new ArrayList<>();

        testList.add(new Test("Divanshu", "Badminton", "IND", 1, Arrays.asList("bronze", "silver")));
        testList.add(new Test("Divanshu", "Badminton", "IND", 18, Arrays.asList("bronze", "silver")));
        testList.add(new Test("Divanshu", "Badminton", "IND", 3, Arrays.asList("bronze", "gold")));
        testList.add(new Test("Divanshu", "Badminton", "IND", 12, Arrays.asList("gold", "silver")));
        testList.add(new Test("Divanshu", "Badminton", "IND", 1, Arrays.asList("silver", "gold")));
        testList.add(new Test("Divanshu", "Badminton", "IND", 16, Arrays.asList("bronze", "silver", "gold")));
        testList.add(new Test("Divanshu", "Badminton", "IND", 71, Arrays.asList("bronze")));
        testList.add(new Test("Divanshu", "Badminton", "IND", 13, Arrays.asList("bronze", "silver")));
        testList.add(new Test("Divanshu", "Badminton", "IND", 31, Arrays.asList("silver", "silver")));
        testList.add(new Test("Divanshu", "Badminton", "IND", 15, Arrays.asList("bronze", "silver")));
        testList.add(new Test("Divanshu", "Badminton", "IND", 17, Arrays.asList("bronze", "silver", "gold")));
        testList.add(new Test("Divanshu", "Badminton", "IND", 152, Arrays.asList("bronze", "silver", "gold")));


        Collections.sort(testList);
        System.out.println("------------");
        System.out.println("World Rank sort");
        for (Test t : testList) {

            System.out.println(t.world_rank + "--" + t.medals);
        }

        System.out.println("-----------By comparator----------");

        System.out.println("Medals sort--");
        AthleteComparator athleteComparator = new AthleteComparator();
        Collections.sort(testList, athleteComparator);
//        testList.sort(athleteComparator);

        for (Test t : testList) {

            System.out.println(t.toString());
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getWorld_rank() {
        return world_rank;
    }

    public void setWorld_rank(int world_rank) {
        this.world_rank = world_rank;
    }

    public List<String> getMedals() {
        return medals;
    }

    public void setMedals(List<String> medals) {
        this.medals = medals;

    }

    @Override
    public int compareTo(Test o) {
        return this.world_rank - o.world_rank;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", sport='" + sport + '\'' +
                ", country='" + country + '\'' +
                ", world_rank=" + world_rank +
                ", medals=" + medals.size() +
                '}';
    }

}


class AthleteComparator implements Comparator<Test> {

    @Override
    public int compare(Test o1, Test o2) {

        if (o1.getMedals().size() < o2.getMedals().size()) {
            return -1;
        }
        if (o1.getMedals().size() > o2.getMedals().size()) {
            return 1;
        } else return 0;
    }
}


